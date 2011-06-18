package Visual;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LoggedIn.java
 *
 * Created on 18/06/2011, 01:15:58
 */

/**
 *
 * @author Renato
 */
public class SessionManagerLoggedIn extends javax.swing.JPanel {
    private Santanbooks parent;
    /** Creates new form LoggedIn */
    public SessionManagerLoggedIn(Santanbooks p) {
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

        helloLabel = new javax.swing.JLabel();
        editProfileLabel = new javax.swing.JLabel();
        addBookLabel = new javax.swing.JLabel();
        logoPanel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 50));
        setMinimumSize(new java.awt.Dimension(800, 50));
        setPreferredSize(new java.awt.Dimension(800, 50));
        setLayout(null);

        helloLabel.setText("Ol�, <USERNAME>!");
        add(helloLabel);
        helloLabel.setBounds(620, 10, 100, 14);

        editProfileLabel.setForeground(new java.awt.Color(0, 0, 255));
        editProfileLabel.setText("Edite seu perfil");
        editProfileLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(editProfileLabel);
        editProfileLabel.setBounds(620, 30, 80, 14);

        addBookLabel.setForeground(new java.awt.Color(0, 0, 255));
        addBookLabel.setText("Adicionar livro");
        addBookLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(addBookLabel);
        addBookLabel.setBounds(720, 30, 70, 14);

        logoPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("Santanbooks_Small.png"))); // NOI18N
        logoPanel.setText("jLabel1");
        logoPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoPanel.setMaximumSize(new java.awt.Dimension(214, 45));
        logoPanel.setMinimumSize(new java.awt.Dimension(214, 45));
        logoPanel.setPreferredSize(new java.awt.Dimension(214, 45));
        logoPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoPanelMouseClicked(evt);
            }
        });
        add(logoPanel);
        logoPanel.setBounds(10, 5, 210, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void logoPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoPanelMouseClicked
        parent.changePanel(Santanbooks.PANEL_HOME);
    }//GEN-LAST:event_logoPanelMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addBookLabel;
    private javax.swing.JLabel editProfileLabel;
    private javax.swing.JLabel helloLabel;
    private javax.swing.JLabel logoPanel;
    // End of variables declaration//GEN-END:variables
}
