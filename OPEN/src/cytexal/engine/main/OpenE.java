package cytexal.engine.main;


import org.lwjgl.*;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.*;
import org.newdawn.slick.Color;
import org.newdawn.slick.TrueTypeFont;

import cytexal.engine.gameobject.Camera;
import cytexal.engine.gameobject.GameObject;
import cytexal.engine.manage.RenderManager;
import cytexal.engine.manage.WorkshopManager;
import cytexal.engine.manage.WorldManager;
import static org.lwjgl.opengl.GL11.*;

import java.awt.Font;
 
public class OpenE {
 
    /////////////////////
    static 
    World world;
    static String devText="OPEN";
    static TrueTypeFont font;
    /////////////////////
 
    public void run() {
        System.out.println("Hello LWJGL " + 1 + "!");
 
            init();
            RenderManager.setBackgroundColor(1, 1, 1, 1);
            Camera cam =new Camera(0, 0, 0, 70, 16f/9, 0.1f, 1000f);
            cam.use();
            world=WorldManager.load("OPEN/TestWorld");
            world.addChild(cam);
            loop();
    }
 
    private void init() {
    	try {
			Display.setDisplayMode(new DisplayMode(1600,900));
			Display.create();
			Display.setTitle("OPEN");
			Mouse.setGrabbed(true);
			GL11.glViewport(0, 0, 1600, 900);
			WorkshopManager.init();
			font=new TrueTypeFont(new Font("Times New Roman", Font.BOLD, 24),false);
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
 
    private void loop() {
    	OGraphics graphics=new OGraphics();
    	long last=System.currentTimeMillis();
    	double time=0;
        while ( !Display.isCloseRequested()) {
            glEnable(GL_DEPTH_TEST);
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT); // clear the framebuffer
        	for(GameObject g:world.getChilds()){
        		g.doUpdate(time);
        	}
        	for(GameObject g:world.getChilds()){
        		g.doDraw(graphics);
        	}
        	Color.white.bind();
        	font.drawString(100, 50, devText,Color.cyan);
            Display.update();
            Display.sync(60);
            time=(double)(System.currentTimeMillis()-last)/1000;
            last=System.currentTimeMillis();
        }
    }
    
 
    public static void main(String[] args) {
        new OpenE().run();
    }

	public static World getWorld() {
		// TODO Auto-generated method stub
		return world;
	}
 
}