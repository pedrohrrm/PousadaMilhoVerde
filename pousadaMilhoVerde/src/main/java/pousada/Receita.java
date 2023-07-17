
package pousada;

/**
 *
 * @author Pedro Henrique
 */
public class Receita extends Agenda {
    private String idVenda;
    private double lucro;
    private double receita;

    public Receita() {
    }

    @Override
    public String toString() {
        return "Receita{" + "idVenda=" + idVenda + ", lucro=" + lucro + ", receita=" + receita + '}';
    }

    

    public String getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(String idVenda) {
        this.idVenda = idVenda;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public double getReceita() {
        return receita;
    }

    public void setReceita(double receita) {
        this.receita = receita;
    }
    
}
