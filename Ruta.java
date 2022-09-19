/**
 * Write a description of class Ruta here.
 * 
 * @author (Johann Amaya) 
 * @version (Ciclo 2)
 */
public class Ruta
{
    private Line linea;
    private int xi,yi,xf,yf;
    
    public Ruta (int xi,int yi,int xf,int yf) {
        this.xi=xi;
        this.xf=xi;
        this.yi=yi;
        this.yf=yf;
        linea = new Line(xi,yi,xf,yf);
    } 
    
    public int[] listRuta(){
        int[] liRutas= {this.xi,this.yi,this.xf,this.yf};
        return liRutas;
    }
    
    
    public void makeVisible(){
        linea.makeVisible();
    }
    
    public void makeInvisible(){
        linea.makeInvisible();
    }
}
    
