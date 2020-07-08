package view;

import conexao.ConnectionFactory;
import controller.ProfessorController;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import model.bean.Professor;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import regex.ValidaCampos;

public class CadastroProfessoresView extends javax.swing.JFrame {

    ProfessorController pc;

    Professor professor = new Professor();
    private int idprofessor = 0;
    private boolean alterar = false;
    
    public CadastroProfessoresView(Professor prof) {
        initComponents();
        
        pc = new ProfessorController();
        
        if(prof != null){
            preencheCampos(prof);
            this.professor = prof;
        }
        else{
            txtnome.requestFocus();
        }
    }
    
    public void preencheCampos(Professor p){
        this.idprofessor = p.getIdprofessor();
        txtnome.setText(p.getNome());
        txtendereco.setText(p.getEndereco());
        txtfone.setText(p.getFone());
        txtemail.setText(p.getEmail());
        txtformacao.setText(p.getFormacao());
        txtsalario.setText(String.valueOf(p.getSalario()));
        comboboxGraduacao.setSelectedItem(p.getTitulacao());
        btnexcluir.setEnabled(true);
        btnsalvar.setEnabled(false);
        btnincluir.setEnabled(false);
        btncancelar.setEnabled(true);
        btndisciplinas.setEnabled(true);
        
        this.alterar = true;
    }
    

    public void limpar(){
        txtnome.setText("");
        txtendereco.setText("");
        txtfone.setText("");
        txtemail.setText("");
        txtformacao.setText("");
        txtsalario.setText("");
    }
    
    public void getListaProfessores(){
        ConsultaProfessoresView cv = new ConsultaProfessoresView();
        cv.setVisible(true);
        this.dispose();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnincluir = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        btndisciplinas = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtendereco = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtsalario = new javax.swing.JTextField();
        txtfone = new javax.swing.JFormattedTextField();
        txtformacao = new javax.swing.JTextField();
        comboboxGraduacao = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnincluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        btnincluir.setText("Incluir");
        btnincluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnincluirActionPerformed(evt);
            }
        });

        btnsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save.png"))); // NOI18N
        btnsalvar.setText("Salvar");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        btnexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete.png"))); // NOI18N
        btnexcluir.setText("Excluir");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        btnsair.setText("Sair");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });

        btndisciplinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/order.png"))); // NOI18N
        btndisciplinas.setText("Disciplinas");
        btndisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndisciplinasActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/print.png"))); // NOI18N
        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnincluir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btncancelar)
                .addGap(30, 30, 30)
                .addComponent(btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btndisciplinas)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnincluir)
                    .addComponent(btnsalvar)
                    .addComponent(btnexcluir)
                    .addComponent(btncancelar)
                    .addComponent(btnsair)
                    .addComponent(btndisciplinas)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel1.setText("NOME:");

        jLabel2.setText("ENDEREÇO:");

        jLabel3.setText("E-MAIL:");

        jLabel4.setText("FONE:");

        jLabel5.setText("SALÁRIO:");

        jLabel6.setText("FORMAÇÃO:");

        jLabel7.setText("TITULAÇÃO:");

        txtnome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomeKeyTyped(evt);
            }
        });

        txtendereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtenderecoKeyTyped(evt);
            }
        });

        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtemailKeyTyped(evt);
            }
        });

        txtsalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsalarioKeyTyped(evt);
            }
        });

        try {
            txtfone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtfone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfoneKeyTyped(evt);
            }
        });

        txtformacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtformacaoKeyTyped(evt);
            }
        });

        comboboxGraduacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Graduação", "Especialização", "Mestrado", "Doutorado", "Pós Doutorado" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtnome)
                        .addComponent(txtendereco)
                        .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtsalario)
                            .addComponent(txtfone, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtformacao)
                            .addComponent(comboboxGraduacao, 0, 361, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtfone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(txtformacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtsalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(comboboxGraduacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        getListaProfessores();
    }//GEN-LAST:event_btnsairActionPerformed

    private void txtnomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomeKeyTyped
        if(alterar){
            btnexcluir.setEnabled(false);
            btnsalvar.setEnabled(true);
            btnincluir.setEnabled(true);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_txtnomeKeyTyped

    private void btnincluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnincluirActionPerformed
        if (ValidaCampos()) {
            if (!txtnome.getText().isEmpty() && !txtformacao.getText().isEmpty()) {
                if (pc.insert(txtnome.getText(), txtendereco.getText(), txtfone.getText(), txtemail.getText(),
                        txtformacao.getText(), comboboxGraduacao.getSelectedItem().toString(), Double.parseDouble(txtsalario.getText()))) {
                    limpar();
                } else {
                    JOptionPane.showMessageDialog(null, "não foi possível salvar o professor", "", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "nome e formação são obrigatórios", "", JOptionPane.WARNING_MESSAGE);
            }

            getListaProfessores();
        }
    }//GEN-LAST:event_btnincluirActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        if (ValidaCampos()) {
            if (!txtnome.getText().isEmpty() && !txtformacao.getText().isEmpty()) {
                if (pc.update(idprofessor, txtnome.getText(), txtendereco.getText(), txtfone.getText(), txtemail.getText(),
                        txtformacao.getText(), comboboxGraduacao.getSelectedItem().toString(), Double.parseDouble(txtsalario.getText()))) {
                    limpar();
                } else {
                    JOptionPane.showMessageDialog(null, "não foi possível salvar o professor", "", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "nome e formação são obrigatórios", "", JOptionPane.WARNING_MESSAGE);
            }

            getListaProfessores();
        }
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        if(pc.delete(idprofessor)){
           JOptionPane.showMessageDialog(this, "professor excluido com sucesso", "", JOptionPane.INFORMATION_MESSAGE);
       }else{
           JOptionPane.showMessageDialog(null, "não foi possível excluir", "", JOptionPane.INFORMATION_MESSAGE);
       }
       
       getListaProfessores();
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void btndisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndisciplinasActionPerformed
        ProfessorDisciplinaView adv = new ProfessorDisciplinaView();
        adv.professor = this.professor;
        adv.setVisible(true);
        adv.txtnome.setText(txtnome.getText());
        this.dispose();
    }//GEN-LAST:event_btndisciplinasActionPerformed

    private void txtenderecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtenderecoKeyTyped
        if(alterar){
            btnexcluir.setEnabled(false);
            btnsalvar.setEnabled(true);
            btnincluir.setEnabled(true);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_txtenderecoKeyTyped

    private void txtemailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyTyped
        if(alterar){
            btnexcluir.setEnabled(false);
            btnsalvar.setEnabled(true);
            btnincluir.setEnabled(true);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_txtemailKeyTyped

    private void txtfoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfoneKeyTyped
        if(alterar){
            btnexcluir.setEnabled(false);
            btnsalvar.setEnabled(true);
            btnincluir.setEnabled(true);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_txtfoneKeyTyped

    private void txtformacaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtformacaoKeyTyped
        if(alterar){
            btnexcluir.setEnabled(false);
            btnsalvar.setEnabled(true);
            btnincluir.setEnabled(true);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_txtformacaoKeyTyped

    private void txtsalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsalarioKeyTyped
        if(alterar){
            btnexcluir.setEnabled(false);
            btnsalvar.setEnabled(true);
            btnincluir.setEnabled(true);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_txtsalarioKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection con = ConnectionFactory.getConnection();
        String src = "src/reports/relatorioProfessor.jasper";
        
        JasperPrint jp = null;
        Map m = new HashMap();
        m.put("idprofessor", this.professor.getIdprofessor());
        
        try{
            jp = JasperFillManager.fillReport(src, m, con);
            
        }catch(JRException ex){
            System.out.println("erro ao gerar relatório de disciplinas"+ex);
        }
        
        JasperViewer view = new JasperViewer(jp, false);
        view.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        btnincluir.setEnabled(false);
        btnexcluir.setEnabled(false);
        btncancelar.setEnabled(false);
        btnsalvar.setEnabled(false);
        alterar = false;
        limpar();
    }//GEN-LAST:event_btncancelarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProfessoresView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessoresView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessoresView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessoresView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProfessoresView(null).setVisible(true);
            }
        });
    }
    
    private boolean ValidaCampos(){
        if(!ValidaCampos.validaNome(txtnome.getText())){
            JOptionPane.showMessageDialog(this, "nome inválido", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!ValidaCampos.validaEndereco(txtendereco.getText())){
            JOptionPane.showMessageDialog(this, "endereço inválido", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!ValidaCampos.validaEmail(txtemail.getText())){
            JOptionPane.showMessageDialog(this, "e-mail inválido", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!ValidaCampos.validaFone(txtfone.getText())){
            JOptionPane.showMessageDialog(this, "telefone inválido", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!ValidaCampos.validaFormacao(txtformacao.getText())){
            JOptionPane.showMessageDialog(this, "formação inválido", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!ValidaCampos.validaSalario(txtsalario.getText())){
            JOptionPane.showMessageDialog(this, "salário inválido", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btndisciplinas;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnincluir;
    private javax.swing.JButton btnsair;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JComboBox<String> comboboxGraduacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtendereco;
    private javax.swing.JFormattedTextField txtfone;
    private javax.swing.JTextField txtformacao;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtsalario;
    // End of variables declaration//GEN-END:variables
}
