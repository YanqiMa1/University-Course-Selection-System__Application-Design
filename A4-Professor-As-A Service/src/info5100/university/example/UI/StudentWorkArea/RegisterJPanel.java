/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package info5100.university.example.UI.StudentWorkArea;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseLoad;
import info5100.university.example.CourseCatalog.CourseOffer;
import info5100.university.example.CourseCatalog.CourseSchedule;
import info5100.university.example.CourseCatalog.SeatAssignment;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.Platform.Platform;
import info5100.university.example.Role.UserAccount;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ma2017
 */
public class RegisterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisterJPanel
     */
    private Platform pf;
    private UserAccount userAccount;

    public RegisterJPanel() {
        initComponents();
        this.setVisible(true);
    }

    public RegisterJPanel(Platform pf, UserAccount userAccount) {
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

        searchField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        registerBtn1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        semesterCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 310, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel1.setText("Search courses by ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 190, -1));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CourseNum", "CourseName", "Semester", "topic", "region", "language", "credit", "price", "RatingOfPro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 690, 220));

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 100, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CourseNum", "CourseName"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 290, 120));

        registerBtn1.setText("Register");
        registerBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtn1ActionPerformed(evt);
            }
        });
        add(registerBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 100, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel2.setText("choose Semester you need to register");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 260, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "professor name", "topic", "region", "language" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        semesterCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022Fall", "2023Spring", "2023Summer" }));
        add(semesterCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 120, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel3.setText("Registed Plan");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 200, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int selectedRow = jTable2.getSelectedRow();

        if (selectedRow >= 0) {

            // we will delete the object
            Course c = (Course) jTable2.getValueAt(selectedRow, 0);

            this.pf.getStudentdirectory().findStudent(this.userAccount.getAccountId()).getCourseLoadByTerm(c.getTerm()).deleteSeatAssignment(c);

            populateRegisteredCourse();
        } else {

        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String keyword = searchField.getText();
//        System.out.println(keyword);
        if (keyword == null || keyword.trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Input the Keyword.");
        } else {
            ArrayList<Course> researchList = new ArrayList<Course>();

            if (jComboBox1.getSelectedItem().equals("professor name")) {
                for (FacultyProfile p : this.pf.getFacultydirectory().getProfessors()) {
                    if (p.getPerson().getNameOfPerson().equals(keyword)) {
                        for (Map.Entry<String, CourseSchedule> termSchedule : p.getAllSchedules().entrySet()) {
                            for (CourseOffer co : termSchedule.getValue().getSchedule()) {
                                researchList.add(co.getCourse());
                            }
                        }
                        displayResult(researchList);
                    } else {
                        researchList = null;
                        JOptionPane.showMessageDialog(null, "Professor is not exist");
                    }
                }
            } else if (jComboBox1.getSelectedItem().equals("topic")) {
                for (FacultyProfile p : this.pf.getFacultydirectory().getProfessors()) {
                    for (Map.Entry<String, CourseSchedule> termSchedule : p.getAllSchedules().entrySet()) {
                        for (CourseOffer co : termSchedule.getValue().getSchedule()) {
                            if (co.getCourse().getTopic().equals(keyword)) {
                                researchList.add(co.getCourse());

                            } else {
                                JOptionPane.showMessageDialog(null, "This topic is not exist");
                            }
                        }
                    }

                }
                displayResult(researchList);
            } else if (jComboBox1.getSelectedItem().equals("region")) {
                for (FacultyProfile p : this.pf.getFacultydirectory().getProfessors()) {
                    for (Map.Entry<String, CourseSchedule> termSchedule : p.getAllSchedules().entrySet()) {
                        for (CourseOffer co : termSchedule.getValue().getSchedule()) {
                            if (co.getCourse().getRegion().equals(keyword)) {
                                researchList.add(co.getCourse());
                            } else {
                                JOptionPane.showMessageDialog(null, "This region is not exist");
                            }
                        }
                    }

                }
                displayResult(researchList);

            } else if (jComboBox1.getSelectedItem().equals("language")) {
                for (FacultyProfile p : this.pf.getFacultydirectory().getProfessors()) {
                    for (Map.Entry<String, CourseSchedule> termSchedule : p.getAllSchedules().entrySet()) {
                        for (CourseOffer co : termSchedule.getValue().getSchedule()) {
                            if (co.getCourse().getLanguage().equals(keyword)) {
                                researchList.add(co.getCourse());
                            } else {
                                JOptionPane.showMessageDialog(null, "This language is not exist");
                            }
                        }
                    }

                }
                displayResult(researchList);
            } else {
                JOptionPane.showMessageDialog(this, "Please choose the keyword catagory.");
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void registerBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtn1ActionPerformed
        CourseLoad col;
        FacultyProfile f;
        int selectedRow = jTable1.getSelectedRow();
        Course c = (Course) jTable1.getValueAt(selectedRow, 0);
        StudentProfile sp = this.pf.getStudentdirectory().findStudent(this.userAccount.getAccountId());

        String term = (String) semesterCombo.getSelectedItem();
        if (sp.getTranscript().getCourseLoadBySemester(term) != null) {
            if (sp.getTranscript().isThisCourseLoadExist(c)) {
                JOptionPane.showMessageDialog(this, "this course is already registered");
            } else {

                col = sp.getTranscript().getCourseLoadBySemester(term);
                f = pf.getFacultydirectory().findProfessorByName(c.getProfname());
                if (c.getTerm().equals(term)) {
                    CourseOffer cof = f.getCourseScheduleByTerm(term).getCourseOfferByCourseId(c.getCourseId());
                    SeatAssignment seatA = col.newSeatAssignment(cof);
                    populateRegisteredCourse();
                } else {
                    JOptionPane.showMessageDialog(this, "the semester you selected do not offer this course");
                }
            }

        } else {
            col = sp.newCourseLoad(term);
            f = pf.getFacultydirectory().findProfessorByName(c.getProfname());
            if (c.getTerm().equals(term)) {
                CourseOffer cof = f.getCourseScheduleByTerm(term).getCourseOfferByCourseId(c.getCourseId());
                SeatAssignment seatA = col.newSeatAssignment(cof);
                populateRegisteredCourse();
            } else {
                JOptionPane.showMessageDialog(this, "the semester you selected do not offer this course");
            }
        }


    }//GEN-LAST:event_registerBtn1ActionPerformed
    private void displayResult(ArrayList<Course> searchResList) {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        for (Course c : searchResList) {

            Object[] row = new Object[9];
            row[0] = c;
            row[1] = c.getName();
            row[2] = c.getTerm();
            row[3] = c.getTopic();

            row[4] = c.getRegion();
            row[5] = c.getLanguage();
            row[6] = c.getCredit();
            row[7] = c.getPrice();
            row[8] = c.getProfname();

            model.addRow(row);

        }
    }

    private void populateRegisteredCourse() {

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        StudentProfile s = this.pf.getStudentdirectory().findStudent(this.userAccount.getAccountId());
        String term = (String) semesterCombo.getSelectedItem();
        CourseLoad coload = s.getCourseLoadBySemester(term);

        for (Course c : coload.getRegisteredCourses()) {

            Object[] row = new Object[2];
            row[0] = c;
            row[1] = c.getName();

            model.addRow(row);

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton registerBtn1;
    private javax.swing.JTextField searchField;
    private javax.swing.JComboBox<String> semesterCombo;
    // End of variables declaration//GEN-END:variables
}
