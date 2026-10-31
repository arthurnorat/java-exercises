package basics;

public class OperadoresRelacionais {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 10;

        // Operadores de comparação
        System.out.println(a == b);   // false (igual a)
        System.out.println(a != b);   // true (diferente de)
        System.out.println(a > b);    // true (maior que)
        System.out.println(a < b);    // false (menor que)
        System.out.println(a >= c);   // true (maior ou igual)
        System.out.println(a <= c);   // true (menor ou igual)

        // Exemplo prático
        int idade = 18;
        boolean maiorDeIdade = idade >= 18;
        System.out.println("Maior de idade? " + maiorDeIdade);  // true

        // CUIDADO: Comparando Strings (lembra?)
        String texto1 = "Java";
        String texto2 = "Java";

        System.out.println(texto1 == texto2);         // Pode dar problema!
        System.out.println(texto1.equals(texto2));    // CORRETO - true
    }
}