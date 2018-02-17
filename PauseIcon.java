import greenfoot.*; 

/**
 * The menu text.
 * 
 * @author kurczak9 
 * @version 1.0.0
 */
public class PauseIcon extends Pause
{
    public void act() 
    {
         World world = this.getWorld();   
        
        if(Greenfoot.mouseClicked(this) && !Space.gameover)
        {
            world.removeObject(this);
            
            PauseText pausetext = new PauseText();
            world.addObject(pausetext, 350, 130);
            
            PauseIcon2 pauseicon2 = new PauseIcon2();
            world.addObject(pauseicon2, 675, 30);
            
            Space.pause = true;
        }
    }    
}
