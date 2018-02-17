import greenfoot.*;  

/**
 * Sets difficult to easy.
 * 
 * @author github.com/kurczak9
 * @version 0.0.1
 */
public class EasyButton extends GameDifficulty
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Menu());
            Enemy.difficulty = 4;
            GameDifficulty.difficulty = 4;
        }  
    }    
}
