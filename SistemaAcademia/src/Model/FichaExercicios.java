package Model;

public class FichaExercicios {
    
    private String nome;
    private String exercicios;
    
    // construtor
    public FichaExercicios (String nome, String exercicios ) {
        this.nome = nome;
        this.exercicios = exercicios;
    }
    
    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setExercicio(String exercicios){
        this.exercicios = exercicios;
    }
    // fim dos setters
    
    //getters
    public String getExercicios () {
        return this.exercicios;
    }
    
    public String getNome () {
        return this.nome;
    }
    // fim dos getters
 
    @Override
    public String toString() {
        return ( "NOME: " + this.nome + "| EXERCICIOS: " + this.exercicios );
    }
}
