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
public class AddBook extends javax.swing.JPanel {
    private Santanbooks parent;
    /** Creates new form AddBooks */
    public AddBook(Santanbooks p) {
        this.parent = p;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        publisherField = new javax.swing.JFormattedTextField();
        year = new javax.swing.JLabel();
        imageButton = new javax.swing.JButton();
        authors = new javax.swing.JLabel();
        editionField = new javax.swing.JFormattedTextField();
        edition = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        isbn = new javax.swing.JLabel();
        publisher = new javax.swing.JLabel();
        yearField = new javax.swing.JFormattedTextField();
        description = new javax.swing.JLabel();
        isbnField = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionField = new javax.swing.JTextArea();
        titleField = new javax.swing.JFormattedTextField();
        authorsField = new javax.swing.JFormattedTextField();
        imageField = new javax.swing.JFormattedTextField();
        saveButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        imageField1 = new javax.swing.JFormattedTextField();
        image = new javax.swing.JLabel();
        image1 = new javax.swing.JLabel();
        pageTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(240, 240, 240));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 330));

        year.setFont(new java.awt.Font("Lucida Grande 13 Negrito 13 Negrito", 0, 12));
        year.setText("Ano");

        imageButton.setText("Adicionar");
        imageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageButtonActionPerformed(evt);
            }
        });

        authors.setFont(new java.awt.Font("Lucida Grande 13 Negrito", 0, 12));
        authors.setText("Autores");

        edition.setFont(new java.awt.Font("Lucida Grande 13 Negrito 13 Negrito", 0, 12));
        edition.setText("Edição");

        title.setFont(new java.awt.Font("Lucida Grande 13 Negrito", 0, 12));
        title.setText("Título");

        isbn.setFont(new java.awt.Font("Lucida Grande 13 Negrito", 0, 12));
        isbn.setText("ISBN");

        publisher.setFont(new java.awt.Font("Lucida Grande 13 Negrito 13 Negrito", 0, 12));
        publisher.setText("Editora");

        yearField.setText("YYYY");
        yearField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                yearFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                yearFieldFocusLost(evt);
            }
        });

        description.setFont(new java.awt.Font("Lucida Grande 13 Negrito 13 Negrito 13 Negrito", 0, 12));
        description.setText("Resumo");

        isbnField.setText("xxx-x-xxx-xxxxx-x");
        isbnField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbnFieldActionPerformed(evt);
            }
        });
        isbnField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                isbnFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                isbnFieldFocusLost(evt);
            }
        });

        descriptionField.setColumns(20);
        descriptionField.setLineWrap(true);
        descriptionField.setRows(5);
        jScrollPane1.setViewportView(descriptionField);

        saveButton.setText("Salvar");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Limpar");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        imageField1.setText("Separe suas categorias com espaços");
        imageField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                imageField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                imageField1FocusLost(evt);
            }
        });

        image.setFont(new java.awt.Font("Lucida Grande 13 Negrito 13 Negrito 13 Negrito 13 Negrito", 0, 12));
        image.setText("Imagem");

        image1.setFont(new java.awt.Font("Lucida Grande 13 Negrito 13 Negrito 13 Negrito 13 Negrito", 0, 12));
        image1.setText("Categorias");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(clearButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveButton)
                .addContainerGap(237, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(image1)
                    .addComponent(image)
                    .addComponent(description)
                    .addComponent(publisher)
                    .addComponent(isbn)
                    .addComponent(authors)
                    .addComponent(title))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(imageField, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imageButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(authorsField, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(titleField, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isbnField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(publisherField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(edition)
                            .addComponent(year))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yearField)
                            .addComponent(editionField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(imageField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authors))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isbnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edition)
                    .addComponent(isbn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(publisherField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year)
                    .addComponent(publisher))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(description))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imageButton)
                    .addComponent(imageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(image))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imageField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(image1))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton)
                    .addComponent(saveButton))
                .addGap(12, 12, 12))
        );

        add(jPanel1);
        jPanel1.setBounds(100, 100, 600, 470);

        pageTitle.setFont(new java.awt.Font("SansSerif 24 Plano", 1, 24));
        pageTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageTitle.setText("Adicionar novo livro");
        add(pageTitle);
        pageTitle.setBounds(270, 50, 251, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void yearFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearFieldFocusGained
        if(yearField.getText().equalsIgnoreCase("YYYY"))
            yearField.setText(null);
}//GEN-LAST:event_yearFieldFocusGained

    private void yearFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearFieldFocusLost
        if(yearField.getText().equalsIgnoreCase(""))
            yearField.setText("YYYY");
}//GEN-LAST:event_yearFieldFocusLost

    private void isbnFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_isbnFieldFocusGained
        if(isbnField.getText().equalsIgnoreCase("xxx-x-xxx-xxxxx-x"))
            isbnField.setText(null);
}//GEN-LAST:event_isbnFieldFocusGained

    private void isbnFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_isbnFieldFocusLost
        if(isbnField.getText().equalsIgnoreCase(""))
            isbnField.setText("xxx-x-xxx-xxxxx-x");
}//GEN-LAST:event_isbnFieldFocusLost

    private void imageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageButtonActionPerformed
        chooser = new JFileChooser();
        chooser.setFileFilter(new ImageFilter("Image Files", "jpg", "gif", "png"));
        
        String path = null;
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            path = chooser.getSelectedFile().getAbsolutePath();
    	}
        imageField.setText(path);    }//GEN-LAST:event_imageButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        titleField.setText(null);
        authorsField.setText(null);
        isbnField.setText("xxx-x-xxx-xxxxx-x");
        editionField.setText(null);
        publisherField.setText(null);
        yearField.setText("YYYY");
        descriptionField.setText(null);
        imageField.setText(null);    }//GEN-LAST:event_clearButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveButtonActionPerformed

    private void isbnFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbnFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isbnFieldActionPerformed

    private void imageField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_imageField1FocusGained
        if(imageField1.getText().equalsIgnoreCase("Separe suas categorias com espaços"))
            imageField1.setText(null);
    }//GEN-LAST:event_imageField1FocusGained

    private void imageField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_imageField1FocusLost
        if(imageField1.getText().equalsIgnoreCase(""))
            imageField1.setText("Separe suas categorias com espaços");
    }//GEN-LAST:event_imageField1FocusLost
 
    
    
    private JFileChooser chooser;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authors;
    private javax.swing.JFormattedTextField authorsField;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel description;
    private javax.swing.JTextArea descriptionField;
    private javax.swing.JLabel edition;
    private javax.swing.JFormattedTextField editionField;
    private javax.swing.JLabel image;
    private javax.swing.JLabel image1;
    private javax.swing.JButton imageButton;
    private javax.swing.JFormattedTextField imageField;
    private javax.swing.JFormattedTextField imageField1;
    private javax.swing.JLabel isbn;
    private javax.swing.JFormattedTextField isbnField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pageTitle;
    private javax.swing.JLabel publisher;
    private javax.swing.JFormattedTextField publisherField;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel title;
    private javax.swing.JFormattedTextField titleField;
    private javax.swing.JLabel year;
    private javax.swing.JFormattedTextField yearField;
    // End of variables declaration//GEN-END:variables
}