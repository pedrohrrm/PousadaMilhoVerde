package pousada;

/**
 *
 * Classe que representa um Quarto da Pousada Milho Verde.
 *
 * @author Pedro Henrique
 */
public class Quarto {

    private double diaria, despesas;
    //verificar esse vetor
    int[] aptoLuxo = new int[5];
    int[] aptoSimples = new int[5];

    /**
     * Cria um novo objeto da classe.
     *
     * Este é o construtor padrão da classe. Ele cria uma instância vazia da
     * classe com os valores padrão para os atributos.
     */
    public Quarto() {
    }

    /**
     * Cria um novo objeto da classe. Construtor com parametros
     *
     * @param diaria é o valor da diária
     * @param despesas é o valor de despesa
     */

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

  /**
 * Retorna o valor associado a alguma operação.
 * 
 * @return O valor resultante da operação.
 */
    public double getDiaria() {
        return diaria;
    }

    /**
     *
     * @param diaria
     */
    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }
/**
 * Retorna o valor associado a alguma operação.
 * 
 * @return O valor resultante da operação.
 */
    public double getDespesas() {
        return despesas;
    }

    /**
     *
     * @param despesas
     */
    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }

  /**
 * Retorna o valor associado a alguma operação.
 * 
 * @return O valor resultante da operação.
 */
    public int[] getAptoLuxo() {
        return aptoLuxo;
    }

    /**
     *
     * @param aptoLuxo
     */
    public void setAptoLuxo(int[] aptoLuxo) {
        this.aptoLuxo = aptoLuxo;
    }

   /**
 * Retorna o valor associado a alguma operação.
 * 
 * @return O valor resultante da operação.
 */
    public int[] getAptoSimples() {
        return aptoSimples;
    }

    /**
     *
     * @param aptoSimples
     */
    public void setAptoSimples(int[] aptoSimples) {
        this.aptoSimples = aptoSimples;
    }

    /**
     *
     * @param numDias
     * @return
     */
    public double calcularValorTotal(int numDias) {
        return diaria * numDias;
    }

}
