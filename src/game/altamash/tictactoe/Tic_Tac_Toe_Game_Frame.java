package game.altamash.tictactoe;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Tic_Tac_Toe_Game_Frame extends JFrame
{
	private static final long serialVersionUID = 4L;
	private Container pane;
	private String playerPlaying;
	private JButton[][] board;
	static boolean winnerDeclared;
	static String gameWinner,playerOne,playerTwo;
	public boolean returnTTTGameFrame,drawFlag;
	byte drawFlagNo;
	public Tic_Tac_Toe_Game_Frame()
	{
		pane=getContentPane();
		pane.setLayout(new GridLayout(3,3));
		setTitle("Tic Tac Toe Game Altamash");
		setSize(600,600);
		returnTTTGameFrame=false;
		playerPlaying="X";
		board=new JButton[3][3];
		winnerDeclared=false;
		drawFlagNo=0;
		createGameBoard();
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void createGameBoard()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				JButton box=new JButton();
				box.setFont(new Font(Font.SANS_SERIF,Font.BOLD,150));
				board[i][j]=box;
				box.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e)
					{
						if(((JButton)e.getSource()).getText().equals("") && winnerDeclared==false)
						{
							box.setText(playerPlaying);
							checkWinner();
							changeGamePlayer();
							checkDraw();
						}
					}
				});
				pane.add(box);
			}
		}
	}
	public void changeGamePlayer()
	{
		if(playerPlaying.equals("X"))
			playerPlaying="O";
		else
			playerPlaying="X";
	}
	public void checkWinner()
	{
		if(board[0][0].getText().equals(playerPlaying) && board[1][0].getText().equals(playerPlaying) && board[2][0].getText().equals(playerPlaying))
		{
			if(playerPlaying.equals("X"))
				gameWinner=playerOne;
			else
				gameWinner=playerTwo;
			winnerDeclared=true;
			returnTTTGameFrame=true;
		}
		else if(board[0][1].getText().equals(playerPlaying) && board[1][1].getText().equals(playerPlaying) && board[2][1].getText().equals(playerPlaying))
		{
			if(playerPlaying.equals("X"))
				gameWinner=playerOne;
			else
				gameWinner=playerTwo;
			winnerDeclared=true;
			returnTTTGameFrame=true;

		}
		else if(board[0][2].getText().equals(playerPlaying) && board[1][2].getText().equals(playerPlaying) && board[2][2].getText().equals(playerPlaying))
		{
			if(playerPlaying.equals("X"))
				gameWinner=playerOne;
			else
				gameWinner=playerTwo;
			winnerDeclared=true;
			returnTTTGameFrame=true;

		}
		else if(board[0][0].getText().equals(playerPlaying) && board[0][1].getText().equals(playerPlaying) && board[0][2].getText().equals(playerPlaying))
		{
			if(playerPlaying.equals("X"))
				gameWinner=playerOne;
			else
				gameWinner=playerTwo;
			winnerDeclared=true;
			returnTTTGameFrame=true;

		}
		else if(board[1][0].getText().equals(playerPlaying) && board[1][1].getText().equals(playerPlaying) && board[1][2].getText().equals(playerPlaying))
		{
			if(playerPlaying.equals("X"))
				gameWinner=playerOne;
			else
				gameWinner=playerTwo;
			winnerDeclared=true;
			returnTTTGameFrame=true;

		}
		else if(board[2][0].getText().equals(playerPlaying) && board[2][1].getText().equals(playerPlaying) && board[2][2].getText().equals(playerPlaying))
		{
			if(playerPlaying.equals("X"))
				gameWinner=playerOne;
			else
				gameWinner=playerTwo;
			winnerDeclared=true;
			returnTTTGameFrame=true;

		}
		else if(board[0][0].getText().equals(playerPlaying) && board[1][1].getText().equals(playerPlaying) && board[2][2].getText().equals(playerPlaying))
		{
			if(playerPlaying.equals("X"))
				gameWinner=playerOne;
			else
				gameWinner=playerTwo;
			winnerDeclared=true;
			returnTTTGameFrame=true;

		}
		else if(board[0][2].getText().equals(playerPlaying) && board[1][1].getText().equals(playerPlaying) && board[2][0].getText().equals(playerPlaying))
		{
			if(playerPlaying.equals("X"))
				gameWinner=playerOne;
			else
				gameWinner=playerTwo;
			winnerDeclared=true;
			returnTTTGameFrame=true;

		}
	}
	public void checkDraw()
	{
		drawFlagNo=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(board[i][j].getText().equals(""))
					drawFlag=false;
				else
				{
					drawFlagNo++;
				}

			}
		}
		if(drawFlagNo==9)
			returnTTTGameFrame=true;
	}
} 