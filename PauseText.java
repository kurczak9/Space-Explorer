import greenfoot.*;  

/**
 * The menu text.
 * 
 * @author kurczak9 
 * @version 1.0.0
 */
public class PauseText extends Pause
{
    public PauseText() 
    {
        setImage(new GreenfootImage("PAUSE"+'\n'+'\n'
        , 100, Color.RED, new Color(0,0,0,0)));
    } 
    
    public void act()
    {
        World world = this.getWorld();
        
        if(!Space.pause || Space.gameover)
        {
            world.removeObject(this);
        }
    }
}

