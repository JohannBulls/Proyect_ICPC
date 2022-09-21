import java.awt.Graphics;

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
    private Graphics a;
    public Senales(int x,int y,int cost){
        this.x =x;
        this.y =y;
        this.limite=cost;
        String color = "green";
        senal = new Triangle();
        senal.changeColor(color);
        senal.changePosition(x, y);
        Canvas canvas = Canvas.getCanvas();
        canvas.drawText("juhan es gay",x, y);
        
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
