package tiles;

import java.awt.*;
import javax.swing.*;

/**@author Martin Petrov
 * клас дефиниращ полетата, в които се намира баба Яга
 */
public class BabaYagaHouseTile extends JFrame {
    private int row;
    private int col;

    //конструктор
    public BabaYagaHouseTile(int row, int col){
        this.row=row;
        this.col=col;
    }

    //метод, изобразяващ полетата с баба Яга
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
