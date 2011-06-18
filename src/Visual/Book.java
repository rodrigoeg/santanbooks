package Visual;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddBooks.java
 *
 * Created on 14/06/2011, 16:13:26
 */

import javax.swing.JFileChooser;

/**
 *
 * @author msvolenski
 */
public class Book extends javax.swing.JPanel {
    private Santanbooks parent;
    private Classes.Book livroAtual;
    
    public Book(Santanbooks p) {
        this.parent = p;
        initComponents();
    }

    public void setBook(Classes.Book novo) {
    	this.livroAtual = novo;    	
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        year = new javax.swing.JLabel();
        authors = new javax.swing.JLabel();
        edition = new javax.swing.JLabel();
        isbn = new javax.swing.JLabel();
        publisher = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        publisher1 = new javax.swing.JLabel();
        publisher3 = new javax.swing.JLabel();
        publisher4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        description1 = new javax.swing.JLabel();
        publisher5 = new javax.swing.JLabel();
        description2 = new javax.swing.JLabel();
        publisher6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        pageTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(240, 240, 240));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        year.setFont(new java.awt.Font("Lucida Grande 13 Negrito 13 Negrito", 1, 13)); // NOI18N
        year.setText("Ano:");

        authors.setFont(new java.awt.Font("Lucida Grande 13 Negrito 13 Negrito", 1, 13)); // NOI18N
        authors.setText("Autores:");

        edition.setFont(new java.awt.Font("Lucida Grande 13 Negrito 13 Negrito", 1, 13)); // NOI18N
        edition.setText("Edição:");

        isbn.setFont(new java.awt.Font("Lucida Grande 13 Negrito 13 Negrito", 1, 13)); // NOI18N
        isbn.setText("ISBN:");

        publisher.setFont(new java.awt.Font("Lucida Grande 13 Negrito 13 Negrito", 1, 13)); // NOI18N
        publisher.setText("Editora:");

        description.setFont(new java.awt.Font("Lucida Grande 13 Negrito 13 Negrito", 1, 13)); // NOI18N
        description.setText("Resumo:");

        jLabel1.setText("<EDIÇÃO>");

        jLabel2.setText("<ANO>");

        publisher1.setFont(new java.awt.Font("Lucida Grande 13 Negrito 13 Negrito", 0, 12)); // NOI18N
        publisher1.setText("<EDITORA>");

        publisher3.setFont(new java.awt.Font("Lucida Grande 13 Negrito 13 Negrito", 0, 12)); // NOI18N
        publisher3.setText("<AUTORES>");

        publisher4.setFont(new java.awt.Font("Lucida Grande 13 Negrito 13 Negrito", 0, 12)); // NOI18N
        publisher4.setText("<RESUMO>");

        jLabel4.setText("<ISBN>");

        jLabel3.setText("<IMAGEM DO LIVRO>");

        description1.setFont(new java.awt.Font("Lucida Grande 13 Negrito 13 Negrito", 1, 13)); // NOI18N
        description1.setText("Avaliações");

        publisher5.setFont(new java.awt.Font("Lucida Grande 13 Negrito 13 Negrito", 0, 12)); // NOI18N
        publisher5.setText("<AVALIAÇÕES>");

        description2.setFont(new java.awt.Font("Lucida Grande 13 Negrito 13 Negrito", 1, 13)); // NOI18N
        description2.setText("Comentários");

        publisher6.setFont(new java.awt.Font("Lucida Grande 13 Negrito 13 Negrito", 0, 12)); // NOI18N
        publisher6.setText("<COMENT�?RIOS>");

        jButton1.setText("Adicionar avaliação");

        jTextField1.setText("Digite seu comentário aqui");

        jButton2.setText("Enviar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(description)
                        .addGap(18, 18, 18)
                        .addComponent(publisher4)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(authors)
                                    .addComponent(publisher))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(publisher3)
                                    .addComponent(publisher1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(isbn)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(edition)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(year)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)))
                        .addGap(69, 69, 69))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(publisher5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(description1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(448, 448, 448))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(publisher6)
                    .addComponent(description2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(authors)
                                    .addComponent(publisher3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(publisher)
                                    .addComponent(publisher1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(isbn)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edition)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(year)
                                    .addComponent(jLabel2)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(34, 34, 34)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(description)
                    .addComponent(publisher4))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(description1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(publisher5)
                .addGap(36, 36, 36)
                .addComponent(description2)
                .addGap(18, 18, 18)
                .addComponent(publisher6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        pageTitle.setFont(new java.awt.Font("SansSerif 24 Plano", 1, 24)); // NOI18N
        pageTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageTitle.setText("<NOME DO LIVRO>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(pageTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(pageTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    	
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authors;
    private javax.swing.JLabel description;
    private javax.swing.JLabel description1;
    private javax.swing.JLabel description2;
    private javax.swing.JLabel edition;
    private javax.swing.JLabel isbn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel pageTitle;
    private javax.swing.JLabel publisher;
    private javax.swing.JLabel publisher1;
    private javax.swing.JLabel publisher3;
    private javax.swing.JLabel publisher4;
    private javax.swing.JLabel publisher5;
    private javax.swing.JLabel publisher6;
    private javax.swing.JLabel year;
    // End of variables declaration//GEN-END:variables
}
