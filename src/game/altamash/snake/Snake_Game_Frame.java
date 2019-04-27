package game.altamash.snake;
import java.awt.GridLayout;
import javax.swing.JFrame;
public class Snake_Game_Frame extends JFrame 
{
	private static final long serialVersionUID = 3L;
	public Snake_Game_Frame()
	{
		createFrame();
	}
	public void createFrame()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(Snake_Game_Intro_Frame.titleValue);
		setResizable(false);
		Snake_Game_Screen screen=new Snake_Game_Screen();
		add(screen);
		setLayout(new GridLayout(1,1,0,0));
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
