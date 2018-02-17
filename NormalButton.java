import greenfoot.*;  

/**
 * Sets difficult to normal (its deafult so it just takes you to the menu)
 * 
 * @author github.com/kurczak9
 * @version 0.0.1
 */
public class NormalButton extends GameDifficulty
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Menu());
        }  
    }    
}
