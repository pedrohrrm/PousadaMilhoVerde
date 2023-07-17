package pousada;
/**
 *
 * @author Pedro Henrique
 */
public class Quarto {
    private double diaria, despesas;
    //verificar esse vetor
    int [] aptoLuxo = new int [5];
    int [] aptoSimples = new int [5];


    public Quarto() {
    }

    public Quarto(double diaria, double despesas) {
        this.diaria = diaria;
        this.despesas = despesas;
    }

    Quarto(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Quarto{" + "diaria=" + diaria + ", despesas=" + despesas + ", aptoLuxo=" + aptoLuxo + ", aptoSimples=" + aptoSimples + '}';
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

    public int[] getAptoLuxo() {
        return aptoLuxo;
    }

    public void setAptoLuxo(int[] aptoLuxo) {
        this.aptoLuxo = aptoLuxo;
    }

    public int[] getAptoSimples() {
        return aptoSimples;
    }

    public void setAptoSimples(int[] aptoSimples) {
        this.aptoSimples = aptoSimples;
    }
public double calcularValorTotal(int numDias) {
        return diaria * numDias;
    }

}
