
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dialogRoulette extends javax.swing.JDialog {

    Wheel wheel = new Wheel();
    ArrayList board = wheel.board();
    int n;
    String s;

    boolean status = false;

    public dialogRoulette() {
        initComponents();

        setModal(true);

        ExitSelected.hide();
        ResultText.hide();
        NumberText.hide();
        ColourText.hide();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FirstThirdSelected = new javax.swing.JButton();
        SecondThirdSelected = new javax.swing.JButton();
        ThirdThirdSelected = new javax.swing.JButton();
        BlacksSelected = new javax.swing.JButton();
        RedsSelected = new javax.swing.JButton();
        FirstHalfSelected = new javax.swing.JButton();
        SecondHalfSelected = new javax.swing.JButton();
        QuitSelected = new javax.swing.JButton();
        ExitSelected = new javax.swing.JButton();
        ResultText = new javax.swing.JLabel();
        NumberText = new javax.swing.JLabel();
        ColourText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        FirstThirdSelected.setText("1-12");
        FirstThirdSelected.setBounds(new java.awt.Rectangle(-32699, -32543, 80, 25));
        FirstThirdSelected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FirstThirdSelectedMousePressed(evt);
            }
        });

        SecondThirdSelected.setText("13-24");
        SecondThirdSelected.setLocation(new java.awt.Point(-32610, -32542));
        SecondThirdSelected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SecondThirdSelectedMousePressed(evt);
            }
        });

        ThirdThirdSelected.setText("25-36");
        ThirdThirdSelected.setBounds(new java.awt.Rectangle(-32531, -32542, 80, 25));
        ThirdThirdSelected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ThirdThirdSelectedMousePressed(evt);
            }
        });

        BlacksSelected.setText("Blacks");
        BlacksSelected.setBounds(new java.awt.Rectangle(-32749, -32507, 80, 25));
        BlacksSelected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BlacksSelectedMousePressed(evt);
            }
        });

        RedsSelected.setText("Reds");
        RedsSelected.setBounds(new java.awt.Rectangle(-32653, -32507, 80, 25));
        RedsSelected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RedsSelectedMousePressed(evt);
            }
        });

        FirstHalfSelected.setText("1-18");
        FirstHalfSelected.setBounds(new java.awt.Rectangle(-32557, -32507, 80, 25));
        FirstHalfSelected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FirstHalfSelectedMousePressed(evt);
            }
        });

        SecondHalfSelected.setText("19-36");
        SecondHalfSelected.setBounds(new java.awt.Rectangle(-32461, -32507, 80, 25));
        SecondHalfSelected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SecondHalfSelectedMousePressed(evt);
            }
        });

        QuitSelected.setText("Quit");
        QuitSelected.setBounds(new java.awt.Rectangle(-32749, -32749, 80, 25));
        QuitSelected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                QuitSelectedMousePressed(evt);
            }
        });

        ExitSelected.setText("Exit");
        ExitSelected.setBounds(new java.awt.Rectangle(-32617, -32581, 80, 25));
        ExitSelected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitSelectedMousePressed(evt);
            }
        });

        ResultText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ResultText.setText("ResultText");

        NumberText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumberText.setText("NumberText");

        ColourText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ColourText.setText("ColourText");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(FirstThirdSelected)
                        .addGap(30, 30, 30)
                        .addComponent(SecondThirdSelected)
                        .addGap(31, 31, 31)
                        .addComponent(ThirdThirdSelected))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BlacksSelected)
                                .addGap(29, 29, 29)
                                .addComponent(RedsSelected)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(FirstHalfSelected)
                                .addGap(29, 29, 29)
                                .addComponent(SecondHalfSelected))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(QuitSelected)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ExitSelected))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(NumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ColourText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(ResultText, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuitSelected)
                    .addComponent(ExitSelected))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(ResultText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ColourText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ThirdThirdSelected)
                    .addComponent(SecondThirdSelected)
                    .addComponent(FirstThirdSelected))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BlacksSelected)
                    .addComponent(RedsSelected)
                    .addComponent(FirstHalfSelected)
                    .addComponent(SecondHalfSelected))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FirstThirdSelectedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstThirdSelectedMousePressed
        wheel.betMultiplier = 3;
        // TODO add your handling code here:
        n = spinResult();
        try {
            s = wheelColour(n);
        } catch (IOException ex) {
            Logger.getLogger(dialogRoulette.class.getName()).log(Level.SEVERE, null, ex);
        }
        if ((n > 0) && (n < 12)) {
            rouletteWin();
        } else {
            rouletteLose();
        }
    }//GEN-LAST:event_FirstThirdSelectedMousePressed

    private void SecondThirdSelectedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecondThirdSelectedMousePressed
        wheel.betMultiplier = 3;
        // TODO add your handling code here:
        n = spinResult();
        try {
            s = wheelColour(n);
        } catch (IOException ex) {
            Logger.getLogger(dialogRoulette.class.getName()).log(Level.SEVERE, null, ex);
        }
        if ((n > 12) && (n <= 24)) {
            rouletteWin();
        } else {
            rouletteLose();
        }
    }//GEN-LAST:event_SecondThirdSelectedMousePressed

    private void ThirdThirdSelectedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThirdThirdSelectedMousePressed
        wheel.betMultiplier = 3;
        // TODO add your handling code here:
        n = spinResult();
        try {
            s = wheelColour(n);
        } catch (IOException ex) {
            Logger.getLogger(dialogRoulette.class.getName()).log(Level.SEVERE, null, ex);
        }
        if ((n > 24) && (n <= 36)) {
            rouletteWin();
        } else {
            rouletteLose();
        }
    }//GEN-LAST:event_ThirdThirdSelectedMousePressed

    private void BlacksSelectedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BlacksSelectedMousePressed
        wheel.betMultiplier = 2;
        // TODO add your handling code here:
        n = spinResult();
        try {
            s = wheelColour(n);
        } catch (IOException ex) {
            Logger.getLogger(dialogRoulette.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (s.equals("Black")) {
            rouletteWin();
        } else {
            rouletteLose();
        }
    }//GEN-LAST:event_BlacksSelectedMousePressed

    private void RedsSelectedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RedsSelectedMousePressed
        wheel.betMultiplier = 2;
        // TODO add your handling code here:
        n = spinResult();
        try {
            s = wheelColour(n);
        } catch (IOException ex) {
            Logger.getLogger(dialogRoulette.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (s.equals("Red")) {
            rouletteWin();
        } else {
            rouletteLose();
        }
    }//GEN-LAST:event_RedsSelectedMousePressed

    private void FirstHalfSelectedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstHalfSelectedMousePressed
        wheel.betMultiplier = 2;
        // TODO add your handling code here:
        n = spinResult();
        try {
            s = wheelColour(n);
        } catch (IOException ex) {
            Logger.getLogger(dialogRoulette.class.getName()).log(Level.SEVERE, null, ex);
        }
        if ((n > 0) && (n <= 18)) {
            rouletteWin();
        } else {
            rouletteLose();
        }
    }//GEN-LAST:event_FirstHalfSelectedMousePressed

    private void SecondHalfSelectedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecondHalfSelectedMousePressed
        wheel.betMultiplier = 2;
        // TODO add your handling code here:
        n = spinResult();
        try {
            s = wheelColour(n);
        } catch (IOException ex) {
            Logger.getLogger(dialogRoulette.class.getName()).log(Level.SEVERE, null, ex);
        }
        if ((n > 18) && (n <= 36)) {
            rouletteWin();
        } else {
            rouletteLose();
        }
    }//GEN-LAST:event_SecondHalfSelectedMousePressed

    private void QuitSelectedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuitSelectedMousePressed

        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_QuitSelectedMousePressed

    private void ExitSelectedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitSelectedMousePressed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_ExitSelectedMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BlacksSelected;
    private javax.swing.JLabel ColourText;
    private javax.swing.JButton ExitSelected;
    private javax.swing.JButton FirstHalfSelected;
    private javax.swing.JButton FirstThirdSelected;
    private javax.swing.JLabel NumberText;
    private javax.swing.JButton QuitSelected;
    private javax.swing.JButton RedsSelected;
    private javax.swing.JLabel ResultText;
    private javax.swing.JButton SecondHalfSelected;
    private javax.swing.JButton SecondThirdSelected;
    private javax.swing.JButton ThirdThirdSelected;
    // End of variables declaration//GEN-END:variables

    private int spinResult() {
        return wheel.Spin();
    }

    private String wheelColour(int spin) throws IOException {
        String colour = "";

        FileReader Fr;
        try {
            Fr = new FileReader("resources/RouletteColours.txt");
            BufferedReader Br = new BufferedReader(Fr);

            for (int k = 0; k < spin - 1; k++) {
                colour = Br.readLine();
            }
            Br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(dialogRoulette.class.getName()).log(Level.SEVERE, null, ex);
        }
        return colour;
    }

    private void rouletteWin() {
        FirstThirdSelected.hide();
        SecondThirdSelected.hide();
        ThirdThirdSelected.hide();
        BlacksSelected.hide();
        RedsSelected.hide();
        FirstHalfSelected.hide();
        SecondHalfSelected.hide();

        ExitSelected.show();
        ResultText.show();
        NumberText.show();
        ColourText.show();

        ResultText.setText("You Win!");
        NumberText.setText("Number Spun: " + n);
        ColourText.setText("Colour Spun: " + s);

        status = true;
    }

    private void rouletteLose() {
        FirstThirdSelected.hide();
        SecondThirdSelected.hide();
        ThirdThirdSelected.hide();
        BlacksSelected.hide();
        RedsSelected.hide();
        FirstHalfSelected.hide();
        SecondHalfSelected.hide();

        ExitSelected.show();
        ResultText.show();
        NumberText.show();
        ColourText.show();

        ResultText.setText("You Lose!");
        NumberText.setText("Number Spun: " + n);
        ColourText.setText("Colour Spun: " + s);
    }

    boolean GetStatus() {
        return status;
    }

    int GetMultiplier() {
        return wheel.betMultiplier;
    }
}
