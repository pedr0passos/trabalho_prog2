package Interface;

import Main.*;
import Model.*;
import java.util.*;
import javax.swing.DefaultListModel;

public class JFrameBusca extends javax.swing.JFrame {

    public static boolean janelaInformacao;
    
    public JFrameBusca() {
        initComponents();

        DefaultListModel modelNovo = new DefaultListModel();
        
        for (int i = 0; i < Main.listaClientes.size(); i++ ) 
            modelNovo.addElement(Main.listaClientes.get(i).getNome());
        listaBuscados.setModel(modelNovo);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBuscaClientes = new javax.swing.JPanel();
        labelBuscador = new javax.swing.JLabel();
        labelNomePBuscado = new javax.swing.JLabel();
        campoNomeBuscado = new javax.swing.JTextField();
        botaoBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaBuscados = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busca de Clientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        labelBuscador.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        labelBuscador.setText("Buscar");

        labelNomePBuscado.setText("Nome:");

        botaoBuscar.setText("Buscar");
        botaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarActionPerformed(evt);
            }
        });

        listaBuscados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaBuscados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaBuscadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaBuscados);

        javax.swing.GroupLayout panelBuscaClientesLayout = new javax.swing.GroupLayout(panelBuscaClientes);
        panelBuscaClientes.setLayout(panelBuscaClientesLayout);
        panelBuscaClientesLayout.setHorizontalGroup(
            panelBuscaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscaClientesLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(panelBuscaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelBuscador)
                    .addGroup(panelBuscaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(labelNomePBuscado)
                        .addGroup(panelBuscaClientesLayout.createSequentialGroup()
                            .addComponent(campoNomeBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botaoBuscar))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelBuscaClientesLayout.setVerticalGroup(
            panelBuscaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscaClientesLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(labelBuscador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelNomePBuscado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBuscaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNomeBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBuscaClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBuscaClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JFramePrincipal.janelaBusca = false;
    }//GEN-LAST:event_formWindowClosing

    private void listaBuscadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaBuscadosMouseClicked
        Cliente cliente = Main.getClienteNome(listaBuscados.getSelectedValue());        
        if ( cliente == null ) {
            return;
        }
        if ( !janelaInformacao ) {
            JFrameInformacoes frameInfo = new JFrameInformacoes(cliente); 
            frameInfo.setLocationRelativeTo(null);
            frameInfo.setVisible(true);
            janelaInformacao = true;
        }
    }//GEN-LAST:event_listaBuscadosMouseClicked

    private void botaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarActionPerformed
        if ( campoNomeBuscado.getText().isEmpty() ) {
            DefaultListModel modelNovo = new DefaultListModel();
            for (int i = 0; i < Main.listaClientes.size(); i++ ) 
                modelNovo.addElement(Main.listaClientes.get(i).getNome());
            listaBuscados.setModel(modelNovo);            
            return;            
        }
        ArrayList<String> listaAux = new ArrayList<>();
        for ( Cliente cliente : Main.listaClientes ) {
            if ( cliente.getNome().contains(campoNomeBuscado.getText().toUpperCase()))
                listaAux.add(cliente.getNome());
        }
        DefaultListModel modelNovo = new DefaultListModel();
        for (int i = 0; i < listaAux.size(); i++ ) 
            modelNovo.addElement(listaAux.get(i));
        listaBuscados.setModel(modelNovo);
        
    }//GEN-LAST:event_botaoBuscarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        janelaInformacao = false;
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
            java.util.logging.Logger.getLogger(JFrameBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameBusca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBuscar;
    private javax.swing.JTextField campoNomeBuscado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBuscador;
    private javax.swing.JLabel labelNomePBuscado;
    private javax.swing.JList<String> listaBuscados;
    private javax.swing.JPanel panelBuscaClientes;
    // End of variables declaration//GEN-END:variables
}
