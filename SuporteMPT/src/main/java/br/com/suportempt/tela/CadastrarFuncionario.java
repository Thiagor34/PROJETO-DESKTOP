package br.com.suportempt.tela;

import br.com.suportempt.dao.FuncionarioDao;
import br.com.suportempt.dao.FuncionarioDaoImpl;
import br.com.suportempt.dao.HibernateUtil;
import br.com.suportempt.entidade.Funcionario;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class CadastrarFuncionario extends javax.swing.JFrame {

    private final FuncionarioDao funcionarioDao = new FuncionarioDaoImpl();
    private Funcionario funcionario;
    private Session sessao;

    public CadastrarFuncionario() {
        initComponents();
        lb_situacao.setVisible(false);
        btSituacao.setVisible(false);
    }

    public CadastrarFuncionario(Funcionario funcionario) {
        initComponents();
        btCadastrar.setText("Alterar");
        lb_titulo.setText("Alterar Funcionário");
        carregarAlteracaoFuncionario(funcionario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_titulo = new javax.swing.JLabel();
        lb_nome = new javax.swing.JLabel();
        varNome = new javax.swing.JTextField();
        lb_login = new javax.swing.JLabel();
        varLogin = new javax.swing.JTextField();
        lb_senha = new javax.swing.JLabel();
        varSenha = new javax.swing.JPasswordField();
        lb_confirmaSenha = new javax.swing.JLabel();
        varConfirmaSenha = new javax.swing.JPasswordField();
        btCadastrar = new javax.swing.JButton();
        lb_situacao = new javax.swing.JLabel();
        btSituacao = new javax.swing.JToggleButton();
        lb_nome1 = new javax.swing.JLabel();
        varEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Usuário");

        lb_titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo.setText("Cadastrar Funcionário");

        lb_nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome.setText("Nome:");

        lb_login.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_login.setText("Login:");

        lb_senha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_senha.setText("Senha:");

        lb_confirmaSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_confirmaSenha.setText("Confirma Senha:");

        varConfirmaSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                varConfirmaSenhaFocusLost(evt);
            }
        });

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        lb_situacao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_situacao.setText("Situação:");

        btSituacao.setText("Ativo");
        btSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSituacaoActionPerformed(evt);
            }
        });

        lb_nome1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome1.setText("Email:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lb_situacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_senha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_confirmaSenha, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(lb_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btSituacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(btCadastrar))
                            .addComponent(varLogin)
                            .addComponent(varSenha)
                            .addComponent(varConfirmaSenha)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(varNome))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(varEmail)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lb_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nome)
                    .addComponent(varNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nome1)
                    .addComponent(varEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_login)
                    .addComponent(varLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_senha)
                    .addComponent(varSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_confirmaSenha)
                    .addComponent(varConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(lb_situacao)
                    .addComponent(btSituacao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        sessao = HibernateUtil.abrirConexao();
        if (validarFormulario()) {
            if (funcionario == null) {
                funcionario = new Funcionario();
                funcionario.setAtivo(true);
                funcionario.setSenha(String.valueOf(varSenha.getPassword()));
            } else {
                buscarValorAtivoBotao();
            }

            funcionario.setNome(varNome.getText());
            funcionario.setEmail(varEmail.getText());
            funcionario.setLogin(varLogin.getText());
            try {
                funcionarioDao.salvarOuAlterar(funcionario, sessao);
                dispose();
                JOptionPane.showMessageDialog(null, "Funcionário salvo com sucesso!");
            } catch (HibernateException e) {
                System.out.println("Erro ao salvar fornecedor!");
            } finally {
                sessao.close();
            }
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void carregarAlteracaoFuncionario(Funcionario funcionario1) {
        this.funcionario = funcionario1;
        varNome.setText(funcionario1.getNome());
        varEmail.setText(funcionario1.getEmail());
        varLogin.setText(funcionario1.getLogin());
        varSenha.setEditable(false);
        varConfirmaSenha.setEditable(false);
    }

    private void btSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSituacaoActionPerformed
        System.out.println("Valor botão: " + btSituacao.getText());
        if (btSituacao.getText().equals("Ativo")) {
            btSituacao.setText("Inativo");
        } else {
            btSituacao.setText("Ativo");
        }
    }//GEN-LAST:event_btSituacaoActionPerformed

    private void buscarValorAtivoBotao() {
        if (btSituacao.getText().equals("Ativo")) {
            funcionario.setAtivo(true);
        } else {
            funcionario.setAtivo(false);
        }
    }
    private void varConfirmaSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_varConfirmaSenhaFocusLost
        String senhaNova = String
                .valueOf(varSenha.getPassword());
        String confirmaSenha = String
                .valueOf(varConfirmaSenha.getPassword());

        if (!senhaNova.equals(confirmaSenha)) {
            JOptionPane.showMessageDialog(null, "As senhas não conferem");
            varConfirmaSenha.grabFocus();
        }
    }//GEN-LAST:event_varConfirmaSenhaFocusLost

    private boolean validarFormulario() {
        String nome = varNome.getText().trim();
        if (validarCampoMenor3Caracter(nome)) {
            JOptionPane.showMessageDialog(null, "Preencha o nome corretamente!");
            return false;
        }
        String login = varLogin.getText().trim();
        if (validarCampoMenor3Caracter(login)) {
            JOptionPane.showMessageDialog(null, "Preencha o login corretamente!");
            return false;
        }

        return true;
    }

    private boolean validarCampoMenor3Caracter(String campo) {
        return campo.length() < 3;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JToggleButton btSituacao;
    private javax.swing.JLabel lb_confirmaSenha;
    private javax.swing.JLabel lb_login;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_nome1;
    private javax.swing.JLabel lb_senha;
    private javax.swing.JLabel lb_situacao;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JPasswordField varConfirmaSenha;
    private javax.swing.JTextField varEmail;
    private javax.swing.JTextField varLogin;
    private javax.swing.JTextField varNome;
    private javax.swing.JPasswordField varSenha;
    // End of variables declaration//GEN-END:variables
}
