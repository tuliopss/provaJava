public class Aluno {
    private String nome, matricula;

    public Aluno(String nome, String matricula, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

   public void mostrar() {
       System.out.println("NOME: " + getNome());
       System.out.println("MATRICULA: " + getMatricula());
       System.out.println("IDADE: " + getIdade());
   }
}