
package posttest6;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormRumahSakit extends javax.swing.JFrame {

    public FormRumahSakit() {
        initComponents();
    }
    
    private DefaultTableModel model;
    private final Connection con = koneksi.getConnection();
    private Statement stt;
    private ResultSet rss;
  
    public void initTable(){
        model = new DefaultTableModel();
        model.addColumn("NAMA PASIEN");
        model.addColumn("TANGGAL LAHIR");
        model.addColumn("USIA");
        model.addColumn("JENIS KELAMIN");
        model.addColumn("DIAGNOSA");
        model.addColumn("DOKTER");
        model.addColumn("RUANGAN");
        model.addColumn("TANGGAL MASUK");
        jTable2.setModel(model);
    }
    public void TampilData(){
        try{
            String sql = "SELECT*FROM rumahsakit";
            stt = con.createStatement();
            rss = stt.executeQuery(sql);
            while(rss.next()){
                Object[] o = new Object[8];
                o[0] = rss.getString("namapasien");
                o[1] = rss.getString("tanggallahir");
                o[2] = rss.getString("usia");
                o[3] = rss.getString("jeniskelamin");
                o[4] = rss.getString("diagnosa");
                o[5] = rss.getString("dokter");
                o[6] = rss.getString("ruangan");
                o[7] = rss.getString("tanggalmasuk");
                model.addRow(o);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public void TambahData(String namapasien , String tanggallahir , String usia, String jeniskelamin, String diagnosa, String dokter, String ruangan, String tanggalmasuk){
        try{
            String sql = "INSERT INTO rumahsakit VALUES(NULL,'"+namapasien+"','"+tanggallahir+"','"+usia+"','"+jeniskelamin+"','"+diagnosa+"','"+dokter+"','"+ruangan+"','"+tanggalmasuk+"')";
            stt = con.createStatement();
            stt.executeUpdate(sql);
                model.addRow(new Object[]{namapasien,tanggallahir,usia,jeniskelamin,dokter,ruangan,tanggalmasuk});
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        L = new javax.swing.JRadioButton();
        P = new javax.swing.JRadioButton();
        namaPasien = new javax.swing.JTextField();
        usia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        diagnosa = new javax.swing.JList();
        tanggallahir = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dokter = new javax.swing.JTextField();
        ruangan = new javax.swing.JTextField();
        tanggalmasuk = new javax.swing.JFormattedTextField();
        tambah = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cari = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        kategori = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 204));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel1.setText("Rumah Sakit Sebatik");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jLabel2.setText("DATA PASIEN");

        jLabel3.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jLabel4.setText("Tanggal Lahir");

        jLabel5.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jLabel5.setText("Usia");

        jLabel6.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jLabel6.setText("Jenis Kelamin");

        buttonGroup1.add(L);
        L.setText("L");

        buttonGroup1.add(P);
        P.setText("P");
        P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PActionPerformed(evt);
            }
        });

        namaPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaPasienActionPerformed(evt);
            }
        });

        usia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usiaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jLabel7.setText("Diagnosa");

        diagnosa.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        diagnosa.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Stroke", "Ginjal", "Kanker", "Katarak", "Normal" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(diagnosa);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(91, 91, 91)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tanggallahir, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(L, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P))
                            .addComponent(usia)
                            .addComponent(namaPasien)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(namaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tanggallahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(usia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(L)
                    .addComponent(P))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));

        jLabel9.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jLabel9.setText("Dokter");

        jLabel10.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jLabel10.setText("Ruangan");

        jLabel11.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jLabel11.setText("Tanggal Masuk");

        dokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dokterActionPerformed(evt);
            }
        });

        ruangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruanganActionPerformed(evt);
            }
        });

        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jLabel12.setText("Cari");

        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cariKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jLabel13.setText("By");

        kategori.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "namapasien", "Dokter" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(simpan))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(jLabel8))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dokter)
                                    .addComponent(ruangan)
                                    .addComponent(tanggalmasuk)
                                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(dokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ruangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tanggalmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambah)
                    .addComponent(simpan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kategori, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama Pasien", "Tanggal Lahir", "Usia", "Jenis Kelamin", "Diagnosa", "Dokter", "Ruangan", "Tanggal Masuk"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PActionPerformed

    private void namaPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaPasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaPasienActionPerformed

    private void dokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dokterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dokterActionPerformed

    private void ruanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruanganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruanganActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        String kelamin=null;
        if(L.isSelected()){
            kelamin = L.getText();
        }else if(P.isSelected()){
            kelamin = P.getText();
        }
        String NamaPasien = namaPasien.getText();
        String tanggal_lahir = tanggallahir.getText();
        String umur = usia.getText();
        String Diagnosa = diagnosa.getSelectedValue().toString();
        String Dokter = dokter.getText();
        String Ruangan = ruangan.getText();
        String tanggal_masuk = tanggalmasuk.getText();
        TambahData(NamaPasien,tanggal_lahir,umur,kelamin,Diagnosa,Dokter,Ruangan,tanggal_masuk);
    }//GEN-LAST:event_simpanActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cariActionPerformed

    private void usiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usiaActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        namaPasien.setEnabled(true);
        tanggallahir.setEnabled(true);
        usia.setEnabled(true);
        diagnosa.setEnabled(true);
        dokter.setEnabled(true);
        ruangan.setEnabled(true);
        tanggalmasuk.setEnabled(true);
        simpan.setEnabled(true);
    }//GEN-LAST:event_tambahActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        initTable();
        TampilData();
    }//GEN-LAST:event_formComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        namaPasien.setText("");
        tanggallahir.setText("");
        usia.setText("");
        dokter.setText("");
        ruangan.setText("");
        tanggalmasuk.setText("");
        cari.setText("");
        
        namaPasien.setEnabled(false);
        tanggallahir.setEnabled(false);
        usia.setEnabled(false);
        diagnosa.setEnabled(false);
        dokter.setEnabled(false);
        ruangan.setEnabled(false);
        tanggalmasuk.setEnabled(false);
        simpan.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void cariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyTyped
        // TODO add your handling code here:
        DefaultTableModel modelcari = new DefaultTableModel();
        modelcari.addColumn("NAMA PASIEN");
        modelcari.addColumn("TANGGAL LAHIR");
        modelcari.addColumn("USIA");
        modelcari.addColumn("JENIS KELAMIN");
        modelcari.addColumn("DIAGNOSA");
        modelcari.addColumn("DOKTER");
        modelcari.addColumn("RUANGAN");
        modelcari.addColumn("TANGGAL MASUK");
        
        try{
        String sql = "SELECT * FROM rumahsakit where "+kategori.getSelectedItem().toString()+" like '%"+cari.getText()+"%'";
        stt = con.createStatement();
        rss = stt.executeQuery(sql);
        while(rss.next()){
            modelcari.addRow(new Object[]{
            rss.getString(2),
            rss.getString(3),
            rss.getString(4),
            rss.getString(5),
            rss.getString(6),
            rss.getString(7),
            rss.getString(8),
            rss.getString(9)
            });
            }jTable2.setModel(modelcari);
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_cariKeyTyped

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
            java.util.logging.Logger.getLogger(FormRumahSakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRumahSakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRumahSakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRumahSakit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRumahSakit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton L;
    private javax.swing.JRadioButton P;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cari;
    private javax.swing.JList diagnosa;
    private javax.swing.JTextField dokter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox kategori;
    private javax.swing.JTextField namaPasien;
    private javax.swing.JTextField ruangan;
    private javax.swing.JButton simpan;
    private javax.swing.JButton tambah;
    private javax.swing.JFormattedTextField tanggallahir;
    private javax.swing.JFormattedTextField tanggalmasuk;
    private javax.swing.JTextField usia;
    // End of variables declaration//GEN-END:variables
}
