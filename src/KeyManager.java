import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener
{
     private boolean[] keys;
     public boolean up, down, left, right;

     public KeyManager()
     {
         //array for all keys, each key has a keycode
         keys = new boolean[256];
     }

     public void update()
     {
         //gets the key code for a specific key
         up = keys[KeyEvent.VK_W];
         right = keys[KeyEvent.VK_D];
         left = keys[KeyEvent.VK_A];
         down = keys[KeyEvent.VK_S];
     }

     //called when user pressed a key
     public void keyPressed(KeyEvent e)
     {
         keys[e.getKeyCode()] = true;

         //Prints key code
         System.out.println(e.getKeyCode());
     }

     //called when a user lets go of a key
    public void keyReleased(KeyEvent e)
    {
        keys[e.getKeyCode()] = false;
    }

    public void keyTyped(KeyEvent e) { }
}
