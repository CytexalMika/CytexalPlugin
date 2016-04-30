package cytexal.engine.main;

import static org.lwjgl.opengl.GL11.*;

import java.awt.Color;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.util.vector.Matrix4f;

import cytexal.engine.model.RawModel;

public class OGraphics {
	public void drawRect(int x, int y, int width, int height){
        glPushMatrix();
        glTranslatef(x, y, 0);
        glBegin(GL_QUADS);
        {
        	glVertex2f(0, 0);
        	glVertex2f(0, height);
        	glVertex2f(width, height);
        	glVertex2f(width, 0);
        }
        glEnd();
        glPopMatrix();
	}
	public void drawRect(float x, float y, float width, float height, float rot){
		glPushMatrix();
        glRotatef(rot, x, y, 1);
        glTranslatef(x, y, 0);
        glBegin(GL_QUADS);
        {
        	glVertex2f(0, 0);
        	glVertex2f(0, height);
        	glVertex2f(width, height);
        	glVertex2f(width, 0);
        }
        glEnd();
        glPopMatrix();
	}
	public void setColor(float r, float g, float b){
		glColor3f(r, g, b);
	}
	OGraphics() {
	}
	public void drawModel(RawModel model, Matrix4f matrix) {
		GL30.glBindVertexArray(model.getVaoID());
		GL20.glEnableVertexAttribArray(0);
		GL20.glEnableVertexAttribArray(1);
		GL20.glEnableVertexAttribArray(2);
		model.getMaterial().apply();
		model.getMaterial().applyMatrix(matrix);
		GL11.glDrawElements(GL11.GL_TRIANGLES, model.getVertexCount(),GL11.GL_UNSIGNED_INT,0);
		model.getMaterial().unApply();
		GL20.glDisableVertexAttribArray(0);
		GL20.glDisableVertexAttribArray(1);
		GL20.glDisableVertexAttribArray(2);
		GL30.glBindVertexArray(0);
	}
}
