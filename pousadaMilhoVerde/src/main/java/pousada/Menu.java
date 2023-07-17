package pousada;

import java.util.Scanner;
import sistema.Balancos;

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
            System.out.println("[5] - Gerir funcionários");
            System.out.println("[6] - Sair");
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
                    System.out.println("Em Desenvolvimento");
                    break;
                }
                case "4": {
                    // Solicitar CPF e senha para autenticação do administrador
                    System.out.println("Digite o CPF do administrador:");
                    String cpfAdmin = scanner.nextLine();

                    System.out.println("Digite a senha do administrador:");
                    String senhaAdmin = scanner.nextLine();

                    // Verificar se os dados do administrador estão corretas
                    if (cpfAdmin.equals("98765432101") && senhaAdmin.equals("milhoverde")) {
                        
                        Balancos b = new Balancos();
                        b.menuBalanco();
                    } else {
                        System.out.println("Credenciais inválidas. Acesso negado.");
                    }
                    break;
                }
                
                case "5": {
                    Funcionario menu = new Funcionario();
                    menu.menuFuncionario();
                    break;
                }
                case "6": {
                    menuLoop = false;
                    break;
                }
            }
        }
    }
}
