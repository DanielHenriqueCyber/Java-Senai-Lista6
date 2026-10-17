import java.util.Scanner;
public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        System.out.print("Digite o preco do produto (valor negativo para parar): ");
        double preco = sc.nextDouble();
        while (preco >= 0) {
            total = total + preco;
            System.out.print("Digite o preco do produto (valor negativo para parar): ");
            preco = sc.nextDouble();
        }
        System.out.println("Total da compra: R$ " + total);
        sc.close();
    }
}
 