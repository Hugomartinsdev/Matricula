import java.util.ArrayList;

public class Classe {
    static ArrayList<Aluno> classe = new ArrayList<Aluno>();

     public static ArrayList<Aluno> getClasse() {
        return classe;
    }
     public static void setClasse(ArrayList<Aluno> classe) {
        Classe.classe = classe;
    }

    public static void adicionar(Aluno a){
        classe.add(a);
    }

    public static String listar(){
        String saida="";
        for(Aluno b: classe){
            saida+=b.detalhes();
        }
        return saida;
    }
    public static void editar(String nome,Aluno certo){
        for(int i = 0; i < classe.size(); i++){
            if(classe.get(i).getNome().equals(nome)){
                classe.set(i, certo);
            }
        }
    }

    public static void buscarMat(int mat){
      for(Aluno a: classe){
       if( a.getMatricula()==mat){
            System.out.println(a.detalhes());
       }
      }
    }

    public static boolean excluir(String nome){
        for(Aluno c: classe){
            if(c.getNome().equals(nome)){
                classe.remove(c);
                return true;
            }
        }
         return false;
    }

   


}

/*CRUD (Create, Read, Update, Delete) no array de alunos: adicionar um novo aluno
, exibir todos os alunos, buscar um aluno pelo número de matrícula, 
atualizar informações de um aluno existente e excluir um aluno.
 */
