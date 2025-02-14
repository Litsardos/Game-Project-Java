public class Pawn {

    private String color;
    private int boardsquare;
    private boolean isstillplaying;
    private boolean isinsafety;
    private boolean isinstart;
    /**
     * A constructor the initialize the player's pawn.
     * @param color Represent the player's color that will pass to the pawn.
     * @pre The color has to be not null.
     * @para The pawn has been initialized. 
     */

    public Pawn(String color){
        /*this.color=color;
        this.boardsquare=0;
        this.isstillplaying=true;
        this.isinsafety=false;
        this.isinstart=true;*/
    }
    /**
     * A transformer that getting the pawn out of the game.
     */
    public void finished(){
        //isstillplaying=false;
    }
    /**
     * A transformer that setting the pawn in the safety of getting it out of it.
     * @param safety Represents true if the pawn is on safety and false if it is not.
     */
    public void setsafety(boolean safety){
        //isinsafety=safety;
    }
    /**
     * A transformer that changing the pawn's position on the board.
     * @param boardsquare Represents a square on the board.
     */
    public void setboardsquare(int boardsquare){
        //this.boardsquare=boardsquare;
    }
    /**
     * A accessor the returns the pawn's position on the board.
     * @return an int that represents a square on the board.
     */
    public int getboardsquare(){
        //return this.boardsquare;
    }
    /**
     * A accessor that returns if the pawn is on safety or not.
     * @return a boolean that represent if the pawn is on safety or not.
     */
    public boolean getsafety(){
        //return isinsafety;
    }
    /**
     * A accessor that returns if the pawn is on the start square or not.
     * @return a boolean that represent is the pawn is on the start square or not.
     */
    public boolean getifstart(){
        //return isinstart;
    }
    /**
     * A transformer that setting the pawn to the start.
     */
    public void returntostart(){
        //isinstart=true;
    }
    /**
     * A transformer that changes the position of the pawn.
     * @param squares represent the number of the squares that the pawn has to move.
     * @pre The move has to be playable
     * @para The pawn moved.
     */
    public void movePawn(int squares){}
    /* 
        if(boardsquare+squares<=59){
            boardsquare=boardsquare+squares;
        }
        else{
            //CHOICE

        }

        if(boardsquare==66){
            isstillplaying=false;
        }

        if(boardsquare>=61&&boardsquare<=66){
            isinsafety=true;
        }
        //place the pawn on top of square       
    }*/

    public boolean returnifinished(){
        //return isstillplaying;
    }
}