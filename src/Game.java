import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game implements Runnable{
    private Display display;
    private boolean running;
    private Thread thread;
    private BufferStrategy bs;
    private Graphics g;
    private int width, height;
    private String title;
    private Handler handler;

    public Game(String title, int width, int height){
        this.width = width;
        this.height = height;
        this.title = title;
    }

    public void init(){
        display = new Display(title, width, height);

        handler = new Handler(this);
    }

    public void update(){

    }

    public void render(){
        bs = display.getCanvas().getBufferStrategy();

        if(bs == null){
            display.getCanvas().createBufferStrategy(3);
            return;
        }

        g = bs.getDrawGraphics();

        g.clearRect(0, 0, width, height);

        bs.show();
        g.dispose();
    }

    public void run(){
        init();

        int fps = 60;
        double timePerTick = 1000000000 / fps;
        double delta = 0;
        long now;

        long lastTime = System.nanoTime();

        long timer = 0;
        int ticks = 0;

        while(running){
            now = System.nanoTime();

            delta += (now - lastTime) / timePerTick;

            timer += now - lastTime;

            lastTime = now;

            if(delta >= 1){
                update();
                render();

                ticks++;
                delta--;
            }

            if(timer < 1000000000){
                ticks = 0;
                timer = 0;
            }
        }

        stop();
    }

    public synchronized void start(){
        if(!running){
            running = true;
            thread = new Thread(this);
            thread.start();
        }
    }

    public synchronized void stop(){
        if(running){
            running = false;
            try{
                thread.join();
            }catch(Exception e){}
        }
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

}
