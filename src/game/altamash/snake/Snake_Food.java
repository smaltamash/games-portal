package game.altamash.snake;
import java.awt.Color;
import java.awt.Graphics;
public class Snake_Food 
{
	private int x,y,width,height;
	public Snake_Food(int x,int y,int dimension)
	{
		this.x=x;
		this.y=y;
		width=dimension;
		height=dimension;
	}
	public void draw(Graphics g)
	{
		if(Snake_Game_Selection_Frame.flag==1)
			g.setColor(Color.cyan);
		if(Snake_Game_Selection_Frame.flag==2)
			g.setColor(Color.red);
		if(Snake_Game_Selection_Frame.flag==3)
			g.setColor(Color.orange);
		if(Snake_Game_Screen.bonusFlag==5)
		{
			g.setColor(Color.black);
			g.fillOval(x*width,y*height,width,height);
			g.setColor(Color.magenta);
			g.fillOval(x*width+2,y*height+2,width-3,height-3);
		}
		else
			g.fillRect(x*width,y*height,width,height);
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
