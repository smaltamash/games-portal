package game.altamash.snake;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Snake_Game_Start_Frame extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 5L;
	JLabel alert;
	JButton start;
	Font f1;
	public boolean returnSnakeGameStartFrame;
	public Snake_Game_Start_Frame()
	{
		setTitle(Snake_Game_Intro_Frame.titleValue);
		setSize(400,250);
		returnSnakeGameStartFrame=false;
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
			returnSnakeGameStartFrame=true;
		}
	}
}
