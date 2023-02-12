package Main;

import Interface.*;
import Model.*;
import java.util.ArrayList;

// GRUPO : PEDRO HENRIQUE PASSOS ROCHA E CATTERINA VITTORAZZI SALVADOR

public class Main {
    public static ArrayList<Cliente> listaClientes = new ArrayList<>(); 
    public static void main (String[] args) {
        JFramePrincipal mainFrame = new JFramePrincipal();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        listaClientes.sort(null);
    }
    public static Cliente getClienteNome( String nome ) {
        return listaClientes.stream().filter(cliente -> cliente.getNome().equals(nome)).findFirst().get();
    }
}
