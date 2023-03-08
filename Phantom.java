import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Phantom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Phantom extends Item
{
    private int offset = 5;
    private int nextOffset = 2;
    public Phantom(){
        super(50);
        offset=nextOffset;
        nextOffset+=5;
    }
    
    public void act()
    {
        movement();
    }
    private void movement(){
        int x = getX();
        int y = getY();
        setLocation(x+offset,y);
        if(getX() >= 575 || getX() <=0){
            offset*=-1;
        }
    }
}
