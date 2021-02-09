import java.awt.*;
import javax.swing.*;

public class BabaYagaHouseTile extends JFrame {
    private int row;
    private int col;

    public BabaYagaHouseTile(int row, int col){
        this.row=row;
        this.col=col;
    }

    public void draw(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(300, 0, 50, 50);
        g.fillRect(50, 50, 50, 50);
        g.fillRect(250, 100, 50, 50);
        g.fillRect(50, 150, 50, 50);
        g.fillRect(150, 150, 50, 50);
        g.fillRect(300, 200, 50, 50);
        g.fillRect(100, 250, 50, 50);
        g.fillRect(300, 350, 50, 50);
    }
}
