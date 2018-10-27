import java.awt.*;

public abstract class State
{
    //Stores current state
    private static State currentState = null;

    //Set state
    public static void setCurrentState(State state)
    {
        currentState = state;
    }

    //Gets state
    public static State getCurrentState()
    {
        return currentState;
    }

    protected Handler handler;
    protected Game game;

    public State(Handler handler)
    {
        this.handler = handler;
    }

    public abstract void update();
    public abstract void render(Graphics g);
}