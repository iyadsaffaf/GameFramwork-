package Game;

import java.awt.*;

public class Player {

    boolean startMove = false;
    Color color;

    Player(boolean doIStart, Color color)
    {
        this.startMove = doIStart;
        this.color = color;
    }

}
