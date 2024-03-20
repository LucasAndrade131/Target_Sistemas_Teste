import java.util.Scanner;
public class Teste5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String entrada = scanner.nextLine(); //Lê linha completa,e o método trim() remove os espaços em branco
        String saida = "";

        //realizando a reversão da String
        for (int i = entrada.length() - 1; i >= 0; i--){
            saida += entrada.charAt(i);//charAt() para acessar caracteres individualmente
        }
        System.out.println("Palavra invertida: " + saida);
    }
}
