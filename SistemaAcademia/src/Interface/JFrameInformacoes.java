package Interface;

import Main.Main;
import Model.*;
import javax.swing.DefaultListModel;

public class JFrameInformacoes extends javax.swing.JFrame {

    private Cliente clienteAux;
    public static boolean janelaTreino;
    
    public JFrameInformacoes() {
        initComponents();
        
        DefaultListModel modelNovo = new DefaultListModel();
        
        for (int i = 0; i < Main.listaClientes.size(); i++ ) 
            modelNovo.addElement(Main.listaClientes.get(i).getNome());
        listaTreinosInformacao.setModel(modelNovo);        
    }

    public JFrameInformacoes( Cliente cliente ) {
        
        initComponents();
        
        clienteAux = cliente;
        
        campoNomeInformacao.setEditable(false);
        campoIdadeInformacao.setEditable(false);
        campoTelefoneInformacao.setEditable(false);
        
        campoNomeInformacao.setText(cliente.getNome());
        campoIdadeInformacao.setText(""+cliente.getIdade());
        campoTelefoneInformacao.setText(cliente.getTelefone());        
        
        DefaultListModel modelNovo = new DefaultListModel();
        for (int i = 0; i < cliente.getFicha().size(); i++ ) 
            modelNovo.addElement(cliente.getFicha().get(i).getNome());
        listaTreinosInformacao.setModel(modelNovo);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInformacoesCliente = new javax.swing.JPanel();
        labelInformacoesCliente = new javax.swing.JLabel();
        labelNomeInformacao = new javax.swing.JLabel();
        campoNomeInformacao = new javax.swing.JTextField();
        labelIdadeInformacao = new javax.swing.JLabel();
        campoIdadeInformacao = new javax.swing.JTextField();
        campoTelefoneInformacao = new javax.swing.JTextField();
        labelTelefoneInformacao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTreinosInformacao = new javax.swing.JList<>();
        labelFichasInformacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informações do Cliente");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        labelInformacoesCliente.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        labelInformacoesCliente.setText("Informações do Cliente");

        labelNomeInformacao.setText("Nome:");

        labelIdadeInformacao.setText("Idade:");

        labelTelefoneInformacao.setText("Telefone:");

        listaTreinosInformacao.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaTreinosInformacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaTreinosInformacaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaTreinosInformacao);

        labelFichasInformacao.setText("Fichas:");

        javax.swing.GroupLayout panelInformacoesClienteLayout = new javax.swing.GroupLayout(panelInformacoesCliente);
        panelInformacoesCliente.setLayout(panelInformacoesClienteLayout);
        panelInformacoesClienteLayout.setHorizontalGroup(
            panelInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacoesClienteLayout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(panelInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelFichasInformacao)
                        .addComponent(labelTelefoneInformacao)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelInformacoesCliente))
                    .addGroup(panelInformacoesClienteLayout.createSequentialGroup()
                        .addGroup(panelInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelInformacoesClienteLayout.createSequentialGroup()
                                .addComponent(campoTelefoneInformacao, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelInformacoesClienteLayout.createSequentialGroup()
                                .addGroup(panelInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelNomeInformacao)
                                    .addComponent(campoNomeInformacao, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panelInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoIdadeInformacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelIdadeInformacao))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        panelInformacoesClienteLayout.setVerticalGroup(
            panelInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacoesClienteLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(labelInformacoesCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeInformacao)
                    .addComponent(labelIdadeInformacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInformacoesClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNomeInformacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoIdadeInformacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTelefoneInformacao)
                .addGap(3, 3, 3)
                .addComponent(campoTelefoneInformacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelFichasInformacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInformacoesCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInformacoesCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listaTreinosInformacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaTreinosInformacaoMouseClicked
        if ( !janelaTreino ) {
            JFrameTreino frameTreino = new JFrameTreino(clienteAux.getFicha().get(listaTreinosInformacao.getSelectedIndex()));
            frameTreino.setLocationRelativeTo(null);
            frameTreino.setVisible(true);
            janelaTreino = true;
        }
    }//GEN-LAST:event_listaTreinosInformacaoMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JFrameBusca.janelaInformacao = false;
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        janelaTreino = false;
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
            java.util.logging.Logger.getLogger(JFrameInformacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameInformacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameInformacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameInformacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameInformacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoIdadeInformacao;
    private javax.swing.JTextField campoNomeInformacao;
    private javax.swing.JTextField campoTelefoneInformacao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFichasInformacao;
    private javax.swing.JLabel labelIdadeInformacao;
    private javax.swing.JLabel labelInformacoesCliente;
    private javax.swing.JLabel labelNomeInformacao;
    private javax.swing.JLabel labelTelefoneInformacao;
    private javax.swing.JList<String> listaTreinosInformacao;
    private javax.swing.JPanel panelInformacoesCliente;
    // End of variables declaration//GEN-END:variables
}
