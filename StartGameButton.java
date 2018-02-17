import greenfoot.*;  

/**
 * Starts the game.
 * 
 * @author github.com/kurczak9
 * @version 0.0.1
 */
public class StartGameButton extends MenuObjects
{    
    public void act() 
    {        
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Space());
            
            Space.pause = false;
            Space.gameover = false;
        }  
    }
}
