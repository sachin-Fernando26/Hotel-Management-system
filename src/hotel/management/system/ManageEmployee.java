
package hotel.management.system;

import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.HashMap;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


public class ManageEmployee extends javax.swing.JFrame {


    public ManageEmployee() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        cmbTitle = new javax.swing.JComboBox<>();
        cmbStatus = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        btnPrint = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Employee");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 26, 235, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search employee here ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txtId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 121, 100, -1));

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Mobile", "Address", "Hire Date", "Job title", "Salary", "status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 650, 49));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 98, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 98, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mobile");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 81, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 81, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hire Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Job Title");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 69, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Status");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 61, -1));

        txtFname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 264, -1));

        txtLname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 264, -1));

        txtMobile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 264, -1));

        txtAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 264, -1));

        txtDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 264, -1));

        cmbTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbTitle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Restaurant Manager", "F&B Manager", "Waiter", "Room Service Attendant", "Bartender" }));
        getContentPane().add(cmbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 264, -1));

        cmbStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "On_Leave" }));
        getContentPane().add(cmbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 264, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save-icon--1.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 461, -1, -1));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 463, -1, -1));

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(955, 572, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Salary");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, -1, -1));

        txtSalary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 260, -1));

        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrint.setText("Print Report");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 580, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/All background.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String idText = txtId.getText().trim();
        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Employee ID.");
            return;
        }

        final int employeeID;
        try {
            employeeID = Integer.parseInt(idText);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Employee ID must be a number.");
            return;
        }

        final String sql =
            "SELECT fName, Lname, mobile, address, hireDate, jobTitle, salary, status " +
            "FROM employee WHERE empID = ?"; 

        try (Connection conn = DBconnection.connect()) {

            // Fill form fields
            try (PreparedStatement pst = conn.prepareStatement(sql)) {
                pst.setInt(1, employeeID);
                try (ResultSet rs = pst.executeQuery()) {
                    if (!rs.next()) {
                        JOptionPane.showMessageDialog(this, "Employee ID does not exist.");
                        return;
                    }

                    txtFname.setText(rs.getString("fName"));
                    txtLname.setText(rs.getString("Lname"));
                    txtMobile.setText(rs.getString("mobile"));
                    txtAddress.setText(rs.getString("address"));

                    java.sql.Date d = rs.getDate("hireDate");
                    txtDate.setText(d != null
                            ? new java.text.SimpleDateFormat("yyyy/MM/dd").format(d)
                            : "");

                    //Combos
                    safeSelect(cmbTitle,  rs.getString("jobTitle"));
                    safeSelect(cmbStatus, rs.getString("status"));

                    //Salary
                    try {
                        java.math.BigDecimal sal = rs.getBigDecimal("salary");
                        txtSalary.setText(sal != null ? sal.toPlainString() : "");
                    } catch (Exception ignoreIfNotDecimal) {
                        // If salary is VARCHAR/INT, fallback:
                        txtSalary.setText(rs.getString("salary"));
                    }
                }
            }

            //same record in the table 
            try (PreparedStatement pst2 = conn.prepareStatement(sql)) {
                pst2.setInt(1, employeeID);
                try (ResultSet rs2 = pst2.executeQuery()) {
                    jTable1.setModel(DbUtils.resultSetToTableModel(rs2));
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String Fname = txtFname.getText();
        String Lname = txtLname.getText();
        String mobile = txtMobile.getText();
        String address = txtAddress.getText();
        String salaryText = txtSalary.getText(); 

        //required fields 
        if (Fname == null || Fname.trim().isEmpty()
                || Lname == null || Lname.trim().isEmpty()
                || mobile == null || mobile.trim().isEmpty()
                || address == null || address.trim().isEmpty()
                || txtDate.getText() == null || txtDate.getText().trim().isEmpty()
                || txtId.getText() == null || txtId.getText().trim().isEmpty()
                || salaryText == null || salaryText.trim().isEmpty()) {  
            JOptionPane.showMessageDialog(this, "Please fill in all required fields.");
            return;
        }

        // validate Firtname
        if (Fname != null && Fname.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(this, "First name cannot contain numbers.");
            txtFname.requestFocus();
            return;
        }

        // validate LastName
        if (Lname != null && Lname.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(this, "Last name cannot contain numbers.");
            txtLname.requestFocus();
            return;
        }

        //validate mobile
        if (!mobile.matches("^\\d{10,12}$")) {
            JOptionPane.showMessageDialog(this, "Mobile number must be 10-12 digits.");
            return;
        }

        // Parse date 
        java.sql.Date hireDate;
        try {
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy/MM/dd");
            sdf.setLenient(false);
            java.util.Date parsed = sdf.parse(txtDate.getText().trim());
            hireDate = new java.sql.Date(parsed.getTime());
        } catch (java.text.ParseException ex) {
            JOptionPane.showMessageDialog(this, "Invalid date format (use yyyy/MM/dd).");
            return;
        }

        String title  = (String) cmbTitle.getSelectedItem();  
        String status = (String) cmbStatus.getSelectedItem();  

        // Parse salary (BigDecimal)
        java.math.BigDecimal salary;
        try {
            salary = new java.math.BigDecimal(salaryText.trim());
            if (salary.signum() < 0) {
                JOptionPane.showMessageDialog(this, "Salary cannot be negative.");
                return;
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Enter a valid amount for salary (e.g., 3500.00).");
            return;
        }

        int employeeId;
        try {
            employeeId = Integer.parseInt(txtId.getText().trim());
            if (employeeId <= 0) {
                JOptionPane.showMessageDialog(this, "Employee ID must be a positive number.");
                return;
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Employee ID must be a whole number.");
            return;
        }

        final String sql = "UPDATE employee SET fName = ?, Lname = ?, mobile = ?, address = ?, hireDate = ?, jobTitle = ?, salary = ?, status = ? " +
            "WHERE empID = ?"; 

        try (Connection conn = DBconnection.connect();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, Fname);
            pst.setString(2, Lname);
            pst.setString(3, mobile);
            pst.setString(4, address);
            pst.setDate(5, hireDate);
            pst.setString(6, title);
            pst.setBigDecimal(7, salary);   
            pst.setString(8, status);       
            pst.setInt(9, employeeId);      

            int rows = pst.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(this, "Successfully updated");
            } else {
                JOptionPane.showMessageDialog(this, "No record found with Employee ID");
            }
        } catch (java.sql.SQLIntegrityConstraintViolationException dup) {
            JOptionPane.showMessageDialog(this, "Update failed: " + dup.getMessage());
        } catch (java.sql.SQLException e) {
            JOptionPane.showMessageDialog(this, "DB Error: " + e.getMessage());
        }

   
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int empID = Integer.parseInt(txtId.getText());
        //Confirm
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?","Confirm Delete",JOptionPane.YES_NO_OPTION);
        
        if(confirm == JOptionPane.YES_NO_OPTION){
        try {
            Connection conn = DBconnection.connect();
            String sql = "DELETE FROM employee Where empID = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setInt(1, empID);
            int rows = pst.executeUpdate();

            if (rows > 0) {
             JOptionPane.showMessageDialog(this, "Employee deleted.");
        } else {
        JOptionPane.showMessageDialog(this, "No Employee found for that ID.");
    }
        } catch (Exception e) {
        }
        
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/hotel?zeroDateTimeBehavior=CONVERT_TO_NULL",
            "root", "")) {

           InputStream jasper = getClass().getResourceAsStream("/Report/employeeReport.jasper");
            if (jasper == null) throw new FileNotFoundException("Missing /reportsGenerate/employeeReport.jasper");

             JasperPrint jp = JasperFillManager.fillReport(jasper, new HashMap<>(), conn);
             JasperViewer.viewReport(jp, false);
        }
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
         }
    }//GEN-LAST:event_btnPrintActionPerformed

     private void safeSelect(javax.swing.JComboBox<String> combo, String value) {
    if (value == null) return;
    for (int i = 0; i < combo.getItemCount(); i++) {
        if (value.equalsIgnoreCase(String.valueOf(combo.getItemAt(i)))) {
            combo.setSelectedIndex(i);
            return;
        }
    }
}
        
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
            java.util.logging.Logger.getLogger(ManageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JComboBox<String> cmbTitle;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}
