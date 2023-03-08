import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wall wall = new Wall();
        addObject(wall,120,158);
        wall.setLocation(137,158);
        Wall wall2 = new Wall();
        addObject(wall2,190,156);
        wall2.setLocation(181,157);
        Wall wall3 = new Wall();
        addObject(wall3,235,159);
        Wall wall4 = new Wall();
        addObject(wall4,288,159);
        wall4.setLocation(263,162);
        Wall wall5 = new Wall();
        addObject(wall5,279,109);
        wall5.setLocation(295,120);
        Wall wall6 = new Wall();
        addObject(wall6,282,208);
        Wall wall7 = new Wall();
        addObject(wall7,282,258);
        Wall wall8 = new Wall();
        addObject(wall8,330,255);
        Wall wall9 = new Wall();
        addObject(wall9,376,254);
        wall8.setLocation(324,257);
        wall9.setLocation(382,259);
        Wall wall10 = new Wall();
        addObject(wall10,426,263);
        Wall wall11 = new Wall();
        addObject(wall11,426,312);
        Wall wall12 = new Wall();
        addObject(wall12,424,215);
        Apple apple = new Apple();
        addObject(apple,371,207);
        Banana banana = new Banana();
        addObject(banana,370,308);
        SmallItem smallItem = new SmallItem();
        addObject(smallItem,561,363);
        BigItem bigItem = new BigItem();
        addObject(bigItem,235,209);
        Cherry cherry = new Cherry();
        addObject(cherry,472,258);
        Strowberry strowberry = new Strowberry();
        addObject(strowberry,230,112);
        Pacman pacman = new Pacman();
        addObject(pacman,29,29);
        wall4.setLocation(291,153);
        wall3.setLocation(243,150);
        wall5.setLocation(275,108);
        wall9.setLocation(366,250);
        wall12.setLocation(407,213);
        wall10.setLocation(406,251);
        wall11.setLocation(423,298);
        wall10.setLocation(409,252);
        wall9.setLocation(382,256);
        wall11.setLocation(415,298);
        wall12.setLocation(421,206);
        wall3.setLocation(228,162);
        wall4.setLocation(264,165);
        wall5.setLocation(276,104);
        removeObject(wall5);
        wall9.setLocation(355,249);
        wall9.setLocation(375,254);
        bigItem.setLocation(224,215);
        Phantom phantom = new Phantom();
        addObject(phantom,33,368);
        smallItem.setLocation(571,33);
    }
}
