import java.awt.*;

public class GameState extends State
{
    private Player player;
    private Monster monster;
    private World world;
    private MenuControl menu;

    public GameState(Handler handler)
    {
        super(handler);

        world = new World(handler, "res/worlds/world1.txt");
        menu = new MenuControl(handler);
        player = new Player(handler, 64, 64, menu);
        //passes world through handler
        handler.setWorld(world);
        //Places the player
        monster = new Monster(handler, 100, 200);
    }

    public void update()
    {
        world.update();
        player.update();
    }

    public void render(Graphics g)
    {
        world.render(g);
        monster.render(g);
        player.render(g);

        //Menu Stuff
        g.drawImage(Asset.tMenu1, 868, 618, null);

        //
        g.setFont(new Font("TimesRoman", Font.BOLD, 20));
        g.setColor(Color.white);
        g.drawString("Move Direction", 943, 640);

        //
        g.setColor(Color.black);
        g.drawString("End Turn", 973, 730);

        menu.render(g);
    }
}