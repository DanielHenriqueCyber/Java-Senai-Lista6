public class Atividade8 {
    public static void main(String[] args) {
        double cidadeA = 1000;
        double cidadeB = 1500;
        int anos = 0;
        while (cidadeA <= cidadeB) {
            cidadeA = cidadeA + cidadeA * 0.02;
            cidadeB = cidadeB + cidadeB * 0.01;
            anos = anos + 1;
        }
        System.out.println("A cidade A passara a cidade B em " + anos + " anos.");
        System.out.println("Populacao da cidade A: " + (int) cidadeA);
        System.out.println("Populacao da cidade B: " + (int) cidadeB);
    }
}
