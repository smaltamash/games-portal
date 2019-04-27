package game.altamash.tictactoe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Tic_Tac_Toe_Game_Input_Frame extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 2L;
	JLabel top,player1,player2;
	JTextField player1Name,player2Name;
	JButton next,exit;
	public boolean returnTTTGameInputFrame;
	public Tic_Tac_Toe_Game_Input_Frame()
	{
		setTitle(Tic_Tac_Toe_Game_Intro_Frame.titleValue);
		setSize(420,420);
		returnTTTGameInputFrame=false;
		top=new JLabel("ENTER THE PLAYERS NAME");
		player1=new JLabel("1.Enter name of Player One (X) :-");
		player2=new JLabel("2.Enter name of Player Two (O) :-");
		player1Name=new JTextField();
		player2Name=new JTextField();
		next=new JButton("NEXT >");
		exit=new JButton("EXIT");
		top.setBounds(110,40,250,10);
		player1.setBounds(90,90,250,20);
		player1Name.setBounds(90,130,220,30);
		player2.setBounds(90,180,260,20);
		player2Name.setBounds(90,220,220,30);
		next.setBounds(110,290,80,40);
		exit.setBounds(210,290,80,40);
		add(top);
		add(player1);
		add(player1Name);
		add(player2);
		add(player2Name);
		add(next);
		add(exit);
		next.addActionListener(this);
		exit.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(player1Name.getText().equals(""))
			Tic_Tac_Toe_Game_Frame.playerOne="Player One";
		else
			Tic_Tac_Toe_Game_Frame.playerOne=player1Name.getText();
		if(player2Name.getText().equals(""))
			Tic_Tac_Toe_Game_Frame.playerTwo="Player Two";
		else
			Tic_Tac_Toe_Game_Frame.playerTwo=player2Name.getText();
		if(e.getSource()==next)
		{
			returnTTTGameInputFrame=true;
		}
		if(e.getSource()==exit)
		{
			System.exit(EXIT_ON_CLOSE);
		}

	}
}