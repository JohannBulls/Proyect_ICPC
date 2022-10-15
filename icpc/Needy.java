package icpc;


/**
 * Write a description of class Needy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Needy extends Interseccion
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Needy
     */
    public Needy(String color, int x, int y)
    {
        super(color,x,y);
        this.color = color;
        this.x = x;
        this.y = y;
        inter.changeColor(color);
        inter.changePosition(x, y);
        
    }
    
    
    @Override
    /**
     * we make the route Visible, if the route is already visible it does nothing
     */
    public void makeVisible(){
        if(routs > 0){
            inter.makeVisible();
        }
        
    } 

    
}
