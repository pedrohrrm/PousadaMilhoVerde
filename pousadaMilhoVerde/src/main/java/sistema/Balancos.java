/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

import arquivo.Arquivo;
import java.util.ArrayList;
import java.util.Scanner;
import pousada.Cliente;
import pousada.Despesa;
import pousada.Reserva;

/**
 *
 * @author Pedro Henrique
 */
public class Balancos {

    private String cpf;
    private String mes;
    private double conta;
    private double preco;

    public Balancos() {

    }

    public Balancos(String cpf, String mes, double conta, double preco) {
        this.cpf = cpf;
        this.mes = mes;
        this.conta = conta;
        this.preco = preco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public double getConta() {
        return conta;
    }

    public void setConta(double conta) {
        this.conta = conta;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Balancos{" + "cpf=" + cpf + ", mes=" + mes + ", conta=" + conta + ", preco=" + preco + '}';
    }

    public void menuBalanco() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Despesa> listaDepesaPousada = Arquivo.lerDespesaPousada();
        ArrayList<Cliente> listaCliente = (ArrayList<Cliente>) Arquivo.lerClientes();
        ArrayList<Reserva> listaReserva = (ArrayList<Reserva>) Arquivo.lerReserva();
        ArrayList<Balancos> listaBalanco = Arquivo.lerBalanco();

        boolean menuLoop = true;

        while (menuLoop) {
            System.out.println("======|MENU GERIR POUSADA|======");
            System.out.println("[1] - Adicionar Despesa");
            System.out.println("[2] - Remover Despesa");
            System.out.println("[3] - Balanco Mensal");
            System.out.println("[4] - Sair");
            System.out.println("Digite o que quer fazer: ");
            String escolha = scanner.nextLine();
            switch (escolha) {
                case "1": {
                    System.out.println("======|Adicionar Despesa|======");
                    System.out.println("Digite a descrição da despesa: ");
                    String descricao = scanner.nextLine();

                    System.out.println("Digite o valor da despesa: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Digite a data de lançamento da despesa (DD/MM/AAAA): ");
                    String dataLancamento = scanner.nextLine();

                    System.out.println("Digite o mês de lançamento da despesa (MM/AAAA): ");
                    String mesLancamento = scanner.nextLine();

                    Despesa despesa = new Despesa(descricao, valor, dataLancamento, mesLancamento);
                    listaDepesaPousada.add(despesa);

                    Arquivo.salvarDespesaPousada(listaDepesaPousada);
                    System.out.println("Despesa adicionada com sucesso!");
                    break;
                }
                case "2": {
                    if (listaDepesaPousada.isEmpty()) {
                        System.out.println("Não há despesas para remover.");
                        return;
                    }

                    System.out.println("======|Remover Despesa|======");
                    System.out.println("Despesas disponíveis:");

                    for (int i = 0; i < listaDepesaPousada.size(); i++) {
                        Despesa despesa = listaDepesaPousada.get(i);
                        System.out.println("[" + i + "] Descrição: " + despesa.getDescricao() + ", Valor: " + despesa.getValor()
                                + ", Data: " + despesa.getDataLancamento() + ", Mês: " + despesa.getMesLancamento());
                    }

                    System.out.println("Digite o número da despesa que deseja remover: ");
                    int posicaoRemover = scanner.nextInt();
                    scanner.nextLine();

                    if (posicaoRemover >= 0 && posicaoRemover < listaDepesaPousada.size()) {
                        listaDepesaPousada.remove(posicaoRemover);
                        Arquivo.salvarDespesaPousada(listaDepesaPousada);
                        System.out.println("Despesa removida com sucesso!");
                    } else {
                        System.out.println("Posição inválida. Nenhuma despesa foi removida.");
                    }
                    break;
                }
                case "3": {
                    System.out.println("======|BALANÇO MENSAL|======");
                    System.out.println("Digite o mês que deseja calcular o balanço (MM/yyyy): ");
                    String mesReferencia = scanner.nextLine();

                    
                    

                    // Cálculo do total de receitas (preço + conta) dos clientes no mês de referência
                    double totalReceitas = 0;
                    for (Reserva reserva : listaReserva) {
                        String dataReserva = reserva.getDataReserva();
                        if (dataReserva.substring(2).equals(mesReferencia)) {
                            totalReceitas += reserva.getPreco() + reserva.getConta();
                        }
                    }

                    // Cálculo do total de despesas da pousada no mês de referência
                    double totalDespesas = 0;
                    for (Despesa despesa : listaDepesaPousada) {
                        String dataLancamento = despesa.getMesLancamento();
                        if (dataLancamento.equals(mesReferencia)) {
                            totalDespesas += despesa.getValor();
                        }
                    }

                    // Cálculo do saldo do mês de referência
                    double saldoMensal = totalReceitas - totalDespesas;

                    // Imprimir os resultados do balanço
                    System.out.println("======|BALANÇO MENSAL - " + mesReferencia + "|======");
                    System.out.println("Total de receitas (valor das reservas confirmadas): R$ " + totalReceitas);
                    System.out.println("Total de despesas: R$ " + totalDespesas);
                    System.out.println("Saldo do mês: R$ " + saldoMensal);

                    break;
                }

                case "4": {
                    menuLoop = false;
                    break;
                }
                default: {
                    System.out.println("Opção inválida. Digite novamente.");
                }
            }
        }
    }

}
