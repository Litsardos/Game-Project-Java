public class Controller {
    

    Board board;

    View view;

    Player player1;
    Player player2;


    /**
     * A transformer that initialize the board,the players and the view.
     */
    public void initialize(){}
    /**
     * A transformer that will set the listeners like buttons to interact with the game.
     * @pre The buttons and the other listeners have to be initialized already.
     * @post We have out listeners ready.
     */
    public void setListeners(){}
    /**
     * A transformer that will draw a card when the player click on the deck of cards.
     * @pre The deck should have at least one card.
     * @pre The deck should be a button and not just an image.
     * @post The card that was picked will open next to the deck.
     */
    private void handlePlayerdrawCardClick(){}
    /**
     * A transformer that will fold player's turn.
     * @pre The player need to has the right to fold.
     * @pre The player need to has drawn a card.
     * @post The player give the turn to the next player.
     */
    private void handleFoldButtonClick(){}
    /**
     * A observer that check if a player can play the card that he drew.
     * @pre The player need to has drawn a card.
     * @return A boolean that represents if the player can play the card or not.
     */
    public boolean checkifcanplay(){}
    /**
     * A observer that check if the game has finished.
     * @return A boolean that represents if the game has finished or not.
     */
    public boolean checkIfGameFinished(){}
    /**
     * A transformer that will move the pawn and update the pawn's and square's stats.
     * @pre The move has to be playable.
     * @post The pawn's and square's stats have been updated.
     */
    public void playthemove(){}
    /**
     * A transformer that will change the player's turn.
     * @param player1 The player that already played.
     * @param player2 The player that will be given the turn to play.
     * @pre The player need to play his turn before give the turn to the other player.
     * @post The turn has been given to player two.
     */
    public void changeturn(Player player1,Player player2){}
}
 