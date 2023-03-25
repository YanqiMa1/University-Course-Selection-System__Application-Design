/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package info5100.university.example.UI;

import info5100.university.example.Platform.Platform;
import info5100.university.example.Persona.Person;
import info5100.university.example.Role.AuthorityRole;
import info5100.university.example.Role.FacultyRole;
import info5100.university.example.Role.StudentRole;
import info5100.university.example.Role.UserAccount;
import info5100.university.example.Role.UserAccountDirectory;
import javax.swing.JOptionPane;

/**
 *
 * @author alilovepeach
 */
public class SignUpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SignUpJPanel
     */
    private Platform pf;
    private UserAccountDirectory uad;

    public SignUpJPanel() {
        initComponents();
    }

    public SignUpJPanel(Platform pf, UserAccount userAccount) {
        initComponents();
        this.pf = pf;
        this.uad = pf.getUad();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldName = new javax.swing.JTextField();
        fieldUsername = new javax.swing.JTextField();
        fieldPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        roleComboBox = new javax.swing.JComboBox<>();
        btnSignUp = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("Create An Account");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 210, 50));

        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        fieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNameActionPerformed(evt);
            }
        });
        add(fieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 140, -1));
        add(fieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 140, -1));
        add(fieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 140, -1));

        jLabel5.setText("Username");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jLabel4.setText("Choose your role");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Professor", "Student", "Authority" }));
        add(roleComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 140, -1));

        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, -1, -1));

        jLabel6.setText("Password");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNameActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:\
//        Platform info = this.pf.findDepartment("Information System");
        UserAccountDirectory infoUad = this.pf.getUad();
        if (infoUad.accountExists(fieldUsername.getText())) {
            JOptionPane.showMessageDialog(null, "This username has been taken.");
        } else if (pf.getPersondirectory().nameExists(fieldName.getText())) {
            JOptionPane.showMessageDialog(null, "This name is already exist.");
        } else {
            if (roleComboBox.getSelectedItem().equals("Student")) {
                UserAccount user = infoUad.createUserAccount(fieldUsername.getText(), fieldPassword.getText(), new StudentRole());
                Person p = pf.getPersondirectory().newPerson(user.getAccountId());
                p.setNameOfPerson(fieldName.getText());

                pf.getStudentdirectory().newStudentProfile(p);
                JOptionPane.showMessageDialog(null, "Student successfully registered.");

            }
            if (roleComboBox.getSelectedItem().equals("Professor")) {
                UserAccount user = infoUad.createUserAccount(fieldUsername.getText(), fieldPassword.getText(), new FacultyRole());
                Person p = pf.getPersondirectory().newPerson(user.getAccountId());
                p.setNameOfPerson(fieldName.getText());
                pf.getFacultydirectory().newFacultyProfile(p);
                JOptionPane.showMessageDialog(null, "Professor successfully registered.");
            }

            if (roleComboBox.getSelectedItem().equals("Authority")) {
                UserAccount user = infoUad.createUserAccount(fieldUsername.getText(), fieldPassword.getText(), new AuthorityRole());
                Person p = pf.getPersondirectory().newPerson(user.getAccountId());
                p.setNameOfPerson(fieldName.getText());
                pf.getAuthoritydirectory().newAuthorityProfile(p);
                JOptionPane.showMessageDialog(null, "Authority successfully registered.");
            }
        }
    }//GEN-LAST:event_btnSignUpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JTextField fieldName;
    private javax.swing.JTextField fieldPassword;
    private javax.swing.JTextField fieldUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> roleComboBox;
    // End of variables declaration//GEN-END:variables
}
