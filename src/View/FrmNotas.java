package View;

import Dao.NotasDao;
import Entidades.Genero;
import Models.NotasListModel;
import Entidades.Notas;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import Entidades.Aluno;
import Dao.AlunoDao;
import Entidades.Professor;
import Dao.ProfessorDao;

public class FrmNotas extends javax.swing.JDialog {
    private boolean editar;
    private int id; 
    private Notas notas;
    private int linhaSelecionada;
    private NotasListModel notasListModel;
    
    public FrmNotas(boolean editar, int id,  NotasListModel notasListModel, int linhaSelecionada, Notas notas) {
        initComponents();
        this.notas = notas;
        this.editar = editar;
        this.notasListModel = notasListModel;
        this.linhaSelecionada = linhaSelecionada;
        if (id > 0){
            this.id = id;
        }else{
            this.id = 0;
        }
        if (editar){
            AlunoDao alunoDao = new AlunoDao();
            Aluno aluno = alunoDao.findById(this.notas.getIdAluno());
            ProfessorDao professorDao = new ProfessorDao();
            Professor professor = professorDao.findById(this.notas.getIdProfessor());
            tfNomeAluno.setText(aluno.getNome());
            tfNomeProfessor.setText(professor.getNome());
            tfIdAluno.setText(String.valueOf(this.notas.getIdAluno()));
            tfIdProfessor.setText(String.valueOf(this.notas.getIdProfessor()));
            tfAno.setText(String.valueOf(this.notas.getAno()));
            tfNota1.setText(String.valueOf(this.notas.getNota1()));
            tfNota2.setText(String.valueOf(this.notas.getNota2()));
            tfNota3.setText(String.valueOf(this.notas.getNota3()));
            tfNota4.setText(String.valueOf(this.notas.getNota4()));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTitulo1 = new javax.swing.JPanel();
        lbTitulo1 = new java.awt.Label();
        btCancelar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        pnTitulo = new javax.swing.JPanel();
        lbTitulo = new java.awt.Label();
        lbAluno = new javax.swing.JLabel();
        lbAno = new javax.swing.JLabel();
        lbNota1 = new javax.swing.JLabel();
        lbNota2 = new javax.swing.JLabel();
        lbNota4 = new javax.swing.JLabel();
        lbNota3 = new javax.swing.JLabel();
        btCancelar1 = new javax.swing.JButton();
        btSalvar1 = new javax.swing.JButton();
        tfIdAluno = new javax.swing.JTextField();
        tfNomeAluno = new javax.swing.JTextField();
        tfNota3 = new javax.swing.JTextField();
        tfNota1 = new javax.swing.JTextField();
        tfNota2 = new javax.swing.JTextField();
        tfNota4 = new javax.swing.JTextField();
        tfAno = new javax.swing.JTextField();
        lbProfessor = new javax.swing.JLabel();
        tfIdProfessor = new javax.swing.JTextField();
        tfNomeProfessor = new javax.swing.JTextField();

        pnTitulo1.setBackground(new java.awt.Color(51, 51, 51));
        pnTitulo1.setName(""); // NOI18N

        lbTitulo1.setAlignment(java.awt.Label.CENTER);
        lbTitulo1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo1.setName(""); // NOI18N
        lbTitulo1.setText("Cadastro de Professor");

        javax.swing.GroupLayout pnTitulo1Layout = new javax.swing.GroupLayout(pnTitulo1);
        pnTitulo1.setLayout(pnTitulo1Layout);
        pnTitulo1Layout.setHorizontalGroup(
            pnTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnTitulo1Layout.setVerticalGroup(
            pnTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTitulo1Layout.createSequentialGroup()
                .addComponent(lbTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btCancelar.setText("Cancelar");

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSalvar.setText("Salvar");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GestMais - Cadastro de Notas");

        pnTitulo.setBackground(new java.awt.Color(51, 51, 51));
        pnTitulo.setName(""); // NOI18N

        lbTitulo.setAlignment(java.awt.Label.CENTER);
        lbTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setName(""); // NOI18N
        lbTitulo.setText("Cadastro de Notas");

        javax.swing.GroupLayout pnTituloLayout = new javax.swing.GroupLayout(pnTitulo);
        pnTitulo.setLayout(pnTituloLayout);
        pnTituloLayout.setHorizontalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnTituloLayout.setVerticalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, Short.MAX_VALUE)
        );

        lbAluno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbAluno.setText("Aluno:");

        lbAno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbAno.setText("Ano:");

        lbNota1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNota1.setText("Nota 1:");

        lbNota2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNota2.setText("Nota 2:");

        lbNota4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNota4.setText("Nota 4:");

        lbNota3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNota3.setText("Nota 3:");

        btCancelar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btCancelar1.setText("Cancelar");
        btCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelar1ActionPerformed(evt);
            }
        });

        btSalvar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSalvar1.setText("Salvar");
        btSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvar1ActionPerformed(evt);
            }
        });

        tfIdAluno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfNomeAluno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfNota3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfNota1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfNota2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfNota4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfAno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lbProfessor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbProfessor.setText("Professor:");

        tfIdProfessor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfNomeProfessor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(363, 363, 363))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbNota1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbNota2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbNota3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbNota4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNota4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfIdProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfIdAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNomeAluno)))))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProfessor)
                    .addComponent(tfIdProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAluno)
                    .addComponent(tfIdAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbAno)
                            .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNota1)
                            .addComponent(lbNota2)
                            .addComponent(lbNota3)
                            .addComponent(lbNota4)
                            .addComponent(tfNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar1))
                    .addComponent(btSalvar1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelar1ActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelar1ActionPerformed

    private void btSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvar1ActionPerformed
        salvar();
    }//GEN-LAST:event_btSalvar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btCancelar1;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btSalvar1;
    private javax.swing.JLabel lbAluno;
    private javax.swing.JLabel lbAno;
    private javax.swing.JLabel lbNota1;
    private javax.swing.JLabel lbNota2;
    private javax.swing.JLabel lbNota3;
    private javax.swing.JLabel lbNota4;
    private javax.swing.JLabel lbProfessor;
    private java.awt.Label lbTitulo;
    private java.awt.Label lbTitulo1;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JPanel pnTitulo1;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfIdAluno;
    private javax.swing.JTextField tfIdProfessor;
    private javax.swing.JTextField tfNomeAluno;
    private javax.swing.JTextField tfNomeProfessor;
    private javax.swing.JTextField tfNota1;
    private javax.swing.JTextField tfNota2;
    private javax.swing.JTextField tfNota3;
    private javax.swing.JTextField tfNota4;
    // End of variables declaration//GEN-END:variables

    private void getAluno() {
        if (this.notas == null) {
            this.notas = new Notas(this.id, Double.valueOf(tfNota1.getText()),
                                   Double.valueOf(tfNota2.getText()), Double.valueOf(tfNota3.getText()),
                                   Double.valueOf(tfNota4.getText()), Integer.valueOf(tfAno.getText()),
                                   Integer.valueOf(tfIdAluno.getText()), Integer.valueOf(tfIdProfessor.getText()));
        }else{
            this.notas.setAno(Integer.valueOf(tfAno.getText()));
            this.notas.setId(this.id);
            this.notas.setIdAluno(Integer.valueOf(tfIdAluno.getText()));
            this.notas.setIdProfessor(Integer.valueOf(tfIdProfessor.getText()));
            this.notas.setNota1(Double.valueOf(tfNota1.getText()));
            this.notas.setNota2(Double.valueOf(tfNota2.getText()));
            this.notas.setNota3(Double.valueOf(tfNota3.getText()));
            this.notas.setNota4(Double.valueOf(tfNota4.getText()));
        }
    }
    
    private void salvar(){
        getAluno();
        NotasDao notasDao = new NotasDao();
        if (!this.editar) {
            notasDao.insert(notas);
            this.notasListModel.insertModel(notas);
            dispose();
        } else {
            this.notas.setId(this.id);
            notasDao.update(notas);
            this.notasListModel.atualizarModel(linhaSelecionada, notas);
            dispose();            
        }
    }
    
}
