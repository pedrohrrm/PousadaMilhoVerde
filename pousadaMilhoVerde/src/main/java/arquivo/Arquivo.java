/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arquivo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import pousada.Cliente;
import pousada.Despesa;
import pousada.Funcionario;
import pousada.Proprietario;
import pousada.Reserva;
import sistema.Balancos;

/**
 * Descrição da classe Arquivo.
 * 
 * @author Pedro Henrique
 */

public class Arquivo {
    private static final String END_ARQ_CLIENTE = "./src/main/java/arquivo/Cliente.json";
    private static final String END_ARQ_RESERVA = "./src/main/java/arquivo/Reserva.json";
    private static final String END_ARQ_COLABORADOR = "./src/main/java/arquivo/Funcionario.json";    
    private static final String END_ARQ_PROPRIETARIO = "./src/main/java/arquivo/Proprietario.json";
    private static final String END_ARQ_BALANCO = "./src/main/java/arquivo/Balanco.json";
    private static final String END_ARQ_DESPESAPOUSADA = "./src/main/java/arquivo/Despesapousada.json";

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
        System.out.println("Clientes salvos em cliente.json ");
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
        // Salvar o JSON em um arquivo
        try (FileWriter writer = new FileWriter(END_ARQ_RESERVA)) {
            String json = gson.toJson(listaReserva);
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Reservas salvas no Reserva.json ");
    }

   
    
 public static void salvarColaborador(List<Funcionario> listaFuncionario) {
        // Converter a lista de Funcionario para JSON usando Gson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(listaFuncionario);

        // Salvar o JSON em um arquivo
        try (FileWriter writer = new FileWriter(END_ARQ_COLABORADOR)) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Funcionario salvos em funcionario.json");
    }

    public static ArrayList<Funcionario> lerColaborador() {
        ArrayList<Funcionario> listaFuncionario = new ArrayList();

        try (FileReader reader = new FileReader(END_ARQ_COLABORADOR)) {
            // Ler o JSON do arquivo e converter para lista de Colaborador usando Gson
            Gson gson = new Gson();
            var listaFuncionarios = new TypeToken<List<Funcionario>>() {
            }.getType();
            listaFuncionario = gson.fromJson(reader, listaFuncionarios);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaFuncionario;
    }
 public static void salvarProprietario(List<Proprietario> listaProprietario) {
        // Converter a lista de Funcionario para JSON usando Gson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(listaProprietario);

        // Salvar o JSON em um arquivo
        try (FileWriter writer = new FileWriter(END_ARQ_PROPRIETARIO)) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Proprietario salvos em proprietario.json ");
    }

    public static ArrayList<Proprietario> lerProprietario() {
        ArrayList<Proprietario> listaProprietario = new ArrayList();

        try (FileReader reader = new FileReader(END_ARQ_PROPRIETARIO)) {
            // Ler o JSON do arquivo e converter para lista de Colaborador usando Gson
            Gson gson = new Gson();
            var listaProprietarios = new TypeToken<List<Proprietario>>() {
            }.getType();
            listaProprietario = gson.fromJson(reader, listaProprietarios);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaProprietario;
    }
    
     public static List<Reserva> lerReserva() {
        ArrayList<Reserva> listaReserva = new ArrayList<>();

        try (FileReader reader = new FileReader(END_ARQ_RESERVA)) {
            // Ler o JSON do arquivo e converter para lista de reservas usando Gson
            Gson gson = new Gson();
            Type reservaListType = new TypeToken<ArrayList<Reserva>>() {}.getType();
            listaReserva = gson.fromJson(reader, reservaListType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaReserva;
    }

    public static void salvarBalanco(ArrayList<Balancos> listaBalanco) {
         
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(listaBalanco);

        // Salvar o JSON em um arquivo
        try (FileWriter writer = new FileWriter(END_ARQ_BALANCO)) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Dados salvos em Balanco.json ");
    }
    
    public static ArrayList<Balancos> lerBalanco() {
         ArrayList<Balancos> listaBalancos = new ArrayList();

        try (FileReader reader = new FileReader(END_ARQ_BALANCO)) {
           
            Gson gson = new Gson();
            var listaB = new TypeToken<ArrayList<Balancos>>() {}.getType();
            listaBalancos = gson.fromJson(reader, listaB);
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaBalancos;
    }
public static void salvarDespesaPousada(ArrayList<Despesa> listaDepesaPousada) {
        // Converter a lista de Funcionario para JSON usando Gson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(listaDepesaPousada);

        // Salvar o JSON em um arquivo
        try (FileWriter writer = new FileWriter(END_ARQ_DESPESAPOUSADA)) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Despesas salvos em DespesaPousada.json");
    }

    public static ArrayList<Despesa> lerDespesaPousada() {
    ArrayList<Despesa> listaDepesaPousada = new ArrayList<>();

        try (FileReader reader = new FileReader(END_ARQ_DESPESAPOUSADA)) {
            // Ler o JSON do arquivo e converter para lista de Colaborador usando Gson
            Gson gson = new Gson();
            var listaDepesaPousadas = new TypeToken<List<Despesa>>() {
            }.getType();
            listaDepesaPousada = gson.fromJson(reader, listaDepesaPousadas);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaDepesaPousada;
    }
}
