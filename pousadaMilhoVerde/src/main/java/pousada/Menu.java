/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pousada;

import java.util.Scanner;

/**
 *
 * @author Pedro Henrique
 */
public class Menu {

    public void menuGeral() {
        Scanner scanner = new Scanner(System.in);

        boolean menuLoop = true;
        while (menuLoop) {
            System.out.println("======|POUSADA MILHO VERDE|======");
            System.out.println("[1] - Gerir Clientes");
            System.out.println("[2] - Gerir Reservas");
            System.out.println("[3] - Consultar Agenda");
            System.out.println("[4] - Balanço Pousada");
            System.out.println("[5] - Despesas diária quartos");
            System.out.println("[6] - Gerir funcionários");
            System.out.println("[7] - Sair");
            System.out.println("Digite o que quer fazer: ");
            String escolha = scanner.nextLine();

            switch (escolha) {
                case "1": {
                    //MENU CLIENTE
                    Cliente menu = new Cliente();
                    menu.menuCliente();
                    break;
                }
                case "2": {
                    //MENU RESERVA
                    Reserva menu = new Reserva();
                    menu.menuReserva();
                    break;
                }
                case "3": {
                    //MENU AGENDA
                    break;
                }
                case "4":{
                    break;
                }
                case "5":{
                    
                }
                case "6": {
                    Funcionario menu = new Funcionario();
                    menu.menuFuncionario();
                    break;
                }
                case "7": {
                    menuLoop = false;
                    break;
                }
            }
        }
    }
}
