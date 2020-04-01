package Game;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JPanel implements GameManager{

    Spot[][] cells;
    Spot[][] board;

    @Override
    public int getBoardValue(int i, int j) {
        return 0;
    }

    @Override
    public void setBoardValue(int i, int j, int value) {

    }

    @Override
    public void handleClick(int i, int j) {

    }

    Player black = new Player();
    Player white = new Player();

    public GameWindow()
    {
        this.setBackground(Color.WHITE); //TODO moet groen worden denk ik
        this.setLayout(new BorderLayout());

        JPanel reversiBoard = new JPanel();
        reversiBoard.setLayout(new GridLayout(8,8));
        reversiBoard.setPreferredSize(new Dimension(500,500));
        reversiBoard.setBackground(new Color(41,100, 59));

        //maak de vakjes
        cells = new Spot[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                cells[i][j] = new Spot(this,reversiBoard,i,j);
                reversiBoard.add(cells[i][j]);
            }
        }

        cells[4][4].color = 2;
        cells[4][3].color = 1;
        cells[3][4].color = 1;
        cells[3][3].color = 2;
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar,BoxLayout.Y_AXIS));
        sidebar.setPreferredSize(new Dimension(200,0));
        sidebar.setBackground(Color.BLUE);

        this.add(sidebar,BorderLayout.WEST);
        this.add(reversiBoard);
    }
}
