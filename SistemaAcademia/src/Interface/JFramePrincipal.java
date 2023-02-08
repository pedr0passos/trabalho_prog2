package Interface;

import java.awt.CardLayout;
import java.lang.*;
import Model.*;
import java.util.*;

public class JFramePrincipal extends javax.swing.JFrame {
    
    public static boolean janelaCadastro;
    private FichaExercicios fichaAuxiliar;
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    public JFramePrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        botaoCadastrarCliente = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        labelAutores = new javax.swing.JLabel();
        botaoListarClientes = new javax.swing.JButton();
        botaoCadastrarFichas = new javax.swing.JButton();
        SairPrograma = new javax.swing.JButton();
        botaoBuscarCliente = new javax.swing.JButton();
        panelCadastroCliente = new javax.swing.JPanel();
        botaoSalvar = new javax.swing.JButton();
        botaoSairCadastro = new javax.swing.JButton();
        campoTelefoneCliente = new javax.swing.JTextField();
        labelNomeCliente = new javax.swing.JLabel();
        comboBoxIdadeCliente = new javax.swing.JComboBox<>();
        labelIdadeCliente = new javax.swing.JLabel();
        campoNomeCliente = new javax.swing.JTextField();
        labelTelefoneCliente = new javax.swing.JLabel();
        botaoCriarFicha = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoFichaExercicio = new javax.swing.JTextArea();
        labelFichaCliente = new javax.swing.JLabel();
        botaoLimpaFicha = new javax.swing.JButton();
        panelListarClientes = new javax.swing.JPanel();
        botaoSairListagem = new javax.swing.JButton();
        labelTituloListagem = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaTextoListaClientes = new javax.swing.JTextArea();
        panelBuscarClientes = new javax.swing.JPanel();
        campoBuscarNome = new javax.swing.JTextField();
        labelNomeBuscado = new javax.swing.JLabel();
        botaoBusca = new javax.swing.JButton();
        botaoSairBusca = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        campoTreinoClienteBuscado = new javax.swing.JTextArea();
        botaoMostrarTreinos = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        campoClienteBuscado = new javax.swing.JTextArea();
        comboBoxTreinos = new javax.swing.JComboBox<>();
        labelSeletorTreino = new javax.swing.JLabel();

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

        botaoCadastrarCliente.setText("Cadastrar Aluno");
        botaoCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarClienteActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        labelTitulo.setText("DecaGym - Sistema de Academia");

        labelAutores.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        labelAutores.setText("@ 2023 por Catterina Salvador e Pedro Henrique Passos");

        botaoListarClientes.setText("   Listar Alunos   ");
        botaoListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarClientesActionPerformed(evt);
            }
        });

        botaoCadastrarFichas.setText(" Cadastrar Ficha ");
        botaoCadastrarFichas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarFichasActionPerformed(evt);
            }
        });

        SairPrograma.setText("Sair");
        SairPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairProgramaActionPerformed(evt);
            }
        });

        botaoBuscarCliente.setText("Buscar Aluno");
        botaoBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarClienteActionPerformed(evt);
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
                        .addComponent(labelAutores))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addContainerGap(207, Short.MAX_VALUE)
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(botaoCadastrarCliente)
                            .addComponent(labelTitulo)
                            .addComponent(botaoListarClientes)
                            .addComponent(botaoCadastrarFichas)
                            .addComponent(SairPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(botaoCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoCadastrarFichas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoListarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SairPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(labelAutores)
                .addContainerGap())
        );

        panelPrincipal.add(panelMenu, "telamenu");

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoSairCadastro.setText("Sair");
        botaoSairCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairCadastroActionPerformed(evt);
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

        campoFichaExercicio.setColumns(20);
        campoFichaExercicio.setRows(5);
        campoFichaExercicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(campoFichaExercicio);

        labelFichaCliente.setText("Ficha:");

        botaoLimpaFicha.setText("Limpar Ficha");
        botaoLimpaFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimpaFichaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCadastroClienteLayout = new javax.swing.GroupLayout(panelCadastroCliente);
        panelCadastroCliente.setLayout(panelCadastroClienteLayout);
        panelCadastroClienteLayout.setHorizontalGroup(
            panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefoneCliente)
                    .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(labelFichaCliente, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                            .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelNomeCliente))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelIdadeCliente)
                                .addComponent(comboBoxIdadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(botaoCriarFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoLimpaFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(112, 112, 112)
                            .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(botaoSairCadastro)
                                .addComponent(botaoSalvar)))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        panelCadastroClienteLayout.setVerticalGroup(
            panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIdadeCliente)
                    .addComponent(labelNomeCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxIdadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(labelTelefoneCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(labelFichaCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(botaoCriarFicha)
                        .addGap(9, 9, 9)
                        .addComponent(botaoLimpaFicha))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(botaoSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoSairCadastro)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelCadastroCliente, "telacadastro");

        botaoSairListagem.setText("Sair");
        botaoSairListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairListagemActionPerformed(evt);
            }
        });

        labelTituloListagem.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        labelTituloListagem.setText("Alunos");

        areaTextoListaClientes.setColumns(20);
        areaTextoListaClientes.setRows(5);
        jScrollPane2.setViewportView(areaTextoListaClientes);

        javax.swing.GroupLayout panelListarClientesLayout = new javax.swing.GroupLayout(panelListarClientes);
        panelListarClientes.setLayout(panelListarClientesLayout);
        panelListarClientesLayout.setHorizontalGroup(
            panelListarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListarClientesLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(panelListarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTituloListagem)
                    .addGroup(panelListarClientesLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoSairListagem)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        panelListarClientesLayout.setVerticalGroup(
            panelListarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListarClientesLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(labelTituloListagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelListarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoSairListagem)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelListarClientes, "telalistagem");

        labelNomeBuscado.setText("Nome:");

        botaoBusca.setText("Buscar");
        botaoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscaActionPerformed(evt);
            }
        });

        botaoSairBusca.setText("Sair");
        botaoSairBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairBuscaActionPerformed(evt);
            }
        });

        campoTreinoClienteBuscado.setColumns(20);
        campoTreinoClienteBuscado.setRows(5);
        jScrollPane4.setViewportView(campoTreinoClienteBuscado);

        botaoMostrarTreinos.setText("Treinos");
        botaoMostrarTreinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMostrarTreinosActionPerformed(evt);
            }
        });

        campoClienteBuscado.setColumns(20);
        campoClienteBuscado.setRows(5);
        jScrollPane5.setViewportView(campoClienteBuscado);

        comboBoxTreinos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C\t" }));

        labelSeletorTreino.setText("Treino:");

        javax.swing.GroupLayout panelBuscarClientesLayout = new javax.swing.GroupLayout(panelBuscarClientes);
        panelBuscarClientes.setLayout(panelBuscarClientesLayout);
        panelBuscarClientesLayout.setHorizontalGroup(
            panelBuscarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarClientesLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(panelBuscarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNomeBuscado)
                    .addGroup(panelBuscarClientesLayout.createSequentialGroup()
                        .addGroup(panelBuscarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoBuscarNome, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                            .addComponent(jScrollPane5)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBuscarClientesLayout.createSequentialGroup()
                                .addGroup(panelBuscarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxTreinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelSeletorTreino))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(panelBuscarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoBusca)
                            .addComponent(botaoSairBusca)
                            .addComponent(botaoMostrarTreinos))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        panelBuscarClientesLayout.setVerticalGroup(
            panelBuscarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarClientesLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(panelBuscarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBuscarClientesLayout.createSequentialGroup()
                        .addComponent(botaoMostrarTreinos)
                        .addGap(7, 7, 7)
                        .addComponent(botaoSairBusca))
                    .addGroup(panelBuscarClientesLayout.createSequentialGroup()
                        .addComponent(labelNomeBuscado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBuscarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoBuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoBusca))
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelBuscarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBuscarClientesLayout.createSequentialGroup()
                                .addComponent(labelSeletorTreino)
                                .addGap(4, 4, 4)
                                .addComponent(comboBoxTreinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelBuscarClientes, "telabusca");

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

    private void botaoCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarClienteActionPerformed
        CardLayout telaCadastro = (CardLayout) panelPrincipal.getLayout();
        telaCadastro.show(panelPrincipal,"telacadastro");
    }//GEN-LAST:event_botaoCadastrarClienteActionPerformed

    private void botaoSairCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairCadastroActionPerformed
        CardLayout telaMenu = (CardLayout) panelPrincipal.getLayout();
        telaMenu.show(panelPrincipal,"telamenu");
    }//GEN-LAST:event_botaoSairCadastroActionPerformed

    private void botaoListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarClientesActionPerformed
        CardLayout telaListagem = (CardLayout) panelPrincipal.getLayout();
        telaListagem.show(panelPrincipal, "telalistagem");
        
        if ( !listaClientes.isEmpty() )
            for (int i = 0; i < listaClientes.size(); i++ )
                areaTextoListaClientes.append(listaClientes.get(i).getNome() + "\n");
        else
            areaTextoListaClientes.setText("Não Possui Nenhum Aluno!");
        areaTextoListaClientes.setEditable(false);
    }//GEN-LAST:event_botaoListarClientesActionPerformed

    private void botaoCadastrarFichasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarFichasActionPerformed
        
    }//GEN-LAST:event_botaoCadastrarFichasActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        if ( !campoNomeCliente.getText().isEmpty() && !campoTelefoneCliente.getText().isEmpty() ) {
            Cliente novoCliente = new Cliente(campoNomeCliente.getText().toUpperCase(), comboBoxIdadeCliente.getSelectedIndex()+1, campoTelefoneCliente.getText());
            Cliente.id++;
            
            campoNomeCliente.setText("");
            campoTelefoneCliente.setText("");
            comboBoxIdadeCliente.setSelectedIndex(0);
            
            novoCliente.adicionaFicha(fichaAuxiliar);
            listaClientes.add(novoCliente);
            Collections.sort(listaClientes);
            System.out.println(listaClientes.toString());
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoCriarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarFichaActionPerformed
        if ( !campoFichaExercicio.getText().isEmpty() ) {
            FichaExercicios novaFicha = new FichaExercicios();
            novaFicha.adicionaExercicio(campoFichaExercicio.getText());
            fichaAuxiliar = novaFicha;
            campoFichaExercicio.setText("");
        }
    }//GEN-LAST:event_botaoCriarFichaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);
        JFramePrincipal.janelaCadastro = false;
        Cliente.id = 0;
    }//GEN-LAST:event_formWindowOpened

    private void botaoLimpaFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimpaFichaActionPerformed
        if (!campoFichaExercicio.getText().isEmpty() )
            campoFichaExercicio.setText("");
    }//GEN-LAST:event_botaoLimpaFichaActionPerformed

    private void botaoSairListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairListagemActionPerformed
        CardLayout telaMenu = (CardLayout) panelPrincipal.getLayout();
        telaMenu.show(panelPrincipal,"telamenu");
        areaTextoListaClientes.setText("");
    }//GEN-LAST:event_botaoSairListagemActionPerformed

    private void SairProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairProgramaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairProgramaActionPerformed

    private void botaoBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarClienteActionPerformed
        CardLayout telaBusca = (CardLayout) panelPrincipal.getLayout();
        telaBusca.show(panelPrincipal, "telabusca");
        
        // escondendo os objetos de treino
        comboBoxTreinos.setVisible(false);
        labelSeletorTreino.setVisible(false);
        
        // esvaziando campos de texto e não mostrando
        campoTreinoClienteBuscado.setText("");
        campoTreinoClienteBuscado.setVisible(false);
        campoClienteBuscado.setText("");
        campoClienteBuscado.setVisible(false);
        
        // setando para q os campos de textos sejam não editaveis
        campoClienteBuscado.setEditable(false);
        campoTreinoClienteBuscado.setEditable(false);
    }//GEN-LAST:event_botaoBuscarClienteActionPerformed

    private void botaoSairBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairBuscaActionPerformed
        CardLayout telaMenu = (CardLayout) panelPrincipal.getLayout();
        telaMenu.show(panelPrincipal, "telamenu");
        campoBuscarNome.setText("");
    }//GEN-LAST:event_botaoSairBuscaActionPerformed

    private void botaoBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscaActionPerformed
        if ( !campoBuscarNome.getText().isEmpty() ) {
            String nome = campoBuscarNome.getText().toUpperCase();
            campoClienteBuscado.setText("");
            for ( int i = 0; i < listaClientes.size(); i++ ) 
                    if ( listaClientes.get(i).getNome().equals(nome) ) {
                        campoClienteBuscado.append("ID: " + listaClientes.get(i).getIdentificador() + "\n");
                        campoClienteBuscado.append("Nome: "+ nome + "\n");
                        campoClienteBuscado.append("Telefone: " + listaClientes.get(i).getTelefone() + "\n");
                        campoClienteBuscado.append("Idade: " + Integer.toString(listaClientes.get(i).getIdade()) + "\n");
                        campoClienteBuscado.setVisible(true);
                    }
        }
    }//GEN-LAST:event_botaoBuscaActionPerformed

    private void botaoMostrarTreinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMostrarTreinosActionPerformed
        if ( !campoBuscarNome.getText().isEmpty() ) {
            // mostrando os campos escondidos
            comboBoxTreinos.setVisible(true);
            labelSeletorTreino.setVisible(true);
            campoTreinoClienteBuscado.setVisible(true);
        }
    }//GEN-LAST:event_botaoMostrarTreinosActionPerformed

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
    private javax.swing.JButton SairPrograma;
    private javax.swing.JTextArea areaTextoListaClientes;
    private javax.swing.JButton botaoBusca;
    private javax.swing.JButton botaoBuscarCliente;
    private javax.swing.JButton botaoCadastrarCliente;
    private javax.swing.JButton botaoCadastrarFichas;
    private javax.swing.JButton botaoCriarFicha;
    private javax.swing.JButton botaoLimpaFicha;
    private javax.swing.JButton botaoListarClientes;
    private javax.swing.JButton botaoMostrarTreinos;
    private javax.swing.JButton botaoSairBusca;
    private javax.swing.JButton botaoSairCadastro;
    private javax.swing.JButton botaoSairListagem;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField campoBuscarNome;
    private javax.swing.JTextArea campoClienteBuscado;
    private javax.swing.JTextArea campoFichaExercicio;
    private javax.swing.JTextField campoNomeCliente;
    private javax.swing.JTextField campoTelefoneCliente;
    private javax.swing.JTextArea campoTreinoClienteBuscado;
    private javax.swing.JComboBox<String> comboBoxIdadeCliente;
    private javax.swing.JComboBox<String> comboBoxTreinos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel labelAutores;
    private javax.swing.JLabel labelFichaCliente;
    private javax.swing.JLabel labelIdadeCliente;
    private javax.swing.JLabel labelNomeBuscado;
    private javax.swing.JLabel labelNomeCliente;
    private javax.swing.JLabel labelSeletorTreino;
    private javax.swing.JLabel labelTelefoneCliente;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTituloListagem;
    private javax.swing.JPanel panelBuscarClientes;
    private javax.swing.JPanel panelCadastroCliente;
    private javax.swing.JPanel panelListarClientes;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
