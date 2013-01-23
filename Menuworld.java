import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menuworld here.
 * 
 * @author (Levi Cupedo) 
 * @version (0.001)
 */
public class Menuworld extends World
{

    /**
     * Constructor for objects of class Menuworld.
     * 
     */
    public Menuworld()
    {    
        // Create a new world with 800x800 cells with a cell size of 1x1 pixels.
        super(160, 160, 5);
        setBackground("Menu.png");
        
        // Add things to menu
        addObject(new Game1(), 40, 70);
        addObject(new Game2(), 120, 70);
        addObject(new Game3(), 40, 120);
        addObject(new Game4(), 120, 120);
        addObject(new Scoreboardbutton(), 20, 150);
        addObject(new Quitbutton(), 145, 150);
        
    }
    
}
