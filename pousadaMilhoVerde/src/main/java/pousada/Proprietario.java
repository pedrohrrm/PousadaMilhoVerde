
package pousada;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pedro Henrique
 */
public class Proprietario extends Pessoa{

    public Proprietario() {
    }

    public Proprietario(String nome, String cpf, boolean nivelAcesso, int id) {
        super(nome, cpf, nivelAcesso = true, id);
    }
    
    //colocar algo para conferir o nível de acesso do funcionário antes de liberar as funçõe??
    
    
    public void menuProprietário(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> listaFuncionario = new ArrayList();
        
        boolean menuLoop = true;
        
        while(menuLoop){
            System.out.println("======|MENU FUNCIONÁRIO|======");
            System.out.println("[1] - Novo Funcionário");
            System.out.println("[2] - Procurar Funcionário");
            System.out.println("[3] - Atualizar Funcionário");
            System.out.println("[4] - Remover Funcionário");
            System.out.println("[5] - Listar Funcionários");
            System.out.println("[6] - Balanço mensal");
            System.out.println("[8] - Sair");
            System.out.println("Digite o que quer fazer: ");
            String escolha = scanner.nextLine();
            switch(escolha){
                case "1": {
                    System.out.println("======|NOVO FUNCIONÁRIO|======");
                    System.out.println("Digite o nome do Funcionário: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.println("Nivel de acesso definido: Funcionário!");
                    int i = 0;
                    
                    
                    //intanciar funcionário
                    Funcionario f = new Funcionario(nome, cpf, super.isNivelAcesso(), 0);
                    f.setNome(nome);
                    f.setCpf(cpf);
                    boolean setNivelAcesso = f.setNivelAcesso();
                    f.setId(i);
                    i++;
                    
                //add o objeto f do tipo funcionario no ArrayList listaFuncionario
                listaFuncionario.add(f);
                    break;
                }
                case "2": {
                    System.out.println("======|PROCURAR FUNCIONÁRIO|======");
                    System.out.println("Digite o cpf do Funcionário:");
                    String cpf = scanner.nextLine();
                    
                    boolean localizado = false;
                    for (int i = 0 ; i < listaFuncionario.size(); i++){
                        Funcionario fTemporario = listaFuncionario.get(i);
                        if(cpf.equals(fTemporario)){
                            System.out.println("FUNCIONÁRIO LOCALIZADO");
                            System.out.println("Dados do funcionário" + i + ": ");
                            System.out.println("CPF: " + fTemporario.getCpf());
                            System.out.println("Nome" + fTemporario.getNome());
                            System.out.println("Nivel de acesso:" + fTemporario.isNivelAcesso());
                            localizado = true;
                            break;
                            
                        }
                    }
                    if(localizado = false){
                        System.out.println("Não existe funcionário cadastrado com esse CPF");
                    }
                    break;
                }
                case "3": {
                    System.out.println("======|ATUALIZAR FUNCIONÁRIO|======");
                    for(int i = 0; i < listaFuncionario.size(); i++){
                        Funcionario fTemporario = listaFuncionario.get(i);
                        System.out.println("[" + i + "]" + fTemporario.getNome());
                    }
                    System.out.println("Digite o número do Funcionário que deseja alterar:");
                    int funcionarioNum = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o novo nome do Funcionário: ");
                    String nomeNovo = scanner.nextLine();
                    System.out.println("Digite o novo CPF do funcionário: ");
                    String novoCpf = scanner.nextLine();
                    
                    Funcionario f = new Funcionario();
                    f.setNome(nomeNovo);
                    f.setCpf(novoCpf);
                    break;
                }
                case "4": {
                    System.out.println("======|ATUALIZAR FUNCIONÁRIO|======");
                    for(int i = 0; i < listaFuncionario.size(); i++){
                        Funcionario fTemporario = listaFuncionario.get(i);
                        System.out.println("[" + i + "]" + fTemporario.getNome());
                    }
                    System.out.println("Digite o número do funcionário que deseja excluir: ");
                    int funcionarioNum = scanner.nextInt();
                    scanner.nextLine();
                    
                    listaFuncionario.remove(funcionarioNum);
                    break;
                }
                case "5": {
                    System.out.println("======|LISTAR FUNCIONÁRIOS|======");
                    for(int i = 0; i < listaFuncionario.size(); i++){
                        Funcionario fTemporario = listaFuncionario.get(i);
                        System.out.println("Dados do funcionário" + i + " :");
                        System.out.println("Nome: " + fTemporario.getNome());
                        System.out.println("CPF: "+ fTemporario.getCpf());
                        System.out.println("Nível de Acesso: " + fTemporario.isNivelAcesso());
                    }
                    break;
                }
                case "6":{
                    //aqui vai ser para o balanço
                    
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
