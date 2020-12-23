import java.util.Arrays;

public class Disciplina {
	
    private Aluno[] array = new Aluno[10];
    private static int index = 0;
    public void getArrayAlunos(){
        for(Aluno aluno: array){
            System.out.println("nome:"+aluno.getNome());
            System.out.println("nota:"+aluno.getNota());
        }
    }
      
    public void addAluno(Aluno aluno){
        array[index] = aluno;
        index++;
    }
    
    public void ordem(){
        Arrays.sort(array);
    }
    
    public void removerAluno(String nome){
        for(int i = 0 ; i<array.length; i++){
            if(array[i].getNome().equals(nome)){
                for(int j = i; j<array.length; j++){
                    array[j]=array[j+1];
                    if(j==array.length-1){
                        break;
                    }
                }
                break;
            }
        }
    }
}

