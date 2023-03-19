/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package info5100.university.example.UI.FacultyJFrame;

/**
 *
 * @author hp
 */
public class GradeStudentsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GradeStudentsJPanel
     */
    public GradeStudentsJPanel() {
        initComponents();
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
        courseNameCB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gradeTable = new javax.swing.JTable();
        gradeBtn = new javax.swing.JButton();
        lbRevenue = new javax.swing.JLabel();
        lbRegistered = new javax.swing.JLabel();
        statusCB = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 204, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Course Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        add(courseNameCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 130, 30));

        jLabel2.setText("Total Revenue of this Course:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        jLabel3.setText("Total Students Registered:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        gradeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Student Name", "Course Status"
            }
        ));
        jScrollPane1.setViewportView(gradeTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 230, 180));

        gradeBtn.setText("GRADE");
        add(gradeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 80, 30));
        add(lbRevenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 70, 30));
        add(lbRegistered, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 80, 30));

        statusCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Passed", "Failed" }));
        add(statusCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 80, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> courseNameCB;
    private javax.swing.JButton gradeBtn;
    private javax.swing.JTable gradeTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbRegistered;
    private javax.swing.JLabel lbRevenue;
    private javax.swing.JComboBox<String> statusCB;
    // End of variables declaration//GEN-END:variables
}
