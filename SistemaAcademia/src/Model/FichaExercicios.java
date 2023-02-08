package Model;

import java.util.ArrayList;

public class FichaExercicios {
    
    private String nome;
    private String exercicios;
    
    public void adicionaExercicio ( String exercicio ) {
        exercicios = exercicio;
    }
    
    public String getNome () {
        return this.nome;
    }
    
}
