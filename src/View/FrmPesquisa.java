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
import java.beans.PropertyVetoException;
import java.util.List;
import javax.swing.JDesktopPane;

public class FrmPesquisa extends javax.swing.JInternalFrame {
    public int tipo;
    private ProfessorListModel professorListModel;
    private List<Professor> listaProfessores;
    private AlunoListModel alunoListModel;
    private List<Aluno> listaAlunos;
    private NotasListModel notasListModel;
    private List<Notas> listaNotas;
    public FrmPesquisa(int tipo) {
        initComponents();
        this.tipo =  tipo;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(spPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo)
                    .addComponent(btEditar)
                    .addComponent(btVoltar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
       dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
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
    }//GEN-LAST:event_btEditarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btVoltar;
    private javax.swing.JScrollPane spPesquisa;
    private javax.swing.JTable tbPesquisa;
    // End of variables declaration//GEN-END:variables
    
    private void editarProfessor(){
        int linhaSelecionada = tbPesquisa.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int id = (int) tbPesquisa.getValueAt(linhaSelecionada, 0);
            ProfessorDao professorDao = new ProfessorDao();
            Professor professor = professorDao.findById(id);
            FrmProfessor frmProfessor = new FrmProfessor();
            frmProfessor.setVisible(true);
        }    
    }
    
    private void editarAluno(){
        int linhaSelecionada = tbPesquisa.getSelectedRow();
        if (linhaSelecionada >= 0) {
            int id = (int) tbPesquisa.getValueAt(linhaSelecionada, 0);
            AlunoDao alunoDao = new AlunoDao();
            Aluno aluno = alunoDao.findById(id);            
            FrmAluno frmAluno = new FrmAluno(true, id, alunoListModel, linhaSelecionada, aluno);   
            frmAluno.setVisible(true);
        }           
    }
    
    private void editarNotas(){
        
    }
    
    private void novoAluno(){
        int linhaSelecionada = tbPesquisa.getSelectedRow();           
        int id = 0;
        AlunoDao alunoDao = new AlunoDao();
        Aluno aluno = alunoDao.findById(id);
        FrmAluno frmAluno = new FrmAluno(false, id, alunoListModel, linhaSelecionada, null);
        frmAluno.setVisible(true);        
    }
    
    private void novasNotas(){
        
    }
    
    private void novoProfessor(){
        
    }
}
