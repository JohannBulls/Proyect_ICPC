package icpc;


/**
 * Write a description of class Hermit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hermit extends Interseccion
{

    

    /**
     * Constructor for objects of class Hermit
     */
    public Hermit(String color, int x , int y){
        super(color,x,y);
        this.color = color;
        this.x = x;
        this.y = y;
        inter.changeColor(color);
        inter.changePosition(x, y);
    }
    
    @Override
    public void addRouts(){
        if(routs == 0){
            routs += 1;
        }
    
    }
    
    
   
    

    
}
