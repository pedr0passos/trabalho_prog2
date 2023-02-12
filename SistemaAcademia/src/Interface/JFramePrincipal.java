package Interface;

public class JFramePrincipal extends javax.swing.JFrame {

    public static boolean janelaCadastro;    
    public static boolean janelaListagem;
    public static boolean janelaBusca;
    public static boolean janelaCadastroFichas;
    
    public JFramePrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        botaoCadastrarCliente = new javax.swing.JButton();
        botaoBuscarCliente = new javax.swing.JButton();
        botaoCadastrarFicha = new javax.swing.JButton();
        botaoListarClientes = new javax.swing.JButton();
        botaoRemoverCliente = new javax.swing.JButton();
        botaoRemoverFicha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Academias");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        labelTitulo.setText("Sistema de Academias");

        botaoCadastrarCliente.setText("Cadastrar Cliente");
        botaoCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarClienteActionPerformed(evt);
            }
        });

        botaoBuscarCliente.setText("Buscar Cliente");
        botaoBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarClienteActionPerformed(evt);
            }
        });

        botaoCadastrarFicha.setText("Cadastrar Ficha");
        botaoCadastrarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarFichaActionPerformed(evt);
            }
        });

        botaoListarClientes.setText("Listar Clientes");
        botaoListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarClientesActionPerformed(evt);
            }
        });

        botaoRemoverCliente.setText("Remover Cliente");
        botaoRemoverCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverClienteActionPerformed(evt);
            }
        });

        botaoRemoverFicha.setText("Remover Ficha");

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoCadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(botaoRemoverCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoCadastrarFicha, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(botaoListarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(botaoRemoverFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(labelTitulo))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadastrarFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoListarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(botaoBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoRemoverFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoRemoverCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarClienteActionPerformed
        if ( !janelaCadastro ) {
            JFrameCadastro frameCadastro = new JFrameCadastro();
            frameCadastro.setLocationRelativeTo(null);
            frameCadastro.setVisible(true);
            janelaCadastro = true;
        }
    }//GEN-LAST:event_botaoCadastrarClienteActionPerformed

    private void botaoCadastrarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarFichaActionPerformed
        if ( !janelaCadastroFichas ) {
            JFrameCadastroFichas frameCadastroFichas = new JFrameCadastroFichas();
            frameCadastroFichas.setLocationRelativeTo(null);
            frameCadastroFichas.setVisible(true);
            janelaCadastroFichas = true;
        }
    }//GEN-LAST:event_botaoCadastrarFichaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        janelaCadastro = false;
        janelaListagem = false;
        janelaBusca = false;
        janelaCadastroFichas = false;
    }//GEN-LAST:event_formWindowOpened

    private void botaoListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarClientesActionPerformed
        if ( !janelaListagem ) {
            JFrameListagem frameListagem = new JFrameListagem();
            frameListagem.setLocationRelativeTo(null);
            frameListagem.setVisible(true);
            janelaListagem = true;                         
        }
    }//GEN-LAST:event_botaoListarClientesActionPerformed

    private void botaoBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarClienteActionPerformed
        if ( !janelaBusca ) {
            JFrameBusca frameBusca = new JFrameBusca();
            frameBusca.setLocationRelativeTo(null);
            frameBusca.setVisible(true);
            janelaBusca = true;
        }
    }//GEN-LAST:event_botaoBuscarClienteActionPerformed

    private void botaoRemoverClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoRemoverClienteActionPerformed


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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBuscarCliente;
    private javax.swing.JButton botaoCadastrarCliente;
    private javax.swing.JButton botaoCadastrarFicha;
    private javax.swing.JButton botaoListarClientes;
    private javax.swing.JButton botaoRemoverCliente;
    private javax.swing.JButton botaoRemoverFicha;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
