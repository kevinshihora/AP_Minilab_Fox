package socialdistancing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Wall extends Building{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected boolean visible;
    protected Image image;
    protected boolean vertical;
    
    public static Wall[] walls;
    public static Rectangle[] r;

    public Wall(int x, int y, String imageS, boolean vertical) {

        this.x = x;
        this.y = y;
        visible = true;
        this.vertical = vertical;
        loadImage(imageS);
        getImageDimensions();
   
    }
    
    
    public static void makeWalls()
    {
    	Wall vWall1 = new Wall(550, 0, "SocialDistancingImages/wall2.png", true);
		Wall vWall2 = new Wall(200, 0, "SocialDistancingImages/wall2.png", true);
		Wall vWall3 = new Wall(550, 400, "SocialDistancingImages/wall2.png", true);
		Wall vWall4 = new Wall(200, 400, "SocialDistancingImages/wall2.png", true);
		
		Wall hWall1 = new Wall(620, 160, "SocialDistancingImages/wall1.png", false);
		Wall hWall2 = new Wall(-25, 160, "SocialDistancingImages/wall1.png", false);
		Wall hWall3 = new Wall(620, 400, "SocialDistancingImages/wall1.png", false);
		Wall hWall4 = new Wall(-25, 400, "SocialDistancingImages/wall1.png", false);
		walls = new Wall[]{vWall1, hWall1, vWall2, hWall2, vWall3, hWall3, vWall4, hWall4};
		r = new Rectangle[]{vWall1.getBounds(), hWall1.getBounds(), vWall2.getBounds(), hWall2.getBounds(),
				vWall3.getBounds(), hWall3.getBounds(), vWall4.getBounds(), hWall4.getBounds()};
    }
    
    protected void loadImage(String imageName) {

        ImageIcon ii = new ImageIcon(imageName);
        image = ii.getImage();
    }
    
    protected void getImageDimensions() {

        this.width = image.getWidth(null);
        this.height = image.getHeight(null);
    }    

    public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }
    
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }
}