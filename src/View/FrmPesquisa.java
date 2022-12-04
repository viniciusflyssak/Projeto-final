package View;

import Dao.ProfessorDao;
import Dao.AlunoDao;
import Dao.NotasDao;
import Entidades.Aluno;
import Entidades.Professor;
import Entidades.Notas;
import Models.AlunoListModel;
import Models.NotasListModel;
import Models.ProfessorListModel;
import java.util.List;
import javax.swing.JOptionPane;

public class FrmPesquisa extends javax.swing.JInternalFrame {
    public int tipo;
    private ProfessorListModel professorListModel;
    private List<Professor> listaProfessores;
    private AlunoListModel alunoListModel;
    private List<Aluno> listaAlunos;
    private NotasListModel notasListModel;
    private List<Notas> listaNotas;
    private int linhaSelecionada;
    
    public FrmPesquisa(int tipo) {
        initComponents();
        this.tipo =  tipo;
        btMediaNotas.setVisible(tipo == 3);
        if (tipo == 1){
            super.setTitle("Pesquisa de professores");
            ProfessorDao professorDao = new ProfessorDao();
            listaProfessores = professorDao.findAll();
            professorListModel = new ProfessorListModel(listaProfessores);
            tbPesquisa.setModel(professorListModel);
        }else{
            if (tipo == 2){
                super.setTitle("Pesquisa de alunos");
                AlunoDao alunoDao = new AlunoDao();
                listaAlunos = alunoDao.findAll();
                alunoListModel = new AlunoListModel(listaAlunos);
                tbPesquisa.setModel(alunoListModel);
            }else{
                if (tipo == 3){
                    super.setTitle("Pesquisa de notas");
                    NotasDao notasDao = new NotasDao();
                    listaNotas = notasDao.findAll();
                    notasListModel = new NotasListModel(listaNotas);
                    tbPesquisa.setModel(notasListModel);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spPesquisa = new javax.swing.JScrollPane();
        tbPesquisa = new javax.swing.JTable();
        btNovo = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        tfPesquisa = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        btMediaNotas = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Pesquisa");

        tbPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "teste"
            }
        ));
        spPesquisa.setViewportView(tbPesquisa);

        btNovo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btVoltar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btMediaNotas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btMediaNotas.setText("Média");
        btMediaNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMediaNotasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spPesquisa)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btMediaNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(spPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo)
                    .addComponent(btEditar)
                    .addComponent(btVoltar)
                    .addComponent(btExcluir)
                    .addComponent(btMediaNotas))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
       dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        linhaSelecionada = tbPesquisa.getSelectedRow();
        if (linhaSelecionada >= 0) {
            if (tipo == 1){
                editarProfessor();
            }else{
                if (tipo == 2){
                    editarAluno();
                }else{
                    if (tipo == 3){
                        editarNotas();
                    }
                }
            } 
        }else{
            JOptionPane.showMessageDialog(null, "Selecione ao menos um registro!", "Erro", EXIT_ON_CLOSE);
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        linhaSelecionada = tbPesquisa.getSelectedRow();  
        if (tipo == 1){
            novoProfessor();
        }else{
            if (tipo == 2){
                novoAluno();
            }else{
                if (tipo == 3){
                    novasNotas();
                }
            }
        }       
    }//GEN-LAST:event_btNovoActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        linhaSelecionada = tbPesquisa.getSelectedRow();  
        if (linhaSelecionada >= 0) {
            int opcao = JOptionPane.showConfirmDialog(null,
                    "Deseja excluir o registro selecionado? ",
                    "Exclusão", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (opcao == JOptionPane.YES_OPTION) {
                if (tipo == 1){            
                    excluirProfessor();
                    professorListModel.removeModel(linhaSelecionada);
                }else{
                    if (tipo == 2){
                        excluirAluno();
                        alunoListModel.removeModel(linhaSelecionada);
                    }else{
                        if (tipo == 3){
                            excluirNotas();
                            notasListModel.removeModel(linhaSelecionada);
                        }
                    }
                }         
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione ao menos um registro!", "Erro", EXIT_ON_CLOSE);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        pesquisar();
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btMediaNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMediaNotasActionPerformed
        calcularMedia();
    }//GEN-LAST:event_btMediaNotasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btMediaNotas;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JScrollPane spPesquisa;
    private javax.swing.JTable tbPesquisa;
    private javax.swing.JTextField tfPesquisa;
    // End of variables declaration//GEN-END:variables
    
    private void editarProfessor(){
        int id = (int) tbPesquisa.getValueAt(linhaSelecionada, 0);
        ProfessorDao professorDao = new ProfessorDao();
        Professor professor = professorDao.findById(id);
        FrmProfessor frmProfessor = new FrmProfessor(id, professorListModel, linhaSelecionada, professor);
        frmProfessor.setVisible(true);   
    }
    
    private void editarAluno(){
        int id = (int) tbPesquisa.getValueAt(linhaSelecionada, 0);
        AlunoDao alunoDao = new AlunoDao();
        Aluno aluno = alunoDao.findById(id);            
        FrmAluno frmAluno = new FrmAluno(id, alunoListModel, linhaSelecionada, aluno);   
        frmAluno.setVisible(true);       
    }
    
    private void editarNotas(){
        int id = (int) tbPesquisa.getValueAt(linhaSelecionada, 0);
        NotasDao notasDao = new NotasDao();
        Notas notas = notasDao.findById(id);            
        FrmNotas frmNotas = new FrmNotas(id, notasListModel, linhaSelecionada, notas);  
        frmNotas.setVisible(true);
    }
    
    private void novoAluno(){       
        FrmAluno frmAluno = new FrmAluno(0, alunoListModel, linhaSelecionada, null);
        frmAluno.setVisible(true);                
    }
    
    private void novasNotas(){               
        FrmNotas frmNotas = new FrmNotas(0, notasListModel, linhaSelecionada, null);
        frmNotas.setVisible(true);          
    }
    
    private void novoProfessor(){          
        FrmProfessor frmProfessor = new FrmProfessor(0, professorListModel, linhaSelecionada, null);
        frmProfessor.setVisible(true);           
    }
    
    private void excluirProfessor(){
        int id = (int) tbPesquisa.getValueAt(tbPesquisa.getSelectedRow(), 0);
        ProfessorDao professorDao = new ProfessorDao();
        professorDao.delete(id);
    }
    
    private void excluirAluno(){
        int id = (int) tbPesquisa.getValueAt(tbPesquisa.getSelectedRow(), 0);
        AlunoDao alunoDao = new AlunoDao();
        alunoDao.delete(id);
    }
    
    private void excluirNotas(){
        int id = (int) tbPesquisa.getValueAt(tbPesquisa.getSelectedRow(), 0);
        NotasDao notasDao = new NotasDao();
        notasDao.delete(id);         
    }
    
    private void pesquisar(){        
        if (tipo == 1){            
            List<Professor> pesquisa = listaProfessores.stream()
            .filter(est -> est.getNome().contains(tfPesquisa.getText()))
            .toList();

            ProfessorListModel listModel = new ProfessorListModel(pesquisa);
            tbPesquisa.setModel(listModel);
        }else{
            if (tipo == 2){
                List<Aluno> pesquisa = listaAlunos.stream()
                .filter(est -> est.getNome().contains(tfPesquisa.getText()))
                .toList();

                AlunoListModel listModel = new AlunoListModel(pesquisa);
                tbPesquisa.setModel(listModel);
            }else{
                if (tipo == 3){
                    List<Notas> pesquisa = listaNotas.stream()
                    .filter(est -> est.getAno()== Integer.valueOf(tfPesquisa.getText()))
                    .toList();

                    NotasListModel listModel = new NotasListModel(pesquisa);
                    tbPesquisa.setModel(listModel);
                }
            }
        }       
    }
    
    private void calcularMedia(){
        linhaSelecionada = tbPesquisa.getSelectedRow();  
        Double media = ((double)tbPesquisa.getValueAt(linhaSelecionada, 2) + 
                        (double)tbPesquisa.getValueAt(linhaSelecionada, 3) + 
                        (double)tbPesquisa.getValueAt(linhaSelecionada, 4) +
                        (double)tbPesquisa.getValueAt(linhaSelecionada, 5)) / 4;
        JOptionPane.showMessageDialog(null, "A média do aluno é: " + String.valueOf(media), "Média do(a) aluno " + 
                                      tbPesquisa.getValueAt(linhaSelecionada, 7), DO_NOTHING_ON_CLOSE);
    }
}
