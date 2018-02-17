import greenfoot.*;  

/**
 * Shows the pause text.
 * 
 * @author kurczak9 
 * @version 1.0.0
 */
public class Pause extends Actor
{
    public void act()
    {
        if(Space.pause && !Space.gameover)
        {
            World world = this.getWorld();      
        
            PauseText pausetext = new PauseText();
            world.addObject(pausetext, 350, 130);
        }
    }
}
