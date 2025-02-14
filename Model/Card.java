public abstract class Card{

    private boolean played;
    private String description;
    private String cardname;
    /**
     * A constructor that initialize each card.
     * @param description A string which has the info of the card.
     * @param cardname A string which has the name of the card.
     * @pre The parameters have to be not null.
     * @post Our private variables are initialized.
     */
    public Card(String description,String cardname) {
        /*this.played = false;
        this.description = description;
        this.cardname=cardname;*/
    }
    /**
     * A transformer that change the location of the Pawn on the board.
     * @param a is a Pawn.
     * @param board is our board.
     * @pre The move has to be playable.
     * @post The pawn is moving depending on the card.
     */
    public void movePawn(Pawn a,Board board){}

    /**
     * A transformer that change the location of two pawns on the board.
     * @param a is the first Pawn.
     * @param board is our board.
     * @param b is the second Pawn.
     * @pre The move has to be playable.
     * @post The two pawns are moving depending on the card.
     */

    public void movePawn(Pawn a,Board board,Pawn b){}
    /**
     * A transformer that change each other's pawn's position.
     * @param a The first pawn.
     * @param b The second pawn.
     * @pre The move has to be playable.
     * @post The two pawns are moving depending on the card.
     */
    public void movePawn(Pawn a,Pawn b){}
    /**
     * A getter that is returning if the card is playable in two pawns,and is about changing the position of the two pawns.
     * @param a The first pawn.
     * @param b The second pawn.
     * @pre The two pawns have to be not null.
     * @return true if the card is playable and false if it is not.
     */
    public boolean isitplayable(Pawn a,Pawn b){}

    /**
     * A getter that is returning if the card is playable with a specific pawn.
     * @param a The first pawn.
     * @param board is our board.
     * @pre The pawn and the board have to be not null.
     * @return true if the card is playable and false if it is not.
     */

    public boolean isitplayable(Pawn a,Board board){}

    /**
     * A getter that is returning if the card is playable with a specific pawn.
     * @param a The first pawn.
     * @param board is our board.
     * @param b The second pawn.
     * @pre The two pawns and the board have to be not null.
     * @return true if the card is playable and false if it is not.
     */

    public boolean isitplayable(Pawn a,Pawn b,Board board){}

}