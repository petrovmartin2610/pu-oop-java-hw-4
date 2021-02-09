import java.awt.*;
import javax.swing.*;

public class UnknownTerritoryTile extends JFrame {
    private int row;
    private int col;

    public UnknownTerritoryTile(int row, int col){
        this.row=row;
        this.col=col;
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(0, 0, 50, 50);
        g.fillRect(50, 0, 50, 50);
        g.fillRect(100, 0, 50, 50);
        g.fillRect(150, 0, 50, 50);
        g.fillRect(200, 0, 50, 50);
        g.fillRect(250, 0, 50, 50);
        g.fillRect(350, 0, 50, 50);
        g.fillRect(0, 50, 50, 50);
        g.fillRect(100, 50, 50, 50);
        g.fillRect(150, 50, 50, 50);
        g.fillRect(250, 50, 50, 50);
        g.fillRect(300, 50, 50, 50);
        g.fillRect(350, 50, 50, 50);
        g.fillRect(0, 100, 50, 50);
        g.fillRect(50, 100, 50, 50);
        g.fillRect(100, 100, 50, 50);
        g.fillRect(150, 100, 50, 50);
        g.fillRect(200, 100, 50, 50);
        g.fillRect(300, 100, 50, 50);
        g.fillRect(0, 150, 50, 50);
        g.fillRect(100, 150, 50, 50);
        g.fillRect(200, 150, 50, 50);
        g.fillRect(250, 150, 50, 50);
        g.fillRect(300, 150, 50, 50);
    }

    public void draw2(Graphics g) {
        g.fillRect(350, 150, 50, 50);
        g.fillRect(0, 200, 50, 50);
        g.fillRect(50, 200, 50, 50);
        g.fillRect(100, 200, 50, 50);
        g.fillRect(150, 200, 50, 50);
        g.fillRect(200, 200, 50, 50);
        g.fillRect(250, 200, 50, 50);
        g.fillRect(350, 200, 50, 50);
        g.fillRect(50, 250, 50, 50);
        g.fillRect(150, 250, 50, 50);
        g.fillRect(200, 250, 50, 50);
        g.fillRect(250, 250, 50, 50);
        g.fillRect(300, 250, 50, 50);
        g.fillRect(0, 300, 50, 50);
        g.fillRect(50, 300, 50, 50);
        g.fillRect(100, 300, 50, 50);
        g.fillRect(150, 300, 50, 50);
        g.fillRect(200, 300, 50, 50);
        g.fillRect(250, 300, 50, 50);
        g.fillRect(300, 300, 50, 50);
        g.fillRect(350, 300, 50, 50);
        g.fillRect(50, 350, 50, 50);
        g.fillRect(100, 350, 50, 50);
        g.fillRect(150, 350, 50, 50);
        g.fillRect(200, 350, 50, 50);
    }

    public void draw3(Graphics g){
        g.fillRect(250, 350, 50, 50);
        g.fillRect(350, 350, 50, 50);
    }
}
