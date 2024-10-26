
import java.util.ArrayList;
import java.util.List;

public class dialogBlackjack extends javax.swing.JDialog {

    Deck deck = new Deck();

    //Create an empty hand for the player
    List<Card> playersHand = new ArrayList<>();
    //Create an empty hand for the dealer
    List<Card> dealersHand = new ArrayList<>();

    //Sum of the players hand
    int playerSum = 0;
    //Sum of the dealers hand
    int dealerSum = 0;

    //Player win status
    boolean status = false;

    public dialogBlackjack() {
        initComponents();

        setModal(true);

        lblStatus.hide();
        btnExit.hide();

        StartGame();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblPlayerTotal = new javax.swing.JLabel();
        lblDealerTotal = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnHit = new javax.swing.JButton();
        btnStand = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(198, 198, 198));

        lblStatus.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 0, 0));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("You Lost!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStatus)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(18, 51, 106));

        lblPlayerTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerTotal.setText("Your Total: ");

        lblDealerTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblDealerTotal.setText("Dealer Total: ");

        btnExit.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExitMousePressed(evt);
            }
        });

        btnHit.setText("Hit");
        btnHit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHitMousePressed(evt);
            }
        });

        btnStand.setText("Stand");
        btnStand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnStandMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblPlayerTotal)
                        .addGap(107, 107, 107)
                        .addComponent(lblDealerTotal))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnHit)
                        .addGap(73, 73, 73)
                        .addComponent(btnStand)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHit)
                    .addComponent(btnStand))
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlayerTotal)
                    .addComponent(lblDealerTotal))
                .addGap(14, 14, 14))
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
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHitMousePressed
        //Deal the player a card
        playersHand.add(deck.dealCard());

        playerSum = HandSum(playersHand);

        UpdateTotals(playerSum, dealerSum);

        //Check the players sum
        if (playerSum > 21) {
            GoBust();
        }
    }//GEN-LAST:event_btnHitMousePressed

    private void btnStandMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStandMousePressed
        //Start dealing the dealers cards
        while (dealerSum < 21) {
            dealersHand.add(deck.dealCard());

            dealerSum = HandSum(dealersHand);

            UpdateTotals(playerSum, dealerSum);

            if (dealerSum > playerSum && dealerSum <= 21) {
                DealerWin();
                return;
            }
        }
        WinGame();
    }//GEN-LAST:event_btnStandMousePressed

    private void btnExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMousePressed
        //Exit blackjack
        this.hide();
    }//GEN-LAST:event_btnExitMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHit;
    private javax.swing.JButton btnStand;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDealerTotal;
    private javax.swing.JLabel lblPlayerTotal;
    private javax.swing.JLabel lblStatus;
    // End of variables declaration//GEN-END:variables

    private void StartGame() {

        //Add two cards to the players hand to start the game
        playersHand.add(deck.dealCard());
        playersHand.add(deck.dealCard());

        playerSum = HandSum(playersHand);

        UpdateTotals(playerSum, dealerSum);

    }

    public void DealerWin() {
        //Dealer won
        btnHit.hide();
        btnStand.hide();

        lblStatus.setText("The House Wins!");

        lblStatus.show();
        btnExit.show();
    }

    public void WinGame() {
        //Player won
        btnHit.hide();
        btnStand.hide();

        lblStatus.setText("You Won!");

        lblStatus.show();
        btnExit.show();

        status = true;
    }

    public void GoBust() {
        //Player goes bust
        btnHit.hide();
        btnStand.hide();
        lblDealerTotal.hide();

        lblStatus.setText("You went bust!");

        lblStatus.show();
        btnExit.show();

    }

    private void UpdateTotals(int player, int dealer) {
        //Update the players hand total
        lblPlayerTotal.setText("Your Total: " + player);
        //Update the dealers hand total
        lblDealerTotal.setText("Dealer Total: " + dealer);

    }

    private int HandSum(List<Card> hand) {
        //Count the sum of the hand given

        int handVal = 0;
        int rankVal;

        for (Card card : hand) {
            try {
                rankVal = Integer.parseInt(card.rank);
            } catch (Exception ex) {
                rankVal = 10;
            }
            handVal += rankVal;
        }
        return handVal;
    }

    boolean GetStatus() {
        //Return if the player has won
        return status;
    }
}
