import greenfoot.*; 

/**
 * The back to menu button.
 * 
 * @author github.com/kurczak9
 * @version 0.0.1
 */
public class ToMenuButton extends GameOverIcon
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Menu());
            ScoreCounter.score = 0;
        }  
    }    
}
