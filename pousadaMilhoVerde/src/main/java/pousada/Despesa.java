
package pousada;




/**
 *
 * @author Pedro Henrique
 */
public class Despesa extends Agenda {
private String descricao;
    private double valor;
    private String dataLancamento;
    private String mesLancamento;

    public Despesa() {
    }
    
    public Despesa(String descricao, double valor, String dataLancamento, String mesLancamento) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataLancamento = dataLancamento;
        this.mesLancamento = mesLancamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getMesLancamento() {
        return mesLancamento;
    }

    public void setMesLancamento(String mesLancamento) {
        this.mesLancamento = mesLancamento;
    }

    
}