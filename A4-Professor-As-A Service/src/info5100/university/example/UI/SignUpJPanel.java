/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package info5100.university.example.UI;

import info5100.university.example.College.College;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Person;
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
    
    private College college;
    private UserAccountDirectory uad;
    public SignUpJPanel() {
        initComponents();
    }
    
    public SignUpJPanel(College college, UserAccount userAccount) {
        initComponents();
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

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("Create An Account");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 210, 50));

        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        fieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNameActionPerformed(evt);
            }
        });
        add(fieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 80, -1));
        add(fieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 80, -1));
        add(fieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 80, -1));

        jLabel5.setText("Username");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        jLabel4.setText("Choose your role");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Professor" }));
        add(roleComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 80, -1));

        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        jLabel6.setText("Password");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNameActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:\
        Department info = this.college.findDepartment("Information System");
        UserAccountDirectory infoUad = info.getUad();
        if (infoUad.studentAccountExists(fieldUsername.getText())) {
            JOptionPane.showMessageDialog(null, "This username has been taken.");
        } else {
            if (roleComboBox.getSelectedItem().equals("Student")) {
                UserAccount user = infoUad.newStudentAccount(fieldUsername.getText(), fieldPassword.getText(), new StudentRole());
                Person p = info.getPersondirectory().newPerson(user.getAccountId());
                p.setNameOfPerson(fieldName.getText());

                info.getStudentdirectory().newStudentProfile(p);
                JOptionPane.showMessageDialog(null, "Student successfully registered.");

            }
            if (roleComboBox.getSelectedItem().equals("Professor")) {
                UserAccount user = infoUad.newFacultyAccount(fieldUsername.getText(), fieldPassword.getText(), new FacultyRole());
                Person p = info.getPersondirectory().newPerson(user.getAccountId());
                p.setNameOfPerson(fieldName.getText());
                info.getFacultydirectory().newFacultyProfile(p);
                JOptionPane.showMessageDialog(null, "Professor successfully registered.");
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
