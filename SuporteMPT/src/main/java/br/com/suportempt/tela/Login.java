package br.com.suportempt.tela;

import br.com.suportempt.dao.FuncionarioDao;
import br.com.suportempt.dao.FuncionarioDaoImpl;
import br.com.suportempt.dao.HibernateUtil;
import br.com.suportempt.entidade.Funcionario;
import java.awt.HeadlessException;
import java.util.Date;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setSize(360, 270);
        varUsuario.setVisible(false);
        varSenha.setVisible(false);
        lb_usuario.setVisible(false);
        lb_senha.setVisible(false);
        btLogar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_titulo = new javax.swing.JLabel();
        lb_usuario = new javax.swing.JLabel();
        varUsuario = new javax.swing.JTextField();
        lb_senha = new javax.swing.JLabel();
        varSenha = new javax.swing.JPasswordField();
        btLogar = new javax.swing.JButton();
        btEntrar = new javax.swing.JButton();
        btAdmSuporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Suporte Senac");

        lb_titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo.setText("Login");

        lb_usuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_usuario.setText("Usuário:");

        lb_senha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_senha.setText("Senha:");

        btLogar.setText("Logar");
        btLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogarActionPerformed(evt);
            }
        });

        btEntrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btEntrar.setText("Aluno/Professor");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        btAdmSuporte.setText("Adm/Suporte");
        btAdmSuporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdmSuporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lb_usuario)
                        .addComponent(lb_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(varUsuario)
                        .addComponent(varSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btAdmSuporte, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLogar)
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lb_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEntrar)
                .addGap(18, 18, 18)
                .addComponent(btAdmSuporte)
                .addGap(18, 18, 18)
                .addComponent(lb_usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lb_senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btLogar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogarActionPerformed
        String login = varUsuario.getText();
        String senha = String.valueOf(varSenha.getPassword());
        Session sessao = null;
        try {
            FuncionarioDao funcionarioDao = new FuncionarioDaoImpl();
            sessao = HibernateUtil.abrirConexao();
            Funcionario funcionario = funcionarioDao.logar(login, senha, sessao);
            if (funcionario == null) {
                JOptionPane.showMessageDialog(null,
                        "Funcionário ou senha incorretos");
            } else if (!funcionario.isAtivo()) {
                JOptionPane.showMessageDialog(null,
                        "Você não tem permissão de acesso!");
            } else {
                funcionario.setUltimoAcesso(new Date());
                funcionarioDao.salvarOuAlterar(funcionario, sessao);
                new TelaSuporte(funcionario).setVisible(true);
                dispose();
            }
        } catch (HeadlessException | HibernateException ex) {
            System.out.println("Erro ao logar " + ex.getMessage());
        } finally {
            if (sessao != null) {
                sessao.close();
            }
        }
    }//GEN-LAST:event_btLogarActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        new TelaUsuario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btEntrarActionPerformed

    private void btAdmSuporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdmSuporteActionPerformed
        this.setSize(360, 420);
        varUsuario.setVisible(true);
        varSenha.setVisible(true);
        lb_usuario.setVisible(true);
        lb_senha.setVisible(true);
        btLogar.setVisible(true);
    }//GEN-LAST:event_btAdmSuporteActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdmSuporte;
    private javax.swing.JButton btEntrar;
    private javax.swing.JButton btLogar;
    private javax.swing.JLabel lb_senha;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel lb_usuario;
    private javax.swing.JPasswordField varSenha;
    private javax.swing.JTextField varUsuario;
    // End of variables declaration//GEN-END:variables
}
