package game.altamash.tictactoe;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Tic_Tac_Toe_Game_Final_Frame extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 5L;
	JButton restart,exit,returnToMainMenu;
	JLabel over,scoreFinal;
	Font f2,f3;
	public boolean returnTTTGameFinalFrameRestart,returnTTTGameFinalFrameMainMenu;
	public Tic_Tac_Toe_Game_Final_Frame()
	{
		setTitle(Tic_Tac_Toe_Game_Intro_Frame.titleValue);
		setSize(430,350);
		returnTTTGameFinalFrameRestart=false;
		returnTTTGameFinalFrameMainMenu=false;
		f2=new Font("Arial",Font.PLAIN,30);
		over=new JLabel("GAME OVER");
		over.setFont(f2);
		over.setBounds(115,30,200,40);
		if(Tic_Tac_Toe_Game_Frame.winnerDeclared==true)
			scoreFinal=new JLabel(Tic_Tac_Toe_Game_Frame.gameWinner+" won the Game");
		else
			scoreFinal=new JLabel("          It is a Draw");
		f3=new Font("Arial",Font.PLAIN,20);
		scoreFinal.setFont(f3);
		scoreFinal.setBounds(105,90,340,30);
		restart=new JButton("RESTART");
		exit=new JButton("EXIT");
		returnToMainMenu=new JButton("RETURN TO MAIN MENU");
		restart.setBounds(100,150,100,40);
		restart.addActionListener(this);
		exit.setBounds(220,150,100,40);
		exit.addActionListener(this);
		returnToMainMenu.setBounds(100,210,220,40);
		returnToMainMenu.addActionListener(this);
		add(restart);
		add(exit);
		add(returnToMainMenu);
		add(over);
		add(scoreFinal);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==restart)
			returnTTTGameFinalFrameRestart=true;
		if(e.getSource()==exit)
			System.exit(EXIT_ON_CLOSE);
		if(e.getSource()==returnToMainMenu)
			returnTTTGameFinalFrameMainMenu=true;
	}
}