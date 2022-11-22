public class Operadores {

    public static void main(String[] args) {
//        Aritméticos
//        soma (+) e Concatenação de String
//        subtração (-)
//        multiplicação (*)
//        divisão (/)
//        DIV (/)
//        MOD (%)

//        soma (+)
        int numero1 = 2;
        int numero2 = 3;
        int soma = numero1 + numero2;

        System.out.println("\nOperador soma(+): " + soma);


//        subtração (-)
        numero1 = 5;
        numero2 = 2;
        int subtracao = numero1 - numero2;

        System.out.println("Operador subtração(-): " + subtracao);

//        multiplicação (*)
        numero1 = 5;
        numero2 = 2;
        int multiplicacao = numero1 * numero2;

        System.out.println("Operador multiplicacao(*): " + multiplicacao);

//        divisão (/)
        numero1 = 10;
        numero2 = 2;
        int divisao = numero1 / numero2;

        System.out.println("Operador divisao(/): " + divisao);

        numero1 = 5;
        numero2 = 2;
        float divisaoFloat = numero1 / numero2;

        System.out.println("Operador divisão com pontos flutuantes (/): " + divisaoFloat);

        float numeroFloat1 = 5;
        float numeroFloat2 = 2;
        float divisaoFloat2 = numeroFloat1 / numeroFloat2;

        System.out.println("Operador divisão com pontos flutuantes (/): " + divisaoFloat2);

//        DIV (/)
        numero1 = 5;
        numero2 = 2;
        long div = numero1 / numero2;

        System.out.println("Operador div(/): " + div);

//        MOD (%)
        numero1 = 15;
        numero2 = 6;
        int mod = numero1 % numero2;

        System.out.println("Operador mod(%): " + mod);


//        Operadores Lógicos
//        negação/NOT (!)
//        E/AND (&&)
//        OU/OR (||)

        boolean verdade = true;
        boolean falso = false;

//        negação/NOT (!)
        boolean negacao = !verdade;
        System.out.println("negação: " + negacao);

//        E/AND (&&)
        boolean and = verdade && verdade;
        System.out.println("\nOperador E (&&) - verdadeiro E verdadeiro: " + and);

        and = verdade && falso;
        System.out.println("Operador E (&&) - verdadeiro E falso: " + and);

        and = falso && falso;
        System.out.println("Operador E (&&) - falso E verdadeiro: " + and);

        and = falso && falso;
        System.out.println("Operador E (&&) - falso E falso: " + and);


//        OU/OR (||)
        boolean ou = verdade || verdade;
        System.out.println("\nOperador OU (||) - verdadeiro E verdadeiro: " + ou);

        ou = verdade || falso;
        System.out.println("Operador OU (||) - verdadeiro E falso: " + ou);

        ou = falso || verdade;
        System.out.println("Operador OU (||) - verdadeiro E falso: " + ou);

        ou = falso || falso;
        System.out.println("Operador OU (||) - falso E falso: " + ou);

//        Operadores Relacionais
//        maior que (>),
//        menor que (<),
//        igual (==),
//        maior ou igual que (>=),
//        menor ou igual que (<=),
//        diferente (!=)

        boolean maiorQue = 3 > 5;
        System.out.println("\nOperador maior que (>): " + maiorQue);

        boolean menorQue = 3 < 5;
        System.out.println("Operador menor que (<): " + menorQue);

        boolean igual = 1 == 2;
        System.out.println("Operador igual (==): " + igual);

        boolean maiorIgual = 2 >= 2;
        System.out.println("Operador maior ou igual que (>=): " + maiorIgual);

        boolean menorIgual = 1 <= 2;
        System.out.println("Operador menor ou igual que (<=): " + menorIgual);

        boolean diferente = 1 != 2;
        System.out.println("Operador diferente (!=): " + diferente);


//        Operadores Trenário
//        <CONDICAO>? <SE_VERDADEIRO> : <SE_FALSE>

        numero1 = 1;
        numero2 = 2;
        String saida = numero1 >= numero2 ? "numero 1 é maior ou igual ao numero 2" : "numero 2 é maior que numero 1";
        System.out.println(saida);
    }
}
