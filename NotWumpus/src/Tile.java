
import java.awt.*;
import java.awt.image.BufferedImage;

public class Tile
{

    //STATIC STUFF HERE

    //creates an array to hold all our tiles
    public static Tile[] tiles = new Tile[256];
    //creates one instance of everything instead of creating a new one every time
    //creates a new grasstile and sets its id to 0

    public static Tile rockTile = new RockTile(0);
    public static Tile boundaryTile = new BoundaryTile(1);

    //CLASS

    //size of a tile
    public static final int TILEWIDTH = 64, TILEHEIGHT = 64;

    protected BufferedImage texture;
    //id should never change once assigned to a tile
    protected final int id;

    //gets an image and an id
    public Tile(BufferedImage texture, int id){
        this.texture = texture;
        this.id = id;

        //takes array and sets each index every time the tile class is extended
        tiles[id] = this;
    }

    public void update(){

    }

    public void render(Graphics g, int x, int y){

        g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
    }

    //this tells the game is the tile can be walked on
    public boolean isSolid(){
        return false;
    }

    public int getId(){
        return id;
    }
}
