package Interface;

import Main.Main;
import Model.Cliente;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class JFrameCadastroFichas extends javax.swing.JFrame {

    public static boolean janelaAdicionaFichas;
    
    public JFrameCadastroFichas() {
        initComponents();
        
        DefaultListModel modelNovo = new DefaultListModel();
        
        for (int i = 0; i < Main.listaClientes.size(); i++ ) 
            modelNovo.addElement(Main.listaClientes.get(i).getNome());
        listaBuscado.setModel(modelNovo);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCadastroFichas = new javax.swing.JPanel();
        labelNomeCadastroFichas = new javax.swing.JLabel();
        campoNomeCadastroFichas = new javax.swing.JTextField();
        botaoBuscaCadastroFichas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaBuscado = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastramento de Fichas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        labelNomeCadastroFichas.setText("Nome:");

        botaoBuscaCadastroFichas.setText("Buscar");
        botaoBuscaCadastroFichas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscaCadastroFichasActionPerformed(evt);
            }
        });

        listaBuscado.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaBuscado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaBuscadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaBuscado);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setText("Cadastramento de Fichas");

        javax.swing.GroupLayout panelCadastroFichasLayout = new javax.swing.GroupLayout(panelCadastroFichas);
        panelCadastroFichas.setLayout(panelCadastroFichasLayout);
        panelCadastroFichasLayout.setHorizontalGroup(
            panelCadastroFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroFichasLayout.createSequentialGroup()
                .addGroup(panelCadastroFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroFichasLayout.createSequentialGroup()
                        .addContainerGap(59, Short.MAX_VALUE)
                        .addGroup(panelCadastroFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(labelNomeCadastroFichas)
                            .addGroup(panelCadastroFichasLayout.createSequentialGroup()
                                .addComponent(campoNomeCadastroFichas, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoBuscaCadastroFichas))))
                    .addGroup(panelCadastroFichasLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel1)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        panelCadastroFichasLayout.setVerticalGroup(
            panelCadastroFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroFichasLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(labelNomeCadastroFichas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadastroFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNomeCadastroFichas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoBuscaCadastroFichas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadastroFichas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadastroFichas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JFramePrincipal.janelaCadastroFichas = false;
    }//GEN-LAST:event_formWindowClosing

    private void botaoBuscaCadastroFichasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscaCadastroFichasActionPerformed
        if ( campoNomeCadastroFichas.getText().isEmpty() ) {
            DefaultListModel modelNovo = new DefaultListModel();
            for (int i = 0; i < Main.listaClientes.size(); i++ ) 
                modelNovo.addElement(Main.listaClientes.get(i).getNome());
            listaBuscado.setModel(modelNovo);            
            return;            
         }
        ArrayList<String> listaAux = new ArrayList<>();
        for ( Cliente cliente : Main.listaClientes ) {
            if ( cliente.getNome().contains(campoNomeCadastroFichas.getText().toUpperCase()))
                listaAux.add(cliente.getNome());
        }        
        DefaultListModel modelNovo = new DefaultListModel();
        for (int i = 0; i < listaAux.size(); i++ ) 
            modelNovo.addElement(listaAux.get(i));
        listaBuscado.setModel(modelNovo);        
    }//GEN-LAST:event_botaoBuscaCadastroFichasActionPerformed

    private void listaBuscadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaBuscadoMouseClicked
        Cliente cliente = Main.getClienteNome(listaBuscado.getSelectedValue());        
        if ( cliente == null ) {
            return;
        }
        if ( !janelaAdicionaFichas ) {
            JFrameAdicaoFichas frameFichas = new JFrameAdicaoFichas(cliente.getNome()); 
            frameFichas.setLocationRelativeTo(null);
            frameFichas.setVisible(true);
            janelaAdicionaFichas = true;
        }
    }//GEN-LAST:event_listaBuscadoMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        janelaAdicionaFichas = false;
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
            java.util.logging.Logger.getLogger(JFrameCadastroFichas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroFichas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroFichas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroFichas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCadastroFichas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBuscaCadastroFichas;
    private javax.swing.JTextField campoNomeCadastroFichas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNomeCadastroFichas;
    private javax.swing.JList<String> listaBuscado;
    private javax.swing.JPanel panelCadastroFichas;
    // End of variables declaration//GEN-END:variables
}
