/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pousada;

/**
 *udshfbdsbhfudsbf
 * 
 * @author Pedro Henrique
 */
public class Agenda extends Cliente {

    private int totalDeReservas;
    private String idReserva;
    private int numeroQuarto;
    private String data;
    private String idCliente;
    private String idDespesa;

    /**
 * Cria um novo objeto da classe.
 * 
 * Este é o construtor padrão da classe. Ele cria uma instância
 * vazia da classe com os valores padrão para os atributos.
 */
    public Agenda() {
    }

    
 /**
 * Cria um novo objeto da classe Pessoa.
 * @param totalDeReservas é o total
 * @param idReserva é o id da reserva
 * @param numeroQuarto é o número do quarto
 * @param data é a data
 * @param idCliente é o id do cliente
 * @param idDespesa é o id da despesa
 */    
    public Agenda(int totalDeReservas, String idReserva, int numeroQuarto, String data, String idCliente, String idDespesa) {
        this.totalDeReservas = totalDeReservas;
        this.idReserva = idReserva;
        this.numeroQuarto = numeroQuarto;
        this.data = data;
        this.idCliente = idCliente;
        this.idDespesa = idDespesa;
    }
/**
 * Retorna o valor associado a alguma operação.
 * 
 * @return O valor resultante da operação.
 */
    public int getTotalDeReservas() {
        return totalDeReservas;
    }
/**
 * 
 * @param totalDeReservas 
 */
    public void setTotalDeReservas(int totalDeReservas) {
        this.totalDeReservas = totalDeReservas;
    }
/**
 * Retorna o valor associado a alguma operação.
 * 
 * @return O valor resultante da operação.
 */
    public String getIdReserva() {
        return idReserva;
    }
/**
 * 
 * @param idReserva 
 */
    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }
/**
 * Retorna o valor associado a alguma operação.
 * 
 * @return O valor resultante da operação.
 */
    public int getNumeroQuarto() {
        return numeroQuarto;
    }
/**
 * 
 * @param numeroQuarto 
 */
    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }
/**
 * Retorna o valor associado a alguma operação.
 * 
 * @return O valor resultante da operação.
 */
    public String getData() {
        return data;
    }
/**
 * 
 * @param data 
 */
    public void setData(String data) {
        this.data = data;
    }
/**
 * Retorna o valor associado a alguma operação.
 * 
 * @return O valor resultante da operação.
 */
 
    public String getIdCliente() {
        return idCliente;
    }
/**
 * 
 * @param idCliente 
 */
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
/**
 * Retorna o valor associado a alguma operação.
 * 
 * @return O valor resultante da operação.
 */
    public String getIdDespesa() {
        return idDespesa;
    }
/**
 * 
 * @param idDespesa 
 */
    public void setIdDespesa(String idDespesa) {
        this.idDespesa = idDespesa;
    }

    @Override
    public String toString() {
        return "Agenda{" + "totalDeReservas=" + totalDeReservas + ", idReserva=" + idReserva + ", numeroQuarto=" + numeroQuarto + ", data=" + data + ", idCliente=" + idCliente + ", idDespesa=" + idDespesa + '}';
    }

}
