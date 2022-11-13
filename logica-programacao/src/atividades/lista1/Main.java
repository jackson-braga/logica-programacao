import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        int[][] matriz = montarEPreencherQuadrado();
        //Variável de teste:
        //int[][] matriz = { {20,6,7,17}, {9,15,14,12}, {13,11,10,16}, {8,18,19,5} };

        // A ideia é criar duas variáveis. Uma representará o calculo
        //atual, e a outra o calculo anterior. Desta forma, será levantada
        // uma exceção caso os resultados difiram, informando que o quadrado
        // não é perfeito.
        int resultadoA = 0;
        int resultadoB = 0;


        //Calculando número de linhas e colunas:
        int tamanho = matriz[0].length;


        //Percorrendo linhas e calculando soma:
        for (int i = 0; i<tamanho; i++){
            resultadoB = 0;
            for (int j = 0; j < tamanho; j++){
                resultadoB = resultadoB + matriz[i][j];
            }
            //Para a primeira execução:
            if (i==0){resultadoA=resultadoB;}
            //Onde é levantada a exceção:
            if (resultadoA != resultadoB){
                throw new Exception("Não é um quadrado perfeito!");
            }
        }


        //Percorrendo colunas e calculando soma:
        for (int i = 0; i<tamanho; i++){
            resultadoB = 0;
            for (int j = 0; j < tamanho; j++){
                resultadoB = resultadoB + matriz[j][i];
            }
            //Onde é levantada a exceção:
            if (resultadoA != resultadoB){
                throw new Exception("Não é um quadrado perfeito!");
            }
        }


        //Percorrendo diagonal principal e calculando soma:
        resultadoB = 0;
        for (int i = 0; i<tamanho; i++){
            for (int j = 0; j < tamanho; j++){
                if (i==j){
                    resultadoB = resultadoB + matriz[i][i];
                }
            }
        }
        //Onde é levantada a exceção:
        if (resultadoA != resultadoB){
            throw new Exception("Não é um quadrado perfeito!");
        }


        //Percorrendo diagonal secundária e calculando soma:
        resultadoB = 0;
        for (int i = 0; i<tamanho; i++){
            resultadoB = resultadoB + matriz[i][tamanho - 1 - i];
            }
            //Onde é levantada a exceção:
            if (resultadoA != resultadoB){
                throw new Exception("Não é um quadrado perfeito!");
            }

            System.out.println("É um quadrado perfeito!");
        }



    public static int[][] montarEPreencherQuadrado() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do quadrado desejado:");
        int tamanho = scanner.nextInt();
        int[][] matriz = new int[tamanho][tamanho];
        for (int linha = 0; linha < matriz.length; linha++) {
            int[] colunas = matriz[linha];
            for (int coluna = 0; coluna < colunas.length; coluna++) {
                int valorAleatorio = random.nextInt(0, 1000);
                colunas[coluna] = valorAleatorio;
                System.out.print("[" + valorAleatorio + "]");
            }
            System.out.println();
        }
        return matriz;
    }

}
