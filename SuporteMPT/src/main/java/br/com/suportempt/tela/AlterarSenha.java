package br.com.suportempt.tela;

import br.com.suportempt.dao.FuncionarioDao;
import br.com.suportempt.dao.FuncionarioDaoImpl;
import br.com.suportempt.dao.HibernateUtil;
import br.com.suportempt.entidade.Funcionario;
import java.awt.Window;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class AlterarSenha extends javax.swing.JFrame {

    private Funcionario funcionario;

    public AlterarSenha() {
        initComponents();
    }

    public AlterarSenha(Funcionario funcionario) {
        initComponents();
        this.funcionario = funcionario;
        varNome.setText(funcionario.getNome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_titulo = new javax.swing.JLabel();
        lb_nome = new javax.swing.JLabel();
        varNome = new javax.swing.JLabel();
        lb_senhaAntiga = new javax.swing.JLabel();
        varSenhaAntiga = new javax.swing.JPasswordField();
        lb_senhaNova = new javax.swing.JLabel();
        varSenhaNova = new javax.swing.JPasswordField();
        lb_confirmaSenha = new javax.swing.JLabel();
        varConfirmaSenha = new javax.swing.JPasswordField();
        btAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Senha");

        lb_titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo.setText("Alterar Senha");

        lb_nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome.setText("Nome:");

        lb_senhaAntiga.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_senhaAntiga.setText("Senha Antiga:");

        varSenhaAntiga.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                varSenhaAntigaFocusLost(evt);
            }
        });

        lb_senhaNova.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_senhaNova.setText("Senha Nova:");

        varSenhaNova.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                varSenhaNovaFocusLost(evt);
            }
        });

        lb_confirmaSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_confirmaSenha.setText("Confirma Senha:");

        varConfirmaSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                varConfirmaSenhaFocusLost(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_senhaAntiga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_confirmaSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_senhaNova, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(varNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(varSenhaAntiga)
                            .addComponent(varSenhaNova, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(varConfirmaSenha, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btAlterar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lb_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_nome)
                    .addComponent(varNome, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_senhaAntiga)
                    .addComponent(varSenhaAntiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_senhaNova)
                    .addComponent(varSenhaNova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_confirmaSenha)
                    .addComponent(varConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btAlterar)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void varSenhaAntigaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_varSenhaAntigaFocusLost
        String senhaAntiga = String
                .valueOf(varSenhaAntiga.getPassword());
        if (!funcionario.getSenha().equals(senhaAntiga)) {
            JOptionPane.showMessageDialog(null,
                    "Senha antiga não confere");
            varSenhaAntiga.grabFocus();
        }
    }//GEN-LAST:event_varSenhaAntigaFocusLost

    private void varSenhaNovaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_varSenhaNovaFocusLost
        String senhaNova = String
                .valueOf(varSenhaNova.getPassword());

        if (funcionario.getSenha().equals(senhaNova)) {
            JOptionPane.showMessageDialog(null,
                    "A nova senha não pode ser a mesma!");
            varSenhaNova.grabFocus();
        }
    }//GEN-LAST:event_varSenhaNovaFocusLost

    private void varConfirmaSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_varConfirmaSenhaFocusLost
        String senhaNova = String
                .valueOf(varSenhaNova.getPassword());
        String confirmaSenha = String
                .valueOf(varConfirmaSenha.getPassword());

        if (!senhaNova.equals(confirmaSenha)) {
            JOptionPane.showMessageDialog(null,
                    "As senhas não conferem");
            varConfirmaSenha.grabFocus();
        }
    }//GEN-LAST:event_varConfirmaSenhaFocusLost

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        if (validarFormulario()) {
            FuncionarioDao funcionarioDao = new FuncionarioDaoImpl();
            Session sessao = HibernateUtil.abrirConexao();
            String senhaNova = String
                    .valueOf(varSenhaNova.getPassword());
            funcionario.setSenha(senhaNova);
            try {
                funcionarioDao.salvarOuAlterar(funcionario, sessao);
                this.dispose();
                Window[] windows = Window.getWindows();
                for (Window window : windows) {
                    window.dispose();
                }
                new Login().setVisible(true);
            } catch (HibernateException e) {
                System.out.println("Erro ao salvar senha " + e.getMessage());
                new TelaSuporte(funcionario).setVisible(true);
            } finally {
                sessao.close();
            }
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private boolean validarFormulario() {
        String senhaAntiga = String
                .valueOf(varSenhaAntiga.getPassword());
        if (validarCampoPreenchido(senhaAntiga)) {
            JOptionPane.showMessageDialog(null,
                    "Digite a senha antiga");
            return false;
        }

        String senhaNova = String
                .valueOf(varSenhaNova.getPassword());
        if (validarCampoPreenchido(senhaNova)) {
            JOptionPane.showMessageDialog(null,
                    "Digite a senha nova");
            return false;
        }

        String confirmaSenha = String
                .valueOf(varConfirmaSenha.getPassword());
        if (validarCampoPreenchido(confirmaSenha)) {
            JOptionPane.showMessageDialog(null,
                    "Digite um valor para confirmar senha");
            return false;
        }
        return true;
    }

    private boolean validarCampoPreenchido(String campo) {
        return campo.length() < 3;
    }

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
            java.util.logging.Logger.getLogger(AlterarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JLabel lb_confirmaSenha;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_senhaAntiga;
    private javax.swing.JLabel lb_senhaNova;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JPasswordField varConfirmaSenha;
    private javax.swing.JLabel varNome;
    private javax.swing.JPasswordField varSenhaAntiga;
    private javax.swing.JPasswordField varSenhaNova;
    // End of variables declaration//GEN-END:variables
}
