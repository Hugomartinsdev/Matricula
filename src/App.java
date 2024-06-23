import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Aluno a;
        int m,mt=0,i;
        String n,c,n2;
        
        do{
            menu();
            m=sc.nextInt();
            switch (m) {
                case 1:
                    System.out.println("Qual o nome do(a) aluno(a)?:");
                    sc.nextLine();//limpeza de buffer
                    n=sc.nextLine();
                    System.out.println("Qual a idade do(a) aluno(a)?:");
                    i=sc.nextInt();
                    System.out.println("Qual o curso do(a) aluno(a)");
                    sc.nextLine();
                    c=sc.nextLine();
                    mt=mt+1;
                    a= new Aluno(n, c, mt, i);
                    Classe.adicionar(a);
                    System.out.println("Cadastro pronto");
                    break;
            
                case 2:
                    System.out.println(Classe.listar()); 
                    break;
                
                case 3:
                    System.out.println("Qual o nome do(a) aluno(a) que voçê quer editar?");
                    n=sc.next();
                    System.out.println("Qual o novo nome do(a) aluno(a)?:");
                    sc.nextLine();//limpeza de buffer
                    n2=sc.nextLine();
                    System.out.println("Qual a nova idade do(a) aluno(a)?:");
                    i=sc.nextInt();
                    System.out.println("Qual o novo curso do(a) aluno(a)");
                    sc.nextLine();
                    c=sc.nextLine();
                    a= new Aluno(n2, c, mt, i);
                    Classe.editar(n, a);
                    break;

                case 4:
                    System.out.println("Qual o nome do(a) aluno(a) que você quer escolher para excluir?:");
                    sc.nextLine();//limpeza de buffer
                    n=sc.nextLine();
                    if (!Classe.getClasse().isEmpty()){
                    if(Classe.excluir(n)){
                        System.out.println("Contato removido com sucesso");
                    }else{
                        System.out.println("Contato não encontrado");
                    }
                }else{
                    System.out.println("Não existem contatos");
                }
                    Classe.excluir(n);

                    break;

                case 5:
                    System.out.println("Qual o número de matrucla do(a) aluno(a) que voçê quer achar?");//muito trabalho e ficaria feio com matricula
                    mt=sc.nextInt();
                    Classe.buscarMat(mt);
                    break;
                    
            }
        }while(m!=6);
    }
    public static void menu(){
        System.out.println("*************MENU*************");
        System.out.println("1-Adicionar aluno(a)");
        System.out.println("2-Listar os alunos incritos");
        System.out.println("3-Editar informações do aluno");
        System.out.println("4-Excluir aluno(a)");
        System.out.println("5-Buscar um(a) aluno(a) pelo Numero de matrucula");
        System.out.println("6-Sair");
        System.out.println("******************************");
    }
}
