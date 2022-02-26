package Classes;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Daiane");
        aluno.setEmail("email@email.com");
        aluno.setEndereco("Rua bla, 123, bla, SP");
        aluno.setDataNascimento(LocalDate.now());
        aluno.setTelefone(12345652);
        aluno.setNumeroModulo(1);

        aluno.imprimeInformacoes(aluno);
        aluno.calcularXP(aluno, new Modulo());
        aluno.imprimeInformacoes(aluno);
        aluno.avancaModulo(aluno);
        aluno.calcularXP(aluno, new Modulo());
        aluno.imprimeInformacoes(aluno);
        aluno.avancaModulo(aluno);
        aluno.calcularXP(aluno, new Modulo());
        aluno.imprimeInformacoes(aluno);
        aluno.avancaModulo(aluno);
        aluno.calcularXP(aluno, new Modulo());
        aluno.imprimeInformacoes(aluno);
        aluno.avancaModulo(aluno);
        aluno.calcularXP(aluno, new Modulo());
        aluno.imprimeInformacoes(aluno);
        aluno.avancaModulo(aluno);
        aluno.calcularXP(aluno, new Modulo());
        aluno.imprimeInformacoes(aluno);




    }
}
