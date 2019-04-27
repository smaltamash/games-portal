package game.altamash.snake;
import java.awt.Color;
import java.awt.Graphics;
public class Snake_Body 
{
	private int x,y,width,height;
	public Snake_Body(int x,int y,int dimension)
	{
		this.x=x;
		this.y=y;
		width=dimension;
		height=dimension;
	}
	public void draw(Graphics g)
	{
		g.setColor(Color.black);
		g.fillRect(x*width,y*height,width,height);
		if(Snake_Game_Selection_Frame.flag==1)
			g.setColor(Color.red);
		if(Snake_Game_Selection_Frame.flag==2)
			g.setColor(Color.green);
		if(Snake_Game_Selection_Frame.flag==3)
			g.setColor(Color.blue);
		g.fillRect(x*width+2,y*height+2,width-3,height-3);
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
}
