import greenfoot.*; 

/**
 * The text that pop up when game is over.
 * 
 * @author github.com/kurczak9
 * @version 0.0.1
 */
public class GameOverText2 extends GameOverIcon
{
    public GameOverText2()
    {
        setImage(new GreenfootImage(
        "Your score: " + ScoreCounter.score
        , 50, Color.GREEN, new Color (0,0,0,0)));
    }
}
