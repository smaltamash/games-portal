package game.altamash.tictactoe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Tic_Tac_Toe_Game_Intro_Frame extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	static String titleValue="Tic Tac Toe Game by Altamash";
	JLabel top,about,about1,about2,about3,about4,rules,rule1,rule2,rule3,enjoy;
	JButton next,exit;
	public boolean returnTTTGameIntroFrame;
	public Tic_Tac_Toe_Game_Intro_Frame()
	{
		setTitle(titleValue);
		setSize(400,430);
		returnTTTGameIntroFrame=false;
		top=new JLabel("WELCOME TO TIC TAC TOE GAME");
		about=new JLabel("ABOUT :-");
		about1=new JLabel("This Game is designed by Syed Mohd Altamash.");
		about2=new JLabel("The Game relieve your stress.");
		about3=new JLabel("The Game may improves your Logical Reasoning.");
		about4=new JLabel("The Game may Sharpens your Mind.");
		rules=new JLabel("RULES :-");
		rule1=new JLabel("1.Mark Three Boxes Horizontally,Vertically ");
		rule2=new JLabel("or Diognally Cosecutively.");
		rule3=new JLabel("2.First Player To do above task will be the Winner.");
		enjoy=new JLabel("ENJOY THE GAME");
		next=new JButton("NEXT >");
		exit=new JButton("EXIT");
		top.setBounds(90,30,250,10);
		about.setBounds(60,70,100,10);
		about1.setBounds(60,90,300,15);
		about2.setBounds(60,105,300,15);
		about3.setBounds(60,120,300,15);
		about4.setBounds(60,135,300,15);
		rules.setBounds(60,180,100,10);
		rule1.setBounds(60,200,300,15);
		rule2.setBounds(60,215,300,15);
		rule3.setBounds(60,230,300,15);
		enjoy.setBounds(60,275,300,15);
		next.setBounds(95,325,80,40);
		exit.setBounds(195,325,80,40);
		add(top);
		add(about);
		add(about1);
		add(about2);
		add(about3);
		add(about4);
		add(rules);
		add(rule1);
		add(rule2);
		add(rule3);
		add(enjoy);
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
		if(e.getSource()==next)
		{
			returnTTTGameIntroFrame=true;
		}
		if(e.getSource()==exit)
			System.exit(EXIT_ON_CLOSE);
	}
}
