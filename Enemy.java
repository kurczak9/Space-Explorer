import greenfoot.*;

/**
 * The enemy of a rocket.
 * 
 * @author github.com/kurczak9
 * @version 0.0.1
 */
public class Enemy extends GamePlay
{  
    public static int difficulty = 6; // variable setting game difficulty
                                      // (the maximum speed of enemy)
    public void act() 
    {
        World world  = this.getWorld();
    
        this.move(- Greenfoot.getRandomNumber(difficulty));

        if(this.isAtEdge() && Target.barrel != 1) // Target.barrel != 1 
        {                                         //is to protect enemies for 
            world.removeObject(this);             //spawning when the game is
                                                  //paused or lost
            Enemy enemy = new Enemy();
            world.addObject(enemy, 700, Greenfoot.getRandomNumber(400));
        }
    
        else if(this.isTouching(Bullet.class)) //creates new enemy in
        {                                      //beginning of the world
            removeTouching(Bullet.class);      //to keep the number of them
            world.removeObject(this);
    
            Enemy enemy = new Enemy();
            world.addObject(enemy, 700, Greenfoot.getRandomNumber(400));
        }        
    }
}
