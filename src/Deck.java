
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    List<Card> cards;

    Deck() {
        cards = new ArrayList<>();

        // List of all suits
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // List of all ranks
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        //Cerate a card using each suit and each rank
        for (String suit : suits) {
            for (String rank : ranks) {
                //Add each card to the deck
                cards.add(new Card(suit, rank));
            }
        }

        //Shuffle the deck
        Collections.shuffle(cards);
    }

    public Card dealCard() {
        //Check that the deck is not empty
        if (!cards.isEmpty()) {
            //Return the top card and remove it from the deck
            return this.cards.remove(0);
        }
        return null;
    }
}
