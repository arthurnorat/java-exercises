package basics;

public class IncrementoDecremento {
    public static void main(String[] args) {

        int contador = 5;

        // Incremento
        contador++; // 6
        ++contador; // 7

        // Decremento
        contador--;
        --contador;

        System.out.println(contador); //

        // Diferença entre pré e pós-incremento

        int a = 10;
        int b = a++; // b recebe 10, depois vira 11 (pós-incremento)
        System.out.println("a: " + a + ", b: " + b);

        int c = 10;
        int d = ++c; // c vira 11, depois d recebe 11 (pré-incremento)
        System.out.println("c: " + c + ", d: " + d);

        // Na prática, o pós-incremento é mais comum
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
        }
    }
}
