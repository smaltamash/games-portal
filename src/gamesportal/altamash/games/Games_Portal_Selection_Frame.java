package gamesportal.altamash.games;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Games_Portal_Selection_Frame extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 2L;
	JLabel top,game1,game2,bonus1;
	JButton snakeGamebyAltamash,tictactoeGamebyAltamash,bonusStuff;
	public static boolean returnGamesPortalSelectionFrameSnake,returnGamesPortalSelectionFrameTTT,returnGamesPortalSelectionFrameBS;
	Games_Portal_Selection_Frame()
	{
		setTitle(Games_Portal_Intro_Frame.titleValue);
		setSize(500,500);
		returnGamesPortalSelectionFrameSnake=false;
		returnGamesPortalSelectionFrameTTT=false;
		returnGamesPortalSelectionFrameBS=false;
		top=new JLabel("GAME PORTAL GAME SELECTION");
		game1=new JLabel("1.Press Button below to play Snake Game by Altamash");
		game2=new JLabel("2.Press Button Below to play Tic Tac Toe Game by Altamash");
		bonus1=new JLabel("3.Press Button Below to control this System");
		snakeGamebyAltamash=new JButton("SNAKE GAME BY ALTAMASH");
		tictactoeGamebyAltamash=new JButton("TIC TAC TOE GAME BY ALTAMASH");
		bonusStuff=new JButton("CONTROL YOUR SYSTEM");
		top.setBounds(150,40,250,10);
		game1.setBounds(90,90,350,20);
		snakeGamebyAltamash.setBounds(90,130,300,40);
		game2.setBounds(90,190,350,20);
		tictactoeGamebyAltamash.setBounds(90,230,300,40);
		bonus1.setBounds(90,290,350,20);
		bonusStuff.setBounds(90,330,300,40);
		add(top);
		add(game1);
		add(snakeGamebyAltamash);
		add(game2);
		add(tictactoeGamebyAltamash);
		add(bonus1);
		add(bonusStuff);
		snakeGamebyAltamash.addActionListener(this);
		tictactoeGamebyAltamash.addActionListener(this);
		bonusStuff.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==snakeGamebyAltamash)
		{
			returnGamesPortalSelectionFrameSnake=true;
		}
		if(e.getSource()==tictactoeGamebyAltamash)
		{
			returnGamesPortalSelectionFrameTTT=true;
		}
		if(e.getSource()==bonusStuff)
		{
			returnGamesPortalSelectionFrameBS=true;
		}
	}
}