
package hotel.management.system;

import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Employee extends javax.swing.JFrame {

   
    public Employee() {
        initComponents();
         SimpleDateFormat myFormat = new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal = Calendar.getInstance();
        txtDate.setText(myFormat.format(cal.getTime()));
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        cmbTitle = new javax.swing.JComboBox<>();
        cmbStatus = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 98, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 98, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mobile");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hire Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 80, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Job Title");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 80, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Add Employee ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 37, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Status");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 61, -1));

        txtFname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 135, 264, -1));

        txtLname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 184, 264, -1));

        txtMobile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 233, 264, -1));

        txtAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 285, 264, -1));

        txtDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 335, 264, -1));

        cmbTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbTitle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Restaurant Manager", "F&B Manager", "Waiter", "Room Service Attendant", "Bartender" }));
        getContentPane().add(cmbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 380, 264, -1));

        cmbStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "On_Leave" }));
        getContentPane().add(cmbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 264, -1));

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save-icon--1.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, -1, -1));

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(778, 572, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Salary");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 70, -1));
        getContentPane().add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 270, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/All background.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        String Fname = txtFname.getText();
        String Lname = txtLname.getText();
        String mobile = txtMobile.getText();
        String address = txtAddress.getText();

        //required fields 
        if (Fname == null || Fname.trim().isEmpty()
                || Lname == null || Lname.trim().isEmpty()
                || mobile == null || mobile.trim().isEmpty()
                || address == null || address.trim().isEmpty()
                || txtDate.getText() == null || txtDate.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all required fields.");
            return;
        }

        //validate mobile number
        if (!mobile.matches("^\\d{10,12}$")) {
            JOptionPane.showMessageDialog(this, "Mobile number must be 10,12 digits.");
            return;
        }

        java.sql.Date checkinDate;
        try {
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy/MM/dd");
            sdf.setLenient(false);
            java.util.Date parsed = sdf.parse(txtDate.getText().trim());
            checkinDate = new java.sql.Date(parsed.getTime());
        } catch (java.text.ParseException ex) {
            JOptionPane.showMessageDialog(this, "Invalid date format (use yyyy/MM/dd).");
            return;
        }

        String title = (String) cmbTitle.getSelectedItem();
        String salary = txtSalary.getText();   

        // Salary validation 
        if (salary == null || salary.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter salary.");
            return;
        }
        java.math.BigDecimal salaryAmt;
        try {
            salaryAmt = new java.math.BigDecimal(salary.trim());
            if (salaryAmt.signum() <= 0) {
                JOptionPane.showMessageDialog(this, "Salary must be a positive amount.");
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter a valid salary (e.g., 3500.00).");
            return;
        }
        

        String status = (String) cmbStatus.getSelectedItem();


        try {
            Connection conn = DBconnection.connect();
            String sql = "INSERT INTO employee (fName, LName, mobile, address, hireDate, jobTitle, salary, status) VALUES (?, ?, ? ,? ,? ,? ,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, Fname);
            pst.setString(2, Lname);
            pst.setString(3, mobile);
            pst.setString(4, address);
            pst.setDate(5, checkinDate);
            pst.setString(6, title);
            pst.setString(7, salary);
            pst.setString(8, status);

            int rows = pst.executeUpdate();

            if(rows > 0){
                JOptionPane.showMessageDialog(null, "Insert successfully");
            }

            pst.close();
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btnSaveActionPerformed

  
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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JComboBox<String> cmbTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}
