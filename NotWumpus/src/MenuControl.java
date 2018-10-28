import java.awt.*;
import java.awt.event.KeyEvent;

public class MenuControl {

    private boolean[] bool;
    Handler handler;
    public MenuControl(Handler handler)
    {
        this.handler = handler;
        bool = new boolean[4];
    }
    public void update() {}
    public void render(Graphics g)
    {
        //Updatable menu text
        if(handler.getKeyManager().getKeys(KeyEvent.VK_W)) {
            bool[0] = true;
            bool[1] = false;
            bool[2] = false;
            bool[3] = false;
        }
        if(handler.getKeyManager().getKeys(KeyEvent.VK_S)) {
            bool[0] = false;
            bool[1] = true;
            bool[2] = false;
            bool[3] = false;
        }
        if(handler.getKeyManager().getKeys(KeyEvent.VK_A)) {
            bool[0] = false;
            bool[1] = false;
            bool[2] = true;
            bool[3] = false;
        }
        if(handler.getKeyManager().getKeys(KeyEvent.VK_D)) {
            bool[0] = false;
            bool[1] = false;
            bool[2] = false;
            bool[3] = true;
        }

        //Draw
        g.setColor(Color.black);
        g.setFont(new Font("TimesRoman", Font.BOLD, 20));
        if(bool[0])
            g.drawString("Up", 1020, 670);
        if(bool[1])
            g.drawString("Down", 1020, 670);
        if(bool[2])
            g.drawString("Left", 1020, 670);
        if(bool[3])
            g.drawString("Right", 1020, 670);
    }
}
