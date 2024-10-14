
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

        lblRow1 = new javax.swing.JLabel();
        lblRow2 = new javax.swing.JLabel();
        lblRow3 = new javax.swing.JLabel();
        btnSpin = new javax.swing.JButton();
        lblCreditsDisp = new javax.swing.JLabel();
        lblCurrentBet = new javax.swing.JLabel();
        lblBalanceWarning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblRow1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        lblRow1.setText("-");

        lblRow2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        lblRow2.setText("-");

        lblRow3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        lblRow3.setText("-");

        btnSpin.setText("Spin");
        btnSpin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSpinMousePressed(evt);
            }
        });

        lblCreditsDisp.setText("Credits");

        lblCurrentBet.setText("Bet");

        lblBalanceWarning.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBalanceWarning.setForeground(new java.awt.Color(255, 0, 51));
        lblBalanceWarning.setText("Your balance is too low to make this bet");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRow1)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lblRow2)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lblRow3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCreditsDisp))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCurrentBet))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(btnSpin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(lblBalanceWarning)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreditsDisp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCurrentBet)
                .addGap(27, 27, 27)
                .addComponent(lblBalanceWarning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRow1)
                    .addComponent(lblRow2)
                    .addComponent(lblRow3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnSpin)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSpinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSpinMousePressed
        if (CheckValidBet()) {
            Spin();

            if (CheckForWin()) {
                credits += (creditBet * 2);
            } else {
                credits -= creditBet;
            }

            ChangeBalanceDisp();
        } else
            lblBalanceWarning.show();
    }//GEN-LAST:event_btnSpinMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSpin;
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
