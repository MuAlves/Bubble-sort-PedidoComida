package hamburgueria;

import java.util.Scanner;

/**
 *
 * @author Murilo Alves RGM: 23760125
 * 
 * @author Guilherme Araújo Da Silva RGM: 23442701
 * 
 */
public class Matriz {

    public static void main(String[] args) {

        Pedido pd1 = new Pedido();
        Scanner keyboard = new Scanner(System.in);

        pd1.imprimeDadosLanche();
        System.out.println("\nDigite o lanche desejado: ");
        pd1.setPedidoL(keyboard.nextInt());
        pd1.pedidoSelecionadoLanche();
        pd1.imprimeDadosBebidas();
        System.out.println("\nDigite a bebida desejada: ");
        pd1.setPedidoB(keyboard.nextInt());
        pd1.pedidoSelecionadoBebida();  
        pd1.totalApagar();
        
        Pedido pd2 = new Pedido();

        System.out.println();
        pd2.imprimeDadosLanche();
        System.out.println("\nDigite o lanche desejado: ");
        pd2.setPedidoL(keyboard.nextInt());
        pd2.pedidoSelecionadoLanche();
        pd2.imprimeDadosBebidas();
        System.out.println("\nDigite a bebida desejada: ");
        pd2.setPedidoB(keyboard.nextInt());
        pd2.pedidoSelecionadoBebida();
        pd2.totalApagar();

        Pedido.incluir();
        
    }
}
