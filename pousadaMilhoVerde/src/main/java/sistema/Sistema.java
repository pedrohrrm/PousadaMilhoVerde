package sistema;

import arquivo.Arquivo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import pousada.Cliente;
import pousada.Menu;

/**
 *
 * @author Pedro Henrique
 */
public class Sistema {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        //MENU CLIENTE
        Menu menu = new Menu();
        menu.menuGeral();
                

        Cliente cliente1 = new Cliente("João Silva", "Rua A, 123", "joao.silva@example.com", "123.456.789-00", "(11) 1234-5678");
        Cliente cliente2 = new Cliente("Maria Santos", "Rua B, 456", "maria.santos@example.com", "987.654.321-00", "(11) 9876-5432");
        Cliente cliente3 = new Cliente("Pedro Oliveira", "Rua C, 789", "pedro.oliveira@example.com", "456.789.123-00", "(11) 4567-8901");
        Cliente cliente4 = new Cliente("Ana Pereira", "Rua D, 987", "ana.pereira@example.com", "321.654.987-00", "(11) 7890-1234");

        ArrayList<Cliente> lista = new ArrayList<>();
        lista.add(cliente1);
        lista.add(cliente2);
        lista.add(cliente3);
        lista.add(cliente4);
        
        Cliente c = new Cliente();
        
        Collections.sort(lista, cliente1);
        System.out.println(lista);
        
        for(Cliente x: lista){
            System.out.println(x.toString());
        }
//           System.out.println(Cliente.getNumTotalInstancias());
//           System.out.println("Cliente 1" + cliente1.getNumTotalInstancias());
//           System.o1ut.println("Cliente 1" + cliente1.getNome());
//           System.out.println("Cliente 2" + cliente2.getNumTotalInstancias());
//           System.out.println("Cliente 2" + cliente2.getNome());

    }

}
