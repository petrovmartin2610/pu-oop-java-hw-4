package tiles;

import javax.swing.*;
import java.awt.*;

/**@author Martin Petrov
 * клас дефиниращ стартовото поле
 */
public class StartPointTile extends JFrame {
    private int row;
    private int col;

    //конструктор
    public StartPointTile(int row, int col) {
        this.row = row;
        this.col = col;
    }

    //метод изобразяващ полето
    public void draw(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(0, 350, 50, 50);
    }

    //getters & setters
    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }


}