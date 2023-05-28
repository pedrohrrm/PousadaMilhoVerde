/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pousada;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pedro Henrique
 */
public class Despesa extends Agenda {

    private String idProduto;
    private double valorProduto;
    private String idContas;
    private double valorContas;

    @Override
    public String toString() {
        return "Despesa{" + "idProduto=" + idProduto + ", valorProduto=" + valorProduto + ", idContas=" + idContas + ", valorContas=" + valorContas + '}';
    }

    public Despesa() {
    }

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getIdContas() {
        return idContas;
    }

    public void setIdContas(String idContas) {
        this.idContas = idContas;
    }

    public double getValorContas() {
        return valorContas;
    }

    public void setValorContas(double valorContas) {
        this.valorContas = valorContas;
    }
    public void produtos(){
        Despesa a = new Despesa();
        a.setIdProduto("Refrigerante");
        a.setValorProduto(3.95);
        Despesa b = new Despesa();
        b.setIdProduto("Almoco");
        b.setValorProduto(20.99);
        
    }
    public void menuDespesas(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Despesa> listaDespesa = new ArrayList();
        
        boolean menuLoop = true;
        
        while(menuLoop){
            System.out.println("======|MENU DESPESAS CLIENTE|======");
            System.out.println("[1] - Nova Despesa");
            System.out.println("[2] - Procurar Despesa");
            System.out.println("[3] - Atualizar Despesa");
            System.out.println("[4] - Remover Despesa");
            System.out.println("[5] - Listar Despesas");
            System.out.println("[6] - Sair");
            System.out.println("Digite o que quer fazer: ");
            String escolha = scanner.nextLine();
            switch(escolha){
                case "1":{
                    System.out.println("======|NOVA DESPESA|======");
                    System.out.println("Digite o CPF para incluir gasto: ");
                    String cpf = scanner.nextLine();
                    System.out.println("Digite o Produto que deseja: ");
                                       
                    
                    break;
                }
                case "2":{
                    break;
                }
                case "3":{
                    break;
                }
                case "4":{
                    break;
                }
                case "5":{
                    break;
                }
                case "6":{
                    break;
                }
            }
        }
    }
}
