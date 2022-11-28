package View;

public class FrmNotas extends javax.swing.JFrame {
    public FrmNotas() {
        initComponents();
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
        tfIdAluno1 = new javax.swing.JTextField();
        tfIdAluno2 = new javax.swing.JTextField();
        tfIdAluno3 = new javax.swing.JTextField();
        tfIdAluno4 = new javax.swing.JTextField();
        tfIdAluno5 = new javax.swing.JTextField();
        tfIdAluno6 = new javax.swing.JTextField();

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
            .addComponent(lbTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
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

        btSalvar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSalvar1.setText("Salvar");

        tfIdAluno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfIdAluno1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfIdAluno2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfIdAluno3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfIdAluno4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfIdAluno5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tfIdAluno6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbAluno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfIdAluno))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbNota1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfIdAluno3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lbNota2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfIdAluno4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbNota3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfIdAluno2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbNota4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfIdAluno5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(tfIdAluno1))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbAno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfIdAluno6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(399, 399, 399))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAluno)
                    .addComponent(tfIdAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIdAluno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAno)
                    .addComponent(tfIdAluno6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNota1)
                    .addComponent(lbNota2)
                    .addComponent(lbNota3)
                    .addComponent(lbNota4)
                    .addComponent(tfIdAluno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIdAluno3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIdAluno5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIdAluno4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar1)
                    .addComponent(btSalvar1))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNotas().setVisible(true);
            }
        });
    }

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
    private java.awt.Label lbTitulo;
    private java.awt.Label lbTitulo1;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JPanel pnTitulo1;
    private javax.swing.JTextField tfIdAluno;
    private javax.swing.JTextField tfIdAluno1;
    private javax.swing.JTextField tfIdAluno2;
    private javax.swing.JTextField tfIdAluno3;
    private javax.swing.JTextField tfIdAluno4;
    private javax.swing.JTextField tfIdAluno5;
    private javax.swing.JTextField tfIdAluno6;
    // End of variables declaration//GEN-END:variables
}
