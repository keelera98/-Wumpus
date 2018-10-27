import java.awt.image.BufferedImage;

public class Asset {
    public static final int width = 32, height = 32;

    public static BufferedImage player, monster, rock, boundary;

    public static void init(){
        Sprite Monster = new Sprite(ImageLoader.loadImage("/creatures/monster.png"));
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));

        monster = Monster.crop(0, 0, width, height);

        rock = sheet.crop(width, 0, width, height);
        boundary = sheet.crop(width * 3, 0, width, height);


    }
}
