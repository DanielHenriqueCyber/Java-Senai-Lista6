import java.util.Scanner;
public class Atividade9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int quantidade = 0;
        System.out.print("Digite uma idade (0 para parar): ");
        int idade = sc.nextInt();
        while (idade != 0) {
            soma = soma + idade;
            quantidade = quantidade + 1;
            System.out.print("Digite uma idade (0 para parar): ");
            idade = sc.nextInt();
        }
        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.println("Media de idade do grupo: " + media);
        } else {
            System.out.println("Nenhuma idade foi digitada.");
        }
        sc.close();
    }
}
 