/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pousada;

import arquivo.Arquivo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import sistema.Balancos;

/**
 *
 * @author Pedro Henrique
 */
public class Reserva extends Agenda {

    private boolean preliminar;
    private double preco;
    private int quarto, dias;
    private String dataReserva;
    private String cartao; //colocar no sistema método pgto
    protected static int numTotalInstanciasRes = 0;
    private static int numTotalInstanciasPrivadoRes = 0;
    private String tipoQuarto;
    private boolean confirmada;
    private String dataConfirmacao;

    public Reserva() {
        this.preliminar = true;
        numTotalInstanciasRes = numTotalInstanciasRes + 1;
        numTotalInstanciasPrivadoRes = numTotalInstanciasPrivadoRes + 1;
    }

    public Reserva(boolean preliminar, double preco, int quarto, int dias, String dataReserva, String cartao, String tipoQuarto) {
        this.preliminar = preliminar;
        this.preco = preco;
        this.quarto = quarto;
        this.dias = dias;
        this.dataReserva = dataReserva;
        this.cartao = cartao;
        this.tipoQuarto = tipoQuarto;
        this.confirmada = false;
        numTotalInstanciasRes = numTotalInstanciasRes + 1;
        numTotalInstanciasPrivadoRes = numTotalInstanciasPrivadoRes + 1;
    }

    public static int getNumTotalInstanciasPrivadoRes() {
        return numTotalInstanciasPrivadoRes;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public boolean getConfirmada() {
        return this.confirmada;
    }

    public void setConfirmada() {
        this.confirmada = true;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public boolean isPreliminar() {
        return preliminar;
    }

    public void setPreliminar(boolean preliminar) {
        this.preliminar = preliminar;
    }

    public double getPreco() {

        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public static boolean verificarReservaExistente(List<Reserva> listaReservas, String dataReserva, String tipoQuarto) {
        LocalDate dataReservaLocalDate = LocalDate.parse(dataReserva, DateTimeFormatter.ofPattern("ddMMyyyy"));
        for (Reserva reserva : listaReservas) {
            if (dataReservaLocalDate.equals(reserva.getDataReserva()) && tipoQuarto != null && tipoQuarto.equalsIgnoreCase(reserva.getTipoQuarto())) {
                return true; // Já existe uma reserva para a data e tipo de quarto informados
            }
        }
        return false;
    }

    public void confirmarReserva(String dataConfirmacaoStr) {
        if (preliminar && !confirmada) {
            // Verificar se a data de confirmação já foi preenchida
            if (dataConfirmacao != null) {
                System.out.println("A reserva já foi confirmada anteriormente.");
                return;
            }

            // Confirma a reserva
            this.confirmada = true;
            //LocalDate dataConfirmacao = LocalDate.parse(dataConfirmacaoStr, DateTimeFormatter.ofPattern("ddMMyyyy"));
            this.dataConfirmacao = dataConfirmacao;

            // Realizar o débito de uma diária no cartão do cliente (coloque a lógica aqui)
            System.out.println("Reserva confirmada! Foi debitada uma diária no cartão do cliente.");
        } else {
            System.out.println("A reserva não pode ser confirmada.");
        }
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    private static boolean verificarDataDentroDoPrazo(String dataReserva, String dataConfirmacao) {
        LocalDate dataReservaLocalDate = LocalDate.parse(dataReserva, DateTimeFormatter.ofPattern("ddMMyyyy"));
        LocalDate dataConfirmacaoLocalDate = LocalDate.parse(dataConfirmacao, DateTimeFormatter.ofPattern("ddMMyyyy"));

        return dataConfirmacaoLocalDate.isBefore(dataReservaLocalDate);
    }

    private static String adicionarDias(String data, int dias) {
        LocalDate dataLocalDate = LocalDate.parse(data, DateTimeFormatter.ofPattern("ddMMyyyy"));
        LocalDate novaDataLocalDate = dataLocalDate.plusDays(dias);
        return novaDataLocalDate.format(DateTimeFormatter.ofPattern("ddMMyyyy"));
    }

    public static void verificarReservasNaoConfirmadas(List<Reserva> listaReserva) {
        LocalDate dataAtual = LocalDate.now();
        boolean algumaReservaCancelada = false;

        Iterator<Reserva> iterator = listaReserva.iterator();
        while (iterator.hasNext()) {
            Reserva reserva = iterator.next();
            if (!reserva.isConfirmada()) {
                LocalDate dataReservaCliente = LocalDate.parse(reserva.getDataReserva(), DateTimeFormatter.ofPattern("ddMMyyyy"));

                if (dataReservaCliente.isBefore(dataAtual.plusDays(30))) {
                    // A reserva não foi confirmada e está a menos de 30 dias da data da reserva
                    // Então, vamos cancelar a reserva.
                    iterator.remove(); // Remover a reserva da lista
                    Arquivo.salvarReserva(listaReserva);
                    System.out.println("Reserva cancelada: CPF: " + reserva.getCpf() + ", Data da reserva: " + reserva.getDataReserva());
                    algumaReservaCancelada = true;
                }
            }
        }

        if (!algumaReservaCancelada) {
            System.out.println("Não existem reservas com menos de 30 dias para serem excluídas.");
        }
    }

    @Override
    public String toString() {
        return "Reserva{" + "preliminar=" + preliminar + ", preco=" + preco + ", quarto=" + quarto + ", dias=" + dias + ", dataReserva=" + dataReserva + ", cartao=" + cartao + ", tipoQuarto=" + tipoQuarto + ", confirmada=" + confirmada + ", dataConfirmacao=" + dataConfirmacao + '}';
    }

    //CRUD DA RESERVA.
    public void menuReserva() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Balancos> listaBalanco = new ArrayList();
        ArrayList<Reserva> listaReserva = new ArrayList();
        listaBalanco = Arquivo.lerBalanco();
        listaReserva = (ArrayList<Reserva>) Arquivo.lerReserva();

        boolean menuLoop = true;
        while (menuLoop) {
            System.out.println("======|MENU RESERVA|======");
            System.out.println("[1] - Nova Reserva");
            System.out.println("[2] - Procurar Reserva");
            System.out.println("[3] - Atualizar Reserva");
            System.out.println("[4] - Remover Reserva");
            System.out.println("[5] - Listar Reservas");
            System.out.println("[6] - Confirmar Reserva");
            System.out.println("[7] - Nova Despesa Cliente");
            System.out.println("[8] - Remover Despesa Cliente");
            System.out.println("[9] - Sair");
            System.out.println("Digite o que quer fazer: ");
            String escolha = scanner.nextLine();
            switch (escolha) {
                case "1": {
                    System.out.println("======|NOVA RESERVA|======");
                    System.out.println("Digite o CPF: ");
                    String cpf = scanner.nextLine();

                    System.out.println("Digite o tipo de quarto desejado (Luxo ou Simples): ");
                    String tipoQuarto = scanner.nextLine().toLowerCase();

                    double diaria;
                    if (tipoQuarto.equalsIgnoreCase("Luxo")) {
                        diaria = 399.0;
                    } else if (tipoQuarto.equalsIgnoreCase("Simples")) {
                        diaria = 99.0;
                    } else {
                        System.out.println("Tipo de quarto inválido!");
                        break; // Voltar ao menu principal
                    }

                    System.out.println("Digite a data da reserva (ddMMaaaa): ");
                    String dataReserva = scanner.nextLine();

                    // Verificar se já existe uma reserva na data informada e no tipo de quarto desejado
                    boolean existeReserva = Reserva.verificarReservaExistente(listaReserva, dataReserva, tipoQuarto);
                    if (existeReserva) {
                        System.out.println("Já existe uma reserva para a data e tipo de quarto informados!");
                        break; // Voltar ao menu principal
                    }
                    Reserva.verificarReservasNaoConfirmadas(listaReserva);
                    System.out.println("Digite o total de dias para reservas: ");
                    int dias = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o numero do Cartão do Cliente: ");
                    String cartao = scanner.nextLine();
                    System.out.println("Digite o numero do Apartamento: ");
                    int quarto = scanner.nextInt();

                    // Calcular o valor total da reserva
                    double valorTotal = diaria * dias;

                    //Instanciando novas reservas
                    Reserva r = new Reserva(true, valorTotal, quarto, dias, dataReserva, cartao, tipoQuarto);
                    r.setCpf(cpf);
                    r.setDataReserva(dataReserva);
                    r.setDias(dias);
                    r.setCartao(cartao);
                    r.setQuarto(quarto);

                    //add o objeto R do tipo reserva no ArrayList reserva
                    listaReserva.add(r);
                    Arquivo.salvarReserva(listaReserva);

                    scanner.nextLine();
                    // Exibir informações da reserva
                    System.out.println("Reserva criada com sucesso!");
                    System.out.println("Apartamento escolhido: nº " + quarto);
                    System.out.println("Tipo de quarto: " + tipoQuarto);
                    System.out.println("Valor total da reserva: R$ " + valorTotal);

                    // Confirmar reserva
                    System.out.println("Deseja confirmar a reserva? (S/N)");
                    String confirmacao = scanner.nextLine();
                    if (confirmacao.equalsIgnoreCase("S")) {
                        r.setPreliminar(false);
                        System.out.println("Reserva confirmada!");
                    } else {
                        listaReserva.remove(r);
                        System.out.println("Reserva cancelada!");
                    }

                    break;
                }
                case "2": {
                    System.out.println("======|PROCURAR RESERVA|======");
                    System.out.println("Digite o cpf do cliente para procurar a reserva:");
                    String cpf = scanner.nextLine();

                    boolean localizado = false; //Exibir mensagem que reserva foi localizada.
                    for (int i = 0; i < listaReserva.size(); i++) {
                        Reserva resTemporaria = listaReserva.get(i);
                        if (cpf.equals(resTemporaria.getCpf())) {
                            System.out.println("RESERVA LOCALIZADA");
                            System.out.println("Dados da reserva" + i + ": ");
                            System.out.println("CPF: " + resTemporaria.getCpf());
                            System.out.println("Data: " + resTemporaria.getDataReserva());
                            System.out.println("Valor total: " + resTemporaria.getPreco());
                            System.out.println("Número do cartão utilizado: " + resTemporaria.getCartao());
                            System.out.println("Número do Quarto: " + resTemporaria.getQuarto());
                            localizado = true;
                            break;
                        }
                    }
                    if (localizado = false) {
                        System.out.println("Não existe reserva cadastrada com esse CPF!");
                    }
                    break;
                }
                case "3": {
                    System.out.println("======|ATUALIZAR RESERVA|======");
                    for (int i = 0; i < listaReserva.size(); i++) {
                        Reserva resTemporaria = listaReserva.get(i);
                        System.out.println("[" + i + "]" + resTemporaria.getCpf());
                    }
                    System.out.println("Digite o número de acordo com a reserva que quer atualizar: ");
                    int resNum = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite a nova data da reserva: ");
                    String dataNova = scanner.nextLine();
                    System.out.println("Digite o novo valor da reserva: ");
                    double novoPreco = scanner.nextDouble();
                    System.out.println("Digite o novo cartão a ser utilizado: ");
                    String novoCartao = scanner.nextLine();
                    System.out.println("Digite o novo quarto: ");
                    int novoQuarto = scanner.nextInt();

                    Reserva r = listaReserva.get(resNum);
                    r.setDataReserva(dataNova);
                    r.setCartao(novoCartao);
                    r.setPreco(novoPreco);
                    r.setQuarto(novoQuarto);

                    break;
                }
                case "4": {
                    System.out.println("======|REMOVER RESERVA|======");
                    for (int i = 0; i < listaReserva.size(); i++) {
                        Reserva resTemporaria = listaReserva.get(i);
                        System.out.println("[" + i + "]" + resTemporaria.getCpf());
                    }

                    System.out.println("Digite o CPF do cliente para confirmar a reserva:");
                    String cpf = scanner.nextLine();

                    for (Reserva r : listaReserva) {

                        if (cpf.equals(r.getCpf())) {
                            LocalDate dataMaquina = LocalDate.now();
                            String dataAtual = dataMaquina.format(DateTimeFormatter.ofPattern("ddMMyyyy"));

                            String dataReservaCliente = r.getDataReserva();

                            LocalDate dataReservaDate = LocalDate.parse(dataReservaCliente, DateTimeFormatter.ofPattern("ddMMyyyy"));
                            LocalDate dataReservaMais7Dias = dataReservaDate.plusDays(7);

                            String dataReserva7Dias = dataReservaMais7Dias.format(DateTimeFormatter.ofPattern("ddMMyyyy"));

                            var x = Integer.parseInt(dataAtual);
                            var y = Integer.parseInt(dataReserva7Dias);
                            Balancos b = new Balancos();

                            if (y <= x) {
                                r.setConfirmada();
                                System.out.println("Valor R$" + (r.getPreco() / 2) + " , debitado no cartão cadastrado.");

                                //Preenchendo o BALANÇO
                                b.setCpf(r.getCpf());
                                b.setConta(r.getConta());
                                b.setPreco(r.getPreco());
                                b.setMes(dataReservaCliente);
                                listaBalanco.add(b);
                                Arquivo.salvarBalanco(listaBalanco);

                                listaReserva.remove(r);
                                Arquivo.salvarReserva(listaReserva);
                            } else {
                                System.out.println("Valor R$" + r.getPreco() + " , debitado no cartão cadastrado.");
                                System.out.println("Reserva excluida.");
                                listaReserva.remove(r);
                                Arquivo.salvarReserva(listaReserva);
                            }
                            break;
                        }

                    }

                }
                case "5": {
                    System.out.println("======|LISTAR RESERVAS|======");
                    for (int i = 0; i < listaReserva.size(); i++) {
                        Reserva resTemporaria = listaReserva.get(i);
                        System.out.println("Dados da reserva" + i + ":");
                        System.out.println("CPF: " + resTemporaria.getCpf());
                        System.out.println("Data: " + resTemporaria.getDataReserva());
                        System.out.println("Valor total: " + resTemporaria.getPreco());
                        System.out.println("Número do cartão utilizado: " + resTemporaria.getCartao());
                        System.out.println("Número do Quarto: " + resTemporaria.getQuarto());
                        if (resTemporaria.isPreliminar() == true) {
                            System.out.println("Status da reserva = NÃO CONFIRMADA");
                        } else {
                            System.out.println("Status da Reserva = CONFIRMADA");
                        }
                    }

                    break;
                }
                case "6": {
                    System.out.println("======|CONFIRMAR RESERVA|======");
                    System.out.println("Digite o CPF do cliente para confirmar a reserva:");
                    String cpf = scanner.nextLine();

                    for (Reserva r : listaReserva) {
                        if (cpf.equals(r.getCpf())) {
                            System.out.println(r.getCpf());

                            //Verificação da data da reserva.
                            LocalDate dataMaquina = LocalDate.now();
                            LocalDate dataAtualMais30Dias = dataMaquina.plusDays(30);
                            String dataAtual = dataMaquina.format(DateTimeFormatter.ofPattern("ddMMyyyy"));

                            String dataReservaCliente = r.getDataReserva();
                            var x = Integer.parseInt(dataAtual);
                            var y = Integer.parseInt(dataReservaCliente);

                            if (y <= x) {
                                r.setConfirmada();
                                System.out.println("Valor R$" + r.getPreco() + " , debitado no cartão cadastrado.");
                                Arquivo.salvarReserva(listaReserva);
                            } else {
                                System.out.println("Reserva fora do prazo de confirmação!");
                                System.out.println("Reserva excluida.");
                                listaReserva.remove(r);
                                Arquivo.salvarReserva(listaReserva);
                            }
                        }
                        break;
                    }
                }
                case "7": {
                    System.out.println("======|Adicionar Despesa|======");
                    for (int i = 0; i < listaReserva.size(); i++) {
                        Reserva resTemporaria = listaReserva.get(i);
                        System.out.println("[" + i + "]" + resTemporaria.getCpf());
                    }

                    System.out.println("Digite o CPF do cliente para adicionar a despesa:");
                    String cpf = scanner.nextLine();
                    for (Reserva r : listaReserva) {
                        if (cpf.equals(r.getCpf())) {
                            System.out.println("Digite o valor da despesa: ");
                            Double conta = scanner.nextDouble();
                            Double contaAtual = r.getConta();
                            contaAtual += conta;
                            r.setConta(contaAtual);
                            Arquivo.salvarReserva(listaReserva);

                            // Criar uma nova instância de Balancos para adicionar ao ArrayList
                            Balancos b = new Balancos();
                            b.setCpf(r.getCpf());
                            b.setConta(r.getConta());
                            listaBalanco.add(b);
                            Arquivo.salvarBalanco(listaBalanco);

                            System.out.println("Foi adicionado R$" + conta + "ao cliente de CPF " + cpf);

                        }
                    }
                    break;
                }

                case "8": {
                    System.out.println("======|Descontar Valor da Conta|======");
                    for (int i = 0; i < listaReserva.size(); i++) {
                        Reserva resTemporaria = listaReserva.get(i);
                        System.out.println("[" + i + "] " + resTemporaria.getCpf());
                    }

                    System.out.println("Digite o CPF do cliente para descontar valor da conta:");
                    String cpf = scanner.nextLine();

                    for (Reserva r : listaReserva) {
                        if (cpf.equals(r.getCpf())) {
                            System.out.println("Valor atual da conta do cliente: R$ " + r.getConta());
                            System.out.println("Digite o valor a ser descontado:");
                            Double valorDesconto = scanner.nextDouble();

                            if (r.getConta() >= valorDesconto) {
                                Double novaConta = r.getConta() - valorDesconto;
                                r.setConta(novaConta);
                                Arquivo.salvarReserva(listaReserva);

                                // Criar uma nova instância de Balancos para adicionar ao ArrayList
                                Balancos b = new Balancos();
                                b.setCpf(r.getCpf());
                                b.setConta(r.getConta());
                                listaBalanco.add(b);
                                Arquivo.salvarBalanco(listaBalanco);
                                System.out.println("Valor descontado com sucesso. Nova conta: R$ " + r.getConta());
                            } else {
                                System.out.println("Não é possível descontar um valor maior do que o saldo da conta.");
                            }

                        }
                    }
                    break;
                }

                case "9": {
                    menuLoop = false;
                    break;
                }
            }

        }
    }

}
