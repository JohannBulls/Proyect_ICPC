import java.util.ArrayList;
/**
 * ICPC class lac is responsible for displaying the road network..
 *
 * @author (Amaya-Tellez)
 */

public class ICPC
{
    // instance variables - replace the example below with your own
    private int length,width ;
    private ArrayList<Circle> intersecciones;
    private int xi,yi,xf,yf;
    private ArrayList<line> rutas;
    /**
     * Constructor for objects of class ICPC
     */
    public ICPC(int length, int width)
    {
        this.length = length;
        this.width = width;
        intersecciones = new ArrayList<Circle>();
        rutas =new ArrayList<line>();
    }
    
    /**
     * Constructor for objects of class ICPC
     */
    public void addIntersection(String color, int x, int y)
    {
        Circle inter = new Circle();
        inter.changeColor(color);
        inter.changePotition(x, y);
        intersecciones.add(inter);
    }
    
    /**
     * is in charge of adding the points that you want to connect in the road network
     */
    public void addRoute(String intersectionA, String intersectionB)
    {   
        for (int i=0; i<intersecciones.size();i++){
            if (i == Integer.parseInt(intersectionA)){
                xi=intersecciones.get(i).getx();
                yi=intersecciones.get(i).gety();
            }
            
            if (i == Integer.parseInt(intersectionB)){
                xf=intersecciones.get(i).getx();
                yf=intersecciones.get(i).gety();
            }
        }
        line rt = new line(xi,yi,xf,yf);
        rutas.add(rt);
    }
    
    public void putSign(String intersectionA, String intersectionB, int speedLimit)
    {
    
    }
    
    /**
     * is responsible for eliminating the intersection of the road network
     */
    public void delItersection(String color)
    {
        for (int i = 0; i<intersecciones.size();i++){
            if (intersecciones.get(i).getcolor()== color){
                intersecciones.remove(i);
            }
        }
    }
    
    /**
     * add the points of the road that you want to join
     */
    public void delRoad(String locationA, String locationB)
    {
        for (int i=0; i<intersecciones.size();i++){
            if (i == Integer.parseInt(locationA)){
                rutas.remove(i);
            }
            
            if (i == Integer.parseInt(locationB)){
                rutas.remove(i);
            }
        }
        line rt = new line(xi,yi,xf,yf);
        rutas.add(rt);
    }
    
    public void removeSign(String locationA, String locationB)
    {
        
    }
    
    /**
     * check the number of routes and intersections that have so far
     */
    public void consult(){
        int in = intersecciones.size();
        int rt = rutas.size();
        System.out.println("El numero de intersecciones es: " + in);
        System.out.println("El numero de rutas es: " + rt);
    }
    
    /**
     * makes the intersections of the road network visible, if they are already visible it does nothing
     */
    public void makeVisible(){
        for (int i=0 ; i<intersecciones.size();i++){
            intersecciones.get(i).makeVisible();   
        }
        for (int j=0 ; j<rutas.size();j++){    
            rutas.get(j).makeVisible();
        }
    }
    
    /**
     * makes the intersections of the road network invisible, if they are already invisible it does nothing
     */
    public void makeInvisible(){
        for (int i=0 ; i<intersecciones.size();i++){
            intersecciones.get(i).makeInvisible();   
        }
        for (int j=0 ; j<rutas.size();j++){    
            rutas.get(j).makeInvisible();
        }
    }
    
    /**
     *  complete road network
     */
    public void finish(){
        System.exit(0);
    }
}
