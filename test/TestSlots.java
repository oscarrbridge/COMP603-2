
import org.junit.Test;
import static org.junit.Assert.*;

public class TestSlots {

    @Test
    public void testCheckValidBet_ValidBet() {
        //Check that bet will be accepeted if it is valid
        dialogSlots slots = new dialogSlots(100, 50);
        assertTrue("Bet should be valid", slots.CheckValidBet());
    }

    @Test
    public void testCheckValidBet_InvalidBet() {
        //Check that bet will be denied if it is invalid
        dialogSlots slots = new dialogSlots(100, 150);
        assertFalse("Bet should be invalid", slots.CheckValidBet());
    }

    @Test
    public void testCheckWin_Win() {
        //Check that win conditions accept correctly
        dialogSlots slots = new dialogSlots(1000, 100);

        slots.lblRow1.setText("🍒");
        slots.lblRow2.setText("🍒");
        slots.lblRow3.setText("🍒");

        assertTrue("Player should win", slots.CheckForWin());
    }

    @Test
    public void testCheckWin_Loss() {
        //Check that loss conditions accept correctly
        dialogSlots slots = new dialogSlots(1000, 100);

        slots.lblRow1.setText("🍒");
        slots.lblRow2.setText("🍇");
        slots.lblRow3.setText("🍒");

        assertFalse("Player should lose", slots.CheckForWin());
    }

}
