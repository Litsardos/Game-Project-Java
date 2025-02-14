public class Player{
    private String color;
    private String name;
    private Pawn Pawn1;
    private Pawn Pawn2;
    private boolean turn;
    /**
     * A constructor that initialize the player.
     * @param color Represents a string with the player's color.
     * @param name Represents a string with the player's name.
     * @param Pawn1 Represents the first pawn that the player has.
     * @param Pawn2 Represents the second pawn that the player has.
     */
    public Player(String color,String name,Pawn Pawn1,Pawn Pawn2){
        /*this.color=color;
        this.name=name;
        this.Pawn1=Pawn1;
        this.Pawn2=Pawn2;
        this.turn=false;*/
    }
    /**
     * A transformer that change the player's turn.
     * @param turn A boolean that is being setting on player's turn.
     */
    public void set_turn(boolean turn){
        //this.turn=turn;
    }
    /**
     * A accessor that returns if the player's pawns have been finished.
     * @return a boolean if the player has been finished or not.
     * @pre The two pawns have to be not null.
     */
    public boolean iswinner(){
        //return Pawn1.returnifinished() && Pawn2.returnifinished();
    }
    /**
     * A accessor that returns player's name.
     * @return A string that represents a name.
     */
    public String getname(){}
}