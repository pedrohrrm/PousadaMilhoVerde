package pousada;
/**
 *
 * @author Pedro Henrique
 */
public class Quarto {
    private String tipo;
    private double diaria, despesas;

    @Override
    public String toString() {
        return "Quarto{" + "tipo=" + tipo + ", diaria=" + diaria + ", despesas=" + despesas + '}';
    }

    public Quarto() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public double getDespesas() {
        return despesas;
    }

    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }
    
    
}
