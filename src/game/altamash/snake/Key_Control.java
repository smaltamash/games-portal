package game.altamash.snake;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
class Key_Control extends KeyAdapter
{
	public void keyPressed(KeyEvent e)
	{
		int key=e.getKeyCode();
		if(key==KeyEvent.VK_RIGHT && !Snake_Game_Screen.moveLeft)
		{
			Snake_Game_Screen.moveUp=false;
			Snake_Game_Screen.moveDown=false;
			Snake_Game_Screen.moveRight=true;
		}
		if(key==KeyEvent.VK_LEFT && !Snake_Game_Screen.moveRight)
		{
			Snake_Game_Screen.moveUp=false;
			Snake_Game_Screen.moveDown=false;
			Snake_Game_Screen.moveLeft=true;
		}
		if(key==KeyEvent.VK_UP && !Snake_Game_Screen.moveDown)
		{
			Snake_Game_Screen.moveUp=true;
			Snake_Game_Screen.moveLeft=false;
			Snake_Game_Screen.moveRight=false;
		}
		if(key==KeyEvent.VK_DOWN && !Snake_Game_Screen.moveUp)
		{
			Snake_Game_Screen.moveDown=true;
			Snake_Game_Screen.moveLeft=false;
			Snake_Game_Screen.moveRight=false;
		}
	}
}
