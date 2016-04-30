package cytexal.engine.manage;

import static org.lwjgl.opengl.GL11.*;


import org.lwjgl.opengl.Display;



public class ProjectionManager {
	public static void setOrthoMode(){

        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0, Display.getWidth(), 0, Display.getHeight(), -10000, 10000);
	}
}
