/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class QuanLiDiemSinhVien extends javax.swing.JFrame {

    /**
     * Creates new form QuanLiDiemSinhVien
     */
    public QuanLiDiemSinhVien() {
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

        btnThoatQLDiemSV = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtImportQLDiem = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnImportQLDiem = new javax.swing.JButton();
        txtMSSVQLDiem = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtHoTenQLDiem = new javax.swing.JTextField();
        txtTongsoSVQLDiemSV = new javax.swing.JTextField();
        txtTileSVDauQLDiemSV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTileSVRotQLDiemSV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSoSVrotQLDiemSV = new javax.swing.JTextField();
        txtDiemGKQLDiem = new javax.swing.JTextField();
        txtSoSVDauQLDiemSV = new javax.swing.JTextField();
        txtDiemCKQLDiem = new javax.swing.JTextField();
        btnCapnhat = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtDiemKhacQLDiem = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxMalopQLDiemSV = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableQLDiemSV = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnThoatQLDiemSV.setText("Thoát");
        btnThoatQLDiemSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatQLDiemSVActionPerformed(evt);
            }
        });

        jLabel17.setText("Import file:");

        jLabel1.setText("MSSV:");

        btnImportQLDiem.setText("...");
        btnImportQLDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportQLDiemActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 0, 255));
        jLabel18.setText("QUẢN LÍ ĐIỂM SINH VIÊN");

        jLabel2.setText("Họ Tên:");

        txtTongsoSVQLDiemSV.setEditable(false);
        txtTongsoSVQLDiemSV.setBackground(new java.awt.Color(204, 204, 255));
        txtTongsoSVQLDiemSV.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTongsoSVQLDiemSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongsoSVQLDiemSVActionPerformed(evt);
            }
        });

        txtTileSVDauQLDiemSV.setEditable(false);
        txtTileSVDauQLDiemSV.setBackground(new java.awt.Color(204, 204, 255));
        txtTileSVDauQLDiemSV.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTileSVDauQLDiemSV.setForeground(new java.awt.Color(51, 102, 255));

        jLabel3.setText("Điểm Giữa Kì:");

        txtTileSVRotQLDiemSV.setEditable(false);
        txtTileSVRotQLDiemSV.setBackground(new java.awt.Color(204, 204, 255));
        txtTileSVRotQLDiemSV.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTileSVRotQLDiemSV.setForeground(new java.awt.Color(255, 0, 51));

        jLabel4.setText("Điểm Cuối Kì:");

        txtSoSVrotQLDiemSV.setEditable(false);
        txtSoSVrotQLDiemSV.setBackground(new java.awt.Color(204, 204, 255));
        txtSoSVrotQLDiemSV.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtSoSVrotQLDiemSV.setForeground(new java.awt.Color(0, 0, 255));

        txtSoSVDauQLDiemSV.setEditable(false);
        txtSoSVDauQLDiemSV.setBackground(new java.awt.Color(204, 204, 255));
        txtSoSVDauQLDiemSV.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N

        btnCapnhat.setText("Cập nhật");

        jLabel5.setText("Điểm khác:");

        jLabel6.setText("Mã Lớp:");

        cbxMalopQLDiemSV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Chọn Mã Lớp-", "17HCB-Thiết Kế Giao Diện", "17HCB-KIểm Chứng Phần Mềm", "18HCB-Lập Trình Ứng Dụng Java", "18HCB-Mạng Máy Tính" }));
        cbxMalopQLDiemSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMalopQLDiemSVActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Tổng số SV:");

        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Tỉ lệ sinh viên đậu (%):");

        jLabel10.setForeground(new java.awt.Color(255, 51, 0));
        jLabel10.setText("Tỉ lệ sinh viên rớt (%):");

        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("Số sinh viên rớt: ");

        jLabel14.setForeground(new java.awt.Color(51, 0, 255));
        jLabel14.setText("Số sinh viên đậu:");

        tableQLDiemSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MSSV", "Họ Tên", "Điểm Giữa Kì", "Điểm Cuối Kì", "Điểm Khác", "Điểm Tổng"
            }
        ));
        jScrollPane1.setViewportView(tableQLDiemSV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel1)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtHoTenQLDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMSSVQLDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel18)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbxMalopQLDiemSV, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTongsoSVQLDiemSV, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDiemGKQLDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(77, 77, 77))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDiemKhacQLDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDiemCKQLDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(106, 106, 106))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtImportQLDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnImportQLDiem))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCapnhat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnThoatQLDiemSV))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTileSVDauQLDiemSV, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSoSVrotQLDiemSV, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTileSVRotQLDiemSV)
                                    .addComponent(txtSoSVDauQLDiemSV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtImportQLDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImportQLDiem)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiemGKQLDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiemCKQLDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDiemKhacQLDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtTileSVRotQLDiemSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtTileSVDauQLDiemSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtTongsoSVQLDiemSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbxMalopQLDiemSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtHoTenQLDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMSSVQLDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14)
                    .addComponent(jLabel12)
                    .addComponent(txtSoSVrotQLDiemSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoSVDauQLDiemSV))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThoatQLDiemSV)
                    .addComponent(btnCapnhat))
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatQLDiemSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatQLDiemSVActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnThoatQLDiemSVActionPerformed

    private void btnImportQLDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportQLDiemActionPerformed
        // TODO add your handling code here:
        /*reloadData();
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f= chooser.getSelectedFile();
        selectedPath = f.toString();
        System.out.print(selectedPath);
        String filename = f.getAbsolutePath();
        selectedFileName = filename;
        //System.out.println(f);
        File file = new File(filename);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String firstLine = br.readLine().trim();
            String [] columsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)tableQLDiemSV.getModel();
            model.setColumnIdentifiers(columsName);

            Object [] tableLines = br.lines().toArray();
            for(int i =0; i< tableLines.length; i++){
                String line = tableLines[i].toString().trim();
                String [] dataRow = line.split(",");
                model.addRow(dataRow);
            }

            //Get Last line
            if (tableLines.length > 1){
                int numLines = tableLines.length;
                currentSTT = getCurrentSTT(tableLines[numLines-1].toString());
            }else{
                currentSTT = 0;
            }

            tinhTongSV();

        } catch (Exception ex) {
            Logger.getLogger(DsSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        filename = f.getAbsolutePath();
        txtImportQLDiem.setText(filename);*/
    }//GEN-LAST:event_btnImportQLDiemActionPerformed

    private void txtTongsoSVQLDiemSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongsoSVQLDiemSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongsoSVQLDiemSVActionPerformed

    private void cbxMalopQLDiemSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMalopQLDiemSVActionPerformed
        // TODO add your handling code here:
        /* Danhsachlop ds = new Danhsachlop();
        //ds.setMaLop(cbxMalop.getSelectedItem().toString());
        if(cbxMalopQLDiemSV.getSelectedItem().toString() == "18HCB-Lập Trình Ứng Dụng Java")
        {
            reloadData();
            String filePath = "C:\\Users\\user\\Documents\\NetBeansProjects\\BTQLSV\\docs\\Diem_18HCB-CTT001.csv";
            File file = new File(filePath);

            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String firstLine = br.readLine().trim();
                String [] columsName = firstLine.split(",");
                DefaultTableModel model = (DefaultTableModel)tableQLDiemSV.getModel();
                model.setColumnIdentifiers(columsName);

                Object [] tableLines = br.lines().toArray();
                for(int i =0; i< tableLines.length; i++){
                    String line = tableLines[i].toString().trim();
                    String [] dataRow = line.split(",");
                    model.addRow(dataRow);
                }
                tinhTongSV();

            } catch (Exception ex) {
                Logger.getLogger(QuanLiDiemSV.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
    }//GEN-LAST:event_cbxMalopQLDiemSVActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLiDiemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLiDiemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLiDiemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLiDiemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLiDiemSinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapnhat;
    private javax.swing.JButton btnImportQLDiem;
    private javax.swing.JButton btnThoatQLDiemSV;
    private javax.swing.JComboBox<String> cbxMalopQLDiemSV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableQLDiemSV;
    private javax.swing.JTextField txtDiemCKQLDiem;
    private javax.swing.JTextField txtDiemGKQLDiem;
    private javax.swing.JTextField txtDiemKhacQLDiem;
    private javax.swing.JTextField txtHoTenQLDiem;
    private javax.swing.JTextField txtImportQLDiem;
    private javax.swing.JTextField txtMSSVQLDiem;
    private javax.swing.JTextField txtSoSVDauQLDiemSV;
    private javax.swing.JTextField txtSoSVrotQLDiemSV;
    private javax.swing.JTextField txtTileSVDauQLDiemSV;
    private javax.swing.JTextField txtTileSVRotQLDiemSV;
    private javax.swing.JTextField txtTongsoSVQLDiemSV;
    // End of variables declaration//GEN-END:variables
}
