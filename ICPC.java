import java.util.ArrayList;
import javax.swing.*;  
/**
 * Write a description of class ICPC here.
 *
 * @author (Johann Amaya)
 * @version (a version number or a date)
 */

public class ICPC
{
    // instance variables - replace the example below with your own
    private int length,width,sizeSeñal ;
    public ArrayList<Interseccion> intersecciones;
    private int xi,yi,xf,yf;
    private int aPosition;
    private int bPosition;
    public ArrayList<Ruta> rutas;
    public ArrayList<Senales> senal;
    /**
     * Constructor for objects of class ICPC
     */
    public ICPC(int length, int width)
    {
        this.length = length;
        this.width = width;
        intersecciones = new ArrayList<Interseccion>();
        rutas =new ArrayList<Ruta>();
        senal=new ArrayList<Senales>();
    }
    
    public ICPC (int length, int width, int cost){
    
    }
    
    public void addIntersection(String color, int x, int y) {
        boolean validador = false;
        
        for (int i=0; i< intersecciones.size();i++){
            if (color.equals(intersecciones.get(i).getColor()) || ( x==(intersecciones.get(i).getx())  && y==(intersecciones.get(i).gety()) )){
                validador=true;
            }
        }

        if(validador==true){
            alerta("No se puede agregar la interseccion el color ya existe");
        }else{
            Interseccion inter = new Interseccion(color,x,y);
            intersecciones.add(inter);
        }
    }
    
     public void delItersection(String color)
    {
        for (int i = 0; i<intersecciones.size();i++){
            if (intersecciones.get(i).getColor()== color){
                intersecciones.remove(i);
            }
        }
    }
    
    /**
     * Mensaje de alerta
     */
    public void alerta(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    public void addRoute(String intersectionA, String intersectionB)
    {           
        for (int i=0; i<intersecciones.size();i++){
            if (intersecciones.get(i).getColor().equals(intersectionA)){
                xi=intersecciones.get(i).getx();
                yi=intersecciones.get(i).gety();
            }
            
            if (intersecciones.get(i).getColor().equals(intersectionB)){
                xf=intersecciones.get(i).getx();
                yf=intersecciones.get(i).gety();
            }
        }
        
        boolean validador = false;
        
        for (int i=0; i< rutas.size();i++){
            int[] listacordenadas=rutas.get(i).listRuta();
            if (xi==listacordenadas[0] && yi==listacordenadas[1] && xf==listacordenadas[2] && yf==listacordenadas[3] ){
                validador=true;
            }
        }

        if(validador==true){
            alerta("No se puede agregar la ruta ya existe");
        }else{
            Ruta rt = new Ruta(xi,yi,xf,yf);
            rutas.add(rt);
        }
    }
    
    public void delRoad(String locationA, String locationB){
        for (int i=0; i<intersecciones.size();i++){
            if (i == Integer.parseInt(locationA)){
                rutas.remove(i);
            }
            
            if (i == Integer.parseInt(locationB)){
                rutas.remove(i);
            }
        }
    }
    
    public void putSign(String intersectionA, String intersectionB)
    {
        for (int i=0; i<intersecciones.size();i++){
            if (intersecciones.get(i).getColor().equals(intersectionA)){
                xi=intersecciones.get(i).getx();
                yi=intersecciones.get(i).gety();
            }
            
            if (intersecciones.get(i).getColor().equals(intersectionB)){
                xf=intersecciones.get(i).getx();
                yf=intersecciones.get(i).gety();
            }
        }
        aPosition =(xi+xf)/2;
        bPosition =(yi+yf)/2;
        boolean validador = false,validador2 = false;
        
        for (int i=0; i< rutas.size();i++){
            int[] listacordenadas=rutas.get(i).listRuta();
            if (xi!=listacordenadas[0] || yi!=listacordenadas[1] || xf!=listacordenadas[2] || yf!=listacordenadas[3] ){
                validador=true;
            }
        }
        
        for (int i=0; i< senal.size();i++){
            if (aPosition==senal.get(i).getx() && bPosition==senal.get(i).gety() ){
                validador=true;
            }
        } 

        if(validador==true){
            alerta("No se puede agregar la señal porque no existe la ruta");
        }else if(validador2==true){
            alerta("No se puede agregar la señal ya existe");
        }else{
            Senales snl = new Senales(aPosition,bPosition);
            senal.add(snl);
        }       
    }

   public void removeSign(String locationA, String locationB)
    {
        for (int i=0; i<senal.size();i++){
            if (i == Integer.parseInt(locationA)){
                rutas.remove(i);
            }
            if (i == Integer.parseInt(locationB)){
                rutas.remove(i);
            }
        }
    }
    
    public void consult(){
        int in = intersecciones.size();
        int rt = rutas.size();
        System.out.println("El numero de intersecciones es: " + in);
        System.out.println("El numero de rutas es: " + rt);
    }
    
    public void makeVisible(){
        for (int i=0 ; i<intersecciones.size();i++){
            intersecciones.get(i).makeVisible();   
        }
        for (int j=0 ; j<rutas.size();j++){    
            rutas.get(j).makeVisible();
        }
        for (int j=0 ; j<senal.size();j++){    
            senal.get(j).makeVisible();
        }
    }
    
    public void makeInvisible(){
        for (int i=0 ; i<intersecciones.size();i++){
            intersecciones.get(i).makeInvisible();   
        }
        for (int j=0 ; j<rutas.size();j++){    
            rutas.get(j).makeInvisible();
        }
        for (int j=0 ; j<senal.size();j++){    
            senal.get(j).makeVisible();
        }
    }
    
    public void finish(){
        System.exit(0);
    }
    
    public boolean ok(){
        boolean Ok= false;
        return Ok;
    }
}

