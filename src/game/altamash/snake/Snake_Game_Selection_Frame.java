package game.altamash.snake;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
public class Snake_Game_Selection_Frame extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 2L;
	JLabel selection1,selection2,selection3;
	JButton play,exit;
	JRadioButton redSnake,greenSnake,blueSnake,easy,medium,hard,yes,no;
	ButtonGroup snakeColor,difficultyLevel,grids;
	static int flag,gridFlag;
	public boolean returnSnakeGameSelectionFrame;
	public Snake_Game_Selection_Frame()
	{
		returnSnakeGameSelectionFrame=false;
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(Snake_Game_Intro_Frame.titleValue);
		setResizable(false);
		flag=0;
		gridFlag=0;
		selection1=new JLabel("Select the Color of Snake and Food :-");
		selection2=new JLabel("Select the Difficulty Level of the Game :-");
		selection3=new JLabel("Do you want the Grids in Game ?");
		play=new JButton("PLAY");
		exit=new JButton("EXIT");
		redSnake=new JRadioButton("Snake Color = Red and Food Color = Cyan");
		greenSnake=new JRadioButton("Snake Color = Green and Food Color = Red");
		blueSnake=new JRadioButton("Snake Color = Blue and Food Color = Orange",true);
		snakeColor=new ButtonGroup();
		snakeColor.add(redSnake);
		snakeColor.add(greenSnake);
		snakeColor.add(blueSnake);
		easy=new JRadioButton("EASY");
		medium=new JRadioButton("MEDIUM",true);
		hard=new JRadioButton("HARD");
		difficultyLevel=new ButtonGroup();
		difficultyLevel.add(easy);
		difficultyLevel.add(medium);
		difficultyLevel.add(hard);
		yes=new JRadioButton("Yes");
		no=new JRadioButton("No",true);
		grids=new ButtonGroup();
		grids.add(yes);
		grids.add(no);
		selection1.setBounds(70,30,300,20);
		redSnake.setBounds(70,50,300,20);
		greenSnake.setBounds(70,70,300,20);
		blueSnake.setBounds(70,90,300,20);
		selection2.setBounds(70,120,300,20);
		easy.setBounds(70,140,100,20);
		medium.setBounds(70,160,100,20);
		hard.setBounds(70,180,100,20);
		selection3.setBounds(70,210,300,20);
		yes.setBounds(70,230,300,20);
		no.setBounds(70,250,300,20);
		play.setBounds(90,300,100,30);
		exit.setBounds(200,300,100,30);
		add(selection1);
		add(redSnake);
		add(greenSnake);
		add(blueSnake);
		add(selection2);
		add(easy);
		add(medium);
		add(hard);
		add(selection3);
		add(yes);
		add(no);
		add(play);
		add(exit);
		play.addActionListener(this);
		exit.addActionListener(this);
		setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==play)
		{
			if(redSnake.isSelected())
				flag=1;
			if(greenSnake.isSelected())
				flag=2;
			if(blueSnake.isSelected())
				flag=3;
			if(easy.isSelected())
				Snake_Game_Screen.snakeSpeed=60;
			if(medium.isSelected())
				Snake_Game_Screen.snakeSpeed=50;
			if(hard.isSelected())
				Snake_Game_Screen.snakeSpeed=40;
			if(yes.isSelected())
				gridFlag=1;
			returnSnakeGameSelectionFrame=true;
		}
		if(e.getSource()==exit)
			System.exit(EXIT_ON_CLOSE);
	}
}
