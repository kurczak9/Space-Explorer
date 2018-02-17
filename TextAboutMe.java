import greenfoot.*;  

/**
 * The text with contact to me :)
 * 
 * @author github.com/kurczak9
 * @version 0.0.1
 */
public class TextAboutMe extends AboutMe
{
    public void act() 
    {
        setImage(new GreenfootImage(
        "Hi!" + '\n' + "Thanks for playing my game!"+'\n'+
        "I hope you enjoy it!"+'\n'+""+'\n'+"github.com/kurczak9"
        , 35, Color.BLUE, new Color(0,0,0,0)));
    }    
}
