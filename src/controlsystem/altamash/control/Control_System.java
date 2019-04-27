package controlsystem.altamash.control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Control_System extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 2L;
	JLabel top,restart1,restart2,shutdown1,shutdown2;
	JButton restart,shutdown,returnToMainMenu;
	public static boolean returnControlSystemMainMenu;
	public Control_System()
	{
		setTitle("Control System by Altamash");
		setSize(390,440);
		returnControlSystemMainMenu=false;
		top=new JLabel("CONTROL YOUR SYSTEM");
		restart1=new JLabel("1.Press the below button to");
		restart2=new JLabel(" Restart your system :-");
		shutdown1=new JLabel("2.Press the below button to");
		shutdown2=new JLabel(" Shutdown your system :-");
		restart=new JButton("RESTART");
		shutdown=new JButton("SHUTDOWN");
		returnToMainMenu=new JButton("RETURN TO MAIN MENU");
		top.setBounds(100,40,250,10);
		restart1.setBounds(90,80,250,20);
		restart2.setBounds(90,100,220,20);
		restart.setBounds(120,130,120,40);
		shutdown1.setBounds(90,190,250,20);
		shutdown2.setBounds(90,210,220,20);
		shutdown.setBounds(120,240,120,40);
		returnToMainMenu.setBounds(95,310,180,40);
		add(top);
		add(restart1);
		add(restart2);
		add(shutdown1);
		add(shutdown2);
		add(restart);
		add(shutdown);
		add(returnToMainMenu);
		restart.addActionListener(this);
		shutdown.addActionListener(this);
		returnToMainMenu.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==restart)
		{
			try
			{
				Runtime.getRuntime().exec("shutdown -r -t 0");
			}
			catch(IOException e1) 
			{
				System.out.println(e1);
			}
		}
		if(e.getSource()==shutdown)
		{
			try
			{
				Runtime.getRuntime().exec("shutdown -s -t 0");
			}
			catch(IOException e2) 
			{
				System.out.println(e2);
			}
		}
		if(e.getSource()==returnToMainMenu)
		{
			returnControlSystemMainMenu=true;
		}
	}
}