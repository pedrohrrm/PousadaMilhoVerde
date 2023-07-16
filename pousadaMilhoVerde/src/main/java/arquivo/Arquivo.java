/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arquivo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import pousada.Cliente;
import pousada.Reserva;
import java.time.LocalDateTime;
import java.time.LocalDate;

/**
 *
 * @author Pedro Henrique
 */
public class Arquivo {

    private static final String END_ARQ_CLIENTE = "./src/main/java/arquivo/Cliente.json";

    private static final String END_ARQ_RESERVA = "./src/main/java/arquivo/Reserva.json";

    public static void salvarClientes(List<Cliente> listaCliente) {
        // Converter a lista de clientes para JSON usando Gson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(listaCliente);

        // Salvar o JSON em um arquivo
        try (FileWriter writer = new FileWriter(END_ARQ_CLIENTE)) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Clientes salvos em ");
    }

    public static List<Cliente> lerClientes() {
        ArrayList<Cliente> listaCliente = new ArrayList();

        try (FileReader reader = new FileReader(END_ARQ_CLIENTE)) {
            // Ler o JSON do arquivo e converter para lista de clientes usando Gson
            Gson gson = new Gson();
            var tipoListaClientes = new TypeToken<List<Cliente>>() {
            }.getType();
            listaCliente = gson.fromJson(reader, tipoListaClientes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaCliente;
    }

    public static void salvarReserva(List<Reserva> listaReserva) {
        // Converter a lista de clientes para JSON usando Gson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(listaReserva);

        // Salvar o JSON em um arquivo
        try (FileWriter writer = new FileWriter(END_ARQ_RESERVA)) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Reservas salvas em ");
    }

    public static List<Reserva> lerReserva() {
        ArrayList<Reserva> listaReserva = new ArrayList();

        try (FileReader reader = new FileReader(END_ARQ_RESERVA)) {
            System.out.println(reader.toString());
            // Ler o JSON do arquivo e converter para lista de reservas usando Gson
            Gson gson = new Gson();
           Reserva[] reservasArray = gson.fromJson(reader, Reserva[].class);

            // Adiciona cada objeto Reserva à lista
            for (Reserva reserva : reservasArray) {
                listaReserva.add(reserva);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaReserva;

    }
    


}
