package sistema;

import java.util.ArrayList;
import pousada.Cliente;
import pousada.Menu;

/**
 *
 * @author Pedro Henrique
 */
public class Sistema {

    public static void main(String[] args) {
        //MENU CLIENTE
        Menu menu = new Menu();
        menu.menuGeral();
        
        

        // Questao 123
        //{
//    Quantidade de instâncias de Clientes.
        Cliente cliente1 = new Cliente("João Silva", "Rua A, 123", "joao.silva@example.com", "123.456.789-00", "(11) 1234-5678");
        Cliente cliente2 = new Cliente("Maria Santos", "Rua B, 456", "maria.santos@example.com", "987.654.321-00", "(11) 9876-5432");

        ArrayList<Cliente> lista = new ArrayList<>();
        lista.add(cliente1);
        lista.add(cliente2);

        System.out.println("Total de instancias Cliente criadas" + Cliente.getNumTotalInstancias());
        //    }
        
    }
//    // Questao 1
//    {
//    Todas as classes foram implementadas e todos os métodos e atributos
//    }

}
