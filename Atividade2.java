import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();
        while (!senha.equals("1234")) {
            System.out.println("Senha Incorreta, tente novamente");
            System.out.print("Digite a senha: ");
            senha = sc.nextLine();
        }
        System.out.println("Senha correta! Acesso liberado.");
        sc.close();
    }
}
 