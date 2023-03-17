package br.com.suportempt.tela;

import br.com.suportempt.dao.FuncionarioDao;
import br.com.suportempt.dao.FuncionarioDaoImpl;
import br.com.suportempt.dao.HibernateUtil;
import br.com.suportempt.entidade.Funcionario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class PesquisarFuncionario extends javax.swing.JFrame {

    private Session sessao;
    private Funcionario funcionario;
    private FuncionarioDao funcionarioDao = new FuncionarioDaoImpl();
    private List<Funcionario> funcionarios;

    public PesquisarFuncionario() {
        initComponents();
        btAlterar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_titulo = new javax.swing.JLabel();
        lb_nome = new javax.swing.JLabel();
        varNome = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFuncionario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Usuário");

        lb_titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo.setText("Pesquisar Funcionário");

        lb_nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome.setText("Nome:");

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        tbFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "E-mail", "Login", "Situação", "Último Acesso"
            }
        ));
        tbFuncionario.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tbFuncionario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_nome)
                        .addGap(18, 18, 18)
                        .addComponent(varNome)
                        .addGap(18, 18, 18)
                        .addComponent(btPesquisar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btAlterar)
                        .addGap(270, 270, 270)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lb_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nome)
                    .addComponent(varNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btAlterar)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        String nome = varNome.getText().trim();
        if (nome.length() < 3) {
            JOptionPane.showMessageDialog(null, "Preencha o nome corretamente!");
        } else {
            try {
                sessao = HibernateUtil.abrirConexao();
                funcionarios = funcionarioDao.pesquisarPorNome(nome, sessao);
                carregarTabelaFuncionario();
                btAlterar.setVisible(true);
            } catch (HibernateException e) {
                System.out.println("Erro ao pesquisar " + e.getMessage());
            } finally {
                sessao.close();
            }
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        int linhaSelecionada = tbFuncionario.getSelectedRow();
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um Funcionário para alterar");
        } else {
            funcionario = funcionarios.get(linhaSelecionada);
            new CadastrarFuncionario(funcionario).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void carregarTabelaFuncionario() {
        DefaultTableModel defaultTable = (DefaultTableModel) tbFuncionario.getModel();
        defaultTable.setNumRows(0);
        funcionarios.stream()
                .forEach(fun -> {
                    String situacao;
                    if (fun.isAtivo()){
                        situacao = "Ativo";
                    } else {
                        situacao = "Inativo";
                    }
                    defaultTable.addRow(new Object[]{
                        fun.getNome(),
                        fun.getEmail(),
                        fun.getLogin(),
                        situacao,
                        fun.getUltimoAcesso(),});
                });
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new PesquisarFuncionario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JTable tbFuncionario;
    private javax.swing.JTextField varNome;
    // End of variables declaration//GEN-END:variables
}
