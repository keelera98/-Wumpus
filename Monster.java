import java.awt.*;

public class Monster extends Creature{

    public Monster(Handler handler, int x, int y){
        super(handler, x, y, Creature.DEFUALT_CREATURE_WIDTH, Creature.DEFUALT_CREATURE_HEIGHT);
    }

    public void update(){

    }

    public void render(Graphics g){
        g.drawImage(Asset.monster, x, y, width, height, null);
    }
}
