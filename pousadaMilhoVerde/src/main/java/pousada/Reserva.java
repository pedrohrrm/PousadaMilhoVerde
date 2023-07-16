/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pousada;

import arquivo.Arquivo;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Pedro Henrique
 */
public class Reserva extends Agenda {

    private boolean preliminar;
    private double preco;
    private int quarto;
    private String dataReserva;
    private String cartao; //colocar no sistema método pgto

    public Reserva() {
        this.preliminar = true;
    }

    public Reserva(boolean preliminar, double preco, int quarto, String dataReserva, String cartao) {
        this.preliminar = true;
        this.preliminar = preliminar;
        this.preco = preco;
        this.quarto = quarto;
        this.dataReserva = dataReserva;
        this.cartao = cartao;
    }

    public Reserva(boolean preliminar, double preco, int quarto, String cartao, int totalDeReservas, String idReserva, int numeroQuarto, LocalDateTime data, String idCliente, String idDespesa) {
        super(totalDeReservas, idReserva, numeroQuarto, data, idCliente, idDespesa);
        this.preliminar = true;
        this.preliminar = preliminar;
        this.preco = preco;
        this.quarto = quarto;
        this.cartao = cartao;
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

    @Override
    public String toString() {
        return "Reserva{" + "preliminar=" + preliminar + ", preco=" + preco + ", quarto=" + quarto + ", cartao=" + cartao + '}';
    }

    //CRUD DA RESERVA.
    public void menuReserva() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Reserva> listaReserva = new ArrayList();
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
            System.out.println("[7] - Sair");
            System.out.println("Digite o que quer fazer: ");
            String escolha = scanner.nextLine();
            switch (escolha) {
                case "1": {
                    System.out.println("======|NOVA RESERVA|======");
                    System.out.println("Digite o CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.println("Digite a data da reserva (ddMMaaaa): ");
                    String dataReserva = scanner.nextLine();
                    System.out.println("Digite o preço total da Reserva: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Digite o numero do Cartão do Cliente: ");
                    String cartao = scanner.nextLine();
                    System.out.println("Digite o numero do Apartamento: ");
                    int quarto = scanner.nextInt();

                    //Instanciando novas reservas
                    Reserva r = new Reserva(preliminar, preco, quarto, dataReserva, cartao);
                    r.setPreliminar(preliminar = true);
                    r.setCpf(cpf);
                    r.setDataReserva(dataReserva);
                    r.setPreco(preco);
                    r.setCartao(cartao);
                    r.setQuarto(quarto);

                    //add o objeto R do tipo reserva no ArrayList reserva
                    listaReserva.add(r);
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
                    System.out.println("Digite o número da reserva que deseja remover: ");
                    String resNum = scanner.nextLine();
                    listaReserva.remove(resNum);
                    
                    
                    









                    
                    
                    
                                        break;
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
                    for (int i = 0; i < listaReserva.size(); i++) {
                        Reserva resTemporaria = listaReserva.get(i);
                        System.out.println("[" + i + "]" + resTemporaria.getCpf());
                    }
                    System.out.println("Digite o número de acordo com a reserva que quer confirmar: ");
                    int resNum = scanner.nextInt();
                    scanner.nextLine();

                    Reserva r = listaReserva.get(resNum);
                    r.setPreliminar(preliminar = false);
                    System.out.println("RESERVA CONFIRMADA!");
                }
                break;
                case "7": {
                    menuLoop = false;
                    break;
                }
            }

        }
    }
    
    public static void verificaReservas()
    {
//        //foreach para remover reservas não confirmadas em 30 dias
//                    
//                    for(Reserva res: listaReserva){
//                        res.dataReserva > dataLocal+30;
//                        listaReserva.remove(res)
//                    }
//                    LocalDate dataAtual = LocalDate.now();
//        // Adicionar 30 dias à data atual
//        LocalDate dataCom30Dias = dataAtual.plus(30, ChronoUnit.DAYS);
    }
}
