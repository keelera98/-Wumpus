import java.awt.*;

public class World {
    private int spawnX;
    private int spawnY;
    //size of map
    private int width, height;
    //holds tile id's
    private int[][] tiles;
    private Handler handler;

    //this is not randomly generates it needs a file to load a world
    public World(Handler handler, String path){
        this.handler = handler;
        loadWorld(path);
    }

    public void update(){

    }

    public void render(Graphics g){
        /*
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                //multiplies to get larger sizes so the tiles don't spawn on each other
                //subtracts the offset from the rendered game to move the tiles
                getTile(x, y).render(g, x, y);
            }
        }
        */
        int xStart = (int)Math.max(0, handler.getGameCamera().getxOffset() / Tile.TILEWIDTH);
        int xEnd = (int)Math.min(width, (handler.getGameCamera().getxOffset() + handler.getWidth()) / Tile.TILEWIDTH + 1);
        int yStart = (int)Math.max(0, handler.getGameCamera().getyOffset() / Tile.TILEHEIGHT);
        int yEnd = (int)Math.min(height, (handler.getGameCamera().getyOffset() + handler.getHeight()) / Tile.TILEHEIGHT + 1);

        for(int y = yStart; y < yEnd; y++){
            for(int x = xStart; x < xEnd; x++){
                //multiplies to get larger sizes so the tiles don't spawn on each other
                //subtracts the offset from the rendered game to move the tiles
                getTile(x, y).render(g, (int)(x * Tile.TILEWIDTH - handler.getGameCamera().getxOffset()),
                        (int)(y * Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()));
            }
        }

    }

    public Tile getTile(int x, int y){
        //takes tiles array and index it at x and y to get tiles
        Tile t = Tile.tiles[tiles[x][y]];
        //in case there is a null, tile just load a dirt tile
        if(t == null){
            return Tile.rockTile;
        }
        return t;
    }

    private void loadWorld(String path){
        /*
        Loads a world of 5 by 5 made up of one tile
        width = 5;
        height = 5;
        tiles = new int[width][height];
        for(int x = 0; x < width; x++){
            for(int y = 0; y < height; y++){
                tiles[x][y] = 1;
            }
        }*/

        String file = Utils.loadFileAsString(path);

        //takes file and splits up the file by white space and puts in the array
        String[] tokens = file.split("\\s+");
        width = Utils.parseInt(tokens[0]);
        height = Utils.parseInt(tokens[1]);
        spawnX = Utils.parseInt(tokens[2]);
        spawnY = Utils.parseInt(tokens[3]);

        tiles = new int[width][height];
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                //converts x and y to a one dimensional array index
                tiles[x][y] = Utils.parseInt(tokens[(x + y * width) + 4]);
            }
        }
    }

}