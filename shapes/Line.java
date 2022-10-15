package shapes;

import java.awt.*;
import java.awt.geom.*;

/**
 * Write a description of class line here.
 *
 * @author (Amaya - tellez)
 * @version (a version number or a date)
 */
public class Line
{
    public Graphics g;
    public int xi,yi,xf,yf;
    private boolean isVisible;
    private String color;
    /**
     * Constructor for objects of class line
     */
    public Line(int xi,int yi,int xf,int yf)
    {   
        this.xi=xi;
        this.yi=yi;
        this.xf=xf;
        this.yf=yf;
        isVisible = false;
        color = "black";
    }
    
    /**
     * 
     */
    private void draw() {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color, new Line2D.Double(xi+15,yi+15,xf+15,yf+15));
        }
    }
    
    public void makeVisible(){
        isVisible = true;
        draw();
    }
    
    /**
     * Make this rectangle invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible(){
        erase();
        isVisible = false;
    }
    
    
    public void erase(){
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
    
    
    public String getcolor(){
        return color;
    }
    
     /**
     * Change the color. 
     * @param color the new color. Valid colors are "red", "yellow", "blue", "green",
     * "magenta" and "black".
     */
    public void changeColor(String newColor){
        color = newColor;
        draw();
    }

}
