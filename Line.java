import java.awt.*;
import java.awt.geom.*;
/**
 * Write a description of class line here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Line
{
    public Graphics g;
    public int xi,yi,xf,yf;
    private boolean isVisible;
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
    }
        public void makeVisible(){
        isVisible = true;
        draw();
    }
        private void draw() {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, "black", new Line2D.Double(xi+15,yi+15,xf+15,yf+15));
        }
    }
        public void makeInvisible(){
        erase();
        isVisible = false;
    }
        
    private void erase(){
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }

}
