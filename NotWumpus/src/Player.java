import java.awt.*;
import java.awt.event.KeyEvent;

public class Player extends Creature{

    private boolean canMove;
    private MenuControl menu;

    public Player(Handler handler, int x, int y, MenuControl menu/*Weapon playerWeapon*/){
        super(handler, x, y, Creature.DEFUALT_CREATURE_WIDTH, Creature.DEFUALT_CREATURE_HEIGHT);
        //this.playerWeapon = playerWeapon;
        bounds.x = 0;
        bounds.y = 0;
        bounds.width = 32;
        bounds.height = 32;
        this.menu = menu;
    }

    public void update()
    {
        if(handler.getKeyManager().getKeys(KeyEvent.VK_ENTER)) {
            canMove = true;
        }
        //changes speed
        //move();
        if(canMove){
            getInput();
            move();
        }
    }

    public void getInput(){
        xmove = 0;
        ymove = 0;

        if(menu.getBool(0)){
            System.out.println("UP");
            //sets the ymove to move up
            ymove -= 64;
            menu.setBool(0, false);
        }
        if(menu.getBool(1)){
            ymove += 64;
            menu.setBool(1, false);
        }
        if(menu.getBool(2)){
            xmove -= 64;
            menu.setBool(2, false);
        }
        if(menu.getBool(3)){
            xmove += 64;
            menu.setBool(3, false);
        }
        canMove = false;
    }

    public void render(Graphics g){

        g.drawImage(Asset.player,x, y, width, height, null);
        //g.fillRect((int) (x + bounds.x), (int) (y + bounds.y), bounds.width, bounds.height);
    }
}
