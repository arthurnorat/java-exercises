package basics;

public class MeusDados {
    public static void main(String[] args) {
        String nome = "Arthur";
        int idade = 41;
        double altura = 1.70;
        boolean estudante = true;
        final int ANO_ATUAL = 2025;
        int anoDeNascimento = ANO_ATUAL - idade;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.printf("Altura: %.2fm\n", altura);
        System.out.println("Estudante: " + estudante);
        System.out.println("Ano de nascimento: " + anoDeNascimento);
    }
}