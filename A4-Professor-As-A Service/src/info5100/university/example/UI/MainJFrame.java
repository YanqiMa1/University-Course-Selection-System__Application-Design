/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package info5100.university.example.UI;

import info5100.university.example.College.College;
import info5100.university.example.Role.UserAccountDirectory;
import info5100.university.example.Role.UserAccount;
import javax.swing.JOptionPane;

/**
 *
 * @author alilovepeach
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private College college;
    private UserAccount userAccount;
    private UserAccountDirectory uad;
    
    public MainJFrame() {
        initComponents();
        this.college = College.getInstance();
    }
    

    public MainJFrame(College college, UserAccount userAccount){

        initComponents();
        this.setVisible(true);
        
        this.college = college;
        this.uad = college.newDepartment("Information System").getUad();
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
        jPanel1 = new javax.swing.JPanel();
        btnSignUp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JTextField();
        btnSignIn1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 80, 30));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("Professor As A Service Cloud");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 360, 40));

        jLabel3.setText("Username");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));
        jPanel1.add(fieldUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 168, 30));

        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));
        jPanel1.add(fieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 168, 30));

        btnSignIn1.setText("Sign In");
        btnSignIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignIn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignIn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 80, 30));

        jSplitPane1.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        

        jSplitPane1.setRightComponent(new SignUpJPanel(this.college, userAccount));//这里应该是college还是department，还是都有

    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnSignIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignIn1ActionPerformed
        // TODO add your handling code here:
        this.uad = college.findDepartment("Information System").getUad();

        if(this.uad.authenticateUser(fieldUserName.getText(), fieldPassword.getText()) != null) {
            UserAccount studentUser = this.uad.authenticateUser(fieldUserName.getText(), fieldPassword.getText());
            this.setVisible(false);
            studentUser.getRole().createWorkArea(this.college, studentUser);
        }else if(this.uad.authenticateUser(fieldUserName.getText(), fieldPassword.getText()) != null ){
            UserAccount facultyUser = this.uad.authenticateUser(fieldUserName.getText(), fieldPassword.getText());
            this.setVisible(false);
            facultyUser.getRole().createWorkArea(this.college, facultyUser);
        }else if(this.uad.authenticateUser(fieldUserName.getText(), fieldPassword.getText()) != null ){
            UserAccount authorityUser = this.uad.authenticateUser(fieldUserName.getText(), fieldPassword.getText());
            this.setVisible(false);
            authorityUser.getRole().createWorkArea(this.college, authorityUser);}
        else{
            JOptionPane.showMessageDialog(null, "Invalid Credentials");
        }
        //待验证的其他role--yanqi

    }//GEN-LAST:event_btnSignIn1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignIn1;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JTextField fieldPassword;
    private javax.swing.JTextField fieldUserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
