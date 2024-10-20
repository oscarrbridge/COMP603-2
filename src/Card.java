
public class Card {

    String suit;
    String rank;

    Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        //Return a formatted string of the cards rank and suit
        return this.rank + "of" + this.suit;
    }
}
