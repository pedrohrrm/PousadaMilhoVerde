/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pousada;

import java.util.Comparator;

/**
 *
 * @author Pedro Henrique
 */
public class ReservaComparator implements Comparator<Reserva> {
    
    public int compare(Reserva reserva1, Reserva reserva2) {
        return Double.compare(reserva1.getPreco(), reserva2.getPreco());
    }
    
}
