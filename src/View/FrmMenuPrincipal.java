package View;

import java.beans.PropertyVetoException;

public class FrmMenuPrincipal extends javax.swing.JFrame {

    public FrmMenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpDesktop = new javax.swing.JDesktopPane();
        pnTitulo = new javax.swing.JPanel();
        lbTitulo = new java.awt.Label();
        mbPrincipal = new javax.swing.JMenuBar();
        mnCadastros = new javax.swing.JMenu();
        miCadProf = new javax.swing.JMenuItem();
        miCadastroAluno = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GestMais - Gestão de professores e alunos");

        pnTitulo.setBackground(new java.awt.Color(51, 51, 51));
        pnTitulo.setName(""); // NOI18N

        lbTitulo.setAlignment(java.awt.Label.CENTER);
        lbTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setName(""); // NOI18N
        lbTitulo.setText("Menu Principal");

        javax.swing.GroupLayout pnTituloLayout = new javax.swing.GroupLayout(pnTitulo);
        pnTitulo.setLayout(pnTituloLayout);
        pnTituloLayout.setHorizontalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
        pnTituloLayout.setVerticalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        dpDesktop.setLayer(pnTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dpDesktopLayout = new javax.swing.GroupLayout(dpDesktop);
        dpDesktop.setLayout(dpDesktopLayout);
        dpDesktopLayout.setHorizontalGroup(
            dpDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dpDesktopLayout.setVerticalGroup(
            dpDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpDesktopLayout.createSequentialGroup()
                .addComponent(pnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 372, Short.MAX_VALUE))
        );

        mnCadastros.setText("Cadastros");

        miCadProf.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miCadProf.setText("Cadastro de Professores");
        miCadProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadProfActionPerformed(evt);
            }
        });
        mnCadastros.add(miCadProf);

        miCadastroAluno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miCadastroAluno.setText("Cadastro de Alunos");
        miCadastroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastroAlunoActionPerformed(evt);
            }
        });
        mnCadastros.add(miCadastroAluno);
        mnCadastros.add(jSeparator1);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnCadastros.add(jMenuItem1);

        mbPrincipal.add(mnCadastros);

        mnSobre.setText("Sobre");
        mbPrincipal.add(mnSobre);

        setJMenuBar(mbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpDesktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCadProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadProfActionPerformed
        chamarCadastroProfessor();
    }//GEN-LAST:event_miCadProfActionPerformed

    private void miCadastroAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastroAlunoActionPerformed
        chamarCadastroAluno();
    }//GEN-LAST:event_miCadastroAlunoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpDesktop;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private java.awt.Label lbTitulo;
    private javax.swing.JMenuBar mbPrincipal;
    private javax.swing.JMenuItem miCadProf;
    private javax.swing.JMenuItem miCadastroAluno;
    private javax.swing.JMenu mnCadastros;
    private javax.swing.JMenu mnSobre;
    private javax.swing.JPanel pnTitulo;
    // End of variables declaration//GEN-END:variables
    
    private void chamarCadastroProfessor(){
        FrmPesquisa frmPesquisaCliente = new FrmPesquisa(1);        
        dpDesktop.add(frmPesquisaCliente);
        frmPesquisaCliente.setVisible(true);
        try {
            frmPesquisaCliente.setMaximum(true);
        }catch (PropertyVetoException ex){
            ex.printStackTrace();                    
        }
    }
    
    private void chamarCadastroAluno(){
        FrmPesquisa frmPesquisaCliente = new FrmPesquisa(2);        
        dpDesktop.add(frmPesquisaCliente);
        frmPesquisaCliente.setVisible(true);
        try {
            frmPesquisaCliente.setMaximum(true);
        }catch (PropertyVetoException ex){
            ex.printStackTrace();                    
        }
    }
}
