public class Teste3 {
    public static void main(String[] args) {
        desafio1();
        desafio2();
        desafio3();
        desafio4();
        desafio5();
        desafio6();
    }

    public static void desafio1() {
        //definindo constantes
        int inicio = 1, fim = 9, etapa = 2;

        System.out.println("Desafio 1:");
        //For para chegar até o fim, o proximo numero par
        for (int i = inicio; i <= fim; i += etapa){
            System.out.print(i);
            if (i < fim - 1) {
                System.out.print(", ");
            }
        }
    }
    public static void desafio2() {
        int limite = 7; // Define o limite de elementos na sequência
        int[] sequencia = new int[limite];//cria um array de inteiros

        // Calcula os próximos elementos da sequência
        System.out.print("\n\nDesafio 2:\n");

        for (int i = 0; i < limite; i++) {
            sequencia[i] = (int) Math.pow(2, i+1);//calculamos a sequência, elevado à a potência de i+1
            System.out.print(sequencia[i]);
            if (i < limite - 1) { //não imprimir um virgula após o ultimo elemento
                System.out.print(", ");
            }
        }
    }
    public static void desafio3() {
        int[] tamanhoArray = new int[7];//criando um Array, especificando seu tamanho [7]
        tamanhoArray[0] = 0; //inicio será com 0
        int impar = 1;

        for (int i = 1; i < tamanhoArray.length; i++) {
            tamanhoArray[i] = tamanhoArray[i - 1] + impar;// Calcula o próximo elemento da sequência
            impar +=2;// Incrementa o valor ímpar para o próximo ciclo do loop
        }

        int ultimoIndice = tamanhoArray.length - 1; //calcula o índice do último elemento do array tamanhoArray.
        int diferenca = tamanhoArray[ultimoIndice] - tamanhoArray[ultimoIndice - 1];
        tamanhoArray[ultimoIndice] += diferenca + 2; // adicionando a diferença calculada anteriormente e mais 2
        System.out.println("\n\nDesafio 3: ");
        for (int numero : tamanhoArray) {
            System.out.print(numero);
            if (numero < tamanhoArray[ultimoIndice]) {
                System.out.print(", ");
            }
        }
    }
    public static void desafio4() {
        int numeroDeElementos = 5;//definido numero de elementos

        System.out.println("\n\nDesafio 4: ");
        for (int i = 1; i <= numeroDeElementos; i++ ) {
            int proximoNumeroPar = 2 * i;
            int proximoNumeroQuadrado = proximoNumeroPar * proximoNumeroPar;//calculado elevado proximoNumeroPar ao quadrado
            System.out.print(proximoNumeroQuadrado);
            if (i < numeroDeElementos){
                System.out.print(", ");
            }
        }
    }
    public static void desafio5() {
        int numeroDeElementos = 7, anterior = 0, atual = 1;

        System.out.println("\n\nDesafio 5:");

        for (int i = 0; i < numeroDeElementos; i++){
            System.out.print(atual);
            int proximo = anterior + atual;  //somando anterior + atual
            anterior = atual;
            atual = proximo;
            if (i < numeroDeElementos - 1){
                System.out.print(", ");
            }
        }
    }
    public static void desafio6() {
        int[] numeros = {2, 10, 12, 16, 17, 18, 19, 200};//criando array
        System.out.println("\n\nDesafio 6:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);//imprimindo os numeros no array
            if (i < numeros.length -1){
                System.out.print(", ");
            }
        }
    }
}
