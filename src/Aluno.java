public class Aluno {
    String nome;
    String curso;
    int matricula;
    int idade;
    public Aluno(String nome, String curso, int matricula, int idade) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
        this.idade = idade;
    }
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }
    public String detalhes(){
        return "Aluno(a): "+nome+", Curso: "+curso+", idade: "+idade+", Nº de matricula: "+matricula+"\n";
    }
}


