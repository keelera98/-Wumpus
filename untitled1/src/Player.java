import java.awt.*;

public class Player extends Creature{

    public Player(Handler handler, int x, int y /*Weapon playerWeapon*/){
        super(handler, x, y, Creature.DEFUALT_CREATURE_WIDTH, Creature.DEFUALT_CREATURE_HEIGHT);
        //this.playerWeapon = playerWeapon;
        bounds.x = 32;
        bounds.y = 32;
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

        //g.drawImage();
        g.fillRect((int) (x+bounds.x),(int) (y+bounds.y),bounds.width, bounds.height);
    }
}
