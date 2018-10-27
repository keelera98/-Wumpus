public class player extends Creature
{
    private Weapon playerWeapon;

    public player(Handler handler, int x, int y, Weapon playerWeapon){
        super(handler, x, y, Creature.DEFUALT_CREATURE_WIDTH, Creature.DEFUALT_CREATURE_HEIGHT);
        this.playerWeapon = playerWeapon;
    }

    public void update()
    {
        //changes speed
        getInput();
        move();
    }

    public void getInput(){
        xmove = 0;
        ymove = 0;

        if(handler.getKeyManager().up){
            //sets the ymove to move up
            ymove = ymove--;
        }
        if(handler.getKeyManager().down){
            ymove = ymove++;
        }
        if(handler.getKeyManager().left){
            xmove = xmove--;
        }
        if(handler.getKeyManager().right){
            xmove = xmove++;
        }

    }

    public void render(Graphics g){

        g.drawImage(Assets.player, /*(int)(x - handler.getGameCamera().getxOffset()),
                (int)(y - handler.getGameCamera().getyOffset()),*/ width, height, null);
    }

}
