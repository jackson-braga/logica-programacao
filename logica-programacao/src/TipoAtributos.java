public class TipoAtributos {
    // Váriaveis Gobais - Pode ser acessadas em qualquer local da classe
    static byte tipoGlobalByte;
    static short tipoGlobalShort;
    static char tipoGlobalChar;
    static float tipoGlobalFloat;
    static double tipoGlobalDouble;
    static int tipoGlobalInt;
    static long tipoGlobalLong;
    static boolean tipoGlobalBooleano;

    // Contants - Seu valor não pode ser alteradas durante a execução do programa.
    static final String BARRA = "BARRA";
    static final String PIZZA = "PIZZA";
    static final String LINHA = "LINHA";
    static final String FORMAT_DATA = "YYYY-MM-DD";
    static final String FORMAT_DATA_PTBR = "DD-MM-YYYY";

    public static void main(String[] args) {

//        Tipos inteiros
//        byte (1 byte): -128 a 127
//        short (2 bytes): -32.768 a 32.767
//        int (4 bytes): -2.147.483.648 a 2.147.483.647
//        long (8 bytes): -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        byte tipoByte = 127;
        short tipoShort = 32767;
        int tipoInt = 2147483647;
        long tipoLong = 9223372036854775807L;

//        Tipos de ponto flutuante
//        float (4 bytes): aprox. +- 3.40282347E+38F (6-7 dígitos decimais significativos)
//        double (8 bytes): aprox. +- 1.797691313486231570E+308 (15 dígitos decimais significativos)
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;

//        Tipo lógico verdadeir ou falso (true, false)
        boolean tipoBooleano = true;

//        Caractere em Unicode representado por aspas simpels ('')
        char tipoChar = 'C';

//        String - É um Tipo por Referencia com algumas caracteristicas de tipo primitivo
//        Uma String pode ser iniciada diretamente com o uso de aspas duplas ("") se a necessidade de executar o comando new String
//        Por ser um objeto contém métodos próprios. Ex.: replace e substring
//        Strings são imutaveis.
        String texto = "esse é o texto";
//        reblace substitui um valor da String por outro valor
        String replace = texto.replace(" ", "_");
//        substring retorna uma parte da String conforme os indeces informados
        String substring = texto.substring(3, 8);

        System.out.println(texto);
        System.out.println(replace);
        System.out.println(substring);

        System.out.println("Valor do tipoByte = " + tipoByte);
        System.out.println("Valor do tipoShort = " + tipoShort);
        System.out.println("Valor do tipoChar = " + tipoChar);
        System.out.println("Valor do tipoFloat = " + tipoFloat);
        System.out.println("Valor do tipoDouble = " + tipoDouble);
        System.out.println("Valor do tipoInt = " + tipoInt);
        System.out.println("Valor do tipoLong = " + tipoLong);
        System.out.println("Valor do tipoBooleano = " + tipoBooleano);


        System.out.println("Valor do tipoGlobalByte = " + tipoGlobalByte);
        System.out.println("Valor do tipoGlobalShort = " + tipoGlobalShort);
        System.out.println("Valor do tipoGlobalChar = " + tipoGlobalChar);
        System.out.println("Valor do tipoGlobalFloat = " + tipoGlobalFloat);
        System.out.println("Valor do tipoGlobalDouble = " + tipoGlobalDouble);
        System.out.println("Valor do tipoGlobalInt = " + tipoGlobalInt);
        System.out.println("Valor do tipoGlobalLong = " + tipoGlobalLong);
        System.out.println("Valor do tipoGlobalBooleano = " + tipoGlobalBooleano);

        System.out.println("Tipos de dados em Java:");
        System.out.println("Menor Byte: " + Byte.MIN_VALUE);
        System.out.println("Maior Byte: " + Byte.MAX_VALUE);
        System.out.println("Menor Short Int: " + Short.MIN_VALUE);
        System.out.println("Maior Short Int: " + Short.MAX_VALUE);
        System.out.println("Menor Int: " + Integer.MIN_VALUE);
        System.out.println("Maior Int: " + Integer.MAX_VALUE);
        System.out.println("Menor Long: " + Long.MIN_VALUE);
        System.out.println("Maior Long:" + Long.MAX_VALUE);
        System.out.println("Menor Float: " + Float.MIN_VALUE);
        System.out.println("Maior Float: " + Float.MAX_VALUE);
        System.out.println("Menor Double: " + Double.MIN_VALUE);
        System.out.println("Maior Double: " + Double.MAX_VALUE);
    }

}