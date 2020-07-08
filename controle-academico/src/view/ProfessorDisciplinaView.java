package view;

import conexao.ConnectionFactory;
import controller.DisciplinasController;
import controller.ProfessorDisciplinaController;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.bean.Disciplinas;
import model.bean.Professor;
import model.bean.ProfessorDisciplina;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import regex.ValidaCampos;
import tablemodel.ProfessorDisciplinaTableModel;

public class ProfessorDisciplinaView extends javax.swing.JFrame {

    public Professor professor;
    public ProfessorDisciplinaController pcc = new ProfessorDisciplinaController();
    public ProfessorDisciplinaTableModel pt;
    public boolean alterar = false;
    
    public ProfessorDisciplinaView() {
        initComponents();
    }

     public void getListaDisciplinas(){
        DisciplinasController dc = new DisciplinasController();
        
        for(Disciplinas d : dc.read()){
            comboDisciplinas.addItem(d);
        }
    }
    
     
    public void getDisciplinasDoProfessor(){
        pt = new ProfessorDisciplinaTableModel(pcc.getDisciplinasProfessor(this.professor.getIdprofessor()));
        
        tabelaProfessor.setModel(pt);
        
        tabelaProfessor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabelaProfessor.getColumnModel().getColumn(0).setPreferredWidth(155);
        tabelaProfessor.getColumnModel().getColumn(1).setPreferredWidth(155);
        tabelaProfessor.getColumnModel().getColumn(2).setPreferredWidth(50);
        tabelaProfessor.getColumnModel().getColumn(3).setPreferredWidth(60);
        tabelaProfessor.getColumnModel().getColumn(4).setPreferredWidth(150);
        limpar();       
    } 
    
    
    public void limpar(){
        jRadioButtonPrimeiro.setSelected(false);
        jRadioButtonSegundo.setSelected(false);
        txtano.setText("");
        comboDisciplinas.setSelectedIndex(0);
        jCheckBoxSeg.setSelected(false);
        jCheckBoxTerca.setSelected(false);
        jCheckBoxQua.setSelected(false);
        jCheckBoxQui.setSelected(false);
        jCheckBoxSex.setSelected(false);
        
        txtano.requestFocus();
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comboDisciplinas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtano = new javax.swing.JTextField();
        jRadioButtonPrimeiro = new javax.swing.JRadioButton();
        jRadioButtonSegundo = new javax.swing.JRadioButton();
        jCheckBoxSeg = new javax.swing.JCheckBox();
        jCheckBoxTerca = new javax.swing.JCheckBox();
        jCheckBoxQua = new javax.swing.JCheckBox();
        jCheckBoxQui = new javax.swing.JCheckBox();
        jCheckBoxSex = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        btninserir = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProfessor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("PROFESSOR:");

        jLabel2.setText("DISCIPLINA:");

        jLabel3.setText("ANO:");

        jLabel4.setText("SEMESTRE:");

        jLabel5.setText("DIAS:");

        txtano.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanoKeyTyped(evt);
            }
        });

        jRadioButtonPrimeiro.setText("Primeiro");
        jRadioButtonPrimeiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonPrimeiroMouseClicked(evt);
            }
        });

        jRadioButtonSegundo.setText("Segundo");
        jRadioButtonSegundo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonSegundoMouseClicked(evt);
            }
        });

        jCheckBoxSeg.setText("Segunda");
        jCheckBoxSeg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxSegMouseClicked(evt);
            }
        });

        jCheckBoxTerca.setText("Terça");
        jCheckBoxTerca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxTercaMouseClicked(evt);
            }
        });

        jCheckBoxQua.setText("Quarta");
        jCheckBoxQua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxQuaMouseClicked(evt);
            }
        });

        jCheckBoxQui.setText("Quinta");
        jCheckBoxQui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxQuiMouseClicked(evt);
            }
        });

        jCheckBoxSex.setText("Sexta");
        jCheckBoxSex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxSexMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtano)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonSegundo)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButtonPrimeiro)
                                        .addGap(211, 211, 211)
                                        .addComponent(jCheckBoxTerca)
                                        .addGap(55, 55, 55)
                                        .addComponent(jCheckBoxQua)
                                        .addGap(39, 39, 39)
                                        .addComponent(jCheckBoxQui)
                                        .addGap(50, 50, 50)
                                        .addComponent(jCheckBoxSex))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(comboDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3)
                        .addGap(95, 95, 95)
                        .addComponent(jLabel4)
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxSeg)
                            .addComponent(jLabel5))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonPrimeiro)
                        .addComponent(jCheckBoxSeg)
                        .addComponent(jCheckBoxTerca)
                        .addComponent(jCheckBoxQua)
                        .addComponent(jCheckBoxQui)
                        .addComponent(jCheckBoxSex)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonSegundo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btninserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        btninserir.setText("Incluir");
        btninserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninserirActionPerformed(evt);
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
        btnsair.setToolTipText("");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/print.png"))); // NOI18N
        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btninserir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btncancelar)
                .addGap(33, 33, 33)
                .addComponent(btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btninserir)
                    .addComponent(btnsalvar)
                    .addComponent(btnexcluir)
                    .addComponent(btncancelar)
                    .addComponent(btnsair)
                    .addComponent(jButton1))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        tabelaProfessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProfessorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProfessor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        ConsultaProfessoresView cv = new ConsultaProfessoresView();
        cv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsairActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        btninserir.setSelected(true);
        btnexcluir.setSelected(false);
        btncancelar.setSelected(false);
        btnsalvar.setSelected(false);
        alterar = false;
        limpar();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void txtanoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanoKeyTyped
        if(alterar){
            btnexcluir.setEnabled(false);
            btnsalvar.setEnabled(true);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_txtanoKeyTyped

    private void jCheckBoxSegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxSegMouseClicked
        if(jCheckBoxSeg.isSelected()){
            btnexcluir.setEnabled(false);
            btnsalvar.setEnabled(true);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_jCheckBoxSegMouseClicked

    private void jRadioButtonPrimeiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonPrimeiroMouseClicked
        if(jRadioButtonPrimeiro.isSelected()){
            btnexcluir.setEnabled(false);
            btnsalvar.setEnabled(true);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_jRadioButtonPrimeiroMouseClicked

    private void jRadioButtonSegundoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonSegundoMouseClicked
        if(jRadioButtonSegundo.isSelected()){
            btnexcluir.setEnabled(false);
            btnsalvar.setEnabled(true);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_jRadioButtonSegundoMouseClicked

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        Disciplinas disciplina = (Disciplinas) comboDisciplinas.getSelectedItem();
        if(pcc.delete(this.professor.getIdprofessor(), disciplina.getId())){
            JOptionPane.showMessageDialog(null, "apagado com sucesso", "", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "erro ao excluir", "", JOptionPane.ERROR_MESSAGE);
        }
        getDisciplinasDoProfessor();
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        if (validaCampos()) {
            String dias = "";
            if (jCheckBoxSeg.isSelected()) {
                dias += "S";
            }
            if (jCheckBoxTerca.isSelected()) {
                dias += "T";
            }
            if (jCheckBoxQua.isSelected()) {
                dias += "Q";
            }
            if (jCheckBoxQui.isSelected()) {
                dias += "U";
            }
            if (jCheckBoxSex.isSelected()) {
                dias += "X";
            }

            if (pcc.update(this.professor, (Disciplinas) comboDisciplinas.getSelectedItem(),
                    jRadioButtonPrimeiro.isSelected() ? 1 : 2,
                    Integer.parseInt(txtano.getText()), dias)) {
                JOptionPane.showMessageDialog(null, "atualizado com sucesso", "", JOptionPane.INFORMATION_MESSAGE);
                btnsalvar.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "erro ao atualizar", "", JOptionPane.ERROR_MESSAGE);
            }
            getDisciplinasDoProfessor();
        }
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void btninserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninserirActionPerformed
        if (validaCampos()) {
            Disciplinas disc = (Disciplinas) comboDisciplinas.getSelectedItem();
            String dias = "";
            if (jCheckBoxSeg.isSelected()) {
                dias += "S";
            }
            if (jCheckBoxTerca.isSelected()) {
                dias += "T";
            }
            if (jCheckBoxQua.isSelected()) {
                dias += "Q";
            }
            if (jCheckBoxQui.isSelected()) {
                dias += "U";
            }
            if (jCheckBoxSex.isSelected()) {
                dias += "X";
            }

            pcc.insert(this.professor, disc,
                    jRadioButtonPrimeiro.isSelected() ? 1 : 2,
                    Integer.parseInt(txtano.getText()), dias);
            getDisciplinasDoProfessor();
        }
    }//GEN-LAST:event_btninserirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        getListaDisciplinas();
        getDisciplinasDoProfessor();
    }//GEN-LAST:event_formWindowOpened

    private void tabelaProfessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProfessorMouseClicked
        pt = (ProfessorDisciplinaTableModel) tabelaProfessor.getModel();
        ProfessorDisciplina pd = pt.getProfessorDisciplina(tabelaProfessor.getSelectedRow());
        
        txtano.setText(String.valueOf(pd.getAno()));
        if(pd.getDia().contains("Segunda")){
            jCheckBoxSeg.setSelected(true);
        }else{
            jCheckBoxSeg.setSelected(false);
        }
        
        if(pd.getDia().contains("Terça")){
            jCheckBoxTerca.setSelected(true);
        }else{
            jCheckBoxTerca.setSelected(false);
        }
        
        if(pd.getDia().contains("Quarta")){
            jCheckBoxQua.setSelected(true);
        }else{
            jCheckBoxQua.setSelected(false);
        }
        
        if(pd.getDia().contains("Quinta")){
            jCheckBoxQui.setSelected(true);
        }else{
            jCheckBoxQui.setSelected(false);
        }
        
        if(pd.getDia().contains("Sexta")){
            jCheckBoxSex.setSelected(true);
        }else{
            jCheckBoxSex.setSelected(false);
        }
        
  
        
        if(pd.getSemestre() == 1){
            jRadioButtonPrimeiro.setSelected(true);
            jRadioButtonSegundo.setSelected(false);
        }else if(pd.getSemestre() == 2){
            jRadioButtonSegundo.setSelected(true);
            jRadioButtonPrimeiro.setSelected(false);
        }
             
        for (int i = 0; i < comboDisciplinas.getItemCount(); i++) {
            Disciplinas d = (Disciplinas) comboDisciplinas.getItemAt(i);
            if (d.getNome().equals(pd.getDisciplina().getNome())) {
                comboDisciplinas.setSelectedIndex(i);
            }
        }        
        
        comboDisciplinas.setEnabled(false);
        btnexcluir.setEnabled(true);
        btninserir.setEnabled(false);
        btnsalvar.setEnabled(false);
        btncancelar.setEnabled(true);

        alterar = true;
    }//GEN-LAST:event_tabelaProfessorMouseClicked

    private void jCheckBoxTercaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxTercaMouseClicked
        if(jCheckBoxTerca.isSelected()){
            btnexcluir.setEnabled(false);
            btnsalvar.setEnabled(true);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_jCheckBoxTercaMouseClicked

    private void jCheckBoxQuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxQuaMouseClicked
        if(jCheckBoxTerca.isSelected()){
            btnexcluir.setEnabled(false);
            btnsalvar.setEnabled(true);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_jCheckBoxQuaMouseClicked

    private void jCheckBoxQuiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxQuiMouseClicked
        if(jCheckBoxTerca.isSelected()){
            btnexcluir.setEnabled(false);
            btnsalvar.setEnabled(true);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_jCheckBoxQuiMouseClicked

    private void jCheckBoxSexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxSexMouseClicked
        if(jCheckBoxTerca.isSelected()){
            btnexcluir.setEnabled(false);
            btnsalvar.setEnabled(true);
        }
        btncancelar.setEnabled(true);
    }//GEN-LAST:event_jCheckBoxSexMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection con = ConnectionFactory.getConnection();
        String src = "src/reports/relatorioProfessorDisciplinas.jasper";
        
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
            java.util.logging.Logger.getLogger(ProfessorDisciplinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfessorDisciplinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfessorDisciplinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfessorDisciplinaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfessorDisciplinaView().setVisible(true);
            }
        });
    }
    
    private boolean validaCampos(){
        if(!ValidaCampos.validaAno(txtano.getText())){
            JOptionPane.showMessageDialog(this, "ano inválido", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }       
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btninserir;
    private javax.swing.JButton btnsair;
    private javax.swing.JButton btnsalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<Object> comboDisciplinas;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBoxQua;
    private javax.swing.JCheckBox jCheckBoxQui;
    private javax.swing.JCheckBox jCheckBoxSeg;
    private javax.swing.JCheckBox jCheckBoxSex;
    private javax.swing.JCheckBox jCheckBoxTerca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonPrimeiro;
    private javax.swing.JRadioButton jRadioButtonSegundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaProfessor;
    private javax.swing.JTextField txtano;
    public javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables
}
