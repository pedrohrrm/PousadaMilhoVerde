package pousada;

/**
 *  * Classe que representa despesas da Pousada Milho Verde.

 *
 * @author Pedro Henrique
 */
public class Despesa extends Agenda {

    private String descricao;
    private double valor;
    private String dataLancamento;
    private String mesLancamento;
/**
 * Cria um novo objeto da classe.
 * 
 * Este é o construtor padrão da classe. Ele cria uma instância
 * vazia da classe com os valores padrão para os atributos.
 */
    public Despesa() {
    }
/**
 * Cria um novo objeto da classe.
 * Construtor com parametros
 * @param descricao é a descrição
 * @param valor é o valor
 * @param dataLancamento é a data que é lançado
 * @param mesLancamento é o mes de lancamento
 */
 
    public Despesa(String descricao, double valor, String dataLancamento, String mesLancamento) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataLancamento = dataLancamento;
        this.mesLancamento = mesLancamento;
    }
/**
 * Retorna o valor associado a alguma operação.
 * 
 * @return O valor resultante da operação.
 */
    public String getDescricao() {
        return descricao;
    }
/**
 * 
 * @param descricao 
 */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
/**
 * Retorna o valor associado a alguma operação.
 * 
 * @return O valor resultante da operação.
 */
    public double getValor() {
        return valor;
    }
/**
 * 
 * @param valor 
 */
    public void setValor(double valor) {
        this.valor = valor;
    }
/**
 * Retorna a data de lançamento.
 * 
 * @return A data de lançamento no formato de String.
 */
    public String getDataLancamento() {
        return dataLancamento;
    }
/**
 * 
 * @param dataLancamento 
 */
    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
/**
 * Retorna o valor associado a alguma operação.
 * 
 * @return O valor resultante da operação.
 */
    public String getMesLancamento() {
        return mesLancamento;
    }
/**
 * 
 * @param mesLancamento 
 */
    public void setMesLancamento(String mesLancamento) {
        this.mesLancamento = mesLancamento;
    }

    @Override
    public String toString() {
        return "Despesa{" + "descricao=" + descricao + ", valor=" + valor + ", dataLancamento=" + dataLancamento + ", mesLancamento=" + mesLancamento + '}';
    }

}
