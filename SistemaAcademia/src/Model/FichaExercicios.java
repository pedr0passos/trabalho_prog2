package Model;

public class FichaExercicios {
    
    private String nome;
    private String exercicios;
    
    public void adicionaExercicio ( String exercicios ) {
        this.exercicios = exercicios;
    }
    
    public String getNome () {
        return this.nome;
    }
    
    public String getExercicios () {
        return this.exercicios;
    }
    
}
