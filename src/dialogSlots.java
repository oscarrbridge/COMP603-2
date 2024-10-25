
import java.util.Random;

public class dialogSlots extends javax.swing.JDialog {

    frmGamesHome parent;
    int credits;
    int creditBet;

    public dialogSlots(frmGamesHome parent, int credits, int creditBet) {
        super(parent, true);
        initComponents();

        this.parent = parent;
        this.credits = credits;
        this.creditBet = creditBet;

        lblCurrentBet.setText("Your current bet is: " + creditBet);
        ChangeBalanceDisp();

        lblBalanceWarning.hide();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCreditsDisp = new javax.swing.JLabel();
        lblCurrentBet = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSpin = new javax.swing.JButton();
        lblRow1 = new javax.swing.JLabel();
        lblRow2 = new javax.swing.JLabel();
        lblRow3 = new javax.swing.JLabel();
        lblBalanceWarning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(198, 198, 198));

        lblCreditsDisp.setText("Credits");

        lblCurrentBet.setText("Bet");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCreditsDisp)
                    .addComponent(lblCurrentBet))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreditsDisp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCurrentBet)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(18, 51, 106));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        btnSpin.setText("Spin");
        btnSpin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSpinMousePressed(evt);
            }
        });

        lblRow1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        lblRow1.setForeground(new java.awt.Color(255, 255, 255));
        lblRow1.setText("-");

        lblRow2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        lblRow2.setForeground(new java.awt.Color(255, 255, 255));
        lblRow2.setText("-");

        lblRow3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        lblRow3.setForeground(new java.awt.Color(255, 255, 255));
        lblRow3.setText("-");

        lblBalanceWarning.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBalanceWarning.setForeground(new java.awt.Color(255, 0, 51));
        lblBalanceWarning.setText("Your balance is too low to make this bet");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(lblBalanceWarning)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblRow1)
                        .addGap(170, 170, 170)
                        .addComponent(lblRow2)
                        .addGap(170, 170, 170)
                        .addComponent(lblRow3)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSpin)
                        .addGap(218, 218, 218))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblBalanceWarning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRow1)
                    .addComponent(lblRow2)
                    .addComponent(lblRow3))
                .addGap(40, 40, 40)
                .addComponent(btnSpin)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSpinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSpinMousePressed
        if (CheckValidBet()) {
            Spin();

            if (CheckForWin()) {
                credits += (creditBet * 500);
            } else {
                credits -= creditBet;
            }

            ChangeBalanceDisp();
        } else
            lblBalanceWarning.show();
    }//GEN-LAST:event_btnSpinMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSpin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBalanceWarning;
    private javax.swing.JLabel lblCreditsDisp;
    private javax.swing.JLabel lblCurrentBet;
    private javax.swing.JLabel lblRow1;
    private javax.swing.JLabel lblRow2;
    private javax.swing.JLabel lblRow3;
    // End of variables declaration//GEN-END:variables

    private boolean CheckValidBet() {
        return creditBet <= credits;
    }

    private void Spin() {

        for (int i = 0; i < 6; i++) {
            lblRow1.setText(GetCharacter());
            lblRow2.setText(GetCharacter());
            lblRow3.setText(GetCharacter());
        }
    }

    private String GetCharacter() {
        String[] choices = {"🍒", "🍋", "🍇", "🍉", "🔔", "🍀", "💎", "⭐"};

        Random random = new Random();
        int i = random.nextInt(choices.length);

        return choices[i];
    }

    private boolean CheckForWin() {
        return lblRow1.getText().equals(lblRow2.getText()) && lblRow2.getText().equals(lblRow3.getText());
    }

    private void ChangeBalanceDisp() {
        lblCreditsDisp.setText("Your current balance: " + credits + "cr");
    }
    
    int GetNewBalance()
    {
        return credits;
    }
}
