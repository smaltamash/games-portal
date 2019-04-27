package game.altamash.tictactoe;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Tic_Tac_Toe_Game_Start_Frame extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 3L;
	JLabel alert;
	JButton start;
	Font f1;
	public boolean returnTTTGameStartFrame;
	public Tic_Tac_Toe_Game_Start_Frame()
	{
		setTitle(Tic_Tac_Toe_Game_Intro_Frame.titleValue);
		setSize(400,250);
		returnTTTGameStartFrame=false;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		alert=new JLabel("Get ready for the Game");
		start=new JButton("START");
		f1=new Font("Arial",Font.PLAIN,25);
		alert.setBounds(65,40,350,40);
		start.setBounds(145,120,100,40);
		alert.setFont(f1);
		add(alert);
		add(start);
		start.addActionListener(this);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==start)
		{
			returnTTTGameStartFrame=true;
		}
	}
}
