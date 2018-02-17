import greenfoot.*;  

/**
 * Shows the window with contact to me ;)
 * 
 * @author github.com/kurczak9
 * @version 0.0.1
 */
public class AboutMe extends GUI
{
    public void act() 
    {
       World world = this.getWorld();
        
        if(Greenfoot.mouseClicked(this))
       {
           Greenfoot.setWorld(new InfoAboutMe());
       }
    }    
}
