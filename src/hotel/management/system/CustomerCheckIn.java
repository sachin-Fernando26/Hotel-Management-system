
package hotel.management.system;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class CustomerCheckIn extends javax.swing.JFrame {


    public CustomerCheckIn() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNationality = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        cmbBed = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbRoomType = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtDays = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer CheckIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 250, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 156, 100, -1));

        txtName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 179, 226, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mobile Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 228, 150, -1));

        txtMobile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 269, 226, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 322, 130, -1));

        txtAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 345, 226, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 398, 120, -1));

        cmbGender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        getContentPane().add(cmbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 421, 226, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 475, 100, -1));

        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 504, 226, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nationality");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 100, -1));

        txtNationality.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 300, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Check IN Date");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 120, -1));

        txtDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 303, -1));

        cmbBed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbBed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", "Triple" }));
        getContentPane().add(cmbBed, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 179, 251, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Bed");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 156, 110, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Room Type");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 251, 130, -1));

        cmbRoomType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbRoomType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A/C", "Non-A/C" }));
        getContentPane().add(cmbRoomType, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 269, 251, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Days");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, -1, -1));

        txtDays.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtDays, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 130, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Price");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, 70, -1));

        txtPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 430, 251, -1));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save-icon--1.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 94, -1));

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, 94, -1));

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 570, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/All background.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        // Read values
        String name = txtName.getText();
        String mobile = txtMobile.getText();
        String address = txtAddress.getText();
        String gender = (String) cmbGender.getSelectedItem();
        String email = txtEmail.getText();
        String nationality = txtNationality.getText();
        String bed = (String) cmbBed.getSelectedItem();
        String roomType = (String) cmbRoomType.getSelectedItem();

        //Required fields check
        if (name == null || name.trim().isEmpty()
            || mobile == null || mobile.trim().isEmpty()
            || address == null || address.trim().isEmpty()
            || email == null || email.trim().isEmpty()
            || nationality == null || nationality.trim().isEmpty()
            || txtDays.getText() == null || txtDays.getText().trim().isEmpty()
            || txtPrice.getText() == null || txtPrice.getText().trim().isEmpty()
            || txtDate.getText() == null || txtDate.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all required fields.");
            return;
        }

        // Basic format checks
        if (!email.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")) {
            JOptionPane.showMessageDialog(this, "Invalid email format.");
            return;
        }
        if (!mobile.matches("^\\d{7,15}$")) {
            JOptionPane.showMessageDialog(this, "Mobile number must be 7–15 digits.");
            return;
        }
        if (!txtDays.getText().trim().matches("^\\d+$")) {
            JOptionPane.showMessageDialog(this, "Days must be a whole number.");
            return;
        }
        if (!txtPrice.getText().trim().matches("^\\d+$")) {
            JOptionPane.showMessageDialog(this, "Price must be a whole number.");
            return;
        }

        // Safe parse of ints
        int days, price;
        try {
            days = Integer.parseInt(txtDays.getText().trim());
            if (days <= 0 || days > 365) {
                JOptionPane.showMessageDialog(this, "Days must be between 1 and 365.");
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Days must be a whole number.");
            return;
        }
        try {
            price = Integer.parseInt(txtPrice.getText().trim());
            if (price <= 0) {
                JOptionPane.showMessageDialog(this, "Price must be greater than 0.");
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Price must be a whole number.");
            return;
        }

        int totalPrice = price * days;

        //Date parse
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

        // Insert
        String sql = "INSERT INTO customer "
        + "(cusName, mobile, address, gender, email, nationality, bed, roomtype,days, price, date) "
        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBconnection.connect();
            PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, name);
            pst.setString(2, mobile);
            pst.setString(3, address);
            pst.setString(4, gender);
            pst.setString(5, email);
            pst.setString(6, nationality);
            pst.setString(7, bed);
            pst.setString(8, roomType);
            pst.setInt(9, days);
            pst.setInt(10, totalPrice);
            pst.setDate(11, checkinDate);

            int rows = pst.executeUpdate();

            if(rows > 0){
                JOptionPane.showMessageDialog(null, "Added Susscessfully");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new CustomerCheckIn().setVisible(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerCheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JComboBox<String> cmbBed;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JComboBox<String> cmbRoomType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTextField txtDays;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNationality;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
