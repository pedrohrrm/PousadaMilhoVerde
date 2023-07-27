/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pousada;

import java.util.Comparator;

/**
 * Classe que representa um cliente da Pousada Milho Verde.
 * @author Pedro Henrique
 */
public class ClienteComparator implements Comparator<Cliente> {
     @Override
    public int compare(Cliente cliente1, Cliente cliente2) {
        // Comparação por nome
        int comparacaoPorNome = cliente1.getNome().compareTo(cliente2.getNome());

        // Se os nomes forem diferentes, retorna a comparação por nome
        if (comparacaoPorNome != 0) {
            return comparacaoPorNome;
        }

        // Comparação por CPF
        return cliente1.getCpf().compareTo(cliente2.getCpf());
    
    }   
}
