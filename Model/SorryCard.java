public class SorryCard extends Card {
    /**
     *  A contractor that initialize the Sorry card.
     */
    public SorryCard() {
        /*super("Take one of your pawns that is in the Start position (only) and\r\n" + //
        "move it directly to a position occupied by the pawn\r\n" + //
        "of an opponent, sending the opponent's pawn back to his own\r\n" + //
        "Start position.\r\n" + //
        "● The card cannot be used for an opponent's pawn\r\n" + //
        "in a safe area.\r\n" + //
        "● If there are no pawns in the Start position of the playing player or the\r\n" + //
        "opponent's pawns cannot be moved (eg if they are\r\n" + //
        "in their secure area), then the card is simply declined\r\n" + //
        "and the order changes.", "SORRY");*/
    }
    /**
     * here i am doing Override to the methods from the abstract class so i can use here only the methods that i need.
     */
    @Override
    public void movePawn(Pawn a,Pawn b){}

    @Override
    public boolean isitplayable(Pawn a,Pawn b){}

}