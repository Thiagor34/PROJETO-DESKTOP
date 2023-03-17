/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.suportempt.tela;

import br.com.suportempt.dao.ChamadoDao;
import br.com.suportempt.dao.ChamadoDaoImpl;
import br.com.suportempt.dao.HibernateUtil;
import br.com.suportempt.entidade.Chamado;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Truen
 */
public class VerificarChamado extends javax.swing.JFrame {
    private Chamado chamado;
    private final ChamadoDao chamadoDAO = new ChamadoDaoImpl();
    private Session sessao;

    /**
     * Creates new form VerificarChamado
     */
    public VerificarChamado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_titulo = new javax.swing.JLabel();
        lb_patrimonio = new javax.swing.JLabel();
        varPatrimonio = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        varResultado = new javax.swing.JLabel();
        lblProblema = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblAbertura = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        varProblema = new javax.swing.JTextArea();
        varAbertura = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Verificar chamado");

        lb_titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo.setText("Verificar chamado");

        lb_patrimonio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_patrimonio.setText("Código do Patrimônio:");

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblResultado.setText("Resultado:");

        varResultado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        varResultado.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        varResultado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblProblema.setText("Problema");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblAbertura.setText("Data de abertura");

        varProblema.setColumns(20);
        varProblema.setLineWrap(true);
        varProblema.setRows(2);
        varProblema.setEnabled(false);
        jScrollPane1.setViewportView(varProblema);

        varAbertura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(varResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lb_patrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(varPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnVerificar)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblResultado)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProblema)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(varAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAbertura))
                                .addGap(36, 36, 36)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lb_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_patrimonio)
                    .addComponent(varPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(varResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAbertura)
                        .addGap(28, 28, 28)
                        .addComponent(varAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblProblema)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 30, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        if (validarCodigo()){
            try {
                sessao = HibernateUtil.abrirConexao();
                List<Chamado> chamados = chamadoDAO.pesquisarPorPatrimonio(varPatrimonio.getText().trim(), true, sessao);
                if (chamados.isEmpty()){
                    varResultado.setForeground(new Color(0, 102, 0));
                    varResultado.setText("");
                    varProblema.setText("");
                    varAbertura.setText("");
                    varResultado.setText("Não há chamado em aberto para esse patrimônio!");
                } else{
                    varResultado.setForeground(Color.red);
                    varResultado.setText("Já há chamado em aberto para esse patrimônio!");
                    varProblema.setText(chamados.get(0).getProblema());
                    String dataAbertura = new SimpleDateFormat("dd/MM/yyyy").format(chamados.get(0).getDtAbertura());
                    varAbertura.setText(dataAbertura);
                }
            } catch (HibernateException ex){
                JOptionPane.showMessageDialog(null, "Não foi possível verificar o código!");
            } finally {
                sessao.close();
            }
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

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
            java.util.logging.Logger.getLogger(VerificarChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerificarChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerificarChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerificarChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerificarChamado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_patrimonio;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel lblAbertura;
    private javax.swing.JLabel lblProblema;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel varAbertura;
    private javax.swing.JTextField varPatrimonio;
    private javax.swing.JTextArea varProblema;
    private javax.swing.JLabel varResultado;
    // End of variables declaration//GEN-END:variables

    private boolean validarCodigo() {
        if (varPatrimonio.getText().trim().length() < 6){
            JOptionPane.showMessageDialog(null, "O código do equipamento deve ter no mínimo 6 caracteres!");
            return false;
        }
        return true;
    }
}
