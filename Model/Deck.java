import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> Deck = new ArrayList<>(44);
    /**
     * A constructor that use some methods to initialize the deck of the cards. 
     */
    public Deck() {
        putcardsindeck();
        shuffleDeck();
    }
    /**
     * A accessor that put all the cards in the deck.
     * @pre The deck has to be empty.
     * @para The deck has all the cards we need.
     */
    public void putcardsindeck() {}
    /**
     * A accessor that shuffle the deck
     * @pre The deck has to be not null.
     * @para The deck is now shuffled.
     */

    public void shuffleDeck() {
        //Collections.shuffle(Deck);
    }

    /**
     * A accessor that "pulls" a card from the deck and returns it.
     * @pre The deck has to be not null.
     * @para One card has been pulled from the deck.
     * @return The card.
     */

    public Card pullAcard() {}
    /*     if (!Deck.isEmpty()) {
            Card pulledCard = Deck.remove(0);
            if(Deck.isEmpty()){
                putcardsindeck();
                shuffleDeck();
            }
            return pulledCard;
        }
        return null;*/
}