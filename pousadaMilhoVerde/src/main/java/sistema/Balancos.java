/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

import arquivo.Arquivo;
import java.util.ArrayList;
import java.util.Scanner;
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

    public void menuBalanco() {
        Scanner scanner = new Scanner(System.in);
        boolean menuLoop = true;

        while (menuLoop) {
            System.out.println("======|MENU RESERVA|======");
            System.out.println("[1] - Despesas da Pousada");
            System.out.println("[2] - Balanco Mensal");
            System.out.println("[3] - Sair");
            System.out.println("Digite o que quer fazer: ");
            String escolha = scanner.nextLine();
            switch (escolha) {
                case "1": {

                }
                case "2": {

                }
                case "3": {
                    menuLoop = false;
                    break;
                }
            }
        }
    }

}
