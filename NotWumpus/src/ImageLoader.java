import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

//loads images for the game
public class ImageLoader {
    //this class will load an image, the path is the image name
    public static BufferedImage loadImage(String path){
        try {
            System.out.println("Here");
            //reads the image and returns the buffered version
            return ImageIO.read(ImageLoader.class.getResource(path));
        }catch(IOException e){
            //closes the game if we couldn't load the image
            System.exit(1);
        }
        return null;
    }
}