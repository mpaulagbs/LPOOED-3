import java.util.Scanner;

public class Teste2 {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        Disciplina disci = new Disciplina();
        
        for(int i =0 ; i < 10; i++){
            System.out.println("Digite o nome do aluno: ");
            String nome = sc.next();
            System.out.println("Digite a nota do aluno: ");
            double nota = sc.nextDouble();
            disci.addAluno(new Aluno(nome,nota));
        }
        System.out.println("Alunos:");
        disci.ordem();
        disci.getArrayAlunos();
    }
    
}

