package votingconstitutionalmonarchy;

import java.lang.String;

public class GameGUI extends javax.swing.JFrame {

    public void guiGen(){
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        dateLbl = new javax.swing.JLabel();
        eventLbl = new javax.swing.JLabel();
        yBtn = new javax.swing.JButton();
        nBtn = new javax.swing.JButton();
        scoreLbl = new javax.swing.JLabel();
        descLbl = new javax.swing.JLabel();
        roundsLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dateLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateLbl.setText("Dátum");

        eventLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eventLbl.setText("Event");

        yBtn.setText("Áno");
        yBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yBtnActionPerformed(evt);
            }
        });

        nBtn.setText("Nie");

        scoreLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLbl.setText("Počet prežitých dní:");

        descLbl.setText("Opis situácie");
        descLbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        roundsLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roundsLbl.setText("Počet kôl do volieb:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dateLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(yBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(nBtn)
                .addGap(90, 90, 90))
            .addComponent(roundsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scoreLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(eventLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(descLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dateLbl)
                .addGap(18, 18, 18)
                .addComponent(eventLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nBtn)
                    .addComponent(yBtn))
                .addGap(18, 18, 18)
                .addComponent(roundsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scoreLbl)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yBtnActionPerformed
        
    }//GEN-LAST:event_yBtnActionPerformed
    
    public void startGame(int startRounds){
        dateLbl.setText("10.10.2004");
        scoreLbl.setText("Dĺžka tvojej vlády: 0 dní");
        yBtn.setText("Začať");
        nBtn.setText("Začať");
        descLbl.setText("Tvoja vláda sa začína. Snaž sa zostať pri moci čo najdlhšie.");
        String text = "Počet kôl do volieb: " + startRounds;
        roundsLbl.setText(text);
    }
        
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateLbl;
    private javax.swing.JLabel descLbl;
    private javax.swing.JLabel eventLbl;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton nBtn;
    private javax.swing.JLabel roundsLbl;
    private javax.swing.JLabel scoreLbl;
    private javax.swing.JButton yBtn;
    // End of variables declaration//GEN-END:variables
}
