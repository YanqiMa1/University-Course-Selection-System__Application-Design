/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package info5100.university.example.UI.FacultyJFrame;

import info5100.university.example.College.College;
import info5100.university.example.Role.UserAccount;

/**
 *
 * @author hp
 */
public class MakeScheduleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MakeScheduleJPanel
     */
    public MakeScheduleJPanel(College college, UserAccount userAccount) {
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

        nameCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSemester = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSeats = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        scheduleTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 204, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add(nameCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 130, 30));

        jLabel1.setText("Course Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel2.setText("Semester:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));
        add(txtSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 130, 30));

        jLabel3.setText("Seats:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));
        add(txtSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 130, 30));

        addBtn.setText("ADD");
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        scheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Course Name", "Semester", "Seats"
            }
        ));
        jScrollPane1.setViewportView(scheduleTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 280, 210));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> nameCB;
    private javax.swing.JTable scheduleTable;
    private javax.swing.JTextField txtSeats;
    private javax.swing.JTextField txtSemester;
    // End of variables declaration//GEN-END:variables
}