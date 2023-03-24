/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package info5100.university.example.UI.StudentWorkArea;

import info5100.university.example.Authority.AuthorityDirectory;
import info5100.university.example.Authority.AuthorityProfile;
import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseLoad;
import info5100.university.example.CourseCatalog.SeatAssignment;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.Persona.Transcript;
import info5100.university.example.Platform.Platform;
import info5100.university.example.Role.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ma2017
 */
public class TranscriptJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TranscriptJPanel
     */
    private Platform pf;
    private UserAccount userAccount;

    public TranscriptJPanel() {
        initComponents();
        this.setVisible(true);
    }

    public TranscriptJPanel(Platform pf, UserAccount userAccount) {
        initComponents();
        this.setVisible(true);
        this.userAccount = userAccount;
        this.pf = pf;

        populateTranscript();
        populateDropdowns();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    public void populateTranscript() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        StudentProfile s = this.pf.getStudentdirectory().findStudent(this.userAccount.getAccountId());
        Transcript tp = s.getTranscript();

        for (CourseLoad cl : tp.getCourseloadlist().values()) {
            for (SeatAssignment a : cl.getSeatassignments()) {
                Course c = a.getCourse();

                Object[] row = new Object[6];
                row[0] = c;
                row[1] = c.getName();
                row[2] = c.getTerm();
                row[3] = c.getProfname();
                row[4] = a.getGrade();
                row[5] = String.valueOf(pf.getFacultydirectory().findProfessorByName(c.getProfname()).getReputation());

                model.addRow(row);
            }

        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        rateBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        RateField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        requestBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CourseNumber", "CourseName", "Semester", "Professor", "Grade", "RateOfPro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 21, 600, 210));

        rateBtn.setText("Rating");
        rateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateBtnActionPerformed(evt);
            }
        });
        add(rateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Not ready to graduate!");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 200, 20));

        RateField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                RateFieldFocusLost(evt);
            }
        });
        RateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RateFieldActionPerformed(evt);
            }
        });
        add(RateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 170, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel4.setText("Choose the third authority to evaluate your request:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 380, 20));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel5.setText("Graduate request status:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 200, 20));

        requestBtn.setText("Request to graduate");
        requestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestBtnActionPerformed(evt);
            }
        });
        add(requestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 150, -1));

        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 180, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 10)); // NOI18N
        jLabel6.setText("(integer number 1-10)");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 200, 20));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel7.setText("Rating this course:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 200, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void RateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RateFieldActionPerformed

    private void requestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestBtnActionPerformed
        AuthorityProfile ap = (AuthorityProfile) jComboBox1.getSelectedItem();
        ap.getStudentrequest().add(this.pf.getStudentdirectory().findStudent(this.userAccount.getAccountId()));
        jLabel3.setText("Pending···");
    }//GEN-LAST:event_requestBtnActionPerformed

    private void rateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateBtnActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        Course c = (Course) jTable1.getValueAt(selectedRow, 0);
        FacultyProfile fp = pf.getFacultydirectory().findProfessorByName(c.getProfname());
        fp.setReputation(Double.valueOf(RateField.getText()));
        populateTranscript();
        
    }//GEN-LAST:event_rateBtnActionPerformed

    private void RateFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RateFieldFocusLost
        if(isValidrate(RateField)){
            //pass
        }else{
            JOptionPane.showMessageDialog(null, "The rate should be 1-10!");
        }
    }//GEN-LAST:event_RateFieldFocusLost

    public void populateDropdowns() {

        ArrayList<AuthorityProfile> ad = this.pf.getAuthoritydirectory().getAuthoritylist();

        for (AuthorityProfile ap : ad) {
            jComboBox1.addItem(ap);
        }

    }
    public static boolean isValidrate(JTextField textField){
        String input = textField.getText();
        try {
           double number = Double.parseDouble(input);
           if (number >= 1 && number <= 10) {
    // Input is valid, between 1 and 10
           return true;
        } else {
    // Input is not between 1 and 10
        return false;
        }
    } catch (NumberFormatException e) {
  // Input is not a valid double
    return false;
    }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RateField;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton rateBtn;
    private javax.swing.JButton requestBtn;
    // End of variables declaration//GEN-END:variables
}
