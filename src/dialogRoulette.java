
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class dialogRoulette extends javax.swing.JDialog {

    frmGamesHome parent;
    
    Wheel wheel = new Wheel();
    ArrayList board = wheel.board();

    public dialogRoulette(frmGamesHome parent) {
        super(parent, true);
        initComponents();

        this.parent = parent;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnOptionOneMousePressed(java.awt.event.MouseEvent evt)
    {
        
    }
    
    private void btnOptionTwoMousePressed(java.awt.event.MouseEvent evt)
    {
        
    }
    
    private void btnOptionThreeMousePressed(java.awt.event.MouseEvent evt)
    {
        
    }
    
    private void btnOptionFourMousePressed(java.awt.event.MouseEvent evt)
    {
        
    }
    
    private void btnOptionFiveMousePressed(java.awt.event.MouseEvent evt)
    {
        
    }
    
    private void btnOptionSixMousePressed(java.awt.event.MouseEvent evt)
    {
        
    }
    
    private void btnOptionSevenMousePressed(java.awt.event.MouseEvent evt)
    {
        
    }
    
    private void btnSpinWheel(java.awt.event.MouseEvent evt)
    {
        
    }
    
   private void btnExitMousePressed(java.awt.event.MouseEvent evt) {                                     
        this.hide();
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

   private int spinResult()
   {
       return wheel.Spin();
   }
   
   private String wheelColour(int spin) throws IOException
   {
       String colour = "";

        FileReader Fr;
        try {
            Fr = new FileReader("resources/RouletteColours.txt");
            BufferedReader Br = new BufferedReader(Fr);

        for(int k = 0; k<spin-1; k++)
        {
            colour = Br.readLine();
        }
        Br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(dialogRoulette.class.getName()).log(Level.SEVERE, null, ex);
        }
        return colour;
   }
}
