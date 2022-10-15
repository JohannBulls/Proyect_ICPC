package icpc;

import java.util.ArrayList;
import javax.swing.*; 

 
/**
 * Write a description of class ICPC here.
 *
 * @author (Amaya - Tellez)
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
    private int cost;
    private boolean ok;
    public ArrayList<Ruta> rutas;
    public ArrayList<Senales> senal;
    /**
     * Constructor for objects of class ICPC
     */
    public ICPC(int length, int width)
    {
        this.length = length;
        this.width = width;
        this.cost= 10;
        intersecciones = new ArrayList<Interseccion>();
        rutas =new ArrayList<Ruta>();
        senal=new ArrayList<Senales>();
        ok = true;
    }
    
    /**
     * 
     */
    public ICPC (int length, int width, int cost){
        this(length, width);
        this.cost = cost;
    }
    
    /**
     * 
     */
    public ICPC (int cost,int routes[][]){
        
        
        
    }
    
    /**
     * 
     */
    public void addIntersection(String color, int x, int y) {
        boolean validador = false;
        
        for (int i=0; i< intersecciones.size();i++){
            if (color.equals(intersecciones.get(i).getColor()) || ( x==(intersecciones.get(i).getx())  && y==(intersecciones.get(i).gety()) )){
                validador=true;
            }
        }

        if(validador==true){
            alerta("No se puede agregar la interseccion el color ya existe");
            ok = false;
        }else{
            Interseccion inter = new Interseccion(color,x,y);
            intersecciones.add(inter);
            ok = true;
        }
    }
    
    
    private Interseccion creacionIntersecciones(String type, String color, int x, int y){
       
        if(type.equals("Hermit")){
            return new Hermit(color,x,y);
        
        }
        else if(type.equals("Needy")){
            return new Needy(color,x,y);
        
        }
        else if(type.equals("Normal")){
            return new Interseccion(color,x,y);
        
        }
        return null;
    }
    
    
    /**
     * 
     */
    public void addIntersection(String type,String color, int x, int y) {
        boolean validador = false;
        
        for (int i=0; i< intersecciones.size();i++){
            if (color.equals(intersecciones.get(i).getColor()) || ( x==(intersecciones.get(i).getx())  && y==(intersecciones.get(i).gety()) )){
                validador=true;
            }
        }

        if(validador==true){
            alerta("No se puede agregar la interseccion el color ya existe");
            ok = false;
        }else{
            
            Interseccion inter = creacionIntersecciones(type,color,x,y);
            intersecciones.add(inter);
            ok = true;
        }
    }
    
    /**
     * 
     */
     public void delItersection(String color)
    {
        for (int i = 0; i<intersecciones.size();i++){
            if (intersecciones.get(i).getColor()== color){
                intersecciones.remove(i);
                ok = true;
            }
        }
    }
    
    /**
     * Mensaje de alerta
     */
    public void alerta(String message) {
        JOptionPane.showMessageDialog(null, message);
        ok = true;
    }
    
    /**
     * 
     */
    public void addRoute(String intersectionA, String intersectionB)
    {
        boolean validador1 = false;
        boolean validador2 = false;
        boolean vali3 = false;
        for (int i=0; i<intersecciones.size();i++){
            if (intersecciones.get(i).getColor().equals(intersectionA)){
                if(intersecciones.get(i) instanceof Hermit){
                    if(intersecciones.get(i).getCountRouts() == 0 ){
                        xi=intersecciones.get(i).getx();
                        yi=intersecciones.get(i).gety();
                        ok = true;
                    }
                    else{
                        validador2 = true;
                    }
                    
                    
                }
                else{
                    xi=intersecciones.get(i).getx();
                    yi=intersecciones.get(i).gety();
                    ok = true;
                    validador1 = false;
                    vali3 = true;
                }
                intersecciones.get(i).addRouts(); 
            }
            
            else if (intersecciones.get(i).getColor().equals(intersectionB)){
                if(intersecciones.get(i) instanceof Hermit){
                    if(intersecciones.get(i).getCountRouts() == 0 ){
                        xi=intersecciones.get(i).getx();
                        yi=intersecciones.get(i).gety();
                        intersecciones.get(i).addRouts(); 
                        ok = true;
                    }
                    else{
                        validador2 = true;                    
                    } 
                }
                else{
                    xi=intersecciones.get(i).getx();
                    yi=intersecciones.get(i).gety();
                    ok = true;
                    validador1 = false;
                    vali3 = true;
                }
                intersecciones.get(i).addRouts(); 
            }
            else{
                if(!vali3){
                    validador1 = true;
                }
                
            }
        }
        
        boolean validador = false;
        
        for (int i=0; i< rutas.size();i++){
            int[] listacordenadas=rutas.get(i).listRuta();
            if (xi==listacordenadas[0] && yi==listacordenadas[1] && xf==listacordenadas[2] && yf==listacordenadas[3] ){
                validador=true;
                ok = true;
            }
        }
        if(validador1 == true){
            ok = false;
            alerta("Interseccion no encontrada, verifique que la interseccion exista");
        }
        else if(validador2 == true){
            ok = false;
            alerta("Interseccion tipo hermit no puede tener mas de una ruta");
        }
        else if(validador==true){
            ok = false;
            alerta("No se puede agregar la ruta ya existe");
        }else{
            ok = true;
            Ruta rt = new Ruta(xi,yi,xf,yf);
            rutas.add(rt);
        }
    }
    
    public void addRoute(String type,String intersectionA, String intersectionB)
    {
        boolean validador1 = false;
        boolean validador2 = false;
        for (int i=0; i<intersecciones.size();i++){
            if (intersecciones.get(i).getColor().equals(intersectionA)){
                if(intersecciones.get(i) instanceof Hermit){
                    if(intersecciones.get(i).getCountRouts() == 0 ){
                        xi=intersecciones.get(i).getx();
                        yi=intersecciones.get(i).gety();
                        ok = true;
                    }
                    else{
                        validador2 = true;
                    }
                }
                else{
                    xi=intersecciones.get(i).getx();
                    yi=intersecciones.get(i).gety();
                    ok = true;
                    validador1 = false;
                }
                intersecciones.get(i).addRouts(); 
            }
            
            else if (intersecciones.get(i).getColor().equals(intersectionB)){
                if(intersecciones.get(i) instanceof Hermit){
                    if(intersecciones.get(i).getCountRouts() == 0 ){
                        xi=intersecciones.get(i).getx();
                        yi=intersecciones.get(i).gety();
                        intersecciones.get(i).addRouts(); 
                        ok = true;
                    }
                    else{
                        validador2 = true;                    
                    } 
                }
                else{
                    xi=intersecciones.get(i).getx();
                    yi=intersecciones.get(i).gety();
                    ok = true;
                    validador1 = false;
                }
                intersecciones.get(i).addRouts(); 
            }
            else{
                validador1 = true;
            }
        }
        
        boolean validador = false;
        
        for (int i=0; i< rutas.size();i++){
            int[] listacordenadas=rutas.get(i).listRuta();
            if (xi==listacordenadas[0] && yi==listacordenadas[1] && xf==listacordenadas[2] && yf==listacordenadas[3] ){
                validador=true;
                ok = true;
            }
        }
        if(validador1 == true){
            ok = false;
            alerta("Interseccion no encontrada, verifique que la interseccion exista");
        }
        else if(validador2 == true){
            ok = false;
            alerta("Interseccion tipo hermit no puede tener mas de una ruta");
        }
        else if(validador==true){
            ok = false;
            alerta("No se puede agregar la ruta ya existe");
        }else{
            ok = true;
            Ruta rt = creacionRuta(type, xi,yi,xf,yf);
            rutas.add(rt);
        }
    }
    
    private Ruta creacionRuta(String type, int xi,int yi,int xf,int yf){
       
        if(type.equals("Rebel")){
            return new Rebel(xi,yi,xf,yf);
        
        }
        else if(type.equals("Fixed")){
            return new Fixed(xi,yi,xf,yf);
        
        }
        else if(type.equals("Normal")){
            return new Ruta(xi,yi,xf,yf);
        
        }
        return null;
    }
    
    /**
     * 
     */
    public void delRoad(String locationA, String locationB){
        Interseccion interA = null ;
        Interseccion interB = null;
        for (int i=0; i < intersecciones.size();i++){
            if (intersecciones.get(i).getColor().equals(locationA)){
                xi=intersecciones.get(i).getx();
                yi=intersecciones.get(i).gety();
                interA = intersecciones.get(i);
            }
            
            if (intersecciones.get(i).getColor().equals(locationB)){
                xf=intersecciones.get(i).getx();
                yf=intersecciones.get(i).gety();
                interB = intersecciones.get(i);
            }
        }
        for(int i = 0; i < rutas.size();i++){
            int[] coord = rutas.get(i).listRuta();
            if(coord[0] == xi && coord[1] == yi && coord[2] == xf && coord[3] == yf && !(rutas.get(i) instanceof Fixed)){
                rutas.remove(i);
                interA.DelRouts();
                interB.DelRouts();
                break;
            }
        
        }

        
        
    }

    /**
     * 
     */
    public void routeSpeedLimit(String intersectionA,String intersectionB, int speedLimit ){
        for (int i=0; i < intersecciones.size();i++){
            if (intersecciones.get(i).getColor().equals(intersectionA)){
                xi=intersecciones.get(i).getx();
                yi=intersecciones.get(i).gety();
            }
            
            if (intersecciones.get(i).getColor().equals(intersectionB)){
                xf=intersecciones.get(i).getx();
                yf=intersecciones.get(i).gety();
            }
            
        aPosition =(xi+xf)/2;
        bPosition =(yi+yf)/2;
        boolean validador = false,validador2 = false,validador3 = false;
    }
    }
    
    /**
     * 
     */
    public void putSign(String intersectionA, String intersectionB,int speedLimit)
    {
        Ruta rutaVeri = null;
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
        
        
        aPosition =xi + 20;
        bPosition =yi + 20;
        boolean validador = false,validador2 = false,validador3 = false;
        boolean validadoruta;
        
        for (int i=0; i< rutas.size();i++){
            int[] listacordenadas=rutas.get(i).listRuta();
            if (xi!=listacordenadas[0] || yi!=listacordenadas[1] || xf!=listacordenadas[2] || yf!=listacordenadas[3] ){
                validador=true;
            }
            else{
                rutaVeri = rutas.get(i);
            }
        }
        
        for (int i=0; i< senal.size();i++){
            if (aPosition==senal.get(i).getx() && bPosition==senal.get(i).gety() ){
                validador2=true;
            }
        }
        
        if (speedLimit>cost){
            validador3=true;
        }
        
        if(rutaVeri instanceof Rebel){
            ok = false;
            alerta("Ruta tipo Rebel no puede tener señales");   
        }
        else if(validador==false){
            ok = false;
            alerta("No se puede agregar la señal porque no existe la ruta");
        }else if(validador2==true){
            ok = false;
            alerta("No se puede agregar la señal ya existe");
        }else if(validador3==true){
            ok = false;
            alerta("El limite de la señal es mayor al costo");
        }else{
            ok = true;
            Senales snl = new Senales(aPosition,bPosition,speedLimit);
            senal.add(snl);
        }       
    }
    
   /**
    * 
    */ 
   public void removeSign(String locationA, String locationB)
    {
        ok = true;
        for (int i=0; i<senal.size();i++){
            if (i == Integer.parseInt(locationA)){
                rutas.remove(i);
            }
            if (i == Integer.parseInt(locationB)){
                rutas.remove(i);
            }
        }
    }
    
    /**
     * 
     */
    public void wrongSigns(){
        
    }
    
    /**
     * 
     */
    public void consult(){
        ok = true;
        int in = intersecciones.size();
        int rt = rutas.size();
        alerta("El numero de intersecciones es: " + in);
        alerta("El numero de rutas es: " + rt);
    }
    
    /**
     * 
     */
    public void makeVisible(){
        ok = true;
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
    
    /**
     * 
     */
    public void makeInvisible(){
        ok = true;
        for (int i=0 ; i<intersecciones.size();i++){
            intersecciones.get(i).makeInvisible();   
        }
        for (int j=0 ; j<rutas.size();j++){    
            rutas.get(j).makeInvisible();
        }
        for (int j=0 ; j<senal.size();j++){    
            senal.get(j).makeInvisible();
        }
    }
    
    /**
     * 
     */
    public void finish(){
        ok = true;
        System.exit(0);
    }
    
    /**
     * 
     */
    public boolean ok(){
        return ok;
    }
}

