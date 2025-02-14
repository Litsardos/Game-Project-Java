public abstract class Square{
    private int positiononboard;
    private String color;
    private boolean IsPawnOnTop;
    private Pawn PawnOnTop=null;
    /**
     * A constructor that initialize a SIMPLE square of the board.
     * @param positiononboard An int that represent a position on the board that the square is going to be on.
     * @pre The parameter has to be not null.
     * @pre The positiononboard has to be a real position on the board.
     * @post The square is going to be initialized.
     */
    public Square(int positiononboard){
        /*this.color="white";
        this.positiononboard=positiononboard;
        this.IsPawnOnTop=false;*/
    }
    /**
     * A constructor that initialize the START square of the board.
     * @param color A string that has the color of the player.
     * @pre The parameter has to be not null.
     * @pre The color has to be one of the player's.
     * @post The square is going to be initialized.
     */
    public Square(String color){
        /*this.color=color;
        this.positiononboard=0;
        this.IsPawnOnTop=true;*/
    }
    /**
     * A constructor that initialize a square of the board that has a player's color.
     * @param positiononboard An int that represent a position on the board that the square is going to be on.
     * @param color A string that has the color of the player.
     * @pre The parameters have to be not null.
     * @pre The color has to be one of the player's.
     * @pre The positiononboard has to be a real position on the board.
     * @post The square is going to be initialized.
     */
    public Square(String color,int positiononboard){
        /*this.color=color;
        this.positiononboard=positiononboard;
        this.IsPawnOnTop=false;*/
    }
    /**
     * An accessor that returns if the square has a pawn on it.
     * @return A true if a pawn is on top of the square of false if it is not.
     */
    public boolean isPawnOnTop(){
        //return this.IsPawnOnTop;
    }
    /**
     * A transformer that places a pawn on the top of the square.
     * @param pawn The pawn that is going to be placed on top of the square.
     */
    public void placePawnOnTop(Pawn pawn){
        //this.IsPawnOnTop=true;
        //this.PawnOnTop=pawn;
    }
    /**
     * A transformer that removes a pawn from the top of the square.
     * @pre The square need to has a pawn on top of it.
     * @post The square won't have a pawn on top of it.
     */
    public void removePawnFromTop(){
        //this.IsPawnOnTop=false;
        //this.PawnOnTop=null;
    }
    /**
     * An accessor that return the pawn that is on top of the square.
     * @pre A pawn has to be on top of the square.
     * @return The pawn that is on top of the square.
     */
    public Pawn returnPawn(){
        //return PawnOnTop;
    }
    /**
     * An accessor that returns the position of the square on the board.
     * @return An int that represents a position on the board.
     */
    public int returnboardposition(){
        //return positiononboard;
    }
}