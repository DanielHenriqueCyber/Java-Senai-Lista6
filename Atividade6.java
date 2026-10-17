import java.util.Scanner;
public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a base: ");
        int base = sc.nextInt();
        System.out.print("Digite o expoente (0 ou maior): ");
        int expoente = sc.nextInt();
        while (expoente < 0) {
            System.out.println("Expoente invalido!");
            System.out.print("Digite o expoente (0 ou maior): ");
            expoente = sc.nextInt();
        }
        long resultado = 1;
        int contador = 1;
        while (contador <= expoente) {
            resultado = resultado * base;
            contador = contador + 1;
        }
        System.out.println(base + " elevado a " + expoente + " = " + resultado);
        sc.close();
    }
}
 