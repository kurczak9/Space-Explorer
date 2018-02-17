import greenfoot.*; 

/**
 * Gets the player back to menu.
 * 
 * @author github.com/kurczak9
 * @version 0.0.1
 */
public class MenuButton extends AboutMe
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Menu());
        }  
    }    
}
