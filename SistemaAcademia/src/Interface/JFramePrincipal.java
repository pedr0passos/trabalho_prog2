/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.awt.CardLayout;
import java.lang.*;
import Model.*;
import java.util.*;

/**
 *
 * @author pedro
 */
public class JFramePrincipal extends javax.swing.JFrame {
    
    public static boolean janelaCadastro;
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
            
    public JFramePrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botaoListarClientes = new javax.swing.JButton();
        botaoCadastroFichas1 = new javax.swing.JButton();
        panelCadastroCliente = new javax.swing.JPanel();
        botaoSalvar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        campoTelefoneCliente = new javax.swing.JTextField();
        labelNomeCliente = new javax.swing.JLabel();
        comboBoxIdadeCliente = new javax.swing.JComboBox<>();
        labelIdadeCliente = new javax.swing.JLabel();
        campoNomeCliente = new javax.swing.JTextField();
        labelTelefoneCliente = new javax.swing.JLabel();
        botaoCriarFicha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DecaGym");
        setForeground(java.awt.Color.darkGray);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelPrincipal.setForeground(new java.awt.Color(60, 63, 65));
        panelPrincipal.setLayout(new java.awt.CardLayout());

        jButton1.setText("Cadastrar Aluno");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        labelTitulo.setText("DecaGym - Sistema de Academia");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setText("@ 2023 por Catterina Salvador e Pedro Henrique Passos");

        botaoListarClientes.setText("   Listar Alunos   ");
        botaoListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarClientesActionPerformed(evt);
            }
        });

        botaoCadastroFichas1.setText(" Cadastrar Ficha ");
        botaoCadastroFichas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroFichas1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addContainerGap(188, Short.MAX_VALUE)
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButton1)
                            .addComponent(labelTitulo)
                            .addComponent(botaoListarClientes)
                            .addComponent(botaoCadastroFichas1))))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoCadastroFichas1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoListarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        panelPrincipal.add(panelMenu, "telamenu");

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        labelNomeCliente.setText("Nome:");

        comboBoxIdadeCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));

        labelIdadeCliente.setText("Idade:");

        labelTelefoneCliente.setText("Telefone:");

        botaoCriarFicha.setText("Adicionar Ficha");
        botaoCriarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarFichaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCadastroClienteLayout = new javax.swing.GroupLayout(panelCadastroCliente);
        panelCadastroCliente.setLayout(panelCadastroClienteLayout);
        panelCadastroClienteLayout.setHorizontalGroup(
            panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTelefoneCliente)
                    .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botaoCancelar)
                        .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                            .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                                    .addComponent(campoTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botaoCriarFicha))
                                .addComponent(campoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelNomeCliente))
                            .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                                    .addGap(72, 72, 72)
                                    .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelIdadeCliente)
                                        .addComponent(comboBoxIdadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(botaoSalvar))))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        panelCadastroClienteLayout.setVerticalGroup(
            panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIdadeCliente)
                    .addComponent(labelNomeCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxIdadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelTelefoneCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoCriarFicha))
                .addGap(9, 9, 9)
                .addComponent(botaoCancelar)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelCadastroCliente, "telacadastro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout telaCadastro = (CardLayout) panelPrincipal.getLayout();
        telaCadastro.show(panelPrincipal,"telacadastro");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        CardLayout telaCadastro = (CardLayout) panelPrincipal.getLayout();
        telaCadastro.show(panelPrincipal,"telamenu");
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarClientesActionPerformed
        
    }//GEN-LAST:event_botaoListarClientesActionPerformed

    private void botaoCadastroFichas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroFichas1ActionPerformed
        
    }//GEN-LAST:event_botaoCadastroFichas1ActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        if ( !campoNomeCliente.getText().isEmpty() && !campoTelefoneCliente.getText().isEmpty() ) {
            Cliente novoCliente = new Cliente(campoNomeCliente.getText(), comboBoxIdadeCliente.getSelectedIndex()+1, campoTelefoneCliente.getText());
            Cliente.id++;
            campoNomeCliente.setText("");
            campoTelefoneCliente.setText("");
            comboBoxIdadeCliente.setSelectedIndex(0);
            listaClientes.add(novoCliente);
            Collections.sort(listaClientes);
            System.out.println(listaClientes.toString());
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoCriarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarFichaActionPerformed
        if ( !JFramePrincipal.janelaCadastro ) {
            JFrameAdicionaFicha telaAdicionaFicha = new JFrameAdicionaFicha();
            telaAdicionaFicha.show(true);  
        }
    }//GEN-LAST:event_botaoCriarFichaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);
        JFramePrincipal.janelaCadastro = false;
        Cliente.id = 0;
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastroFichas1;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoCriarFicha;
    private javax.swing.JButton botaoListarClientes;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField campoNomeCliente;
    private javax.swing.JTextField campoTelefoneCliente;
    private javax.swing.JComboBox<String> comboBoxIdadeCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelIdadeCliente;
    private javax.swing.JLabel labelNomeCliente;
    private javax.swing.JLabel labelTelefoneCliente;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelCadastroCliente;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
