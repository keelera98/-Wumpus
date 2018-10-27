import java.awt.image.BufferedImage;

public class Asset {
    public static final int width = 32, height = 32;

    public static BufferedImage player, monster, rock, boundary;

    public static void init(){
        Sprite Monster = new Sprite(ImageLoader.loadImage("/creatures/monster.png"));
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));
        Sprite Player = new Sprite(ImageLoader.loadImage("/creatures/player1.png"));
        Sprite Rock = new Sprite(ImageLoader.loadImage("/textures/CliffRock.jpg"));

        monster = Monster.crop(0, 0, width, height);
        player = Player.crop(0, 0, width, height);
        rock = sheet.crop(32, 0, width, height);
        boundary = Rock.crop(0, 0, width, height);



    }
}
