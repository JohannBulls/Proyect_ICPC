import java.awt.*;
import java.awt.geom.*;
/**
 *line is a class that is responsible for making the intersections between the points you want..
 *
 * @autor (Amaya - Téllez)
 */
public class line
{
     public Graphics g;
     public int xi,yi,xf,yf;
        private boolean isVisible;
    /**
     * Constructor for objects of class line
     */
    public line(int xi,int yi,int xf,int yf)
    {   
        this.xi=xi;
        this.yi=yi;
        this.xf=xf;
        this.yf=yf;
        isVisible = false;
    }
    
    /**
     * makes visible the intersection of roads that arises, if it is already visible, it does nothing.
     */
        public void makeVisible(){
        isVisible = true;
        draw();
    }
    
    /**
     * draws the required intersections between the points
     */
        private void draw() {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, "black", new Line2D.Double(xi+15,yi+15,xf+15,yf+15));
        }
    }
    
    /**
     *  makes the road intersection that arises invisible, if it is already invisible, it does nothing.
     */
        public void makeInvisible(){
        erase();
        isVisible = false;
    }
    
    /**
     * takes care of erasing what is on the canvas
     */
        private void erase(){
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }

}
