import greenfoot.*;  

/**
 * Info about me ;)
 * 
 * @author github.com/kurczak9
 * @version 0.0.1
 */
public class InfoAboutMe extends World
{
    public InfoAboutMe()
    {    
        super(700, 300, 1); 
        
        prepare();
    }
    
    private void prepare()
    {
        TextAboutMe text = new TextAboutMe();
        addObject(text, 350, 120);
        
        MenuButton menubutton = new MenuButton();
        addObject(menubutton, 350, 250);
    }
}
