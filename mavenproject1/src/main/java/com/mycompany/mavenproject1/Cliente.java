package com.mycompany.mavenproject1;

import java.util.*;

public class Cliente {
    
    private String nome;
    private int idade;
    private int telefone;
    private ArrayList<FichaExercicios> fichas = new ArrayList<>();
    
    public Cliente(String nome, int idade, int telefone ) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }
    
    public void criaFicha ( FichaExercicios ficha ) {
        fichas.add(ficha);
    }
    
    
}
