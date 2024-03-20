import java.util.Scanner;

public class Teste2Fibonacci {
    public static void main(String[] args) {
        int armazenamento1 = 0, armazenamento2 = 1, armazenamento3 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para gerar a sequência de Fibonnaci: ");
        int valor = scanner.nextInt();

        // Validação para números negativos
        if (valor < 0) {
            System.out.println("A sequência de Fibonacci não está definida para números negativos.");
        } else {
            boolean pertence = false;
            while (valor > armazenamento3) {
                armazenamento3 = armazenamento1 + armazenamento2;
                armazenamento1 = armazenamento2;
                armazenamento2 = armazenamento3;
                if (valor == armazenamento3) {
                    pertence = true;
                    break;
                }
            }// caso pertence ou for igual a 0 ou 1 = TRUE
            if (pertence || valor == 0 || valor == 1) {
                System.out.println("O número " + valor + " faz parte da sequência de Fibonacci.");
            } else { //caso não respeitar a primeira condinção = FALSE
                System.out.println("O número " + valor + " não faz parte da sequência de Fibonacci.");
            }
        }
    }
}
