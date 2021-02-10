import javax.swing.*;
import java.awt.*;

public class StartPointTile extends JFrame {
    private int row;
    private int col;

    public StartPointTile(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void draw(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(0, 350, 50, 50);
    }

    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }


}