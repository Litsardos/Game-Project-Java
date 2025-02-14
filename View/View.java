import javax.swing.*;
import javax.swing.text.PlainDocument;

import java.awt.*;

public class View {

    private JButton playerdrawCard =new JButton();
    private JButton foldButton =new JButton();
    private JLabel drawnCardLabel=new JLabel();
    private JMenuBar menuBar=new JMenuBar();
    private JLabel pawn1=new JLabel();
    private JLabel pawn2=new JLabel();
    private JTextArea infobox;
    //private JLayeredPaneExtension basic_panel;
    /**
     * A constructor that initialize the panel and the buttons.
     */
    public View(){

        //setalltogether();

    }
    /**
     * A transformer that create the menu of the panel.
     */
    public void createmenu(){}
    /**
     * A transformer that create the starting basic panel.
     */
    public void creategamepanel(){}
    /**
     * A transformer that will manage the lifted card.
     */
    public void updateliftedcard(){}
    /**
     * A transformer that will update a pawn on the game.
     * @param pawn It is the pawn that will move.
     * @param position It is the square on the board that the pawn will move.
     */
    public void updatepawn(int position,Pawn pawn){}
    /**
     * A transformer that will update the box with each card's information.
     * @param message A string with card's information.
     */
    public void updateinfobox(String message){}
    /**
     * A observer that will check and show who the winner is.
     * @param message A string with a message to the winner.
     */
    public void showwinner(String message){}
    /**
     * A transformer that will set the basic panel,the buttons and the menu all together.
     */
    public void setalltogether(){}
    /**
     * A transformer that will show a message to the player the let him choose his next move.
     * @param Cardname The card that he must play.
     */
    public void givechoice(String Cardname){}
    /**
     * A transformer that will change game's turn.
     * @param player1 The player that already played.
     * @param player2 The player that it is his turn.
     */
    public void updateturn(Player player1,Player player2){}
}


