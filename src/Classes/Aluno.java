package Classes;

public class Aluno extends Pessoa implements PessoaInterface {

    private int numeroModulo;
    private int xp;

    public int getNumeroModulo() {
        return numeroModulo;
    }

    public void setNumeroModulo(int numeroModulo) {
        this.numeroModulo = numeroModulo;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    //Métodos
    @Override
    public void imprimeInformacoes(Aluno aluno) {
        System.out.println("----Informações Pessoais----");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Email: " + aluno.getEmail());
        System.out.println("Telefone: " + aluno.getTelefone());
        System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
        System.out.println("Endereço: " + aluno.getEndereco());
        System.out.println("Módulo: " + aluno.getNumeroModulo());
        System.out.println("XP: " + aluno.getXp());
    }

    @Override
    public void avancaModulo(Aluno aluno) {
        if (aluno.getNumeroModulo() == 1) {
            aluno.setNumeroModulo(2);
        } else if (aluno.getNumeroModulo() == 2) {
            aluno.setNumeroModulo(3);
        } else if (aluno.getNumeroModulo() == 3) {
            aluno.setNumeroModulo(4);
        } else if (aluno.getNumeroModulo() == 4) {
            aluno.setNumeroModulo(5);
        } else {
            aluno.setNumeroModulo(6);
        }
    }

    @Override
    public void calcularXP(Aluno aluno, Modulo modulo) {
        if (aluno.getNumeroModulo() == 1) {
            int pontos = modulo.retornaPontos(1);
            aluno.setXp(pontos);
        } else if (aluno.getNumeroModulo() == 2) {
            int pontos = modulo.retornaPontos(2);
            aluno.setXp(pontos + aluno.getXp());
        } else if (aluno.getNumeroModulo() == 3) {
            int pontos = modulo.retornaPontos(3);
            aluno.setXp(pontos + aluno.getXp());
        } else if (aluno.getNumeroModulo() == 4) {
            int pontos = modulo.retornaPontos(4);
            aluno.setXp(pontos + aluno.getXp());
        } else if (aluno.getNumeroModulo() == 5) {
            int pontos = modulo.retornaPontos(5);
            aluno.setXp(pontos + aluno.getXp());
        } else {
        }
    }
}
