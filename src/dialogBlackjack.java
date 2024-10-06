
import java.util.ArrayList;
import java.util.List;

public class dialogBlackjack extends javax.swing.JDialog {

    frmGamesHome parent;

    Deck deck = new Deck();

    List<Card> playersHand = new ArrayList<>();
    List<Card> dealersHand = new ArrayList<>();

    int playerSum = 0;
    int dealerSum = 0;

    boolean status = false;

    public dialogBlackjack(frmGamesHome parent) {
        super(parent, true);
        initComponents();

        this.parent = parent;

        lblStatus.hide();
        btnExit.hide();

        StartGame();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPlayerTotal = new javax.swing.JLabel();
        btnHit = new javax.swing.JButton();
        btnStand = new javax.swing.JButton();
        lblDealerTotal = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblPlayerTotal.setText("Your Total: ");

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

        lblDealerTotal.setText("Dealer Total: ");

        lblStatus.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 0, 0));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("You Lost!");

        btnExit.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblStatus)
                .addGap(122, 122, 122))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(lblPlayerTotal)
                        .addGap(107, 107, 107)
                        .addComponent(lblDealerTotal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnHit)
                        .addGap(52, 52, 52)
                        .addComponent(btnStand))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(lblStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHit)
                    .addComponent(btnStand))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlayerTotal)
                    .addComponent(lblDealerTotal))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHitMousePressed
        playersHand.add(deck.dealCard());

        playerSum = HandSum(playersHand);

        UpdateTotals(playerSum, dealerSum);

        if (playerSum > 21) {
            GoBust();
        }
    }//GEN-LAST:event_btnHitMousePressed

    private void btnStandMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStandMousePressed
        while (dealerSum < 21) {
            dealersHand.add(deck.dealCard());

            dealerSum = HandSum(dealersHand);

            UpdateTotals(playerSum, dealerSum);

            //sleep here
            if (dealerSum > playerSum && dealerSum <= 21) {
                DealerWin();
                return;
            }
        }
        WinGame();
    }//GEN-LAST:event_btnStandMousePressed

    private void btnExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMousePressed
        this.hide();
    }//GEN-LAST:event_btnExitMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHit;
    private javax.swing.JButton btnStand;
    private javax.swing.JLabel lblDealerTotal;
    private javax.swing.JLabel lblPlayerTotal;
    private javax.swing.JLabel lblStatus;
    // End of variables declaration//GEN-END:variables

    private void StartGame() {

        playersHand.add(deck.dealCard());
        playersHand.add(deck.dealCard());

        playerSum = HandSum(playersHand);

        UpdateTotals(playerSum, dealerSum);

    }

    private void DealerWin() {
        btnHit.hide();
        btnStand.hide();

        lblStatus.setText("The House Wins!");

        lblStatus.show();
        btnExit.show();
    }

    private void WinGame() {
        btnHit.hide();
        btnStand.hide();

        lblStatus.setText("You Won!");

        lblStatus.show();
        btnExit.show();
        
        status = true;
    }

    private void GoBust() {
        btnHit.hide();
        btnStand.hide();
        lblDealerTotal.hide();

        lblStatus.setText("You went bust!");

        lblStatus.show();
        btnExit.show();

    }

    private void UpdateTotals(int player, int dealer) {
        lblPlayerTotal.setText("Your Total: " + player);
        lblDealerTotal.setText("Dealer Total: " + dealer);

    }

    private int HandSum(List<Card> hand) {

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
        return status;
    }
}
