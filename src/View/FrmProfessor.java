package View;

import Dao.ProfessorDao;
import Entidades.Genero;
import Entidades.Professor;
import Models.ProfessorListModel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class FrmProfessor extends javax.swing.JDialog {
    private final ProfessorListModel professorListModel;
    private final int id;
    private final int linhaSelecionada;
    private Professor professor;
    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public FrmProfessor(int id,  ProfessorListModel  professorListModel, int linhaSelecionada, Professor professor) {
        initComponents();
        this.professor = professor;
        cbSexo.setModel(new DefaultComboBoxModel(Genero.values()));
        this.professorListModel = professorListModel;
        this.linhaSelecionada = linhaSelecionada;
        if (id > 0){
            this.id = id;
            tfCpf.setText(professor.getCpf());
            tfDataNasc.setText(dtf.format(professor.getDataNasc()));
            tfEmail.setText(professor.getEmail());
            tfNome.setText(professor.getNome());
            tfDisciplina.setText(professor.getDisciplina());
            cbSexo.setSelectedIndex(professor.getGenero().ordinal());
        }else{
            this.id = 0;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTitulo = new javax.swing.JPanel();
        lbTitulo = new java.awt.Label();
        lbNome = new javax.swing.JLabel();
        lbCpf = new javax.swing.JLabel();
        lbSexo = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbDataNasc = new javax.swing.JLabel();
        lbDisciplina = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        cbSexo = new javax.swing.JComboBox<>();
        tfCpf = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfDisciplina = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfDataNasc = new javax.swing.JFormattedTextField();
        btCadastrarNotas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GestMais - Cadastro de aluno");

        pnTitulo.setBackground(new java.awt.Color(51, 51, 51));
        pnTitulo.setName(""); // NOI18N

        lbTitulo.setAlignment(java.awt.Label.CENTER);
        lbTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setName(""); // NOI18N
        lbTitulo.setText("Cadastro de Professor");

        javax.swing.GroupLayout pnTituloLayout = new javax.swing.GroupLayout(pnTitulo);
        pnTitulo.setLayout(pnTituloLayout);
        pnTituloLayout.setHorizontalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnTituloLayout.setVerticalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        lbTitulo.getAccessibleContext().setAccessibleName("Cadastro de aluno");

        lbNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNome.setText("Nome:");

        lbCpf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbCpf.setText("CPF:");

        lbSexo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbSexo.setText("Sexo:");

        lbEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbEmail.setText("E-mail:");

        lbDataNasc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbDataNasc.setText("Data de nascimento:");

        lbDisciplina.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbDisciplina.setText("Disciplina:");

        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        cbSexo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outro" }));

        tfCpf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfDisciplina.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });

        tfDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        tfDataNasc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btCadastrarNotas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btCadastrarNotas.setText("Cadastrar Notas");
        btCadastrarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarNotasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSexo)
                    .addComponent(lbCpf)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCadastrarNotas)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbDisciplina)
                                .addComponent(lbEmail)
                                .addComponent(lbNome))
                            .addGap(8, 8, 8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                                .addComponent(tfDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                                .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbDataNasc)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tfNome)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCpf)
                    .addComponent(lbDataNasc)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSexo)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDisciplina)
                    .addComponent(tfDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btSalvar)
                    .addComponent(btCadastrarNotas))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        salvar();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btCadastrarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarNotasActionPerformed
       
    }//GEN-LAST:event_btCadastrarNotasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrarNotas;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbDataNasc;
    private javax.swing.JLabel lbDisciplina;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSexo;
    private java.awt.Label lbTitulo;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JFormattedTextField tfDataNasc;
    private javax.swing.JTextField tfDisciplina;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables

    private void getProfessor() {
        if (this.professor == null) {
            this.professor = new Professor(tfDisciplina.getText(), this.id, tfNome.getText(), 
                                          (Genero) cbSexo.getSelectedItem(), tfEmail.getText(), 
                                           tfCpf.getText(), LocalDate.parse(tfDataNasc.getText(), dtf));
        }else{
            this.professor.setCpf(tfCpf.getText());
            this.professor.setDisciplina(tfDisciplina.getText());
            this.professor.setNome(tfNome.getText());
            this.professor.setEmail(tfEmail.getText());
            this.professor.setId(this.id);
            this.professor.setGenero((Genero) cbSexo.getSelectedItem());
            this.professor.setDataNasc(LocalDate.parse(tfDataNasc.getText(), dtf));
        }
    }
    
    private void salvar(){
        if (validarCampos()){
            getProfessor();
            ProfessorDao professorDao = new ProfessorDao();
            if (this.id == 0) {
                professorDao.insert(professor);
                this.professorListModel.insertModel(professor);
                dispose();
            } else {
                professor.setId(this.id);
                professorDao.update(professor);
                this.professorListModel.atualizarModel(linhaSelecionada, professor);
                this.dispose();            
            }
        }
    }
    
    private boolean validarCampos(){
        if ("".equals(tfCpf.getText())){
            JOptionPane.showMessageDialog(null, "O CPF deve estar preenchido! ");
            return false;
        }
        if ("".equals(tfDataNasc.getText())){
            JOptionPane.showMessageDialog(null, "A data de nascimento deve estar preenchida! ");
            return false;
        }
        if ("".equals(tfDisciplina.getText())){
            JOptionPane.showMessageDialog(null, "A disciplina deve estar preenchido! ");
            return false;
        }
        if ("".equals(tfEmail.getText())){
            JOptionPane.showMessageDialog(null, "O email deve estar preenchido! ");
            return false;
        }
        if ("".equals(tfNome.getText())){
            JOptionPane.showMessageDialog(null, "O nome deve estar preenchido! ");
            return false;
        }        
        return true;
    }
}
