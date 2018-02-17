import greenfoot.*;  

/**
 * Sets difficult to hard.
 * 
 * @author github.com/kurczak9
 * @version 0.0.1
 */
public class HardButton extends GameDifficulty
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Menu());
            Enemy.difficulty = 9;
            GameDifficulty.difficulty = 9;
        }  
    }    
}
