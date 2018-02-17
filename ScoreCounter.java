import greenfoot.*;  

/**
 * Counts the points.
 * 
 * @author github.com/kurczak9
 * @version 0.0.1
 */
public class ScoreCounter extends Actor
{
    public static int score = 0; // variable that increments when the target
                                 // is catched by rocket 
    public void act() 
    {
        World world = this.getWorld();
        
        setImage(new GreenfootImage("SCORE: " + score, 30, Color.GREEN, new Color (0,0,0,0)));
        world.addObject(this, 70, 20);
    
        if(Space.gameover) // when game stops it is removed from game screen
        {                  // to make it look better ;)
            world.removeObject(this);
        }
    } 
}
