import java.util.Random;

public class Teste4 {
    public static void main(String[] args) {
    int[] resultados = simularTestes();

        System.out.println("O interruptor 1 controla a lâmpada " + resultados[0]);
        System.out.println("O interruptor 2 controla a lâmpada " + resultados[1]);
        System.out.println("O interruptor 3 controla a lâmpada " + resultados[2]);
    }

    public static int[] simularTestes() {
        // Inicializa um array para representar o estado das lâmpadas
        // 0 - Desligada e fria, 1 - Acesa, 2 - Desligada e quente
        int[] lampadas = new int[3];

        // Simula o estado inicial das lâmpadas
        Random rand = new Random();
        int ligaPrimeiro = rand.nextInt(3) + 1; // Qual interruptor é ligado primeiro
        // Liga o primeiro interruptor
        ligarInterruptor(ligaPrimeiro, lampadas);

        // Liga o segundo interruptor
        int ligaSegundo = (ligaPrimeiro % 3) + 1; // Garante que não ligue o mesmo interruptor novamente
        ligarInterruptor(ligaSegundo, lampadas);

        // Determina qual interruptor controla qual lâmpada
        int[] resultados = new int[3];
        for (int i = 0; i < 3; i++) {
            if (lampadas[i] == 0) {
                resultados[2] = i + 1; // Terceiro interruptor controla lâmpadas desligadas e frias
            } else if (lampadas[i] == 1) {
                resultados[1] = i + 1; // Segundo interruptor controla lâmpadas acesas
            } else {
                resultados[0] = i + 1; // Primeiro interruptor controla lâmpadas desligadas e quentes
            }
        }
        return resultados;
    }

    public static void ligarInterruptor(int interruptor, int[] lampadas) {
        // Simula o efeito de ligar um interruptor
        for (int i = 0; i < lampadas.length; i++) {
            if ((i + 1) % interruptor == 0 || i == interruptor - 1) {
                lampadas[i] = (lampadas[i] + 1) % 3; // Alterna o estado da lâmpada
            }
        }
    }
}
