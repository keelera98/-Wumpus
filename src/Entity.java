import java.awt.*;

public abstract class Entity {
    //protected  variables are private but extended classes can still use them
    protected int x;
    protected int y;
    //used to change sizes of images
    protected int width, height;
    protected Handler handler;

    public Entity(Handler handler, int x, int y, int width, int height){
        this.handler = handler;
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public abstract void update();

    public abstract void render(Graphics g);

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }
}
