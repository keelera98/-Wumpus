import java.awt.image.BufferedImage;

public class Asset {
    public static final int width = 32, height = 32;

    public static BufferedImage player, monster, rock;

    public static void init(){
        Sprite Monster = new Sprite(ImageLoader.loadImage("/creatures/monster.png"));

        monster = Monster.crop(0, 0, width, height);
    }
}
