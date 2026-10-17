import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        int negativos = 0;
        while (contador <= 10) {
            System.out.print("Digite o numero " + contador + ": ");
            double numero = sc.nextDouble();
            if (numero < 0) {
                negativos = negativos + 1;
            }
            contador = contador + 1;
        }
        System.out.println("Quantidade de numeros negativos: " + negativos);
        sc.close();
    }
}
 