public class Calculadora {

    public Double calcular(Double valor1, Double valor2, EOperacoesMatematica operacao) {
        if(operacao == EOperacoesMatematica.SOMA){
            return valor1 + valor2;
        }
        if(operacao == EOperacoesMatematica.SUBTRACAO){
            return valor1 - valor2;
        }
        return 0.0;
    }
}
