package view;

import conexao.ConnectionFactory;
import controller.AlunoDisciplinaContoller;
import controller.DisciplinasController;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.bean.Aluno;
import model.bean.AlunoDisciplina;
import model.bean.Disciplinas;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import tablemodel.AlunoDisciplinaTableModel;
import tablemodel.AlunoTableModel;
import regex.ValidaCampos;

public class AlunoDisciplinaView extends javax.swing.JFrame {

    public Aluno aluno;
    public AlunoDisciplinaContoller ac;
    public AlunoDisciplinaTableModel at;
    public boolean alterar = false;
    
    public AlunoDisciplinaView(Aluno a) {
        initComponents();
        
        ac = new AlunoDisciplinaContoller();
        btnimprimir.setEnabled(true);
    }
    
    public void getListaDisciplinas(){
        DisciplinasController dc = new DisciplinasController();
        
        for(Disciplinas d : dc.read()){
            comboDisciplinas.addItem(d);
        }
    }
    
    
    public void getDisciplinasDoAluno(){
        at = new AlunoDisciplinaTableModel(ac.read(aluno));
        
        tabelAlunoDisciplinas.setModel(at);
        
        tabelAlunoDisciplinas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabelAlunoDisciplinas.getColumnModel().getColumn(0).setPreferredWidth(250);
        tabelAlunoDisciplinas.getColumnModel().getColumn(1).setPreferredWidth(250);
        tabelAlunoDisciplinas.getColumnModel().getColumn(2).setPreferredWidth(50);
        tabelAlunoDisciplinas.getColumnModel().getColumn(3).setPreferredWidth(65);
        tabelAlunoDisciplinas.getColumnModel().getColumn(4).setPreferredWidth(48);
        tabelAlunoDisciplinas.getColumnModel().getColumn(5).setPreferredWidth(48);
        tabelAlunoDisciplinas.getColumnModel().getColumn(6).setPreferredWidth(50);
        tabelAlunoDisciplinas.getColumnModel().getColumn(7).setPreferredWidth(46);
        limpar();       
    }
    
    
    public void limpar(){
        jRadioButtonPrimeiro.setSelected(false);
        jRadioButtonSegundo.setSelected(false);
        txtano.setText("");
        txtnota1.setText("");
        txtnota2.setText("");
        txtfaltas.setText("");
        txtmedia.setText("");
        comboDisciplinas.setSelectedIndex(0);
        txtano.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comboDisciplinas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtano = new javax.swing.JTextField();
        txtnota1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnota2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtmedia = new javax.swing.JTextField();
        jRadioButtonPrimeiro = new javax.swing.JRadioButton();
        jRadioButtonSegundo = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txtfaltas = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelAlunoDisciplinas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btninserir = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        btnimprimir = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setText("DISCIPLINA:");

        jLabel3.setText("ANO:");

        jLabel4.setText("SEMESTRE:");

        txtano.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanoKeyTyped(evt);
            }
        });

        txtnota1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnota1KeyTyped(evt);
            }
        });

        jLabel5.setText("NOTAS E FALTAS:");

        jLabel6.setText("Nota 1:");

        jLabel7.setText("Nota 2:");

        txtnota2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnota2FocusLost(evt);
            }
        });
        txtnota2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnota2KeyTyped(evt);
            }
        });

        jLabel8.setText("Média:");

        txtmedia.setEditable(false);

        jRadioButtonPrimeiro.setText("Primeiro");

        jRadioButtonSegundo.setText("Segundo");

        jLabel9.setText("Faltas:");

        txtfaltas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfaltasKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtano, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonPrimeiro)
                            .addComponent(jRadioButtonSegundo)
                            .addComponent(jLabel4))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnota1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtfaltas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnota2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtmedia, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(txtnota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtmedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonPrimeiro)
                        .addComponent(txtano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtfaltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(jRadioButtonSegundo))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        tabelAlunoDisciplinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelAlunoDisciplinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelAlunoDisciplinasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelAlunoDisciplinas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setText("ALUNO:");

        txtnome.setEditable(false);
        txtnome.setEnabled(false);

        btninserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        btninserir.setText("Inserir");
        btninserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninserirActionPerformed(evt);
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

        btnimprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/print.png"))); // NOI18N
        btnimprimir.setText("Imprimir");
        btnimprimir.setEnabled(false);
        btnimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btninserir)
                .addGap(30, 30, 30)
                .addComponent(btnsalvar)
                .addGap(35, 35, 35)
                .addComponent(btnexcluir)
                .addGap(26, 26, 26)
                .addComponent(btncancelar)
                .addGap(28, 28, 28)
                .addComponent(btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnimprimir)
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btninserir)
                    .addComponent(btnsalvar)
                    .addComponent(btnexcluir)
                    .addComponent(btncancelar)
                    .addComponent(btnsair)
                    .addComponent(btnimprimir))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtnome))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       getListaDisciplinas();
       getDisciplinasDoAluno();
    }//GEN-LAST:event_formWindowOpened

    private void tabelAlunoDisciplinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelAlunoDisciplinasMouseClicked
        if(tabelAlunoDisciplinas.getSelectedRow()>=0){
            at = (AlunoDisciplinaTableModel) tabelAlunoDisciplinas.getModel();
            AlunoDisciplina add = at.getAlunoDisciplina(tabelAlunoDisciplinas.getSelectedRow());
            
            
            if(add.getSemestre() == 1){
                jRadioButtonPrimeiro.setSelected(true);
                jRadioButtonSegundo.setSelected(false);
            }else if(add.getSemestre() == 2){
                jRadioButtonSegundo.setSelected(true);
                jRadioButtonPrimeiro.setSelected(false);
            }
       
       
            txtano.setText(tabelAlunoDisciplinas.getValueAt(tabelAlunoDisciplinas.getSelectedRow(),2).toString());
            txtnota1.setText(tabelAlunoDisciplinas.getValueAt(tabelAlunoDisciplinas.getSelectedRow(),4).toString());
            txtnota2.setText(tabelAlunoDisciplinas.getValueAt(tabelAlunoDisciplinas.getSelectedRow(),5).toString());
            txtmedia.setText(tabelAlunoDisciplinas.getValueAt(tabelAlunoDisciplinas.getSelectedRow(),6).toString());
            txtfaltas.setText(tabelAlunoDisciplinas.getValueAt(tabelAlunoDisciplinas.getSelectedRow(),7).toString());
            
            String disc = tabelAlunoDisciplinas.getValueAt(tabelAlunoDisciplinas.getSelectedRow(),1).toString();           
            
            for(int i=0; i<comboDisciplinas.getItemCount();i++){
                Disciplinas d = (Disciplinas) comboDisciplinas.getItemAt(i);
                if(d.getNome().equals(disc)){
                    comboDisciplinas.setSelectedIndex(i);
                }
            }
            
            comboDisciplinas.setEnabled(false);
            btnexcluir.setEnabled(true);
            btninserir.setEnabled(false);
            btnsalvar.setEnabled(false);
            btncancelar.setEnabled(true);
            
            alterar = true;
            
        }
    }//GEN-LAST:event_tabelAlunoDisciplinasMouseClicked

    private void btninserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninserirActionPerformed
        if(ValidaCampos()){
            Disciplinas d = (Disciplinas) comboDisciplinas.getSelectedItem();

            ac.insert(this.aluno, d, jRadioButtonPrimeiro.isSelected() ? 1 : 2, Integer.parseInt(txtano.getText()),
                    Double.parseDouble(txtnota1.getText()), Double.parseDouble(txtnota2.getText()), Integer.parseInt(txtfaltas.getText()));
            getDisciplinasDoAluno();
        }
    }//GEN-LAST:event_btninserirActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        btninserir.setSelected(true);
        btnexcluir.setSelected(false);
        btncancelar.setSelected(false);
        btnsalvar.setSelected(false);
        alterar = false;
        limpar();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        ConsultaAlunosView cv = new ConsultaAlunosView();
        cv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsairActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        if(ValidaCampos()){
            if (ac.update(this.aluno, (Disciplinas) comboDisciplinas.getSelectedItem(), jRadioButtonPrimeiro.isSelected() ? 1 : 2,
                    Integer.parseInt(txtano.getText()), Double.parseDouble(txtnota1.getText()), Double.parseDouble(txtnota2.getText()),
                    Integer.parseInt(txtfaltas.getText()))) {
                JOptionPane.showMessageDialog(null, "atualizado com sucesso", "", JOptionPane.INFORMATION_MESSAGE);
                btnsalvar.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "erro ao atualizar", "", JOptionPane.ERROR_MESSAGE);
            }
            getDisciplinasDoAluno();
        }
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        Disciplinas disciplina = (Disciplinas) comboDisciplinas.getSelectedItem();
        if(ac.delete(aluno, disciplina)){
            JOptionPane.showMessageDialog(null, "apagado com sucesso", "", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "erro ao excluir", "", JOptionPane.ERROR_MESSAGE);
        }
        getDisciplinasDoAluno();
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void txtanoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanoKeyTyped
        if(alterar){
            btnexcluir.setEnabled(false);
            btnsalvar.setEnabled(true);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_txtanoKeyTyped

    private void txtnota1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnota1KeyTyped
        if(alterar){
            btnexcluir.setEnabled(false);
            btnsalvar.setEnabled(true);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_txtnota1KeyTyped

    private void txtnota2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnota2KeyTyped
        if(alterar){
            btnexcluir.setEnabled(false);
            btnsalvar.setEnabled(true);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_txtnota2KeyTyped

    private void txtfaltasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfaltasKeyTyped
        if(alterar){
            btnexcluir.setEnabled(false);
            btnsalvar.setEnabled(true);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_txtfaltasKeyTyped

    private void txtnota2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnota2FocusLost
        if(!txtnota1.equals("") && !txtnota2.equals("")){
            double media = (Double.parseDouble(txtnota1.getText())+Double.parseDouble(txtnota2.getText())) / 2;
            txtmedia.setText(String.valueOf(media));
        }
    }//GEN-LAST:event_txtnota2FocusLost

    private void btnimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimirActionPerformed
        Connection con = ConnectionFactory.getConnection();
        String src = "src/reports/DisciplinasDoAluno.jasper";
        
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
            java.util.logging.Logger.getLogger(AlunoDisciplinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlunoDisciplinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlunoDisciplinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlunoDisciplinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlunoDisciplinaView(null).setVisible(true);
            }
        });
    }
    
    
    private boolean ValidaCampos(){
        if(!ValidaCampos.validaAno(txtano.getText())){
            JOptionPane.showMessageDialog(this, "ano inválido", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!ValidaCampos.validaNota(txtnota1.getText())){
            JOptionPane.showMessageDialog(this, "nota inválida", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!ValidaCampos.validaNota(txtnota2.getText())){
            JOptionPane.showMessageDialog(this, "nota inválida", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(!ValidaCampos.validaFaltas(txtfaltas.getText())){
            JOptionPane.showMessageDialog(this, "faltas inválidas", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btninserir;
    private javax.swing.JButton btnsair;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JComboBox<Object> comboDisciplinas;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonPrimeiro;
    private javax.swing.JRadioButton jRadioButtonSegundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelAlunoDisciplinas;
    private javax.swing.JTextField txtano;
    private javax.swing.JTextField txtfaltas;
    private javax.swing.JTextField txtmedia;
    public javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtnota1;
    private javax.swing.JTextField txtnota2;
    // End of variables declaration//GEN-END:variables
}
