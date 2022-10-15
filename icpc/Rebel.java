package icpc;
import shapes.Line;

/**
 * Write a description of class Rebel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rebel extends Ruta
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Rebel
     */
    public Rebel(int xi,int yi,int xf,int yf)
    {
        super(xi,yi,xf,yf);
        this.xi=xi;
        this.xf=xi;
        this.yi=yi;
        this.yf=yf;
        linea = new Line(xi,yi,xf,yf);
    }

   
}
