import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FrogWorld extends greenfoot.World
{
    private Frog frog;
    
    public FrogWorld()
    {    
        super(560, 560, 1); 
        frog=new Frog();
        addObject(frog,280,530);
    }
}
