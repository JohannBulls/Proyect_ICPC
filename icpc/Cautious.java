package icpc;


/**
 * Write a description of class Cautious here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cautious extends Senales
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Cautious
     */
    public Cautious(int x,int y,int cost)
    {
        super(x,y,cost);
        this.x =x;
        this.y =y;
        this.limite=cost;
        String color = "black";
        senal.changeColor(color);
        senal.changePosition(x, y);
    }

}
