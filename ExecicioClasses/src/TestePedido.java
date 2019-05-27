
import java.util.Scanner;

public class TestePedido {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o nome do cliente: ");
        String nomeCliente = input.nextLine();

        System.out.println("Insira a descrição do pedido: ");
        String descPedido = input.nextLine();
        
        System.out.println("O nome do cliente é: " + nomeCliente);

        System.out.println("Descrição da pedido é: " + descPedido);

    }
}
