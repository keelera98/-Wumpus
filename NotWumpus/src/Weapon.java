import java.awt.*;

public class Weapon  extends Entity
{
    public static final double swordDamage = 1;
    public static final double bowDamage = 1.5;
    public static final double slayerDamage = 3;

    public static final int swordID = 1;
    public static final int bowID = 2;
    public static final int slayerID = 3;

    protected double damage;
    protected final int id;
    private Handler handler;


    public Weapon(Handler handler, int x, int y, int width, int height, double damage, int id)
    {
        super(handler, x, y, width, height);
        this.damage = damage;
        this.id = id;
    }



    public void update()
    {

    }

    public void render(Graphics g)
    {

    }

    public Handler getHandler(){
        return handler;
    }
}
