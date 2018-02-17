import greenfoot.*;  

/**
 * The menu text.
 * 
 * @author kurczak9 
 * @version 1.0.0
 */
public class PauseIcon2 extends Pause
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this) && !Space.gameover)
        {
            World world = this.getWorld();  
            
            world.removeObject(this);
        
            PauseIcon pauseicon = new PauseIcon();
            world.addObject(pauseicon, 675, 30);
        
            Space.pause = false;
        }
    }    
}
