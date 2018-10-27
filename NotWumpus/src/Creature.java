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
        moveX();
        moveY();
    }

    public void moveX()
    {
        if(xmove > 0){//Moving right
            int tx = (int) (x + xmove + bounds.x + bounds.width) / Tile.TILEWIDTH;

            if(!collisionWithTile(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT) &&
                    !collisionWithTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)){
                x += xmove;
            }
        }else if(xmove < 0) {//Moving left
            int tx = (int) (x + xmove + bounds.x) / Tile.TILEWIDTH;

            if (!collisionWithTile(tx, (int) (y + bounds.y) / Tile.TILEHEIGHT) &&
                    !collisionWithTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT)) {
                x += xmove;
            }
        }
    }

    public void moveY()
    {
        if(ymove < 0){//Up
            int ty = (int) (y + ymove + bounds.y) / Tile.TILEHEIGHT;

            if(!collisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty) &&
                    !collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)){
                y += ymove;
            }
        }else if(ymove > 0){//Down
            int ty = (int) (y + ymove + bounds.y + bounds.height) / Tile.TILEHEIGHT;

            if(!collisionWithTile((int) (x + bounds.x) / Tile.TILEWIDTH, ty) &&
                    !collisionWithTile((int) (x + bounds.x + bounds.width) / Tile.TILEWIDTH, ty)){
                y += ymove;
            }
        }
    }

    protected boolean collisionWithTile(int x, int y)
    {
        return handler.getWorld().getTile(x,y).isSolid();
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
