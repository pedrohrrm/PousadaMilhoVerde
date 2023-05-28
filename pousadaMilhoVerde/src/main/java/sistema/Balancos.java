/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

/**
 *
 * @author Pedro Henrique
 */
public class Balancos {
    private double receita, despesa;

    @Override
    public String toString() {
        return "Balancos{" + "receita=" + receita + ", despesa=" + despesa + '}';
    }

    public Balancos() {
    }

    public double getReceita() {
        return receita;
    }

    public void setReceita(double receita) {
        this.receita = receita;
    }

    public double getDespesa() {
        return despesa;
    }

    public void setDespesa(double despesa) {
        this.despesa = despesa;
    }

  
    
}
