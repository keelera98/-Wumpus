public class Slayer extends Weapon
{
    private Game game;
    protected int slayerDamage = 3;
    public Slayer(Handler handler, int x, int y, int width, int height)
    {
        super(handler, x, y, width, height, Weapon.slayerDamage, Weapon.slayerID);

    }
}
