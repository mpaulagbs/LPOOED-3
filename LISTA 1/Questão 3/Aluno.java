
	public class Aluno implements Comparable<Aluno>{
		
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    	public int compareTo(Aluno a2) {
    	int resultado = 0;
    	 
        if(this.getNota() == a2.getNota()) {
        	resultado = 0;
        	
        } else if ( this.getNota() < a2.getNota()) {
        	resultado = 1;
        	
        } else {
            resultado = -1;
            
        }
        return resultado;
    }
    
}