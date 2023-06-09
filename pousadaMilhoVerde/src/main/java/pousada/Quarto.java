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

//    public double diariaLuxo(){
//        Quarto lux = new Quarto();
//        lux.diaria = 389.90;
//        return diaria;
//    }
//    public double diariaSimples(){
//        Quarto simp = new Quarto();
//        simp.diaria = 99.99;
//        return diaria;
//    }
}
