
import org.junit.Test;
import static org.junit.Assert.*;

public class TestBlackjack {

    @Test
    public void testGetStatus_PlayerWin() {
        //Check that bet will be accepeted if it is valid
        dialogBlackjack blackjack = new dialogBlackjack();

        blackjack.WinGame();

        assertTrue("Player Should Win", blackjack.GetStatus());
    }

    @Test
    public void testGetStatus_PlayerBust() {
        //Check that bet will be accepeted if it is valid
        dialogBlackjack blackjack = new dialogBlackjack();

        blackjack.GoBust();

        assertFalse("Player Should Lose", blackjack.GetStatus());
    }

    @Test
    public void testGetStatus_DealerWin() {
        //Check that bet will be accepeted if it is valid
        dialogBlackjack blackjack = new dialogBlackjack();

        blackjack.DealerWin();

        assertFalse("Player Should Lose", blackjack.GetStatus());
    }
}
