import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma nota entre 0 e 10: ");
        double nota = sc.nextDouble();
        while (nota < 0 || nota > 10) {
            System.out.println("Nota invalida!");
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = sc.nextDouble();
        }
        System.out.println("Nota valida: " + nota);
 
        sc.close();
    }
}
 