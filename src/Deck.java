
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

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }

        Collections.shuffle(cards);
    }

    public Card dealCard() {
        if (!cards.isEmpty()) {
            return this.cards.remove(0);

        }
        return null;
    }
}
