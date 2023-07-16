package pousada;

import arquivo.Arquivo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Pedro Henrique
 */
public class Cliente extends Pessoa implements Comparator <Cliente>{

    private double conta; //gastos do cliente
    private String codigo;
    protected static int numTotalInstancias = 0;
    private static int numTotalInstanciasPrivado = 0;

    public Cliente() {
        numTotalInstancias = numTotalInstancias + 1;
        numTotalInstanciasPrivado = numTotalInstanciasPrivado +1;
    }
      public Cliente(String nome, String endereco, String email, String cpf, String telefone) {
        super(nome, endereco, email, cpf, telefone);
        numTotalInstancias = numTotalInstancias + 1;
        numTotalInstanciasPrivado = numTotalInstanciasPrivado +1;

    }

    public static int getNumTotalInstanciasPrivado() {
        return numTotalInstanciasPrivado;
    }

    public String getCodigo() {
        codigo = this.getCpf();
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    //verificar se precisa de id ou se vai herdar
    //fazer o toString

    public double getConta() {
        return conta;
    }

    public void setConta(double conta) {
        this.conta = conta;
    }

  

    public static int getNumTotalInstancias() {
        return numTotalInstancias;
    }

//MÉTODOS PARA IMPRIMIR AS INFORMAÇÕES
    public void verCliNome(int i) {
        System.out.println("Nome do Cliente: ");
    }

    public void verCliEndereco(int i) {
        System.out.println("Endereço do Cliente: ");
    }

    public void verCliEmail(int i) {
        System.out.println("E-mail do Cliente: ");
    }

    public void verCliCpf(int i) {
        System.out.println("CPF do Cliente: ");
    }

    public void verCliTelefone(int i) {
        System.out.println("Telefone do Cliente: ");
    }

//ARRAYLIST E CRUD*******
    public void menuCliente() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Cliente> listaCliente = new ArrayList();
        listaCliente = (ArrayList<Cliente>) Arquivo.lerClientes();
        //fazer a lista receber os dados do arquivo

        boolean menuLoop = true;
        while (menuLoop) {
            System.out.println("======|MENU CLIENTE|======");
            System.out.println("[1] - Cadastro de Cliente");
            System.out.println("[2] - Procurar Cliente");
            System.out.println("[3] - Atualizar Cliente");
            System.out.println("[4] - Remover Cliente");
            System.out.println("[5] - Listar Clientes");
            System.out.println("[6] - Sair");
            System.out.println("Digite o que quer fazer: ");
            String escolha = scanner.nextLine();
            switch (escolha) {
                case "1": {
                    //Inserindo os dados dos clientes
                    System.out.println("======|CADASTRO CLIENTE|======");
                    System.out.println("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o endereço do cliente: ");
                    String endereco = scanner.nextLine();
                    System.out.println("Digite o e-mail do cliente: ");
                    String email = scanner.nextLine();
                    System.out.println("Digite o CPF do cliente: ");
                    String cpf = scanner.nextLine();
                    System.out.println("Digite o telefone do cliente: ");
                    String telefone = scanner.nextLine();
                    //Instanciando novos objetos cliente , atribuir os valores necessários
                    Cliente c = new Cliente(nome, endereco, email, cpf, telefone);
                    c.setNome(nome);
                    c.setEndereco(endereco);
                    c.setEmail(email);
                    c.setCpf(cpf);
                    c.setTelefone(telefone);

                    // adcionar o objeto c no arrayList cliente
                    listaCliente.add(c);
                    Arquivo.salvarClientes(listaCliente);
                    break;

                }
                case "2": {
                    System.out.println("======|PESQUISA CLIENTE|======");
                    System.out.println("Digite o CPF do cliente: ");
                    String cpf = scanner.nextLine();

                    boolean localizado = false; //fazer mensagem de clienbte localizada ser exibida.
                    for (int i = 0; i < listaCliente.size(); i++) {
                        Cliente cliTemporario = listaCliente.get(i);
                        if (cpf.equals(cliTemporario.getCpf())) {
                            System.out.println("CLIENTE LOCALIZADO!");
                            System.out.println("Dados do Cliente " + i + " :");
                            System.out.println("Nome: " + cliTemporario.getNome());
                            System.out.println("Endereço: " + cliTemporario.getEndereco());
                            System.out.println("E-mail: " + cliTemporario.getEmail());
                            System.out.println("CPF: " + cliTemporario.getCpf());
                            System.out.println("Telefone: " + cliTemporario.getTelefone());
                            localizado = true;
                            break;

                        }
                    }
                    if (localizado = false) {
                        System.out.println("Não existe cliente cadastrado com esse CPF.");

                    }
                    break;

                }
                case "3": {
                    System.out.println("======|ALTERAR DADOS CLIENTE|======");
                    for (int i = 0; i < listaCliente.size(); i++) {
                        Cliente cliTemporario = listaCliente.get(i);
                        System.out.println("[" + i + "]" + cliTemporario.getNome());
                    }
                    System.out.println("Digite o número do Cliente que você deseja atualizar: ");
                    int clienteNum = scanner.nextInt();
                    scanner.nextLine(); //depois de next int, podemos colocar nextLine para limpar o buffer de digitação.
                    System.out.println("Digite o novo endereço do cliente: ");
                    String enderecoNovo = scanner.nextLine();
                    System.out.println("Digite o novo e-mail do cliente: ");
                    String emailNovo = scanner.nextLine();
                    System.out.println("Digite o novo telefone do cliente: ");
                    String telefoneNovo = scanner.nextLine();

                    Cliente c = listaCliente.get(clienteNum);
                    c.setEndereco(enderecoNovo);
                    c.setEmail(emailNovo);
                    c.setTelefone(telefoneNovo);

                    break;

                }
                case "4": {
                    System.out.println("======|REMOVER CLIENTE|======");
                    for (int i = 0; i < listaCliente.size(); i++) {
                        Cliente cliTemporario = listaCliente.get(i);
                        System.out.println("[" + i + "]" + cliTemporario.getNome());
                    }
                    System.out.println("Digite o número do Cliente que você deseja remover: ");
                    int clienteNum = scanner.nextInt();
                    scanner.nextLine(); //depois de next int, podemos colocar nextLine para limpar o buffer de digitação.

                    listaCliente.remove(clienteNum);
                    break;

                }
                case "5": {
                    System.out.println("======|LISTAR CLIENTES|======");
                    for (int i = 0; i < listaCliente.size(); i++) {

                        Cliente cliTemporario = listaCliente.get(i);
                        System.out.println("Dados do Cliente " + i + " :");
                        System.out.println("Nome: " + cliTemporario.getNome());
                        System.out.println("Endereço: " + cliTemporario.getEndereco());
                        System.out.println("E-mail: " + cliTemporario.getEmail());
                        System.out.println("CPF: " + cliTemporario.getCpf());
                        System.out.println("Telefone: " + cliTemporario.getTelefone());
                        
                    }
                }
                case "6": {
                    menuLoop = false;
                    break;
                }

            }

        }
    }

    @Override
    public int compare(Cliente cliente1, Cliente cliente2) {
//        int resultado = cliente1.getNome().compareTo(cliente2.getNome());
//        if (resultado != 0) {
//            return resultado;
//        }

        int resultado = cliente1.getEndereco().compareTo(cliente2.getEndereco());
        if (resultado != 0) {
            return resultado;
        }

        resultado = cliente1.getEmail().compareTo(cliente2.getEmail());
        if (resultado != 0) {
            return resultado;
        }

        resultado = cliente1.getCpf().compareTo(cliente2.getCpf());
        if (resultado != 0) {
            return resultado;
        }

        resultado = cliente1.getTelefone().compareTo(cliente2.getTelefone());
        if (resultado != 0) {
            return resultado;
        }
        
        return Integer.compare(cliente1.getId(), cliente2.getId());
    }

   
}
