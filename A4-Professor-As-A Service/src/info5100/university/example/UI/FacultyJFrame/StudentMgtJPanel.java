/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package info5100.university.example.UI.FacultyJFrame;

import info5100.university.example.Authority.AuthorityProfile;
import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseLoad;
import info5100.university.example.CourseCatalog.CourseOffer;
import info5100.university.example.CourseCatalog.CourseSchedule;
import info5100.university.example.CourseCatalog.Seat;
import info5100.university.example.CourseCatalog.SeatAssignment;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.Platform.Platform;
import info5100.university.example.Role.UserAccount;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ma2017
 */
public class StudentMgtJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentMgtJPanel
     */
    private Platform platform;
    private UserAccount ua;
    private FacultyProfile professor;
    private DefaultTableModel studentTableModel;
    private Course selectedCourse;

    public StudentMgtJPanel() {
        initComponents();
        this.setVisible(true);
    }

    public StudentMgtJPanel(Platform platform, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        fieldCourseName.setEnabled(false);
        this.platform = platform;
        this.ua = useraccount;
        this.professor = this.platform.getFacultydirectory().findProfessorById(ua.getAccountId());

        this.studentTableModel = (DefaultTableModel) studentTable.getModel();
        populateDropdowns();
        populateStudentTable();
        populateCourseCombo();

        this.selectedCourse = (Course) comboCourse.getSelectedItem();

        rating.setText(String.valueOf(this.professor.getReputation()));
    }

    public void populateCourseCombo() {
        for (Course c : this.professor.getCourseCatalog().getCourses()) {
            comboCourse.addItem(c.getName());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboCourse = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        fieldCourseName = new javax.swing.JTextField();
        gradeBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        fieldRep = new javax.swing.JTextField();
        rating = new javax.swing.JLabel();
        gradeField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboCourse.setToolTipText("");
        comboCourse.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCourseItemStateChanged(evt);
            }
        });
        comboCourse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboCourseFocusLost(evt);
            }
        });
        comboCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCourseActionPerformed(evt);
            }
        });
        add(comboCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 330, -1));

        jLabel1.setText("Course");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Student ID", "Student Name", "Grade Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(studentTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 380, 340));

        jLabel2.setText("Enroll List for my course");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        fieldCourseName.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                fieldCourseNameInputMethodTextChanged(evt);
            }
        });
        add(fieldCourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 230, -1));

        gradeBtn.setText("grade");
        gradeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeBtnActionPerformed(evt);
            }
        });
        add(gradeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, -1, -1));

        jLabel3.setText("My rating from students:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, 20));

        fieldRep.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        add(fieldRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 130, 60));

        rating.setText("0");
        add(rating, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 40, -1));
        add(gradeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void comboCourseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCourseItemStateChanged
        // TODO add your handling code here:
//        fieldCourseName.setText((String) comboCourse.getSelectedItem());

    }//GEN-LAST:event_comboCourseItemStateChanged

    private void comboCourseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboCourseFocusLost
        // TODO add your handling code here:
        fieldCourseName.setText(this.selectedCourse.getName());
        populateStudentTable();
    }//GEN-LAST:event_comboCourseFocusLost

    private void fieldCourseNameInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_fieldCourseNameInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCourseNameInputMethodTextChanged

    private void gradeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = studentTable.getSelectedRow();
        StudentProfile student = (StudentProfile) studentTable.getValueAt(selectedRow, 0);

        String courseName = fieldCourseName.getText();

        if (!courseName.isEmpty()) {
            for (Map.Entry<String, CourseLoad> courseLoads : student.getTranscript().getCourseloadlist().entrySet()) {
                CourseLoad cl = courseLoads.getValue();
                for (SeatAssignment sa : cl.getSeatassignments()) {
                    if (sa.getSeat().getCourseoffer().getCourse().getName().equals(courseName)) {
                        sa.setGrade(Float.valueOf(gradeField.getText()));
                        break;
                    }
                }
            }
        }

        populateStudentTable();
    }//GEN-LAST:event_gradeBtnActionPerformed

    private void comboCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCourseActionPerformed

    public void populateStudentTable() {
        if (this.professor.getEnrolledListForAllTerm().size() > 0) {
            studentTableModel.setRowCount(0);

            for (Map.Entry<String, CourseSchedule> termSchedule : this.professor.getAllSchedules().entrySet()) {
                CourseSchedule cs = termSchedule.getValue();
                ArrayList<CourseOffer> offers = cs.getSchedule();

                for (CourseOffer co : offers) {
//                    ArrayList<Student> enrolledStudentList = co.getEnrolledStudentList();
                    for (Seat s : co.getSeatlist()) {
                        if (s.isOccupied() == true) {

                            Object[] row = new Object[3];

                            row[0] = s.getSeatassignment().getCourseload().getStudent().getPerson().getPersonId();
                            row[1] = s.getSeatassignment().getCourseload().getStudent().getPerson().getNameOfPerson();
                            row[2] = s.getSeatassignment().getGrade();

                            studentTableModel.addRow(row);
                        }
                    }
                }
            }

        }
    }

//    public void populateStudentsForCourse() {
//        if (this.professor.getEnrolledListForAllTerm().size() > 0) {
//            studentTableModel.setRowCount(0);
//
//            for (Map.Entry<String, CourseSchedule> termSchedule : this.professor.getAllSchedules().entrySet()) {
//                CourseSchedule cs = termSchedule.getValue();
//                ArrayList<CourseOffer> offers = cs.getSchedule();
//
//                for (CourseOffer co : offers) {
//                    //only show students enrolled in the selected course
//                    if (co.getCourse().getName().equals(fieldCourseName.getText())) {
//                        for (Seat s : co.getSeatlist()) {
//                            if (s.isOccupied() == true) {
//
//                                Object[] row = new Object[3];
//
//                                row[0] = s.getSeatassignment().getCourseload().getStudent().getPerson().getPersonId();
//                                row[1] = s.getSeatassignment().getCourseload().getStudent().getPerson().getNameOfPerson();
//                                row[2] = s.getSeatassignment().getGrade();
//
//                                studentTableModel.addRow(row);
//                            }
//                        }
//                    }
//
//                }
//            }
//
//        }
//    }

    public void populateDropdowns() {
        for(CourseSchedule cs :this.professor.getAllSchedules().values()){
            for(CourseOffer co :cs.getSchedule()){
                comboCourse.addItem(co.getCourse());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboCourse;
    private javax.swing.JTextField fieldCourseName;
    private javax.swing.JTextField fieldRep;
    private javax.swing.JButton gradeBtn;
    private javax.swing.JTextField gradeField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rating;
    private javax.swing.JTable studentTable;
    // End of variables declaration//GEN-END:variables
}
