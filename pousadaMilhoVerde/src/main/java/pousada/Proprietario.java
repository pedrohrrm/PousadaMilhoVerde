
package pousada;



/**
 *
 * Classe que representa um Proprietário da Pousada Milho Verde.
 * @author Pedro Henrique
 */
public class Proprietario extends Pessoa{

    
    /**
 * Cria um novo objeto da classe.
 * 
 * Este é o construtor padrão da classe. Ele cria uma instância
 * vazia da classe com os valores padrão para os atributos.
 */
    public Proprietario() {
    }
/**
 * Cria um novo objeto da classe.
 * Construtor com parametros
 * @param nome é o nome do proprietário
 * @param cpf é o cpf do proprietário
 * @param senha é a senha de acesso
 * @param nivelAcesso é o nível de acesso
 * @param id é o id
 * 
 */
 
    public Proprietario(String nome, String cpf, String senha, boolean nivelAcesso, int id) {
        super(nome, cpf, senha, nivelAcesso, id);
    }  

    @Override
    public String toString() {
        return "Proprietario{" + '}';
    }




}