
package pousada;

import arquivo.Arquivo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *  * Classe que representa um Funcionário da Pousada Milho Verde.
 *
 * @author Pedro Henrique
 */
public class Funcionario extends Pessoa {
    
    /**
 * Cria um novo objeto da classe.
 * 
 * Este é o construtor padrão da classe. Ele cria uma instância
 * vazia da classe com os valores padrão para os atributos.
 */
    public Funcionario() {
    }
/**
 * Cria um novo objeto da classe.
 * Construtor com parametros
 * @param nome é o nome do funcionário
 * @param cpf é o cpf do funcionário
 * @param nivelAcesso é o nível de acesso da conta
 * @param id é o id
 */
 
    public Funcionario(String nome, String cpf, boolean nivelAcesso, int id) {
        super(nome, cpf, nivelAcesso = false, id);
    }

    @Override
    public String toString() {
        return "Funcionario{" + '}';
    }
    
    

   
    public void menuFuncionario(){
             
        
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> listaFuncionario = new ArrayList();
        listaFuncionario = (ArrayList<Funcionario>) Arquivo.lerColaborador();
        
        ArrayList<Proprietario> listaProprietario = new ArrayList();
        listaProprietario = (ArrayList<Proprietario>) Arquivo.lerProprietario();
        boolean menuLoop = true;
        
        while(menuLoop){
            System.out.println("======|MENU FUNCIONÁRIO|======");
            System.out.println("[1] - Novo Funcionário");
            System.out.println("[2] - Procurar Funcionário");
            System.out.println("[3] - Atualizar Funcionário");
            System.out.println("[4] - Remover Funcionário");
            System.out.println("[5] - Listar Funcionários");
            System.out.println("[6] - Sair");
            System.out.println("Digite o que quer fazer: ");
            String escolha = scanner.nextLine();
            switch(escolha){
                case "1": {
                    System.out.println("======|NOVO FUNCIONÁRIO|======");
                    System.out.println("Digite o nome do Funcionário: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o CPF: ");
                    String cpf = scanner.nextLine();                        
                    
                    System.out.println("Será criada uma conta para PROPRIETÁRIO? (S/N)");
                    String resposta = scanner.nextLine();

                if (resposta.equalsIgnoreCase("S")) {
                    System.out.println("Digite a senha de liberação para criar um proprietário:");
                    String senha = scanner.nextLine();

                    if (senha.equals("milhoverde")) {
                        System.out.println("Nível de acesso definido: Proprietário!");
                        String senhaPadrao = "corngreen";
                        // Crie o objeto do proprietário com senhaPadrao
                        Proprietario p = new Proprietario(nome, cpf, senha, menuLoop, 0);
                        p.setNivelAcesso(true);
                        p.setSenha(senhaPadrao);
                        p.setNome(nome);
                        p.setCpf(cpf);
                        int i = 0;
                        p.setId(i);
                        i++;
                                           
                        listaProprietario.add(p);
                        Arquivo.salvarProprietario(listaProprietario);
                    
                    
                    } else {
                        System.out.println("Senha incorreta. Ação cancelada.");
                    }
                } else {
                    System.out.println("Nível de acesso definido: Funcionário!");
                    int i = 0;
                     //intanciar funcionário
                    Funcionario f = new Funcionario(nome, cpf, super.isNivelAcesso(), 0);
                    f.setNome(nome);
                    f.setCpf(cpf);
                    f.setId(i);
                    i++;
                    
                //add o objeto f do tipo funcionario no ArrayList listaFuncionario
                listaFuncionario.add(f);
                Arquivo.salvarColaborador(listaFuncionario);
                        
                    
                    
                    
                   
                
                    break;
                }}
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
                case "6": {
                    menuLoop = false;
                    break;
                }
            }
        }
              
    }
    
}
