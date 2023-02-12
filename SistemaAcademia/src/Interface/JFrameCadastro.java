package Interface;

import Model.*;
import Main.*;
import java.util.*;

public class JFrameCadastro extends javax.swing.JFrame {

    public static ArrayList<FichaExercicios> fichaAux = new ArrayList<>();
    
    public JFrameCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCadastro = new javax.swing.JPanel();
        botaoSalvar = new javax.swing.JButton();
        campoTelefoneCliente = new javax.swing.JTextField();
        labelNomeCliente = new javax.swing.JLabel();
        comboBoxIdadeCliente = new javax.swing.JComboBox<>();
        labelIdadeCliente = new javax.swing.JLabel();
        campoNomeCliente = new javax.swing.JTextField();
        labelTelefoneCliente = new javax.swing.JLabel();
        botaoAdicionarFicha = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoFichaExercicio = new javax.swing.JTextArea();
        botaoCriaFicha = new javax.swing.JButton();
        labelFicha = new javax.swing.JLabel();
        campoNomeFicha = new javax.swing.JTextField();
        labelExercicios = new javax.swing.JLabel();
        labelAviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Alunos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        labelNomeCliente.setText("Nome:");

        comboBoxIdadeCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));

        labelIdadeCliente.setText("Idade:");

        labelTelefoneCliente.setText("Telefone:");

        botaoAdicionarFicha.setText("Adicionar Ficha");
        botaoAdicionarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarFichaActionPerformed(evt);
            }
        });

        campoFichaExercicio.setColumns(20);
        campoFichaExercicio.setRows(5);
        campoFichaExercicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(campoFichaExercicio);

        botaoCriaFicha.setText("Criar Ficha");
        botaoCriaFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriaFichaActionPerformed(evt);
            }
        });

        labelFicha.setText("Nome Ficha:");

        labelExercicios.setText("Exercicios:");

        labelAviso.setText("AVISO");

        javax.swing.GroupLayout panelCadastroLayout = new javax.swing.GroupLayout(panelCadastro);
        panelCadastro.setLayout(panelCadastroLayout);
        panelCadastroLayout.setHorizontalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNomeFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFicha)
                    .addComponent(labelExercicios)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNomeCliente)
                            .addComponent(campoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTelefoneCliente)
                            .addComponent(campoTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCadastroLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botaoAdicionarFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botaoCriaFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelCadastroLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(labelAviso)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoSalvar)
                    .addComponent(labelIdadeCliente)
                    .addComponent(comboBoxIdadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        panelCadastroLayout.setVerticalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addComponent(labelIdadeCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxIdadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addComponent(labelNomeCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addComponent(labelTelefoneCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(labelFicha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNomeFicha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelExercicios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(labelAviso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoAdicionarFicha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoCriaFicha)
                            .addComponent(botaoSalvar))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        try {
            
            // verificando os campos se estao vazios, e jogando suas devidas exceções
            if ( campoNomeCliente.getText().isEmpty() && !campoTelefoneCliente.getText().isEmpty())
                throw new Exception("Nome Cliente Vazio");      
            
            if ( !campoNomeCliente.getText().isEmpty() && campoTelefoneCliente.getText().isEmpty())
                throw new Exception("Telefone Cliente Vazio");
            
            if ( campoNomeCliente.getText().isEmpty() && campoTelefoneCliente.getText().isEmpty())
                throw new Exception("Nome e Telefone Vazios"); 
            
            if ( !campoNomeCliente.getText().isEmpty() && !campoTelefoneCliente.getText().isEmpty() ) {

                // colocando os campos de criação de ficha vazios novamente
                labelFicha.setVisible(false);
                labelExercicios.setVisible(false);
                botaoAdicionarFicha.setVisible(false);
                campoNomeFicha.setVisible(false);
                campoFichaExercicio.setVisible(false);
                labelAviso.setVisible(false);
                botaoCriaFicha.setVisible(true);

                // colocando a mensagem de aviso invisivel
                labelAviso.setVisible(false);

                // passando as informações dos campos pra variaveis
                String nomeNovoCliente = campoNomeCliente.getText().toUpperCase();
                int idadeNovoCliente = comboBoxIdadeCliente.getSelectedIndex()+1;
                String telefoneNovoCliente = campoTelefoneCliente.getText();                       

                // criando novo cliente
                Cliente novoCliente = new Cliente(nomeNovoCliente, idadeNovoCliente, telefoneNovoCliente);
                novoCliente.adicionaFicha(fichaAux);
                fichaAux.clear();                

                // adicionando o cliente criado no arraylist
                Main.listaClientes.add(novoCliente);
                Collections.sort(Main.listaClientes);

                // zerando os campos
                campoNomeCliente.setText("");
                campoTelefoneCliente.setText("");
                comboBoxIdadeCliente.setSelectedIndex(0);
                
            }      
            
        } catch ( Exception e ) {
            labelAviso.setText(e.getMessage());
            labelAviso.setVisible(true);
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoAdicionarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarFichaActionPerformed
        if ( !campoFichaExercicio.getText().isEmpty() && !campoNomeFicha.getText().isEmpty() ) {
            
            // adicionando as informações dos campos pra variaveis
            String nomeFicha = campoNomeFicha.getText();
            String exercicios = campoFichaExercicio.getText();

            // criando uma ficha nova e adicionando ela em um ficha auxiliar
            FichaExercicios novaFicha = new FichaExercicios(nomeFicha, exercicios);
            fichaAux.add(novaFicha);
            
            // zerando os campos
            campoNomeFicha.setText("");
            campoFichaExercicio.setText("");
            
        }
    }//GEN-LAST:event_botaoAdicionarFichaActionPerformed

    private void botaoCriaFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriaFichaActionPerformed
        if ( !campoNomeCliente.getText().isEmpty() && !campoTelefoneCliente.getText().isEmpty() ) {
            labelFicha.setVisible(true);
            labelExercicios.setVisible(true);
            botaoAdicionarFicha.setVisible(true);
            campoNomeFicha.setVisible(true);
            campoFichaExercicio.setVisible(true);
        }
    }//GEN-LAST:event_botaoCriaFichaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JFramePrincipal.janelaCadastro = false;
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        labelFicha.setVisible(false);
        labelExercicios.setVisible(false);
        botaoAdicionarFicha.setVisible(false);
        campoNomeFicha.setVisible(false);
        campoFichaExercicio.setVisible(false);
        labelAviso.setVisible(false);
        botaoCriaFicha.setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionarFicha;
    private javax.swing.JButton botaoCriaFicha;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextArea campoFichaExercicio;
    private javax.swing.JTextField campoNomeCliente;
    private javax.swing.JTextField campoNomeFicha;
    private javax.swing.JTextField campoTelefoneCliente;
    private javax.swing.JComboBox<String> comboBoxIdadeCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAviso;
    private javax.swing.JLabel labelExercicios;
    private javax.swing.JLabel labelFicha;
    private javax.swing.JLabel labelIdadeCliente;
    private javax.swing.JLabel labelNomeCliente;
    private javax.swing.JLabel labelTelefoneCliente;
    private javax.swing.JPanel panelCadastro;
    // End of variables declaration//GEN-END:variables
}
