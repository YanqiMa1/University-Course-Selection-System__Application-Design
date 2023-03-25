/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package info5100.university.example.UI.FacultyJFrame;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseOffer;
import info5100.university.example.CourseCatalog.CourseSchedule;
import info5100.university.example.Persona.Faculty.FacultyProfile;
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
public class CourseMgtJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CourseMgtJPanel
     */
    private Platform pf;
    private UserAccount ua;
    private FacultyProfile fp;
    DefaultTableModel courseTableModel;
    DefaultTableModel scheduleTableModel;

    public CourseMgtJPanel(Platform pf, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        this.pf = pf;
        this.ua = useraccount;
        this.fp = this.pf.getFacultydirectory().findProfessorById(ua.getAccountId());

        this.courseTableModel = (DefaultTableModel) courseTable.getModel();
        this.scheduleTableModel = (DefaultTableModel) scheduleTable.getModel();

        populateCourse();
        populateSchedule();
    }

    public CourseMgtJPanel() {
        initComponents();
    }

    public void populateCourse() {
        courseTableModel.setRowCount(0);

        for (Course c : this.fp.getCourseCatalog().getCourses()) {
            Object[] row = new Object[6];

            row[0] = c;
            row[1] = c.getName();
            row[2] = c.getTopic();
            row[3] = c.getRegion();
            row[4] = c.getLanguage();
            row[5] = c.getPrice();

            courseTableModel.addRow(row);
        }
    }

    public void populateSchedule() {
        scheduleTableModel.setRowCount(0);

        for (Map.Entry<String, CourseSchedule> termSchedule : this.fp.getAllSchedules().entrySet()) {
            CourseSchedule cs = termSchedule.getValue();
            ArrayList<CourseOffer> offers = cs.getSchedule();

            for (CourseOffer co : offers) {
                Course c = co.getCourse();
                Object[] row = new Object[5];

                row[0] = cs.getTerm(); //term
                row[1] = c.getCourseId();
                row[2] = c.getName();
                row[3] = co.getProfessor().getPerson().getNameOfPerson();
                row[4] = co.getSeatlist().size();

                scheduleTableModel.addRow(row);
            }

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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fieldTopic = new javax.swing.JTextField();
        fieldRegion = new javax.swing.JTextField();
        fieldLang = new javax.swing.JTextField();
        fieldSeats = new javax.swing.JTextField();
        fieldCourseName = new javax.swing.JTextField();
        createCourseBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        fieldPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboTerm = new javax.swing.JComboBox<>();
        createCOBtn = new javax.swing.JButton();
        comboCourseId = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        courseTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        scheduleTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fieldUpdatePrice = new javax.swing.JTextField();
        updatePriceBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Price");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel2.setText("Course Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel3.setText("Topic");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel4.setText("Region");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel5.setText("Language");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        add(fieldTopic, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 200, -1));
        add(fieldRegion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 200, -1));
        add(fieldLang, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 200, -1));
        add(fieldSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 200, -1));
        add(fieldCourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 200, -1));

        createCourseBtn.setText("Create Course");
        createCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCourseBtnActionPerformed(evt);
            }
        });
        add(createCourseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jLabel7.setText("term");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));
        add(fieldPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 200, -1));

        jLabel8.setText("Course Id");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel9.setText("Number of seats");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        comboTerm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022Fall", "2023Spring", "2023Summer" }));
        comboTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTermActionPerformed(evt);
            }
        });
        add(comboTerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 200, -1));

        createCOBtn.setText("Create Course Offer");
        createCOBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCOBtnActionPerformed(evt);
            }
        });
        add(createCOBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, -1));

        add(comboCourseId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 200, -1));

        courseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Course ID", "Course Name", "Topic", "Region", "Language", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        courseTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(courseTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 460, 140));

        jLabel6.setText("My Courses");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        scheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Term", "Course ID", "Course Name", "Professor Name", "No. of seats"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(scheduleTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 460, 230));

        jLabel10.setText("My Course Schedule");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 70, 20));
        add(fieldUpdatePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 100, -1));

        updatePriceBtn.setText("Update Price");
        updatePriceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePriceBtnActionPerformed(evt);
            }
        });
        add(updatePriceBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void createCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCourseBtnActionPerformed
        // TODO add your handling code here:
        String name = fieldCourseName.getText();
        String topic = fieldTopic.getText();
        String region = fieldRegion.getText();
        String lang = fieldLang.getText();
        String price = fieldPrice.getText();
        if (this.fp.getCourseCatalog().isCourseAlreadyExist(name)) {
            JOptionPane.showMessageDialog(null, "You have already create this course");
        } else {
            this.fp.createCourse(name, topic, region, lang, Integer.valueOf(price), fp.getPerson().getNameOfPerson());
        }

        //        JOptionPane.showMessageDialog(null,"Created");
        populateCourse();
        populateCourseIdCombo();
    }//GEN-LAST:event_createCourseBtnActionPerformed

    private void comboTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTermActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTermActionPerformed

    private void createCOBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCOBtnActionPerformed
        // TODO add your handling code here:
        String courseId = (String) comboCourseId.getSelectedItem();
        String seats = fieldSeats.getText();
        String term = (String) comboTerm.getSelectedItem();
        CourseSchedule courseSchedle;

        if (this.fp.getCourseScheduleByTerm(term) != null) {
            courseSchedle = this.fp.getCourseScheduleByTerm(term);
            if (courseSchedle.isThisCourseOfferExist(courseId)) {
                JOptionPane.showMessageDialog(null, "You have already create this courseOffer for this semester");
            } else {
                CourseOffer co = this.fp.createCourseOffer(term, courseId);
                co.getCourse().setTerm(term);
                co.generatSeats(Integer.valueOf(seats));
            }

        } else {
            CourseSchedule cs = this.fp.newCourseSchedule(term);
            CourseOffer co = this.fp.createCourseOffer(term, courseId);
            co.getCourse().setTerm(term);
            co.generatSeats(Integer.valueOf(seats));
        }

        populateSchedule();
    }//GEN-LAST:event_createCOBtnActionPerformed

    private void courseTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = courseTable.getSelectedRow();
        Course c = (Course) courseTable.getValueAt(selectedRow, 0);

        jLabel11.setText(c.getCourseId());
    }//GEN-LAST:event_courseTableMouseClicked

    private void updatePriceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePriceBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = courseTable.getSelectedRow();
        Course c = (Course) courseTable.getValueAt(selectedRow, 0);

        String price = fieldUpdatePrice.getText();
        c.setPrice(Integer.valueOf(price));

        populateCourse();
    }//GEN-LAST:event_updatePriceBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboCourseId;
    private javax.swing.JComboBox<String> comboTerm;
    private javax.swing.JTable courseTable;
    private javax.swing.JButton createCOBtn;
    private javax.swing.JButton createCourseBtn;
    private javax.swing.JTextField fieldCourseName;
    private javax.swing.JTextField fieldLang;
    private javax.swing.JTextField fieldPrice;
    private javax.swing.JTextField fieldRegion;
    private javax.swing.JTextField fieldSeats;
    private javax.swing.JTextField fieldTopic;
    private javax.swing.JTextField fieldUpdatePrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable scheduleTable;
    private javax.swing.JButton updatePriceBtn;
    // End of variables declaration//GEN-END:variables

    public void populateCourseIdCombo() {
        comboCourseId.removeAllItems();

        for (Course c : this.pf.getFacultydirectory().findProfessorById(ua.getAccountId()).getCourseCatalog().getCourses()) {
            comboCourseId.addItem(c.getCourseId());
        }
    }
}
