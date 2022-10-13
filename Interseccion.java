/**
 * we manipulate the intersections to then draw them on the canvas.
 * 
 * @author (Amaya - Tellez) 
 * @version (Ciclo 2)
 */
public class Interseccion 
{
    private Circle inter;
    private int x,y;
    private String color;
    
    /**
     * we ask for the coordinates and the color that we want to give to the intersections
     * @ param x is the position we give to the intersection in x
     * @ param y is the position we give to the intersection in y
     * @ param color is the color assigned to the intersection
     */
    public Interseccion (String color,int x,int y){
        this.color= color;
        this.x = x;
        this.y = y;
        inter = new Circle();
        inter.changeColor(color);
        inter.changePotition(x, y);
    }
    
    /**
     * we ask for a color to give it to the intersections
     */
    public String getColor(){
        return this.color;
    }
    
    /**
     * we make the route Visible, if the route is already visible it does nothing
     */
    public void makeVisible(){
        inter.makeVisible();
    }
    
    /**
     * we make the route Invisible, if the route is already visible it does nothing
     */
    public void makeInvisible(){
        inter.makeInvisible();
    }
    
    /**
     * we ask for a position in x to place it on the canvas
     */
    public int getx(){
        return inter.getx();
    }
    
    /**
     * we ask for a position in y to place it on the canvas
     */
    public int gety(){
        return inter.gety();
    }
}
