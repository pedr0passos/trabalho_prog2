package Model;

import java.util.ArrayList;

public class Cliente implements Comparable<Cliente> {    
    
    private String nome;
    private String telefone;
    private int idade;
    private ArrayList<FichaExercicios> fichas;
    
    @Override 
    public int compareTo(Cliente outroAluno) { 
        return (this.getNome().compareTo(outroAluno.getNome().toUpperCase()));
    }
    
    // construtor 
    public Cliente ( String nome, int idade, String telefone ) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;        
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
    public ArrayList<FichaExercicios> getFicha() {
        return this.fichas;
    }
    // fim getters
    
    public void adicionaFicha( ArrayList<FichaExercicios> ficha ) {
        fichas = new ArrayList<>(ficha);
    }
    
    public void adicionaFichaUnica ( FichaExercicios ficha ) {
        fichas.add(ficha);
    }
    
    @Override 
    public String toString() {
        return (" Nome: " + this.nome + "| Idade: " + this.idade + "| Telefone: " + this.telefone + "| Id: " +  "\n" + " Fichas: " + this.fichas );
    }
        
}
