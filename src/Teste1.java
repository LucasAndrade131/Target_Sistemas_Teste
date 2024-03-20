public class Teste1 {
    public static void main(String[] args) {
        //Declarando as váriaveis
        int INDICE = 13, SOMA = 0, K = 0;
        //a váriavel começa com soma = 0, mas ele vai incrementando até chegar ao indice 13
        while(K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println("O valor da soma é: " + SOMA);
        //No final o valor da soma será 91
    }
}