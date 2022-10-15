package icpc;

import java.awt.Graphics;
import shapes.Triangle;
import shapes.Canvas;

/**
 * we manipulate the signals and then draw them on the canvas.
 * 
 * @author (Amaya - Tellez)
 */
public class Senales
{
    protected Triangle senal;
    protected int x,y,limite;
    protected Graphics a;
    
    /**
     * 
     */
    public Senales(int x,int y,int cost){
        this.x =x;
        this.y =y;
        this.limite=cost;
        String color = "black";
        senal = new Triangle();
        senal.changeColor(color);
        senal.changePosition(x, y);
        
    }
    
    /**
     * 
     */
    public void makeVisible(){
        senal.makeVisible();
        Canvas canvas = Canvas.getCanvas();
        canvas.drawText(String.valueOf(limite),x, y);
    }
    
    /**
     * 
     */
    public void makeInvisible(){
        senal.makeInvisible();
    }
    
    /**
     * 
     */
    public int getx(){
        return this.x;
    }
    
    /**
     * 
     */
    public int gety(){
        return this.y;
    }
}
