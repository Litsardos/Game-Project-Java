public class NumberElevenCard extends NumberCard{
    /**
     * A constructor that initialize the card number eleven.
     */
    public NumberElevenCard(){
        /*super("Move a pawn eleven spaces forward or if desired\r\n" + //
                "exchange position on one of your pawns with an opponent's pawn. The card\r\n" + //
                "11 cannot be used for:\r\n" + //
                "● to exchange an opponent's pawn that is on\r\n" + //
                "safety area of or in the Start and Home positions.\r\n" + //
                "● exchange one of your pawns that is on the starting positions\r\n" + //
                "or House\r\n" + //
                "If a pawn cannot be moved 11 spaces forward, you are not\r\n" + //
                "forced to exchange one of your pawns with the opponent's. In\r\n" + //
                "in this case the order is simply changed (the player chooses to\r\n" + //
                "press fold) and the other player plays.","ELEVEN",11,"forward");*/
    }
    /**
     * here i am doing Override to the methods from the abstract class so i can use here only the methods that i need.
     */
    @Override
    public void movePawn(Pawn a, Board board) {}

    @Override
    public boolean isitplayable(Pawn a, Board board){}

    @Override
    public boolean isitplayable(Pawn a, Pawn b){}

    @Override
    public boolean isitplayable(Pawn a,Board board){}
}
