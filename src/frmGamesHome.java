
public class frmGamesHome extends javax.swing.JFrame {

    int id;
    String username;
    int credits;

    public frmGamesHome(int id, String username, int credits) {
        initComponents();

        this.id = id;
        this.username = username;
        this.credits = credits;

        SetUpPage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPlayingAs = new javax.swing.JLabel();
        lblCreditsDisp = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        btnBlackjack = new javax.swing.JButton();
        btnSlots = new javax.swing.JButton();
        btnRoulette = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPlayingAs.setText("Playing as: ");

        lblCreditsDisp.setText("Your current balance: ");

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

        btnBlackjack.setText("Blackjack");

        btnSlots.setText("Slots");

        btnRoulette.setText("Roulette");

        jLabel1.setText("Select A Game To Play");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuit)
                    .addComponent(lblPlayingAs)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCreditsDisp)
                            .addComponent(btnLogout))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnSlots, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRoulette, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnBlackjack, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblPlayingAs)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCreditsDisp)
                        .addGap(126, 126, 126)
                        .addComponent(btnLogout))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBlackjack)
                        .addGap(18, 18, 18)
                        .addComponent(btnSlots)
                        .addGap(18, 18, 18)
                        .addComponent(btnRoulette)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuit)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        //close this window and re open login screen
        frmLogin login = new frmLogin();
        login.show();
        this.hide();
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnQuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitMouseClicked
        //quit the entire program
        System.exit(0);
    }//GEN-LAST:event_btnQuitMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBlackjack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnRoulette;
    private javax.swing.JButton btnSlots;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCreditsDisp;
    private javax.swing.JLabel lblPlayingAs;
    // End of variables declaration//GEN-END:variables

    private void SetUpPage() {
        lblPlayingAs.setText("Playing as: " + username);
        ChangeBalanceDisp();
    }

    private void ChangeBalanceDisp() {
        lblCreditsDisp.setText("Your current balance: " + credits + "cr");
    }

}
