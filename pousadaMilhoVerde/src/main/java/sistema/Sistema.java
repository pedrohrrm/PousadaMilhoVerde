package sistema;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import pousada.Cliente;
import pousada.ClienteComparator;
import pousada.Funcionario;
import pousada.Menu;
import pousada.Pessoa;
import pousada.Reserva;
import pousada.ReservaComparator;

/**
 *
 * @author Pedro Henrique
 */
public class Sistema {

    public static void main(String[] args) {
        //MENU CLIENTE
        Menu menu = new Menu();
        menu.menuGeral();

        // Questao 11
//    {//Letra a 
//      numTotalInstanciasPrivado foi declarado dentro da classe cliente , como private static  , 
//      logo ela só pode ser acessada dentro da classe cliente.Sua manipulação é feita apenas pelos 
//      métodos da própria classe. Como usei ela no construtor, toda vez que for criado um objeto
//      cliente, estamos acrescendo a um número ao contador de instâncias.
//      letra b
//      o atributo numTotalInstancias  está sendo declarado como protected, logo ele fica visisel para as classes filhas
//      de cliente. Logo, as classes que estendem cliente podem acessar e utilizar este contador. 
//            
//            
//      letra c
//      As duas soluções são boas para o uso, porém a com protected é mais flexivel e permite
//      que as classes filhas acessem diretamente o atributo, já a solução com private oferece
//      mais controle com relação a maneira que o valor é acessado pelas outras classes. 
//      Com relação as desvantagens, o protected possui menos segurança, pois pode ser acessado por                                        
//      qualquer classe que estenda a classe que o contenham, assim pode ocorrer um acoplamento maior                                              
//      e tornar o código mais dificil de se manter e entender.
//      Já o private, é menos flexivel, pois o seu encapsulamento torna dificil estender ou modificar o
//      seu comportamento em classes filhas, algumas informaç~oes não ficam disponíveis para as subclasses.   
// }       
        // Questao 12
        //{
//    Quantidade de instâncias de Clientes.
//        Cliente cliente1 = new Cliente("João Silva", "Rua A, 123", "joao.silva@example.com", "123.456.789-00", "(11) 1234-5678");
//        Cliente cliente2 = new Cliente("Maria Santos", "Rua B, 456", "maria.santos@example.com", "987.654.321-00", "(11) 9876-5432");
//
//        ArrayList<Cliente> lista = new ArrayList<>();
//        lista.add(cliente1);
//        lista.add(cliente2);
//        int totalInstanciasClientes = Cliente.getNumTotalInstanciasPrivado();
//        System.out.println("Total de instâncias de Cliente: " + totalInstanciasClientes);
//
//        Reserva reserva1 = new Reserva();
//        reserva1.setPreco(1000);
//        reserva1.setConta(500);
//        reserva1.setDataReserva("25072023");
//        int totalInstanciasReservas = Reserva.getNumTotalInstanciasPrivadoRes();
//        System.out.println("Total de instâncias de Reserva: " + totalInstanciasReservas);
        //    }
//    }
// Questao 13
        //{
//        Cliente cliente1 = new Cliente("João", "Rua A", "joao@email.com", "123456789", "11111111");
//        Cliente cliente2 = new Cliente("Maria", "Rua B", "maria@email.com", "987654321", "22222222");
//        Cliente cliente3 = new Cliente("Pedro", "Rua C", "pedro@email.com", "456789123", "33333333");
//
//        Reserva reserva1 = new Reserva();
//        reserva1.setPreco(100.0);
//        Reserva reserva2 = new Reserva();
//        reserva2.setPreco(150.0);
//        Reserva reserva3 = new Reserva();
//        reserva3.setPreco(80.0);
//
//        ClienteComparator clienteComparator = new ClienteComparator();
//        ReservaComparator reservaComparator = new ReservaComparator();
//
//        List<Cliente> listaClientes = new ArrayList<>();
//        listaClientes.add(cliente1);
//        listaClientes.add(cliente2);
//        listaClientes.add(cliente3);
//
//        List<Reserva> listaReservas = new ArrayList<>();
//        listaReservas.add(reserva1);
//        listaReservas.add(reserva2);
//        listaReservas.add(reserva3);
//
//        listaClientes.sort(clienteComparator);
//        listaReservas.sort(reservaComparator);
//
//        System.out.println("Lista de clientes ordenada por código:");
//        for (Cliente cliente : listaClientes) {
//            System.out.println("Código: " + cliente.getCodigo() + ", Nome: " + cliente.getNome());
//        }
//
//        System.out.println("\nLista de reservas ordenada por preço:");
//        for (Reserva reserva : listaReservas) {
//            System.out.println("Preço: " + reserva.getPreco());
//        }
//    }
// Questao 15 Uso Iterator
        //{
        //USANDO O ITERATOR!!!!!!
//        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
//        listaPessoas.add(new Cliente("João", "Rua A", "joao@email.com", "123456789", "11111111"));
//        listaPessoas.add(new Cliente("Maria", "Rua B", "maria@email.com", "987654321", "22222222"));
//
//        Iterator<Pessoa> iterator = listaPessoas.iterator();
//
//        System.out.println("Lista de Pessoas:");
//        while (iterator.hasNext()) {
//            Pessoa pessoa = iterator.next();
//            imprimir(pessoa);
//        }
//    }
//
//    public static void imprimir(Pessoa pessoa) {
//        System.out.println("Nome: " + pessoa.getNome());
//        System.out.println("Endereço: " + pessoa.getEndereco());
//        System.out.println("Email: " + pessoa.getEmail());
//        System.out.println("CPF: " + pessoa.getCpf());
//        System.out.println("Telefone: " + pessoa.getTelefone());
//        System.out.println("--------------------");
        //USANDO O FOREACH!!!!!!!
//        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
//        listaPessoas.add(new Cliente("João", "Rua A", "joao@email.com", "123456789", "11111111"));
//        listaPessoas.add(new Cliente("Maria", "Rua B", "maria@email.com", "987654321", "22222222"));
//
//        System.out.println("Lista de Pessoas:");
//        for (Pessoa pessoa : listaPessoas) {
//            imprimirPessoa(pessoa);
//        }
//    }
//    public static void imprimirPessoa(Pessoa pessoa) {
//        System.out.println("Nome: " + pessoa.getNome());
//        System.out.println("Endereço: " + pessoa.getEndereco());
//        System.out.println("Email: " + pessoa.getEmail());
//        System.out.println("CPF: " + pessoa.getCpf());
//        System.out.println("Telefone: " + pessoa.getTelefone());
//        System.out.println("--------------------");
// Questao 16
//        Cliente cliente1 = new Cliente("João", "Rua A", "joao@email.com", "123456789", "11111111");
//        Cliente cliente2 = new Cliente("Maria", "Rua B", "maria@email.com", "987654321", "22222222");
//        Cliente cliente3 = new Cliente("Pedro", "Rua C", "pedro@email.com", "456789123", "33333333");
//
//        List<Cliente> listaClientes = new ArrayList<>();
//        listaClientes.add(cliente1);
//        listaClientes.add(cliente2);
//        listaClientes.add(cliente3);
//
//        // Ordenando clientes por nome
//        System.out.println("Ordenando clientes por nome:");
//        Collections.sort(listaClientes, new ClienteComparator());
//        for (Cliente cliente : listaClientes) {
//            System.out.println(cliente.getNome());
//        }
//
//        // Criando uma nova lista com os mesmos elementos
//        List<Cliente> listaClientesPorCpf = new ArrayList<>(listaClientes);
//
//        // Ordenando clientes por CPF
//        System.out.println("\nOrdenando clientes por CPF:");
//        Collections.sort(listaClientesPorCpf, new ClienteComparator());
//        for (Cliente cliente : listaClientesPorCpf) {
//            System.out.println(cliente.getCpf());
//        }
//}
    }
}
