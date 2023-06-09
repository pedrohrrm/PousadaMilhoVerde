/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pousada;

import java.time.LocalDateTime;

/**
 *
 * @author Pedro Henrique
 */
public class Agenda extends Cliente{

    private int totalDeReservas;
    private String idReserva;
    private int numeroQuarto;
    private LocalDateTime data;
    private String idCliente;
    private String idDespesa;

    public Agenda() {
    }

    public Agenda(int totalDeReservas, String idReserva, int numeroQuarto, LocalDateTime data, String idCliente, String idDespesa) {
        this.totalDeReservas = totalDeReservas;
        this.idReserva = idReserva;
        this.numeroQuarto = numeroQuarto;
        this.data = data;
        this.idCliente = idCliente;
        this.idDespesa = idDespesa;
    }
    

    
    public int getTotalDeReservas() {
        return totalDeReservas;
    }

    public void setTotalDeReservas(int totalDeReservas) {
        this.totalDeReservas = totalDeReservas;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdDespesa() {
        return idDespesa;
    }

    public void setIdDespesa(String idDespesa) {
        this.idDespesa = idDespesa;
    }
        @Override
    public String toString() {
        return "Agenda{" + "totalDeReservas=" + totalDeReservas + ", idReserva=" + idReserva + ", numeroQuarto=" + numeroQuarto + ", data=" + data + ", idCliente=" + idCliente + ", idDespesa=" + idDespesa + '}';
    }
}
