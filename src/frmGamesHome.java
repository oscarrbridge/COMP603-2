
public class frmGamesHome extends javax.swing.JFrame {

    int id;
    String username;
    int credits;

    int creditBet = 0;
    
    Logger log;

    public frmGamesHome(int id, String username, int credits) {
        initComponents();

        this.id = id;
        this.username = username;
        this.credits = credits;

        SetUpPage();

        log = new Logger(id);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCreditsDisp = new javax.swing.JLabel();
        lblPlayingAs = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBlackjack = new javax.swing.JButton();
        btnSlots = new javax.swing.JButton();
        btnRoulette = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        btnViewLog = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(750, 400));

        jPanel1.setBackground(new java.awt.Color(198, 198, 198));

        lblCreditsDisp.setFont(new java.awt.Font("Barlow", 1, 14)); // NOI18N
        lblCreditsDisp.setText("Your current balance: ");

        lblPlayingAs.setFont(new java.awt.Font("Barlow", 1, 14)); // NOI18N
        lblPlayingAs.setText("Playing as: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPlayingAs)
                    .addComponent(lblCreditsDisp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(lblPlayingAs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCreditsDisp)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(18, 51, 106));

        jLabel1.setFont(new java.awt.Font("Barlow", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select A Game To Play");

        btnBlackjack.setText("Blackjack");
        btnBlackjack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBlackjackMouseClicked(evt);
            }
        });

        btnSlots.setText("Slots");
        btnSlots.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSlotsMousePressed(evt);
            }
        });

        btnRoulette.setText("Roulette");
        btnRoulette.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRouletteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRoulette, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnBlackjack, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(btnSlots, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBlackjack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSlots)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRoulette)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(198, 198, 198));

        btnLogout.setText("Logout");
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });

        btnQuit.setText("Quit");
        btnQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuitMouseClicked(evt);
            }
        });

        btnViewLog.setText("View Log");
        btnViewLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewLogMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnLogout)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnQuit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewLog)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuit)
                    .addComponent(btnViewLog))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        //close this window and re open login screen
        log.AddLog("User Logged Out");

        UpdateDatabaseCredits();

        frmLogin login = new frmLogin();
        login.show();
        this.hide();
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnQuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitMouseClicked
        log.AddLog("User Quit The App");

        UpdateDatabaseCredits();

        //quit the entire program
        System.exit(0);
    }//GEN-LAST:event_btnQuitMouseClicked

    private void btnBlackjackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBlackjackMouseClicked
        //play blackjack
        log.AddLog("User Started Blackjack");

        if (PlaceBet()) {
            dialogBlackjack blackjack = new dialogBlackjack(this);
            blackjack.setVisible(true);

            ChangeCreditsBlackjack(blackjack.GetStatus());
        }
        ChangeBalanceDisp();
    }//GEN-LAST:event_btnBlackjackMouseClicked

    private void btnRouletteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRouletteMouseClicked
        //play roulette
        log.AddLog("User Started Roulette");
        if (PlaceBet()) {
            dialogRoulette roulette = new dialogRoulette(this);
            roulette.setVisible(true);

            ChangeCreditsRoulette(roulette.GetStatus(), roulette.GetMultiplier());
        }
        ChangeBalanceDisp();

    }//GEN-LAST:event_btnRouletteMouseClicked

    private void btnSlotsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSlotsMousePressed
        //play slots
        log.AddLog("User Started Slots");

        if (PlaceBet()) {
            dialogSlots slots = new dialogSlots(this, credits, creditBet);
            slots.setVisible(true);

            credits = slots.GetNewBalance();
        }

        ChangeBalanceDisp();
    }//GEN-LAST:event_btnSlotsMousePressed

    private void btnViewLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewLogMouseClicked
        dialogViewLog view = new dialogViewLog(id);
        view.show();
    }//GEN-LAST:event_btnViewLogMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBlackjack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnRoulette;
    private javax.swing.JButton btnSlots;
    private javax.swing.JButton btnViewLog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCreditsDisp;
    private javax.swing.JLabel lblPlayingAs;
    // End of variables declaration//GEN-END:variables

    private void UpdateDatabaseCredits() {
        Databases data = new Databases();

        String query = "UPDATE USERS"
                + " SET CREDITS = " + credits
                + " WHERE ID = " + id;

        data.GenPush(query);
    }

    private void SetUpPage() {
        lblPlayingAs.setText("Playing as: " + username);
        ChangeBalanceDisp();
    }

    private void ChangeBalanceDisp() {
        lblCreditsDisp.setText("Your current balance: " + credits + "cr");
    }

    private boolean PlaceBet() {
        dialogBet bet = new dialogBet(username, credits, this);
        bet.setVisible(true);

        if (bet.CheckBetPlaced()) {
            creditBet = bet.GetBet();
            return true;
        }
        return false;
    }

    private void ChangeCreditsBlackjack(boolean status) {
        if (status) {
            credits += (creditBet * 2);
        } else {
            credits -= creditBet;
        }
    }

    private void ChangeCreditsRoulette(boolean status, int multiplier) {
        if (status) {
            credits += (creditBet * multiplier);
        } else {
            credits -= creditBet;
        }
    }
}
