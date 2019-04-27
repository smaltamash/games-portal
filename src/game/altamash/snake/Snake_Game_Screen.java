package game.altamash.snake;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;
public class Snake_Game_Screen extends JPanel implements Runnable 
{
	private static final long serialVersionUID = 4L;
	public static final int WIDTH=720,HEIGHT=720;
	private Thread gameThread;
	private Boolean gameState;
	private Snake_Body body;
	private ArrayList<Snake_Body> snakeBody;
	private Snake_Food sFood;
	private ArrayList<Snake_Food> food;
	private Random rn;
	static int xValue,yValue;
	static int snakeSize;
	static int snakeSpeed;
	static int score;
	static boolean moveRight,moveLeft,moveUp,moveDown;
	Key_Control keyObj;
	static int bonusFlag;
	public static boolean returnSnakeGameFrame;
	public Snake_Game_Screen()
	{
		setFocusable(true);
		keyObj=new Key_Control();
		addKeyListener(keyObj);
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		rn=new Random();
		snakeBody=new ArrayList<>();
		food=new ArrayList<>();
		xValue=15;
		yValue=15;
		snakeSize=5;
		score=0;
		bonusFlag=0;
		gameState=false;
		moveRight=true;
		moveLeft=false;
		moveUp=false;
		moveDown=false;
		returnSnakeGameFrame=false;
		gameStart();
	}
	public void gameControl()
	{
		if(snakeBody.size()==0)
		{
			body=new Snake_Body(xValue,yValue,20);
			snakeBody.add(body);
		}
		for(int i=0;i<snakeBody.size();i++)
		{
			if(xValue==snakeBody.get(i).getX() && yValue==snakeBody.get(i).getY())
			{
				if(i!=snakeBody.size()-1)
				{
					gameStop();
				}
			}
		}
		if(xValue<2 || xValue>33 || yValue<2 || yValue>33)
		{
			gameStop();
		}
		try
		{
			Thread.sleep(snakeSpeed);
		}
		catch(InterruptedException e) 
		{
			e.printStackTrace();
		} 
		if(moveRight)
			xValue++;
		if(moveLeft)
			xValue--;
		if(moveUp)
			yValue--;
		if(moveDown)
			yValue++;
		body=new Snake_Body(xValue,yValue,20);
		snakeBody.add(body);
		if(snakeBody.size()>snakeSize)
			snakeBody.remove(0);
		if(food.size()==0)
		{
			addFood();
			int iFood=0;
			for(int j=0;j<snakeBody.size();j++)
			{
				if(food.get(iFood).getX()==snakeBody.get(j).getX() && food.get(iFood).getY()==snakeBody.get(j).getY())
				{
					food.remove(iFood);
					addFood();
				}
			}
		}
		if(bonusFlag>=5)
		{
			for(int i=0;i<food.size();i++)
			{
				if(xValue==food.get(i).getX() && yValue==food.get(i).getY())
				{
					snakeSize++;
					food.remove(i);
					i--;
					score+=5;
					bonusFlag=0;
				}				
			}
		}
		else
		{
			for(int i=0;i<food.size();i++)
			{
				if(xValue==food.get(i).getX() && yValue==food.get(i).getY())
				{
					snakeSize++;
					food.remove(i);
					i--;
					score++;
					bonusFlag++;
				}
			}
		}
	}
	public void paint(Graphics g)
	{
		g.clearRect(0,0,WIDTH,HEIGHT);
		Color chocolate = new Color(210,105,30);
		g.setColor(chocolate);
		g.fillRect(0,0,WIDTH,20);
		g.fillRect(0,20,20,HEIGHT);
		g.fillRect(20,700,WIDTH,20);
		g.fillRect(700,20,20,HEIGHT);
		if(Snake_Game_Selection_Frame.gridFlag==1)
		{
			g.setColor(Color.black);
			for(int i=0;i<WIDTH;i++)
			{
				g.drawLine(i*20,0,i*20,HEIGHT);//Vertical Lines
			}
			for(int i=0;i<WIDTH;i++)
			{
				g.drawLine(0,i*20,WIDTH,i*20);//Horizontal lines
			}
		}
		for(int i=0;i<snakeBody.size();i++)
		{
			snakeBody.get(i).draw(g);
		}
		for(int i=0;i<food.size();i++)
		{
			food.get(i).draw(g);
		}
	}
	public void addFood()
	{
		int x=rn.nextInt(31)+2;
		int y=rn.nextInt(31)+2;
		sFood=new Snake_Food(x,y,20);
		food.add(sFood);
	}
	public void gameStart()
	{
		gameState=true;
		gameThread=new Thread(this,"Game Control Thread");
		gameThread.start();
	}
	public void gameStop()
	{
		gameState=false;
		returnSnakeGameFrame=true;
		try
		{
			gameThread.join();
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
	public void run() 
	{
		while(gameState)
		{
			gameControl();
			repaint();
		}
	}
}
