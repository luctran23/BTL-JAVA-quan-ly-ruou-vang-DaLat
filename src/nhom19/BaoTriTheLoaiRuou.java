package nhom19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static nhom19.AddTheLoaiRuou.jTextField1;
import static nhom19.AddTheLoaiRuou.jTextField2;

public class BaoTriTheLoaiRuou extends javax.swing.JFrame {

    ArrayList<TheLoai> dsTl = new ArrayList<TheLoai>();
    ConnectDB con = new ConnectDB();

    public BaoTriTheLoaiRuou() {
        initComponents();
        setTitle("Bảo trì thể loại rượu");
        loadTable(getData(false));
    }

    public BaoTriTheLoaiRuou(String value1, String value2) {
        initComponents();
        loadTable(getData(false));
    }

    public void loadTable(ArrayList<TheLoai> list) {
        jTable1.setModel(new TheLoaiTable(list));
    }

    public ArrayList<TheLoai> getData(boolean isSearch) {
        dsTl.clear();
        try {
            String query;
            if (isSearch == false || "".equals(txtTimKiem.getText())) {
                query = "select * from TheLoai";
            } else {
                query = "select * from TheLoai where tenTheLoai = '" + txtTimKiem.getText() + "'";
            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            TheLoai tl;
            while (rs.next()) {
                    tl = new TheLoai(rs.getString("matheloai"), rs.getString("tentheloai"));
                    dsTl.add(tl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return dsTl;
    }

    void insertTheLoaiIntoDB(String matl, String tentl) {
        try {
            String query = "insert into TheLoai values(?,?)";
            PreparedStatement pst = con.preparedStatement(query);

            pst.setString(1, matl);
            pst.setString(2, tentl);
            
            pst.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void deleteTheLoaiFromDB(String matl) {
        try {
            String query = "delete from TheLoai where matheloai=?";
            PreparedStatement pst = con.preparedStatement(query);

            pst.setString(1, matl);

            pst.executeUpdate();
            
            String query2 = "delete from Ruou where matheloai=?";
            PreparedStatement pst2 = con.preparedStatement(query2);
            pst2.setString(1, matl);
            pst2.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void updateTheLoai(String matl, String tentl) {
        if ("".equals(matl)) {
            JOptionPane.showMessageDialog(null, "Chon mot ma the loai de cap nhat!");
            return;
        }
        try {
            String query = "update TheLoai set tentheloai=? where matheloai=?";
            PreparedStatement pst = con.preparedStatement(query);
            pst.setString(1, tentl);
            pst.setString(2, matl);
            pst.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void searchTheLoai(String matl) {
        try {
            String query = "select * from TheLoai where matheloai=?";
            PreparedStatement pst = con.preparedStatement(query);
            pst.setString(1, matl);
            pst.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTimKiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtMaTheLoai = new javax.swing.JTextField();
        txtTenTheLoai = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtMaTheLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaTheLoaiActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã thể loại");

        jLabel3.setText("Tên thể loại");

        jLabel4.setText("Tìm kiếm tên thể loại");

        jButton5.setText("Tìm");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jButton4.setText("Đăng xuất");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtTenTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addGap(5, 5, 5))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaTheLoai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTenTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(btnRefresh)
                    .addComponent(jButton6))
                .addGap(49, 49, 49))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        updateTheLoai(txtMaTheLoai.getText(), txtTenTheLoai.getText());
        clearTextBox();
        loadTable(getData(false));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void clearTextBox() {
        txtMaTheLoai.setText("");
        txtTenTheLoai.setText("");
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        new AddTheLoaiRuou().setVisible(true);
//        this.dispose();
        String matl = txtMaTheLoai.getText();
        String tentl = txtTenTheLoai.getText();
        this.insertTheLoaiIntoDB(matl, tentl);
        loadTable(getData(false));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if ("".equals(txtMaTheLoai.getText())) {
            JOptionPane.showMessageDialog(null, "Chon mot ma the loai de xoa!");
            return;
        }
        try {
            int click = JOptionPane.showConfirmDialog(null, "Chắc chắn xóa thể loại này", "Xoá?", JOptionPane.YES_NO_OPTION);
            if (click == JOptionPane.YES_OPTION) {
                deleteTheLoaiFromDB(txtMaTheLoai.getText());
                loadTable(getData(false));
                txtMaTheLoai.setText("");
                txtTenTheLoai.setText("");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Không xoa duoc " + ex.toString());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtMaTheLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaTheLoaiActionPerformed

    }//GEN-LAST:event_txtMaTheLoaiActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        TheLoai tl = dsTl.get(row);
        txtMaTheLoai.setText(tl.getMaTl().trim());
        txtTenTheLoai.setText(tl.getTenTl().trim());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        loadTable(getData(true));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        txtTimKiem.setText("");
        loadTable(getData(false));
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new DangNhapFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new QLRuouFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(AddTheLoaiRuou.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTheLoaiRuou.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTheLoaiRuou.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTheLoaiRuou.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaoTriTheLoaiRuou().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField txtMaTheLoai;
    private javax.swing.JTextField txtTenTheLoai;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
