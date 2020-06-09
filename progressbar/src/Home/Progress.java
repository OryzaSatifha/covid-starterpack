package Home;
import java.util.Random;

public class Progress extends javax.swing.JFrame {
    private int apd = 0;
    private int masker = 0;
    private int hs = 0;
    private int sarungtangan = 0;

    public Progress() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        labelapd = new javax.swing.JLabel();
        labeljava = new javax.swing.JLabel();
        btnjava = new javax.swing.JButton();
        labeljudul1 = new javax.swing.JLabel();
        labelmasker = new javax.swing.JLabel();
        labelphp = new javax.swing.JLabel();
        btnphp = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelphp1 = new javax.swing.JLabel();
        labelphp2 = new javax.swing.JLabel();
        labelsarungtangan = new javax.swing.JLabel();
        btnphp1 = new javax.swing.JButton();
        btnphp2 = new javax.swing.JButton();
        labelhs = new javax.swing.JLabel();
        percentapd = new javax.swing.JProgressBar();
        percentmasker = new javax.swing.JProgressBar();
        percentsarungtangan = new javax.swing.JProgressBar();
        percenths = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Riwayat Penggunaan Asset RSUP Kariadi");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelapd.setFont(new java.awt.Font("Times New Roman", 0, 50)); // NOI18N
        labelapd.setText("0");
        jPanel2.add(labelapd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        labeljava.setFont(new java.awt.Font("Euphorigenic", 0, 24)); // NOI18N
        labeljava.setText("APD");
        jPanel2.add(labeljava, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        btnjava.setFont(new java.awt.Font("Euphorigenic", 0, 18)); // NOI18N
        btnjava.setText("Ambil");
        btnjava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjavaActionPerformed(evt);
            }
        });
        jPanel2.add(btnjava, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        labeljudul1.setFont(new java.awt.Font("Euphorigenic", 0, 24)); // NOI18N
        labeljudul1.setText("Riwayat Penggunaan COVID19 Starter Pack");
        jPanel2.add(labeljudul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        labelmasker.setFont(new java.awt.Font("Times New Roman", 0, 50)); // NOI18N
        labelmasker.setText("0");
        jPanel2.add(labelmasker, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        labelphp.setFont(new java.awt.Font("Euphorigenic", 0, 24)); // NOI18N
        labelphp.setText("Sarung Tangan");
        jPanel2.add(labelphp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        btnphp.setFont(new java.awt.Font("Euphorigenic", 0, 18)); // NOI18N
        btnphp.setText("Ambil");
        btnphp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnphpActionPerformed(evt);
            }
        });
        jPanel2.add(btnphp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        btnreset.setFont(new java.awt.Font("Euphorigenic", 0, 18)); // NOI18N
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel2.add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 600, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/LOGO_kariadi.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 620, 170));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 520, 10));

        labelphp1.setFont(new java.awt.Font("Euphorigenic", 0, 24)); // NOI18N
        labelphp1.setText("Masker");
        jPanel2.add(labelphp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        labelphp2.setFont(new java.awt.Font("Euphorigenic", 0, 24)); // NOI18N
        labelphp2.setText("Hand Sanitizer");
        jPanel2.add(labelphp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        labelsarungtangan.setFont(new java.awt.Font("Times New Roman", 0, 50)); // NOI18N
        labelsarungtangan.setText("0");
        jPanel2.add(labelsarungtangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, -1, -1));

        btnphp1.setFont(new java.awt.Font("Euphorigenic", 0, 18)); // NOI18N
        btnphp1.setText("Ambil");
        btnphp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnphp1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnphp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, -1, -1));

        btnphp2.setFont(new java.awt.Font("Euphorigenic", 0, 18)); // NOI18N
        btnphp2.setText("Ambil");
        btnphp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnphp2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnphp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, -1));

        labelhs.setFont(new java.awt.Font("Times New Roman", 0, 50)); // NOI18N
        labelhs.setText("0");
        jPanel2.add(labelhs, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        percentapd.setBackground(new java.awt.Color(255, 255, 255));
        percentapd.setForeground(new java.awt.Color(204, 204, 255));
        percentapd.setStringPainted(true);
        jPanel2.add(percentapd, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, 30));

        percentmasker.setBackground(new java.awt.Color(255, 255, 255));
        percentmasker.setForeground(new java.awt.Color(255, 55, 55));
        percentmasker.setStringPainted(true);
        jPanel2.add(percentmasker, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, 30));

        percentsarungtangan.setBackground(new java.awt.Color(255, 255, 255));
        percentsarungtangan.setForeground(new java.awt.Color(153, 255, 204));
        percentsarungtangan.setStringPainted(true);
        jPanel2.add(percentsarungtangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, -1, 30));

        percenths.setBackground(new java.awt.Color(255, 255, 255));
        percenths.setForeground(new java.awt.Color(0, 102, 204));
        percenths.setStringPainted(true);
        jPanel2.add(percenths, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, -1, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnjavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjavaActionPerformed
       for (int counter =1; counter<=1; counter++){                      
                apd = ++apd;   
        }
    labelapd.setText(String.valueOf(apd));
    percentapd.setValue(apd);
    percentapd.setMaximum(100);
    }//GEN-LAST:event_btnjavaActionPerformed

    private void btnphpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnphpActionPerformed
        for (int counter =1; counter<=1; counter++){                      
                masker = ++masker;   
        }
    labelmasker.setText(String.valueOf(masker));
    percentmasker.setValue(masker);
    percentmasker.setMaximum(250);
    }//GEN-LAST:event_btnphpActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
       apd      =0;
       masker   =0;
       hs       =0;
       sarungtangan =0;
       
       labelmasker.setText(String.valueOf(masker));
       labelapd.setText(String.valueOf(apd));
       labelhs.setText(String.valueOf(hs));
       labelsarungtangan.setText(String.valueOf(sarungtangan));
       
       percentapd.setValue(0);
       percentmasker.setValue(0);
       percentsarungtangan.setValue(0);
       percenths.setValue(0);
       
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnphp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnphp1ActionPerformed
        for (int counter =1; counter<=1; counter++){                      
                sarungtangan = ++sarungtangan;   
        }
    labelsarungtangan.setText(String.valueOf(sarungtangan));
    percentsarungtangan.setValue(sarungtangan);
    percentsarungtangan.setMaximum(250);
    }//GEN-LAST:event_btnphp1ActionPerformed

    private void btnphp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnphp2ActionPerformed
        // TODO add your handling code here:
        for (int counter =1; counter<=1; counter++){                      
                hs = ++hs;   
        }
    labelhs.setText(String.valueOf(hs));
    percenths.setValue(hs);
    percenths.setMaximum(75);
    }//GEN-LAST:event_btnphp2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Progress().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnjava;
    private javax.swing.JButton btnphp;
    private javax.swing.JButton btnphp1;
    private javax.swing.JButton btnphp2;
    private javax.swing.JButton btnreset;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelapd;
    private javax.swing.JLabel labelhs;
    private javax.swing.JLabel labeljava;
    private javax.swing.JLabel labeljudul1;
    private javax.swing.JLabel labelmasker;
    private javax.swing.JLabel labelphp;
    private javax.swing.JLabel labelphp1;
    private javax.swing.JLabel labelphp2;
    private javax.swing.JLabel labelsarungtangan;
    private javax.swing.JProgressBar percentapd;
    private javax.swing.JProgressBar percenths;
    private javax.swing.JProgressBar percentmasker;
    private javax.swing.JProgressBar percentsarungtangan;
    // End of variables declaration//GEN-END:variables
}
