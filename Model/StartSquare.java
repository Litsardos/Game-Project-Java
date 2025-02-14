public class StartSquare extends Square {

    private boolean Pawn1;
    private boolean Pawn2;
    /**
     * A constructor that initialize the starting square.
     * @param color A string that represent the player's color.
     * @pre The color has to match the player's color.
     */
    public StartSquare(String color){
        /*super(color);
        this.Pawn1=true;
        this.Pawn2=true;*/
    }
    /**
     * A transformer that setting a pawn to the starting square.
     * @param int A number that is either one for the first pawn or two for the second pawn.
     * @pre The corresponding pawn has to be false.
     * @pre The pawn has to be either one or two.
     * @post The pawn is back to the starting point of the game.
     */
    public void getpawnbacktostart(int pawn){

    }
    /**
     * A transformer that getting a pawn out of starting square.
     * @param int A number that is either one for the first pawn or two for the second pawn.
     * @pre The corresponding pawn has to be false.
     * @pre The pawn has to be either one or two.
     * @post The pawn is out of the starting point of the game.
     */
    public void getpawnoutofstart(int pawn){

    }
}