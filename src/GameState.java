import java.awt.*;

public class GameState extends State
{

    private Player player;
    private Monster monster;
    //private World world;

    public GameState(Handler handler)
    {
        super(handler);

        //world = new World(handler, "res/world/world.txt");

        //passes world through handler
        //handler.setWorld(world);
        //Places the player
        monster = new Monster(handler, 100, 100);
        player = new Player(handler, 10, 10);
    }

    public void update()
    {
        //world.update();
        player.update();
    }

    public void render(Graphics g)
    {
        //world.render(g);
        monster.render(g);
        player.render(g);
    }
}