import greenfoot.*;

/**
 * If pressed, change to game difficulty settings.
 * 
 * @author kurczak9
 * @version 1.0.0
 */
public class GameDifficultyButton extends MenuObjects
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new ChooseDifficulty());
        }  
    }    
}
