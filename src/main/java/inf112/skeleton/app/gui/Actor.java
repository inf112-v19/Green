package inf112.skeleton.app.gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;

public class Actor implements IActor{

    private int xPos;
    private int yPos;
    private Texture texture;
    private enum direction {NORTH, SOUTH, EAST, WEST};
    private int moveDistance = 50;

    public Actor(int x, int y, Texture texture){
        this.xPos = x;
        this.yPos = y;
        this.texture = texture;
    }

    @Override
    public int getX(){
        return this.xPos;
    }

    @Override
    public int getY(){
        return this.yPos;
    }

    //width of actor image
    public int getTextureWidth(){
        return 50;
    }

    //height of actor image
    public int getTextureHeight(){
        return 50;
    }

    @Override
    public Texture getTexture(){
        return this.texture;
    }

    @Override
    public void move(Enum direction) {

    }


    @Override
    public int getMoveDistance(){
        return moveDistance;
    }


    public void update() {
        badMovementTest();
    }

    //very inefficient movement test
    private void badMovementTest() {
        int randInt = (int) Math.ceil(Math.random() * 10);

        if(randInt == 1) {
            int randomDirection = (int) Math.ceil(Math.random() * 4);
            if (randomDirection == 1) {
                goNorth();
            } else if (randomDirection == 2) {
                goSouth();
            } else if (randomDirection == 3) {
                goEast();
            } else {
                goWest();
            }
        }
    }

    @Override
    public void goNorth(){
        yPos += moveDistance;
    }

    @Override
    public void goSouth(){
        yPos -= moveDistance;
    }

    @Override
    public void goWest(){
        xPos -= moveDistance;
    }

    @Override
    public void goEast(){
        xPos += moveDistance;
    }
}
