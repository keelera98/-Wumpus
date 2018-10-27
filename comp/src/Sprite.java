import java.awt.image.BufferedImage;

public class Sprite {
    private BufferedImage sprite;

    public Sprite(BufferedImage sprite){
        this.sprite = sprite;
    }

    public BufferedImage crop(int x, int y, int width, int height){
        return sprite.getSubimage(x, y, width, height);
    }
}
