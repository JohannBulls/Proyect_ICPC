
/**
 * Write a description of class Señales here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Senales
{
    private Triangle senal;
    private int x,y,limite;
    
    public Senales(int x,int y){
        this.x =x;
        this.y =y;
        String color = "green";
        senal = new Triangle();
        senal.changeColor(color);
        senal.changePosition(x, y);
        
    }
    
    public void makeVisible(){
        senal.makeVisible();
    }
    
    public void makeInvisible(){
        senal.makeInvisible();
    }
    
    public int getx(){
        return this.x;
    }
    
    public int gety(){
        return this.y;
    }
}
