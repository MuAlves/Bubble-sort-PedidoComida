package hamburgueria;

import java.util.Random;

/**s
 *
 * @author Murilo Alves RGM: 23760125
 * 
 * @author Guilherme Araújo Da Silva RGM: 23442701
 * 
 */
      
public class Pedido {

    // variavel global para aux na senha
    static int aux  = 1;
    
    //var de controle 
    private String lanche;
    private double valorLanche;
    private double valorBebida;
    private double valorTotal;
    private int quantidade;
    private int pedidoL;
    private int pedidoB;

    
    public Pedido() {
    }

    public String getLanche() {
        return lanche;
    }

    public double getValorLanche() {
        return valorLanche;
    }

    public void setValorLanche(double valorLanche) {
        this.valorLanche = valorLanche;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public void setLanche(String lanche) {
        this.lanche = lanche;
    }

    public double getvalorLanche() {
        return valorLanche;
    }

    public void setvalorLanche(double valorLanche) {
        this.valorLanche = valorLanche;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPedido() {
        return pedidoL;
    }

    public void setPedido(int pedido) {
        this.pedidoL = pedido;
    }

    public int getPedidoL() {
        return pedidoL;
    }

    public void setPedidoL(int pedidoL) {
        this.pedidoL = pedidoL;
    }

    public int getPedidoB() {
        return pedidoB;
    }

    public void setPedidoB(int pedidoB) {
        this.pedidoB = pedidoB;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    //metodos para imprimir as primeiras opções lanches
    public void imprimeDadosLanche() {
        System.out.println("***************************************************************"
                + "*****************************************************");
        System.out.println("Bem vindo a Hamburgueria UNICSUL! \nAbaixo esta nosso cardápio de lanches, "
                + "basta apenas selecionar o número desejado para selecionar o lanche escolhido:\n");
        System.out.println("\n1 = X-Salada, valor de R$:18,00 "
                + "\n2 = X-Bacon, valor de R$:20,00 "
                + "\n3 = X-Picanha, valor de R$:26,00 ");
        System.out.println("***************************************************************"
                + "*****************************************************");
    }

    //metodos para imprimir a segunda opções bebidas
    public void imprimeDadosBebidas() {
        System.out.println("***************************************************************"
                + "*****************************************************");
        System.out.println("\nAbaixo esta nosso cardápio de bebidas, "
                + "basta apenas selecionar o número desejado para selecionar a bebida desejada:\n");
        System.out.println("\n1 = Coca-Cola, valor de R$:7,00 "
                + "\n2 = Guaraná, valor de R$:6,00 "
                + "\n3 = Água, valor de R$:4,00 ");
    }

    //metodo do total a pagar
    double totalApagar() {
        setValorTotal(getValorLanche() + getValorBebida());
        System.out.println("Total à pagar: R$: " + getValorTotal());
        System.out.println("***************************************************************"
                + "*****************************************************");
        return getValorTotal();
    }

    //switch que efetua a verificação do numeros selecionados no pedido e set o valor do pedido para ir na soma do total a pagar
    public void pedidoSelecionadoLanche() {
        switch (pedidoL) {
            case 1:
                System.out.printf("\nSeu lanche solicitado foi o 1 = X-Salada, no valor de R$:18,00 \n");
                System.out.println("***************************************************************"
                        + "*****************************************************");
                setvalorLanche(18f);
                break;
            case 2:
                System.out.printf("\nSeu lanche solicitado foi o 2 = X-Bacon, no valor de R$:20,00 \n");
                System.out.println("***************************************************************"
                        + "*****************************************************");
                setvalorLanche(20f);
                break;
            case 3:
                System.out.printf("\nSeu lanche solicitado foi o 3 = X-Picanha, no valor de R$:26,00 \n");
                System.out.println("***************************************************************"
                        + "*****************************************************");
                setvalorLanche(26f);
                break;
            default:
                System.out.printf("Você digitou uma operação inválida.\n");
        }
    }

    //switch que efetua a verificação do numeros selecionados no pedido e set o valor do pedido para ir na soma do total a pagar
    public void pedidoSelecionadoBebida() {
        switch (pedidoB) {
            case 1:
                System.out.printf("\nSua bebida solicitada foi a 1 = Coca-Cola, no valor de R$:7,00 \n");
                System.out.println("***************************************************************"
                        + "*****************************************************");
                setValorBebida(7f);
                break;
            case 2:
                System.out.printf("\nSua bebida solicitada foi a 2 = Guarana, no valor de R$:6,00 \n");
                System.out.println("***************************************************************"
                        + "*****************************************************");
                setValorBebida(6f);
                break;
            case 3:
                System.out.printf("\nSua bebida solicitada foi a 3 = Água, no valor de R$:4,00 \n");
                System.out.println("***************************************************************"
                        + "*****************************************************");
                setValorBebida(4f);
                break;
            default:
                System.out.printf("Você digitou uma operação inválida.\n");
        }
    }

    
    public static void incluir() {
        // vetor utilizado e 2 pois só estamos coletando duas senhas
        int n = 2;
        //executa o for com o senha pedido
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = senhaDoPedido();
        }
        
        
        System.out.println("***************************************************************"
                        + "*****************************************************");
        System.out.println("\nFila de pedidos: ");
        //executa o bubble sort
        bubbleSort(v, v.length);
        //mostra numero vetor 
        mostraNumero(v, v.length);
    }

    public static int senhaDoPedido() {
        Random gerador = new Random();
        int numero = gerador.nextInt(50);
        System.out.println("\nSua senha do pedido "+ aux +" é: " + numero);
        aux ++;
        return numero;
    }

    public static void mostraNumero(int[] v, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(v[i]);
        }
    }

    public static void bubbleSort(int[] v, int n) {
        int aux;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (v[j] < v[i]) {
                    aux = v[j];
                    v[j] = v[i];
                    v[i] = aux;
                }
            }
        }
    }
}
