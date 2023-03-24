/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package info5100.university.example.UI.FacultyJFrame;


import info5100.university.example.Platform.Platform;
import info5100.university.example.Role.UserAccount;
import info5100.university.example.UI.MainJFrame;

/**
 *
 * @author alilovepeach
 */
public class FacultyJFrame extends javax.swing.JFrame {

    /**
     * Creates new form FacultyJFrame
     */
    private Platform pf;
    private UserAccount userAccount;
    public FacultyJFrame() {
        initComponents();
        this.setVisible(true);
    }
    
    public FacultyJFrame(Platform pf, UserAccount userAccount) {
        initComponents();
        this.setVisible(true);
        this.pf = pf;
        this.userAccount = userAccount;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        courseBtn = new javax.swing.JButton();
        stuBtn = new javax.swing.JButton();
        stuBtn1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        courseBtn.setText("Course Management");
        courseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseBtnActionPerformed(evt);
            }
        });
        jPanel2.add(courseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 180, -1));

        stuBtn.setText("Student Management");
        stuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuBtnActionPerformed(evt);
            }
        });
        jPanel2.add(stuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 180, -1));

        stuBtn1.setText("My Analytics");
        stuBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuBtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(stuBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 180, -1));

        jSplitPane1.setLeftComponent(jPanel2);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jSplitPane1.setRightComponent(jPanel1);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stuBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuBtn1ActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new ProfessorAnalyticsJPanel(pf,userAccount));
    }//GEN-LAST:event_stuBtn1ActionPerformed

    private void stuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new StudentMgtJPanel(pf,userAccount));
    }//GEN-LAST:event_stuBtnActionPerformed

    private void courseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new CourseMgtJPanel(pf,userAccount));
    }//GEN-LAST:event_courseBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MainJFrame mainJFrame = new MainJFrame(this.pf, this.userAccount);
        mainJFrame.setVisible(true);
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
            java.util.logging.Logger.getLogger(FacultyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacultyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacultyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacultyJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton courseBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton stuBtn;
    private javax.swing.JButton stuBtn1;
    // End of variables declaration//GEN-END:variables
}
