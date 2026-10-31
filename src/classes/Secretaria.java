package classes;


public class Secretaria {
    static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Maria");
        System.out.println("Nome do aluno: " + aluno.getNome());

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Fernando");
        System.out.println("Nome do aluno: " + aluno2.getNome());
    }
}
