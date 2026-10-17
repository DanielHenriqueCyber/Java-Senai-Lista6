import java.util.Scanner;
public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();
        while (numero < 0) {
            System.out.println("Numero invalido!");
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();
        }
        int fatorial = 1;
        int i = numero;
        while (i > 1) {
            fatorial = fatorial * i;
            i = i - 1;
        }
        System.out.println("Fatorial de " + numero + " = " + fatorial);
        sc.close();
    }
}
 