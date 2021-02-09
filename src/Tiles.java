import javax.swing.*;
import java.awt.*;

public class Tiles extends JFrame{
    private int row;
    private int col;
    public static int tileSize;

    public Tiles(int row, int col) {
        this.row = row;
        this.col = col;
        this.tileSize = 50;
    }

    int xTile = this.col*this.tileSize;
    int yTile = this.row*this.tileSize;

    public void draw(Graphics g){
        g.setColor(Color.BLACK);
        g.drawRect(0,0,50,50);
        g.drawRect(50,0,50,50);
        g.drawRect(100,0,50,50);
        g.drawRect(150,0,50,50);
        g.drawRect(200,0,50,50);
        g.drawRect(250,0,50,50);
        g.drawRect(300,0,50,50);
        g.drawRect(350,0,50,50);
        g.drawRect(0,50,50,50);
        g.drawRect(50,50,50,50);
        g.drawRect(100,50,50,50);
        g.drawRect(150,50,50,50);
        g.drawRect(200,50,50,50);
        g.drawRect(250,50,50,50);
        g.drawRect(300,50,50,50);
        g.drawRect(350,50,50,50);
        g.drawRect(0,100,50,50);
        g.drawRect(50,100,50,50);
        g.drawRect(100,100,50,50);
        g.drawRect(150,100,50,50);
        g.drawRect(200,100,50,50);
        g.drawRect(250,100,50,50);
        g.drawRect(300,100,50,50);
        g.drawRect(350,100,50,50);
    }

    public void draw2(Graphics g){
        g.setColor(Color.BLACK);
        g.drawRect(0,150,50,50);
        g.drawRect(50,150,50,50);
        g.drawRect(100,150,50,50);
        g.drawRect(150,150,50,50);
        g.drawRect(200,150,50,50);
        g.drawRect(250,150,50,50);
        g.drawRect(300,150,50,50);
        g.drawRect(350,150,50,50);
        g.drawRect(0,200,50,50);
        g.drawRect(50,200,50,50);
        g.drawRect(100,200,50,50);
        g.drawRect(150,200,50,50);
        g.drawRect(200,200,50,50);
        g.drawRect(250,200,50,50);
        g.drawRect(300,200,50,50);
        g.drawRect(350,200,50,50);
        g.drawRect(0,250,50,50);
        g.drawRect(50,250,50,50);
        g.drawRect(100,250,50,50);
        g.drawRect(150,250,50,50);
        g.drawRect(200,250,50,50);
        g.drawRect(250,250,50,50);
        g.drawRect(300,250,50,50);
        g.drawRect(350,250,50,50);
    }

    public void draw3(Graphics g){
        g.setColor(Color.BLACK);
        g.drawRect(0,300,50,50);
        g.drawRect(50,300,50,50);
        g.drawRect(100,300,50,50);
        g.drawRect(150,300,50,50);
        g.drawRect(200,300,50,50);
        g.drawRect(250,300,50,50);
        g.drawRect(300,300,50,50);
        g.drawRect(350,300,50,50);
        g.drawRect(0,350,50,50);
        g.drawRect(50,350,50,50);
        g.drawRect(100,350,50,50);
        g.drawRect(150,350,50,50);
        g.drawRect(200,350,50,50);
        g.drawRect(250,350,50,50);
        g.drawRect(300,350,50,50);
        g.drawRect(350,350,50,50);
    }
}
