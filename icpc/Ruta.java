package icpc;
import shapes.Line;

/**
 * a signal can be added and drawn on the canvas.
 * 
 * @author (Amaya - Tellez) 
 * @version (Ciclo 2)
 */
public class Ruta
{
    protected Line linea;
    protected int xi,yi,xf,yf;
    
    /**
     * we can add a route with the coordinates X and Y, taking an initial x and a final x
     * @ xi, xf start and end position of an intersection
     * @ yi, yf start and end position of an intersection
     */
    public Ruta (int xi,int yi,int xf,int yf) {
        this.xi=xi;
        this.xf=xi;
        this.yi=yi;
        this.yf=yf;
        linea = new Line(xi,yi,xf,yf);
    } 
    
    /**
     * 
     */
    public int[] listRuta(){
        int[] liRutas= {this.xi,this.yi,this.xf,this.yf};
        return liRutas;
    }
    
    /**
     * we make the route Visible, if the route is already visible it does nothing
     */
    public void makeVisible(){
        linea.makeVisible();
    }
    
    /**
     * we make the route Invisible, if the route is already visible it does nothing
     */
    public void makeInvisible(){
        linea.makeInvisible();
    }
}
    
