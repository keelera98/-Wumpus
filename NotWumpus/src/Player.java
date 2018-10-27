import java.awt.*;

public class Player extends Creature{

    public Player(Handler handler, int x, int y /*Weapon playerWeapon*/){
        super(handler, x, y, Creature.DEFUALT_CREATURE_WIDTH, Creature.DEFUALT_CREATURE_HEIGHT);
        //this.playerWeapon = playerWeapon;
        bounds.x = 0;
        bounds.y = 0;
        bounds.width = 32;
        bounds.height = 32;
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
            ymove -= 32;
        }
        if(handler.getKeyManager().down){
            ymove += 32;
        }
        if(handler.getKeyManager().left){
            xmove -= 32;
        }
        if(handler.getKeyManager().right){
            xmove += 32;
        }

    }

    public void render(Graphics g){

        g.drawImage(Asset.player,x, y, width, height, null);
        //g.fillRect((int) (x + bounds.x), (int) (y + bounds.y), bounds.width, bounds.height);
    }
}
