import java.awt.*;

public class Creature extends Entity{
    //makes a health that can't be changed
    public static final int DEFAULT_HEALTH = 3;
    //defaults what size the creature is
    public static final int DEFUALT_CREATURE_WIDTH = 64;
    public static final int DEFUALT_CREATURE_HEIGHT = 64;


    protected int health;
    //all movement should be in float

    protected int xmove, ymove;

    public Creature(Handler handler, int x, int y, int width, int height){
        //passes the x and y to the parent class constructor
        super(handler, x, y, width, height);
        health = DEFAULT_HEALTH;
        xmove = 0;
        ymove = 0;
    }

    public void move(){
        x += xmove;
        y += ymove;
    }

    public void update(){

    }

    public void render(Graphics g){

    }

    //GETTERS AND SETTERS

    public float getYmove() {
        return ymove;
    }

    public void setYmove(int ymove) {
        this.ymove = ymove;
    }

    public float getXmove() {
        return xmove;
    }

    public void setXmove(int xmove) {
        this.xmove = xmove;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
