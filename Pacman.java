import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pacman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pacman extends Actor
{
    private static final int COUNT_DOWN_MOUTH_START_VALUE = 10;
    private static final int OFFSET = 5;
    
    private static final int DIRECTION_RIGHT = 0;
    private static final int DIRECTION_LEFT = 1;
    private static final int DIRECTION_UP = 2;
    private static final int DIRECTION_DOWN = 3;
    
    private int mouthDelay = COUNT_DOWN_MOUTH_START_VALUE;
    
    private String [][]images;
    private int imageIndex;
    private int direction = DIRECTION_RIGHT;
    
    private int score;
    
    public Pacman(){
        
        prepareImagesCollection();
        
        setImage(images[DIRECTION_RIGHT][0]);
    }
    
    public void act()
    {
        movePacman();
        
        handleKeys();
        
        handleImageSelector();
        
        checkCollisions();
        
        updateHud();
    }
    
    private void prepareImagesCollection(){
        images = new String[4][];
        images[DIRECTION_RIGHT]=new String[]{
            "images/pacman-close.png",
            "images/pacman-open.png"
        };
        images[DIRECTION_LEFT]=new String[]{
            "images/pacman-close-left.png",
            "images/pacman-open-left.png"
        };
        images[DIRECTION_DOWN]=new String[]{
            "images/pacman-close-down.png",
            "images/pacman-open-down.png"
        };
        images[DIRECTION_UP]=new String[]{
            "images/pacman-close-up.png",
            "images/pacman-open-up.png"
        };
    }
    
    private void movePacman(){
        switch(direction){
            case DIRECTION_RIGHT:
                setLocation(getX() + OFFSET, getY());
                if(isTouching(Wall.class)){
                    setLocation(getX() - OFFSET, getY());
                }
                break;
            case DIRECTION_LEFT:
                setLocation(getX() - OFFSET, getY());
                if(isTouching(Wall.class)){
                    setLocation(getX() + OFFSET, getY());
                }
                break;
            case DIRECTION_UP:
                setLocation(getX() , getY() - OFFSET);
                if(isTouching(Wall.class)){
                    setLocation(getX(), getY() + OFFSET);
                }
                break;
            case DIRECTION_DOWN:
                setLocation(getX(), getY() + OFFSET);
                if(isTouching(Wall.class)){
                    setLocation(getX(), getY() - OFFSET);
                }
                break;
        }
    }
    
    private void handleKeys(){
        if(Greenfoot.isKeyDown("left")){
            direction = DIRECTION_LEFT;
        }else if(Greenfoot.isKeyDown("right")){
            direction=DIRECTION_RIGHT;
        }else if(Greenfoot.isKeyDown("up")){
            direction=DIRECTION_UP;
        }else if(Greenfoot.isKeyDown("down")){
            direction=DIRECTION_DOWN;
        }
    }
    private void handleImageSelector(){
        mouthDelay--;
        if(mouthDelay==0){
            imageIndex=(imageIndex+1)%images[direction].length;
            setImage(images[direction][imageIndex]);
            mouthDelay=COUNT_DOWN_MOUTH_START_VALUE;
        }
    }
    
    private void checkCollisions(){
        Item item = (Item)this.getOneIntersectingObject(Item.class);
        if(item!=null){
            score+=item.getPoints();
            this.getWorld().removeObject(item);
        }
        /*if(isTouching(Wall.class)){
            setLocation(getX()-OFFSET,getY()-OFFSET);
        }*/
    }
    
    private void updateHud(){
        World world = getWorld();
        world.showText("Score:" + score, world.getWidth() -100, 20);
    }
}
