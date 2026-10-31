package basics;

public class TiposPrimitivos {
    public static void main(String[] args) {

        // NÚMEROS INTEIROS (sem casas decimais)

        byte numeroPequeno = 127; // 8 bits: -128 até 127
        short numeroMedio = 32000; // 16 bits: -32.768 até 32.767
        int numeroNormal = 2000000; // 32 bits: ~-2 bilhões até ~2 bilhões
        long numeroGrande = 9000000000L; // 64 bits: números muito grandes. Tem L no final

        // NÚMEROS DECIMAIS (com casas decimais)

        float decimalPequeno = 3.14f; // 32 bits (com f no final)
        double decimalGrande = 3.14159265; // 64 bits (padrão para decimais)

        // OUTROS

        char letra = 'A'; // 16 bits: um único caractere (aspas simples)
        boolean verdadeiro = true; // 1 bit: true ou false (letras minúsculas)

        System.out.println(numeroPequeno);
        System.out.println(decimalGrande);
        System.out.println(letra);
        System.out.println(verdadeiro);

        // Tipos mais usados: int, double, boolean, char.
    }
}
