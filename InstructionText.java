import greenfoot.*;

/**
 * The instruction text.
 * 
 * @author github.com/kurczak9
 * @version 0.0.1
 */
public class InstructionText extends InstructionObjects
{
    public InstructionText() 
    {
        setImage(new GreenfootImage(
        "1. Use up & down arrows to steer your rocket and avoid asteroids."+'\n'+
        "2. Use space to destroy asteroids."+'\n'+
        "3. Try to collect as many barells as you can."+'\n'+
        "4. Enjoy !!!"
        , 28, Color.BLUE, new Color(0,0,0,0) ));
    }   
}
