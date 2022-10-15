package icpc;

/**
 * Write a description of class Twin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Twin extends Senales
{

    /**
     * Constructor for objects of class Twin
     */
    public Twin(int x,int y,int cost)
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
