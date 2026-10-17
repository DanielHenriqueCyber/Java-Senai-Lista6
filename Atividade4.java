import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero (0 para parar): ");
        double numero = sc.nextDouble();
        while (numero != 0) {
            System.out.print("Digite um numero (0 para parar): ");
            numero = sc.nextDouble();
        }
        System.out.println("Voce digitou 0. Programa encerrado.");
        sc.close();
    }
}
 