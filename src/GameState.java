import java.awt.*;

public class GameState extends State
{

    private Player player;
    private World world;

    public GameState(Handler handler)
    {
        super(handler);

        world = new World(handler, "res/world/world.txt");

        //passes world through handler
        handler.setWorld(world);
        //Places the player
        player = new Player(handler, 100, 100);
        handler.getGameCamera().move(100, 200);
    }

    public void update()
    {
        world.update();
        player.update();
    }

    public void render(Graphics g)
    {
        world.render(g);
        player.render(g);
    }
}
