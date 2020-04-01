
import Game.GameWindow;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GameScreen extends JFrame {

    public static void main(String[] args) {

        System.out.println("Starting Reversi...");

        new GameScreen();

    }

    public GameScreen(){
        Date date = new Date(System.currentTimeMillis());

        GameWindow gp = new GameWindow();
        this.add(gp);
        this.setTitle("Reversi BUILDMODE " + date.toString());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setSize(1000,800);

    }



}
