import greenfoot.*;

/**
 * The target for the rocket.
 * 
 * @author github.com/kurczak9
 * @version 0.0.1
 */
public class Target extends GamePlay
{
    public static int barrel = 5; // variable setting maximum target speed
    
    public void act() 
    {
        World world = this.getWorld();
        
        this.move(- Greenfoot.getRandomNumber(barrel)); 
        
        if(this.isTouching(Spaceship.class))
        {
            world.removeObject(this);
            
            Target target = new Target();
            world.addObject(target, 700, Greenfoot.getRandomNumber(400));
            
            ScoreCounter.score++; 
        }
        
        else if(this.isAtEdge()) // when it reaches end of world the copy of it is created
         {                        // in the opposite side of world to keep them appearing constantly
            world.removeObject(this);
            
            Target target = new Target(); 
            world.addObject(target, 700, Greenfoot.getRandomNumber(400));
        }
    }    
}
