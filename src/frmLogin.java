
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class frmLogin extends javax.swing.JFrame {
    
    int id;
    String username;
    String password;
    int credits;
    
    public frmLogin() {
        initComponents();
        
        lblPasswordDisp.setVisible(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        lblPasswordDisp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtUsername.setToolTipText("");

        txtPassword.setToolTipText("");

        lblUsername.setText("Username:");

        lblPassword.setText("Password:");

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Welcome to the casino");

        btnLogin.setText("Login");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });

        btnSignUp.setText("Sign Up");
        btnSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignUpMouseClicked(evt);
            }
        });

        lblPasswordDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPasswordDisp.setText("Login info does not match");
        lblPasswordDisp.setName(""); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsername)
                            .addComponent(lblPassword))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(lblPasswordDisp))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnSignUp)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnLogin))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitle)
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnSignUp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPasswordDisp)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        
        if (CheckForUsername()) {
            GetLoginInfo();
        }
        
        if (!CheckLoginInfo()) {
            lblPasswordDisp.setVisible(true);
        }
        else{
            frmGamesHome games = new frmGamesHome(id, username, credits);
            games.show();
            this.hide();
        }

    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseClicked
        if (CheckForUsername()) {
            JOptionPane.showMessageDialog(null, "Username Already Exists!", "Error", JOptionPane.OK_OPTION);
        } else {
            CreateNewUser();
        }
    }//GEN-LAST:event_btnSignUpMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPasswordDisp;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private boolean CheckLoginInfo() {
        return txtPassword.getText().equals(password);
    }
    
    private void GetLoginInfo() {
        Databases data = new Databases();
        
        String query = "SELECT ID, PASSWORD, CREDITS FROM USERS WHERE USERNAME = '" + username + "'";
        
        ResultSet result = data.GenPull(query);
        
        try {
            if (result.next()) {
                id = result.getInt("ID");
                password = result.getString("PASSWORD");
                credits = result.getInt("CREDITS");
            } else {
                System.out.println("User does not exist");
            }
        } catch (Exception ex) {
            System.out.println("Error setting user info");
        }
        
        data.CloseConnection();
    }
    
    private boolean CheckForUsername() {
        Databases data = new Databases();
        
        String username_ = txtUsername.getText();
        
        String query = "SELECT USERNAME FROM USERS WHERE USERNAME = '" + username_ + "'";
        
        ResultSet result = data.GenPull(query);
        
        try {
            if (result.next()) {
                data.CloseConnection();
                username = username_;
                return true;
            } else {
                data.CloseConnection();
                return false;
            }
        } catch (Exception ex) {
            data.CloseConnection();
            return false;
        }
    }
    
    private void CreateNewUser() {
        Databases data = new Databases();
        
        String query = "INSERT INTO USERS (USERNAME, PASSWORD, CREDITS) "
                + "VALUES ('" + txtUsername.getText() + "', '" + txtPassword.getText() + "', 1000)";
        
        boolean comp = data.GenPush(query);
        data.CloseConnection();
        
        if (comp) {
            JOptionPane.showMessageDialog(null, "User has been created, You can now login", "Complete", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
