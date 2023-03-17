package br.com.suportempt.tela;

import br.com.suportempt.entidade.Funcionario;

public class TelaSuporte extends javax.swing.JFrame {
    
    private Funcionario funcionario;
    
    public TelaSuporte() {
        initComponents();
    }
    
    public TelaSuporte(Funcionario funcionario) {
        initComponents();
        this.funcionario = funcionario;
        varFuncionarioLogado.setText("Seja bem vindo " + funcionario.getNome());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        varFuncionarioLogado = new javax.swing.JLabel();
        lb_titulo = new javax.swing.JLabel();
        lb_cadastro = new javax.swing.JLabel();
        lb_chamados = new javax.swing.JLabel();
        icone_pesq_chamado = new javax.swing.JLabel();
        icone_pesq_usuario = new javax.swing.JLabel();
        icone_cad_usuario = new javax.swing.JLabel();
        icone_cad_chamado = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuCadastrar = new javax.swing.JMenu();
        item_cad_chamado = new javax.swing.JMenuItem();
        item_cad_usuario = new javax.swing.JMenuItem();
        menuPesquisar = new javax.swing.JMenu();
        item_pesq_chamado = new javax.swing.JMenuItem();
        item_pesq_usuario = new javax.swing.JMenuItem();
        menuAlterarSenha = new javax.swing.JMenu();
        item_alterar_senha = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Suporte MPT");
        setResizable(false);

        lb_titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo.setText("Bem Vindo ao Suporte MPT");

        lb_cadastro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_cadastro.setForeground(new java.awt.Color(102, 102, 102));
        lb_cadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_cadastro.setText("Cadastros");

        lb_chamados.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_chamados.setForeground(new java.awt.Color(102, 102, 102));
        lb_chamados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_chamados.setText("Pesquisas");

        icone_pesq_chamado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/pesq_chamado.png"))); // NOI18N
        icone_pesq_chamado.setToolTipText("Pesquisar Chamados");
        icone_pesq_chamado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        icone_pesq_chamado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        icone_pesq_chamado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icone_pesq_chamadoMouseClicked(evt);
            }
        });

        icone_pesq_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/pesq_funcionario.png"))); // NOI18N
        icone_pesq_usuario.setToolTipText("Pesquisar Usuário");
        icone_pesq_usuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        icone_pesq_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        icone_pesq_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icone_pesq_usuarioMouseClicked(evt);
            }
        });

        icone_cad_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cad_funcionario.png"))); // NOI18N
        icone_cad_usuario.setToolTipText("Cadastrar Usuário");
        icone_cad_usuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        icone_cad_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        icone_cad_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icone_cad_usuarioMouseClicked(evt);
            }
        });

        icone_cad_chamado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cad_chamado.png"))); // NOI18N
        icone_cad_chamado.setToolTipText("Cadastrar Chamado");
        icone_cad_chamado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        icone_cad_chamado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        icone_cad_chamado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icone_cad_chamadoMouseClicked(evt);
            }
        });

        menuCadastrar.setText("Cadastrar");

        item_cad_chamado.setText("Chamado");
        item_cad_chamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cad_chamadoActionPerformed(evt);
            }
        });
        menuCadastrar.add(item_cad_chamado);

        item_cad_usuario.setText("Funcionário");
        item_cad_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cad_usuarioActionPerformed(evt);
            }
        });
        menuCadastrar.add(item_cad_usuario);

        menuBar.add(menuCadastrar);

        menuPesquisar.setText("Pesquisar");

        item_pesq_chamado.setText("Chamado");
        item_pesq_chamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_pesq_chamadoActionPerformed(evt);
            }
        });
        menuPesquisar.add(item_pesq_chamado);

        item_pesq_usuario.setText("Funcionário");
        item_pesq_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_pesq_usuarioActionPerformed(evt);
            }
        });
        menuPesquisar.add(item_pesq_usuario);

        menuBar.add(menuPesquisar);

        menuAlterarSenha.setText("Configurações");

        item_alterar_senha.setText("Alterar Senha");
        item_alterar_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_alterar_senhaActionPerformed(evt);
            }
        });
        menuAlterarSenha.add(item_alterar_senha);

        menuBar.add(menuAlterarSenha);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(icone_cad_chamado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icone_cad_usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(icone_pesq_chamado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icone_pesq_usuario)
                .addGap(83, 83, 83))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(varFuncionarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(lb_cadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_chamados)
                .addGap(121, 121, 121))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(varFuncionarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_chamados)
                    .addComponent(lb_cadastro))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icone_cad_chamado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icone_cad_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icone_pesq_chamado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icone_pesq_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 102, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(lb_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(264, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void icone_pesq_chamadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icone_pesq_chamadoMouseClicked
        new PesquisarChamado().setVisible(true);
    }//GEN-LAST:event_icone_pesq_chamadoMouseClicked

    private void icone_cad_chamadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icone_cad_chamadoMouseClicked
        new CadastrarChamado().setVisible(true);
    }//GEN-LAST:event_icone_cad_chamadoMouseClicked

    private void icone_cad_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icone_cad_usuarioMouseClicked
        new CadastrarFuncionario().setVisible(true);
    }//GEN-LAST:event_icone_cad_usuarioMouseClicked

    private void icone_pesq_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icone_pesq_usuarioMouseClicked
        new PesquisarFuncionario().setVisible(true);
    }//GEN-LAST:event_icone_pesq_usuarioMouseClicked

    private void item_cad_chamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cad_chamadoActionPerformed
        new CadastrarChamado().setVisible(true);
    }//GEN-LAST:event_item_cad_chamadoActionPerformed

    private void item_cad_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cad_usuarioActionPerformed
        new CadastrarFuncionario().setVisible(true);
    }//GEN-LAST:event_item_cad_usuarioActionPerformed

    private void item_pesq_chamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_pesq_chamadoActionPerformed
        new PesquisarChamado().setVisible(true);
    }//GEN-LAST:event_item_pesq_chamadoActionPerformed

    private void item_pesq_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_pesq_usuarioActionPerformed
        new PesquisarFuncionario().setVisible(true);
    }//GEN-LAST:event_item_pesq_usuarioActionPerformed

    private void item_alterar_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_alterar_senhaActionPerformed
        new AlterarSenha(funcionario).setVisible(true);
    }//GEN-LAST:event_item_alterar_senhaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaSuporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSuporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSuporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSuporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSuporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icone_cad_chamado;
    private javax.swing.JLabel icone_cad_usuario;
    private javax.swing.JLabel icone_pesq_chamado;
    private javax.swing.JLabel icone_pesq_usuario;
    private javax.swing.JMenuItem item_alterar_senha;
    private javax.swing.JMenuItem item_cad_chamado;
    private javax.swing.JMenuItem item_cad_usuario;
    private javax.swing.JMenuItem item_pesq_chamado;
    private javax.swing.JMenuItem item_pesq_usuario;
    private javax.swing.JLabel lb_cadastro;
    private javax.swing.JLabel lb_chamados;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JMenu menuAlterarSenha;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenu menuPesquisar;
    private javax.swing.JLabel varFuncionarioLogado;
    // End of variables declaration//GEN-END:variables
}
