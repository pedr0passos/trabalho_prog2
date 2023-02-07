package Model;

import java.util.ArrayList;

public class Cliente implements Comparable<Cliente> {
    
    public static int id;
    
    private String nome;
    private String telefone;
    private int idade;
    private int identificador;
    private ArrayList<FichaExercicios> fichas = new ArrayList<>();
    
    @Override 
    public int compareTo(Cliente outroAluno) { 
        return (this.getNome().compareTo(outroAluno.getNome()));
    }
    
    // construtor 
    public Cliente ( String nome, int idade, String telefone ) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.identificador = Cliente.id+1;
    }
    
    // getters
    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public String getTelefone() {
        return this.telefone;
    }
    // fim getters
    
    public void adicionaFicha( FichaExercicios ficha ) {
        fichas.add(ficha);
    }
    
    @Override 
    public String toString() {
        return (" Nome: " + this.nome + "| Idade: " + this.idade + "| Telefone: " + this.telefone + "| Id: " + this.identificador + "\n" );
    }
        
}
