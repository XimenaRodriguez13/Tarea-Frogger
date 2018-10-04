import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Actor
{
    protected void salta()
    {
        if(Greenfoot.isKeyDown("right")){
            setRotation(0);
            move(5);
        }
        if(Greenfoot.isKeyDown("left")){
            setRotation(180);
            move(5);
        }
        if(Greenfoot.isKeyDown("up")){
            setRotation(270);
            move(5);
        }
        if(Greenfoot.isKeyDown("down")){
            setRotation(90);
            move(5);
        }
    }
    
    public void act() 
    {
        if(getY()==560){
            Greenfoot.stop();
        }
        else{
            salta();
        }
    }    
}
