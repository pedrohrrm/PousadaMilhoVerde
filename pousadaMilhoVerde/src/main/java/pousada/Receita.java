
package pousada;

/**
 * Classe que representa uma Receita da Pousada Milho Verde.
 *
 * @author Pedro Henrique
 */
public class Receita extends Agenda {
    private String idVenda;
    private double lucro;
    private double receita;

    /**
 * Cria um novo objeto da classe.
 * 
 * Este é o construtor padrão da classe. Ele cria uma instância
 * vazia da classe com os valores padrão para os atributos.
 */
    public Receita() {
    }

    @Override
    public String toString() {
        return "Receita{" + "idVenda=" + idVenda + ", lucro=" + lucro + ", receita=" + receita + '}';
    }

    
/**
 * Retorna o valor associado a alguma operação.
 * 
 * @return O valor resultante da operação.
 */
    public String getIdVenda() {
        return idVenda;
    }
/**
 * 
 * @param idVenda 
 */
    public void setIdVenda(String idVenda) {
        this.idVenda = idVenda;
    }
/**
 * Retorna o valor associado a alguma operação.
 * 
 * @return O valor resultante da operação.
 */
    public double getLucro() {
        return lucro;
    }
/**
 * 
 * @param lucro 
 */
    public void setLucro(double lucro) {
        this.lucro = lucro;
    }
/**
 * Retorna o valor associado a alguma operação.
 * 
 * @return O valor resultante da operação.
 */
    public double getReceita() {
        return receita;
    }
/**
 * 
 * @param receita 
 */
    public void setReceita(double receita) {
        this.receita = receita;
    }
    
}
