package view;

import conexao.ConnectionFactory;
import controller.DisciplinasController;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import model.bean.Aluno;
import model.bean.Disciplinas;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import regex.ValidaCampos;

public class CadastroDisciplinasView extends javax.swing.JFrame {

    DisciplinasController dc = new DisciplinasController();
    private Disciplinas disc;
    private int idDisc = 0;
    private boolean alterar = false;
    
    public CadastroDisciplinasView(Disciplinas disc) {
        initComponents();
        
        if(disc!=null){
            preencheCampos(disc);
            this.disc = disc;
            btnimprimir.setEnabled(true);
        }
        else{
            txtnomedisc.requestFocus();
        }
    }

    public void limpar(){
        txtnomedisc.setText("");
        txtcargahoraria.setText("");
        txtcode.setText("");
    }
    
     public void preencheCampos(Disciplinas d){
        this.idDisc = d.getId();
        txtnomedisc.setText(d.getNome());
        txtcode.setText(d.getCodigo());
        txtcargahoraria.setText(String.valueOf(d.getCargaHoraria()));
        
        btnexcluir.setEnabled(true);
        btnincluir.setEnabled(false);
        btnsalvar.setEnabled(false);
        btnincluir.setEnabled(false);
        btncancelar.setEnabled(true);
        btndisciplinas.setEnabled(true);
        
        this.alterar = true;
    }
     
        public void getListaDisc(){
        ConsultaDisciplinasView cv = new ConsultaDisciplinasView();
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
        btnimprimir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnomedisc = new javax.swing.JTextField();
        txtcode = new javax.swing.JTextField();
        txtcargahoraria = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jLabel1.setText("NOME:");

        jLabel2.setText("CÓDIGO:");

        jLabel3.setText("CARGA HORÁRIA:");

        txtnomedisc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomediscKeyTyped(evt);
            }
        });

        txtcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodeKeyTyped(evt);
            }
        });

        txtcargahoraria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcargahorariaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtcargahoraria))
                            .addComponent(txtnomedisc, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnomedisc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcargahoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnincluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnincluirActionPerformed
        if(validaCamposDisciplina()){
            if (!txtnomedisc.getText().isEmpty() && !txtcargahoraria.getText().isEmpty()) {
                if (dc.insert(txtnomedisc.getText(), txtcode.getText(), Integer.parseInt(txtcargahoraria.getText()))) {
                    limpar();
                } else {
                    JOptionPane.showMessageDialog(null, "não foi possível salvar a disciplina", "", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "nome e carga horaria são obrigatórios", "", JOptionPane.WARNING_MESSAGE);
            }

            getListaDisc();
        }
    }//GEN-LAST:event_btnincluirActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        if(validaCamposDisciplina()){
            if (!txtnomedisc.getText().isEmpty() && !txtcargahoraria.getText().isEmpty()) {
                if (dc.update(idDisc, txtnomedisc.getText(), txtcode.getText(), Integer.parseInt(txtcargahoraria.getText()))) {
                    limpar();
                } else {
                    JOptionPane.showMessageDialog(null, "não foi possível salvar a disciplina", "", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "nome e carga horaria são obrigatórios", "", JOptionPane.WARNING_MESSAGE);
            }

            getListaDisc();
        }
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        if(dc.delete(idDisc)){
            JOptionPane.showMessageDialog(this, "disciplina excluida com sucesso", "", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "não foi possível excluir", "", JOptionPane.INFORMATION_MESSAGE);
        }

        getListaDisc();
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        btnincluir.setEnabled(false);
        btnexcluir.setEnabled(false);
        btncancelar.setEnabled(false);
        btnsalvar.setEnabled(false);
        alterar = false;
        limpar();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        getListaDisc();
    }//GEN-LAST:event_btnsairActionPerformed

    private void txtnomediscKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomediscKeyTyped
        if(alterar){
            btnsalvar.setEnabled(true);
            btnexcluir.setEnabled(false);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_txtnomediscKeyTyped

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
      /*  ConsultaDisciplinasView cd = new ConsultaDisciplinasView();
        cd.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_formWindowClosed

    private void btndisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndisciplinasActionPerformed
        AlunoDisciplinaView adv = new AlunoDisciplinaView(null);
        adv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btndisciplinasActionPerformed

    private void txtcodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodeKeyTyped
        if(alterar){
            btnsalvar.setEnabled(true);
            btnexcluir.setEnabled(false);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_txtcodeKeyTyped

    private void txtcargahorariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcargahorariaKeyTyped
        if(alterar){
            btnsalvar.setEnabled(true);
            btnexcluir.setEnabled(false);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_txtcargahorariaKeyTyped

    private void btnimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimirActionPerformed
        Connection con = ConnectionFactory.getConnection();
        String src = "src/reports/relatorioDisciplinas.jasper";
        
        JasperPrint jp = null;
        Map m = new HashMap();
        m.put("iddisciplina", this.disc.getId());
        
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
            java.util.logging.Logger.getLogger(CadastroDisciplinasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDisciplinasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDisciplinasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDisciplinasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDisciplinasView(null).setVisible(true);
            }
        });
    }
    
    private boolean validaCamposDisciplina(){
        if(!ValidaCampos.validaNomeDisciplina(txtnomedisc.getText())){
            JOptionPane.showMessageDialog(this, "nome de disciplina inválido", "", JOptionPane.ERROR_MESSAGE);
        }
        if(!ValidaCampos.validaCodigoDisciplina(txtcode.getText())){
            JOptionPane.showMessageDialog(this, "código inválido", "", JOptionPane.ERROR_MESSAGE);
        }
        if(!ValidaCampos.validaCargaHoraria(txtcargahoraria.getText())){
            JOptionPane.showMessageDialog(this, "carga horária inválida", "", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtcargahoraria;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtnomedisc;
    // End of variables declaration//GEN-END:variables
}
