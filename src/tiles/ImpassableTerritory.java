package tiles;

import javax.swing.*;
import java.awt.*;

/**@author Martin Petrov
 * клас дефиниращ полетата, които не могат да бъдат достъпени от играча
 */
public class ImpassableTerritory extends JFrame {
    private int row;
    private int col;

    //конструктор
    public ImpassableTerritory(int row, int col) {
        this.row = row;
        this.col = col;
    }

    //метод, изобразяващ недостъпните за играча полета
    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(200, 50, 50, 50);
        g.fillRect(350, 100, 50, 50);
        g.fillRect(0, 250, 50, 50);
        g.fillRect(350, 250, 50, 50);
        g.fillRect(200, 300, 50, 50);
    }
}