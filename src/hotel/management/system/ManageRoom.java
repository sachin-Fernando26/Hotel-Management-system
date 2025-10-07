package hotel.management.system;



import hotel.management.system.DBconnection;
import javax.swing.JOptionPane;
import java.sql.*;
import net.proteanit.sql.DbUtils;


public class ManageRoom extends javax.swing.JFrame {

    public ManageRoom() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbBed = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnSerach = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Room");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 6, 206, 34));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Room Type");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, -1));

        cmbType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A/C", "Non-A/C" }));
        getContentPane().add(cmbType, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 180, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bed");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 37, -1));

        cmbBed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbBed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", "Triple" }));
        getContentPane().add(cmbBed, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 180, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Price");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));

        txtPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 180, -1));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 100, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 556, -1, -1));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 558, -1, -1));

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 528, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("RoomID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 52, -1, -1));

        txtId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 76, 98, -1));

        btnSerach.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSerach.setText("Search");
        btnSerach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerachActionPerformed(evt);
            }
        });
        getContentPane().add(btnSerach, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 75, -1, -1));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Room Number", "Room Type", "Bed", "Price"
            }
        ));
        jTable1.setRowHeight(25);
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Room Number");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Room Type");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Bed");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Price");
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 111, 560, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Add New Rooms here !");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 220, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/All background.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String RoomType = (String) cmbType.getSelectedItem();
        String bed = (String) cmbBed.getSelectedItem();      
        String priceText = txtPrice.getText(); 

        if (priceText == null || priceText.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the price.");
            return;
        }

        int price;
        try {
            price = Integer.parseInt(priceText.trim()); // or new BigDecimal(...)
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter a valid  number for price.");
            return;
        }

        // Insert query
        try {
            Connection conn = (Connection) DBconnection.connect();
            String sql = "INSERT INTO room (roomType, bed, price) VALUES (?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, RoomType);
            pst.setString(2, bed);
            pst.setInt(3, price);

            int rows = pst.executeUpdate();

            if (rows > 0) {
                JOptionPane.showMessageDialog(this, "Room added successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "Insert failed.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnSerachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerachActionPerformed
        // TODO add your handling code here:
        // Read and validate ID
    String idText = txtId.getText().trim();
    int roomID;
    try {
        roomID = Integer.parseInt(idText);
    } catch (NumberFormatException nfe) {
        JOptionPane.showMessageDialog(this, "Room ID must be a number.");
        return;
    }

    try {
        Connection conn = (Connection) DBconnection.connect();

        //  Check existence
        String sqlCheck = "SELECT COUNT(*) FROM room WHERE roomID = ?";
        PreparedStatement pstCheck = conn.prepareStatement(sqlCheck);
        pstCheck.setInt(1, roomID);
        ResultSet rsCheck = pstCheck.executeQuery();

        if (rsCheck.next() && rsCheck.getInt(1) > 0) {

            //  Fetch data and load into table
            String sql = "SELECT roomID, roomType, bed, price FROM room WHERE roomID = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, roomID);
            ResultSet rs = pst.executeQuery();

            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            //  Fill right-side fields from the table model
            if (jTable1.getRowCount() > 0) {
                int modelRow = jTable1.convertRowIndexToModel(0); // first (and only) row

                Object typeVal  = jTable1.getModel().getValueAt(modelRow, 1); // roomType
                Object bedVal   = jTable1.getModel().getValueAt(modelRow, 2); // bed
                Object priceVal = jTable1.getModel().getValueAt(modelRow, 3); // price

                cmbType.setSelectedItem(typeVal == null ? null : typeVal.toString());
                cmbBed.setSelectedItem(bedVal == null ? null : bedVal.toString());
                txtPrice.setText(priceVal == null ? "" : priceVal.toString());
                txtId.setEditable(false);
            } else {
                JOptionPane.showMessageDialog(null, "Room ID does not exist.");
            }

            rs.close();
            pst.close();
        } else {
            JOptionPane.showMessageDialog(null, "Room ID does not exist.");
        }

        // Close check resources
        rsCheck.close();
        pstCheck.close();
        conn.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
        
    }//GEN-LAST:event_btnSerachActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String roomType = (String) cmbType.getSelectedItem();
        String bed = (String) cmbBed.getSelectedItem();

        // Validate price field 
        if (txtPrice.getText() == null || txtPrice.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the price.");
            return;
        }
        if (!txtPrice.getText().trim().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Price must be a number.");
            return;
        }

        int price = Integer.parseInt(txtPrice.getText());
        int roomId = Integer.parseInt(txtId.getText());

        try {
            Connection conn = DBconnection.connect();
            String sql = "UPDATE room SET roomType = ?, bed = ?, price = ? WHERE roomID = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, roomType);
            pst.setString(2, bed);
            pst.setInt(3, price);
            pst.setInt(4, roomId);

            int rows = pst.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(null, "Successfully updated");
            } else {
                JOptionPane.showMessageDialog(null, "No record found with Patient ID");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please Enter data in correct format");
        }

        
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        //make sure an ID is provided 
        if (txtId.getText() == null || txtId.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the Room ID before deleting.");
            txtId.requestFocus();
            return;
        }

        int roomId;
        try {
            roomId = Integer.parseInt(txtId.getText().trim());
            if (roomId <= 0) {
                JOptionPane.showMessageDialog(this, "Room ID must be a positive whole number.");
                txtId.requestFocus();
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Room ID must be a whole number.");
            txtId.requestFocus();
            return;
        }

        // Ensure Confirm
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?","Confirm Delete",JOptionPane.YES_NO_OPTION);

        if(confirm == JOptionPane.YES_NO_OPTION){
            try {
                Connection conn = DBconnection.connect();
                String sql = "DELETE FROM room WHERE roomiD = ?";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setInt(1, roomId);
                int affectedRows = pst.executeUpdate();

                if (affectedRows > 0) {
                    JOptionPane.showMessageDialog(null, "Record deleted successfully");
                } else {
                    JOptionPane.showMessageDialog(null, "No record found with ID: ");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }


        
    }//GEN-LAST:event_btnDeleteActionPerformed

 
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSerach;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbBed;
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
