
public class dialogBet extends javax.swing.JDialog {

    String username;
    int credits;

    frmGamesHome parent;

    boolean canBet = false;
    int bet;

    public dialogBet(String username, int credits, frmGamesHome parent) {
        super(parent, true);

        initComponents();

        this.username = username;
        this.credits = credits;

        this.parent = parent;

        SetUpPage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPlayingAs = new javax.swing.JLabel();
        lblCreditsDisp = new javax.swing.JLabel();
        lblBet = new javax.swing.JLabel();
        txtBet = new javax.swing.JTextField();
        btnBet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblPlayingAs.setText("Playing as: ");

        lblCreditsDisp.setText("Your current balance: ");

        lblBet.setText("Place your bet");

        txtBet.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBetKeyTyped(evt);
            }
        });

        btnBet.setText("Place Bet");
        btnBet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBetMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPlayingAs)
                            .addComponent(lblCreditsDisp))
                        .addContainerGap(278, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 155, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnBet))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblBet)
                                    .addGap(152, 152, 152))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(txtBet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(139, 139, 139)))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPlayingAs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCreditsDisp)
                .addGap(37, 37, 37)
                .addComponent(lblBet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnBet)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBetKeyTyped
        //check that the value entered is an int

        char input = evt.getKeyChar();
        if (!Character.isDigit(input)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtBetKeyTyped

    private void btnBetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBetMousePressed
        //try to place the bet
        int intBet = Integer.parseInt(txtBet.getText());

        boolean valid = CheckForValidBet(intBet);

        if (valid) {
            canBet = true;
            bet = intBet;

            parent.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnBetMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBet;
    private javax.swing.JLabel lblBet;
    private javax.swing.JLabel lblCreditsDisp;
    private javax.swing.JLabel lblPlayingAs;
    private javax.swing.JTextField txtBet;
    // End of variables declaration//GEN-END:variables

    private void SetUpPage() {
        parent.setVisible(false);

        lblPlayingAs.setText("Playing as: " + username);
        ChangeBalanceDisp();
    }

    private void ChangeBalanceDisp() {
        lblCreditsDisp.setText("Your current balance: " + credits + "cr");
    }

    private boolean CheckForValidBet(int bet) {
        return credits >= bet;
    }

    public boolean CheckBetPlaced() {
        return canBet;
    }

    public int GetBet() {
        return bet;
    }

}
