
# Start/Transfer

## Objetivo
- Esse sistema tem como objetivo controlar a evolução dos alunos inscritos no programa Start/Transfer Lagoinha Jundiaí

## Classes
- Pessoa
  - Atributos:
      - String email;
      - int telefone;
      - String nome;
      - LocalDate dataNascimento;
      - String endereco;
      - int numeroModulo;
      - int xp;
  - Metódos
      - imprimeInformacoes(Pessoa aluno);
      - avancaModulo(Pessoa aluno);
      - calculaXP(Pessoa aluno, Modulo modulo);
- Modulo
  - Atributos:
    - String nome;
    - int numero;
    - int duracao;
    - int quantidadeXP;
  - Metódos:
    - retornaPontos(int numeroModulo);