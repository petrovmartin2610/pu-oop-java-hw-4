package map;

import tiles.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



/** @author Martin Petrov
 * Клас GPSMap задаващ координатите на игровите поленца (чрез хардкод) и рендериращ бутон за рестарт
 */
public class GPSMap extends JFrame implements MouseListener {
    private Object[][] gameTiles;

    public GPSMap() {

        //обект съхраняващ всички игрови поленца
        this.gameTiles = new Object[8][8];

        //render of unknown territory tiles
        this.gameTiles[0][0] = (new UnknownTerritoryTile(0, 0));
        this.gameTiles[0][1] = (new UnknownTerritoryTile(0, 1));
        this.gameTiles[0][2] = (new UnknownTerritoryTile(0, 2));
        this.gameTiles[0][3] = (new UnknownTerritoryTile(0, 3));
        this.gameTiles[0][4] = (new UnknownTerritoryTile(0, 4));
        this.gameTiles[0][5] = (new UnknownTerritoryTile(0, 5));
        this.gameTiles[0][7] = (new UnknownTerritoryTile(0, 7));
        this.gameTiles[1][0] = (new UnknownTerritoryTile(1, 0));
        this.gameTiles[1][2] = (new UnknownTerritoryTile(1, 2));
        this.gameTiles[1][3] = (new UnknownTerritoryTile(1, 3));
        this.gameTiles[1][5] = (new UnknownTerritoryTile(1, 5));
        this.gameTiles[1][6] = (new UnknownTerritoryTile(1, 6));
        this.gameTiles[1][7] = (new UnknownTerritoryTile(1, 7));
        this.gameTiles[2][0] = (new UnknownTerritoryTile(2, 0));
        this.gameTiles[2][1] = (new UnknownTerritoryTile(2, 1));
        this.gameTiles[2][2] = (new UnknownTerritoryTile(2, 2));
        this.gameTiles[2][3] = (new UnknownTerritoryTile(2, 3));
        this.gameTiles[2][4] = (new UnknownTerritoryTile(2, 4));
        this.gameTiles[2][6] = (new UnknownTerritoryTile(2, 6));
        this.gameTiles[3][0] = (new UnknownTerritoryTile(3, 0));
        this.gameTiles[3][2] = (new UnknownTerritoryTile(3, 2));
        this.gameTiles[3][4] = (new UnknownTerritoryTile(3, 4));
        this.gameTiles[3][5] = (new UnknownTerritoryTile(3, 5));
        this.gameTiles[3][6] = (new UnknownTerritoryTile(3, 6));
        this.gameTiles[3][7] = (new UnknownTerritoryTile(3, 7));
        this.gameTiles[4][0] = (new UnknownTerritoryTile(4, 0));
        this.gameTiles[4][1] = (new UnknownTerritoryTile(4, 1));
        this.gameTiles[4][2] = (new UnknownTerritoryTile(4, 2));
        this.gameTiles[4][3] = (new UnknownTerritoryTile(4, 3));
        this.gameTiles[4][4] = (new UnknownTerritoryTile(4, 4));
        this.gameTiles[4][5] = (new UnknownTerritoryTile(4, 5));
        this.gameTiles[4][7] = (new UnknownTerritoryTile(4, 7));
        this.gameTiles[5][1] = (new UnknownTerritoryTile(5, 1));
        this.gameTiles[5][3] = (new UnknownTerritoryTile(5, 3));
        this.gameTiles[5][4] = (new UnknownTerritoryTile(5, 4));
        this.gameTiles[5][5] = (new UnknownTerritoryTile(5, 5));
        this.gameTiles[5][6] = (new UnknownTerritoryTile(5, 6));
        this.gameTiles[6][0] = (new UnknownTerritoryTile(6, 0));
        this.gameTiles[6][1] = (new UnknownTerritoryTile(6, 1));
        this.gameTiles[6][2] = (new UnknownTerritoryTile(6, 2));
        this.gameTiles[6][3] = (new UnknownTerritoryTile(6, 3));
        this.gameTiles[6][5] = (new UnknownTerritoryTile(6, 5));
        this.gameTiles[6][6] = (new UnknownTerritoryTile(6, 6));
        this.gameTiles[6][7] = (new UnknownTerritoryTile(6, 7));
        this.gameTiles[7][1] = (new UnknownTerritoryTile(7, 1));
        this.gameTiles[7][2] = (new UnknownTerritoryTile(7, 2));
        this.gameTiles[7][3] = (new UnknownTerritoryTile(7, 3));
        this.gameTiles[7][4] = (new UnknownTerritoryTile(7, 4));
        this.gameTiles[7][5] = (new UnknownTerritoryTile(7, 5));
        this.gameTiles[7][7] = (new UnknownTerritoryTile(7, 7));


        //render of start point tile
        this.gameTiles[7][0] = (new StartPointTile(7, 0));


        //render of Baba Yaga house tiles
        this.gameTiles[0][6] = (new BabaYagaHouseTile(0, 6));
        this.gameTiles[1][1] = (new BabaYagaHouseTile(1, 1));
        this.gameTiles[2][5] = (new BabaYagaHouseTile(2, 5));
        this.gameTiles[3][1] = (new BabaYagaHouseTile(3, 1));
        this.gameTiles[3][3] = (new BabaYagaHouseTile(3, 3));
        this.gameTiles[4][6] = (new BabaYagaHouseTile(4, 6));
        this.gameTiles[5][2] = (new BabaYagaHouseTile(5, 2));
        this.gameTiles[7][6] = (new BabaYagaHouseTile(7, 6));

        //render of impassable territory tiles
        this.gameTiles[1][4] = (new ImpassableTerritory(1, 4));
        this.gameTiles[2][7] = (new ImpassableTerritory(2, 7));
        this.gameTiles[5][0] = (new ImpassableTerritory(5, 0));
        this.gameTiles[5][7] = (new ImpassableTerritory(5, 7));
        this.gameTiles[6][4] = (new ImpassableTerritory(6, 4));


        //restart button parameters
        JPanel panel = new JPanel();
        panel.setLocation(150, 550);
        JButton restartButton = new JButton("Restart");
        restartButton.setBounds(50,500,100,50);
        panel.add(restartButton);
        this.getContentPane().add(panel);

        //game window parameters
        this.setSize(600, 600);
        this.setVisible(true);
        this.setTitle("The great search for Baba Yaga");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.addMouseListener(this);



    }

    /**@author Martin Petrov
     * Метода paint, изобразяващ игралната дъска като създава инстанции на отделните обекти (поленца)
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {

                Tiles gameTiles = new Tiles(row, col);
                gameTiles.draw(g);
                gameTiles.draw2(g);
                gameTiles.draw3(g);

                UnknownTerritoryTile utt1 = new UnknownTerritoryTile(row, col);
                utt1.draw(g);
                utt1.draw2(g);
                utt1.draw3(g);

                BabaYagaHouseTile byht1 = new BabaYagaHouseTile(row, col);
                byht1.draw(g);

                ImpassableTerritory it1 = new ImpassableTerritory(row, col);
                it1.draw(g);


                StartPointTile spt1 = new StartPointTile(row, col);
                spt1.draw(g);

            }
        }
    }


    /**@author Martin Petrov
     *Метод връщащ координатите на отделните игрови поленца, като за целта използва размера им
     */
    private int tileCoordinates(int tileCoord) {
        return tileCoord / Tiles.tileSize;
    }

    /**@author Martin Petrov
     *Обекти съдържащи съответно сегашното поле, на което се намира играча и полето, към което ще се
     * придвижва на следващия ход
     */
    private Object[][] currentTile;
    private Object newTile;


    /**@author Martin Petrov
     *Обект, който при получаване на стойности за row & col определя в кое поленце се намира играча в момента
     */
    private Object getTile(int row, int col){
        return this.gameTiles[row][col]=currentTile;
    }

    /**@author Martin Petrov
     *Метод, който при mouse click задава местенето на играча чрез repaint на игровите полета от един тип поле
     * към друг
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(this.tileCoordinates(e.getX()));
        System.out.println(this.tileCoordinates(e.getY()));

        int row = this.tileCoordinates(e.getY());
        int col = this.tileCoordinates(e.getX());


        if(this.currentTile!=null){
            int newRow = this.tileCoordinates(e.getY());
            int newCol = this.tileCoordinates(e.getX());

            currentTile[newRow][newCol]=(new StartPointTile(newRow,newCol));
            this.repaint();
            return;
        }
    }





    //неизползвани имплементирани методи от MouseListener
    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
