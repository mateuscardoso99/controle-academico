package view;

import conexao.ConnectionFactory;
import controller.AlunoController;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import model.bean.Aluno;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import regex.ValidaCampos;

public class CadastroAlunosView extends javax.swing.JFrame {
    
    AlunoController ac = new AlunoController();
    private Aluno aluno;
    private int idAluno = 0;
    private boolean alterar = false;
    
    public CadastroAlunosView(Aluno aluno) {
        initComponents();
        
        if(aluno!=null){
            preencheCampos(aluno);
            this.aluno = aluno;
            btnimprimir.setEnabled(true);
        }
        else{
            txtnome.requestFocus();
        }
    }
    
    
    public void limpar(){
        txtnome.setText("");
        txtendereco.setText("");
        txtfone.setText("");
        txtemail.setText("");
        txtcurso.setText("");
        txtmatricula.setText("");
    }

    
    public void preencheCampos(Aluno a){
        this.idAluno = a.getId();
        txtnome.setText(a.getNome());
        txtendereco.setText(a.getEndereco());
        txtfone.setText(a.getTelefone());
        txtemail.setText(a.getEmail());
        txtcurso.setText(a.getCurso());
        txtmatricula.setText(a.getMatricula());
        
        btnexcluir.setEnabled(true);
        btnincluir.setEnabled(false);
        btnsalvar.setEnabled(false);
        btnincluir.setEnabled(false);
        btncancelar.setEnabled(true);
        btndisciplinas.setEnabled(true);
        btnimprimir.setEnabled(true);
        
        this.alterar = true;
    }
    
    public void getListaAlunos(){
        ConsultaAlunosView cv = new ConsultaAlunosView();
        cv.setVisible(true);
        this.dispose();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnincluir = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        btndisciplinas = new javax.swing.JButton();
        btnimprimir = new javax.swing.JButton();
        txtendereco = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtfone = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtmatricula = new javax.swing.JTextField();
        txtcurso = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Alunos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Endereço:");

        jLabel3.setText("Email:");

        jLabel4.setText("Fone:");

        jLabel5.setText("Curso:");

        txtnome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomeKeyTyped(evt);
            }
        });

        btnincluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        btnincluir.setText("Incluir");
        btnincluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnincluirActionPerformed(evt);
            }
        });

        btnsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save.png"))); // NOI18N
        btnsalvar.setText("Salvar");
        btnsalvar.setEnabled(false);
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        btnexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete.png"))); // NOI18N
        btnexcluir.setText("Excluir");
        btnexcluir.setEnabled(false);
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.setEnabled(false);
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
        btndisciplinas.setText("Disciplina");
        btndisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndisciplinasActionPerformed(evt);
            }
        });

        btnimprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/print.png"))); // NOI18N
        btnimprimir.setText("Imprimir");
        btnimprimir.setEnabled(false);
        btnimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnincluir)
                .addGap(39, 39, 39)
                .addComponent(btnsalvar)
                .addGap(43, 43, 43)
                .addComponent(btnexcluir)
                .addGap(47, 47, 47)
                .addComponent(btncancelar)
                .addGap(37, 37, 37)
                .addComponent(btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btndisciplinas)
                .addGap(18, 18, 18)
                .addComponent(btnimprimir)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnincluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalvar)
                    .addComponent(btnexcluir)
                    .addComponent(btncancelar)
                    .addComponent(btnsair)
                    .addComponent(btndisciplinas)
                    .addComponent(btnimprimir))
                .addContainerGap(51, Short.MAX_VALUE))
        );

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

        jLabel6.setText("Matrícula:");

        txtmatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmatriculaKeyTyped(evt);
            }
        });

        txtcurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcursoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addComponent(jLabel1)
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtendereco)
                                .addComponent(txtnome)
                                .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtfone, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(85, 85, 85)
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtcurso, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(0, 824, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtfone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnincluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnincluirActionPerformed
        if(validaCamposAlunos()){
            if(!txtnome.getText().isEmpty()&&!txtmatricula.getText().isEmpty()&&!txtcurso.getText().isEmpty()){
                if(ac.insert(txtnome.getText(), txtendereco.getText(), txtfone.getText(), txtemail.getText(),
                        txtmatricula.getText(), txtcurso.getText())){
                    limpar();
                }else{
                    JOptionPane.showMessageDialog(null, "não foi possível salvar o aluno", "", JOptionPane.WARNING_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "nome, curso e matrícula são obrigatórios", "", JOptionPane.WARNING_MESSAGE);
            }
            getListaAlunos();
        }     
    }//GEN-LAST:event_btnincluirActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       /* ViewPrincipal p = new ViewPrincipal();
        p.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_formWindowClosed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        btnincluir.setEnabled(false);
        btnexcluir.setEnabled(false);
        btncancelar.setEnabled(false);
        btnsalvar.setEnabled(false);
        alterar = false;
        limpar();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        getListaAlunos();
    }//GEN-LAST:event_btnsairActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        if(validaCamposAlunos()){
            if(!txtnome.getText().isEmpty()&&!txtmatricula.getText().isEmpty()&&!txtcurso.getText().isEmpty()){
                if(ac.update(idAluno, txtnome.getText(), txtendereco.getText(), txtfone.getText(), txtemail.getText(),
                        txtmatricula.getText(), txtcurso.getText())){
                    limpar();
                }else{
                    JOptionPane.showMessageDialog(null, "não foi possível salvar o aluno", "", JOptionPane.WARNING_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "nome, curso e matrícula são obrigatórios", "", JOptionPane.WARNING_MESSAGE);
            }
            getListaAlunos();
        }
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void txtnomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomeKeyTyped
        if(alterar){
            btnsalvar.setEnabled(true);
            btnexcluir.setEnabled(false);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_txtnomeKeyTyped

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
       if(ac.delete(idAluno)){
           JOptionPane.showMessageDialog(this, "aluno excluido com sucesso", "", JOptionPane.INFORMATION_MESSAGE);
       }else{
           JOptionPane.showMessageDialog(null, "não foi possível excluir", "", JOptionPane.INFORMATION_MESSAGE);
       }       
       getListaAlunos();
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void btndisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndisciplinasActionPerformed
        AlunoDisciplinaView adv = new AlunoDisciplinaView(null);
        adv.aluno = this.aluno;
        adv.setVisible(true);
        adv.txtnome.setText(txtmatricula.getText()+ " - " + txtnome.getText());
        this.dispose();
    }//GEN-LAST:event_btndisciplinasActionPerformed

    private void txtenderecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtenderecoKeyTyped
        if(alterar){
            btnsalvar.setEnabled(true);
            btnexcluir.setEnabled(false);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_txtenderecoKeyTyped

    private void txtemailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyTyped
        if(alterar){
            btnsalvar.setEnabled(true);
            btnexcluir.setEnabled(false);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_txtemailKeyTyped

    private void txtfoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfoneKeyTyped
        if(alterar){
            btnsalvar.setEnabled(true);
            btnexcluir.setEnabled(false);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_txtfoneKeyTyped

    private void txtmatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatriculaKeyTyped
        if(alterar){
            btnsalvar.setEnabled(true);
            btnexcluir.setEnabled(false);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_txtmatriculaKeyTyped

    private void txtcursoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcursoKeyTyped
        if(alterar){
            btnsalvar.setEnabled(true);
            btnexcluir.setEnabled(false);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_txtcursoKeyTyped

    private void btnimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimirActionPerformed
        Connection con = ConnectionFactory.getConnection();
        String src = "src/reports/relatorioAluno.jasper";
        
        JasperPrint jp = null;
        Map m = new HashMap();
        m.put("idaluno", this.aluno.getId());
        
        try{
            jp = JasperFillManager.fillReport(src, m, con);
            
        }catch(JRException ex){
            System.out.println("erro ao gerar relatório de disciplinas"+ex);
        }
        
        JasperViewer view = new JasperViewer(jp, false);
        view.setVisible(true);
    }//GEN-LAST:event_btnimprimirActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroAlunosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAlunosView(null).setVisible(true);
            }
        });
    }
    
    private boolean validaCamposAlunos(){
        if(!ValidaCampos.validaNome(txtnome.getText())){
            JOptionPane.showMessageDialog(this, "nome inválido","",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!ValidaCampos.validaEndereco(txtendereco.getText())){
            JOptionPane.showMessageDialog(this, "endereço inválido","",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!ValidaCampos.validaEmail(txtemail.getText())){
            JOptionPane.showMessageDialog(this, "e-mail inválido","",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!ValidaCampos.validaFone(txtfone.getText())){
            JOptionPane.showMessageDialog(this, "telefone inválido","",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!ValidaCampos.validaMatricula(txtmatricula.getText())){
            JOptionPane.showMessageDialog(this, "matricula inválido","",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!ValidaCampos.validaCurso(txtcurso.getText())){
            JOptionPane.showMessageDialog(this, "curso inválido","",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btndisciplinas;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnincluir;
    private javax.swing.JButton btnsair;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtcurso;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtendereco;
    private javax.swing.JFormattedTextField txtfone;
    private javax.swing.JTextField txtmatricula;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables
}
