package gamesportal.altamash.games;
import controlsystem.altamash.control.Control_System;
import game.altamash.snake.Snake_Game_Final_Frame;
import game.altamash.snake.Snake_Game_Frame;
import game.altamash.snake.Snake_Game_Intro_Frame;
import game.altamash.snake.Snake_Game_Screen;
import game.altamash.snake.Snake_Game_Selection_Frame;
import game.altamash.snake.Snake_Game_Start_Frame;
import game.altamash.tictactoe.Tic_Tac_Toe_Game_Final_Frame;
import game.altamash.tictactoe.Tic_Tac_Toe_Game_Frame;
import game.altamash.tictactoe.Tic_Tac_Toe_Game_Input_Frame;
import game.altamash.tictactoe.Tic_Tac_Toe_Game_Intro_Frame;
import game.altamash.tictactoe.Tic_Tac_Toe_Game_Start_Frame;
public class Games_Portal_Main 
{
	static boolean gamesPortalState,portalLoop1,portalLoop2;
	static boolean snakeLoop1,snakeLoop2,snakeLoop3,snakeLoop4,snakeLoop5,gameStateRunningSnake;
	static boolean tttLoop1,tttLoop2,tttLoop3,tttLoop4,tttLoop5,gameStateRunningTTT;
	static boolean controlSystemState;
	public static void main(String[] args)
	{
		gamesPortalState=true;
		while(gamesPortalState)
		{
			System.out.print("");
			gamesPortalState=false;
			Games_Portal_Intro_Frame GamesPortalIntroFrame=new Games_Portal_Intro_Frame();
			portalLoop1=true;
			while(portalLoop1)
			{
				System.out.print("");
				if(Games_Portal_Intro_Frame.returnGamesPortalIntroFrame==true)
				{
					portalLoop1=false;
					GamesPortalIntroFrame.dispose();
					Games_Portal_Selection_Frame GamesPortalSelection=new Games_Portal_Selection_Frame();
					portalLoop2=true;
					while(portalLoop2)
					{
						System.out.print("");
						if(Games_Portal_Selection_Frame.returnGamesPortalSelectionFrameSnake==true)
						{
							portalLoop2=false;
							GamesPortalSelection.dispose();
							gameStateRunningSnake=true;
							while(gameStateRunningSnake)
							{
								System.out.print("");
								gameStateRunningSnake=false;
								Snake_Game_Intro_Frame SnakeGameIntroFrame=new Snake_Game_Intro_Frame();
								snakeLoop1=true;
								while(snakeLoop1)
								{
									System.out.print("");
									if(SnakeGameIntroFrame.returnSnakeGameIntroFrame==true)
									{
										snakeLoop1=false;
										Snake_Game_Selection_Frame SnakeGameSelectionFrame=new Snake_Game_Selection_Frame();
										SnakeGameIntroFrame.dispose();
										snakeLoop2=true;
										while(snakeLoop2)
										{
											System.out.print("");
											if(SnakeGameSelectionFrame.returnSnakeGameSelectionFrame==true)
											{
												snakeLoop2=false;
												Snake_Game_Start_Frame SnakeGameStartFrame=new Snake_Game_Start_Frame();
												SnakeGameSelectionFrame.dispose();
												snakeLoop3=true;
												while(snakeLoop3)
												{
													System.out.print("");
													if(SnakeGameStartFrame.returnSnakeGameStartFrame==true)
													{
														snakeLoop3=false;
														Snake_Game_Frame SnakeGameFrame=new Snake_Game_Frame();
														SnakeGameStartFrame.dispose();
														snakeLoop4=true;
														while(snakeLoop4)
														{
															System.out.print("");
															if(Snake_Game_Screen.returnSnakeGameFrame==true)
															{
																snakeLoop4=false;
																Snake_Game_Final_Frame SnakeGameFinalFrame=new Snake_Game_Final_Frame();
																snakeLoop5=true;
																while(snakeLoop5)
																{
																	System.out.print("");
																	if(SnakeGameFinalFrame.returnSnakeGameFinalFrameRestart==true)
																	{
																		snakeLoop5=false;
																		SnakeGameFrame.dispose();
																		SnakeGameFinalFrame.dispose();
																		gameStateRunningSnake=true;
																	}
																	if(SnakeGameFinalFrame.returnSnakeGameFinalFrameMainMenu==true)
																	{
																		snakeLoop5=false;
																		SnakeGameFrame.dispose();
																		SnakeGameFinalFrame.dispose();
																		gamesPortalState=true;
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
						if(Games_Portal_Selection_Frame.returnGamesPortalSelectionFrameTTT==true)
						{
							portalLoop2=false;
							GamesPortalSelection.dispose();
							gameStateRunningTTT=true;
							while(gameStateRunningTTT)
							{
								System.out.print("");
								gameStateRunningTTT=false;
								Tic_Tac_Toe_Game_Intro_Frame TTTGameIntroFrame=new Tic_Tac_Toe_Game_Intro_Frame();
								tttLoop1=true;
								while(tttLoop1)
								{
									System.out.print("");
									if(TTTGameIntroFrame.returnTTTGameIntroFrame==true)
									{
										tttLoop1=false;
										Tic_Tac_Toe_Game_Input_Frame TTTGameInputFrame=new Tic_Tac_Toe_Game_Input_Frame();
										TTTGameIntroFrame.dispose();
										tttLoop2=true;
										while(tttLoop2)
										{
											System.out.print("");
											if(TTTGameInputFrame.returnTTTGameInputFrame==true)
											{
												tttLoop2=false;
												Tic_Tac_Toe_Game_Start_Frame TTTGameStartFrame=new Tic_Tac_Toe_Game_Start_Frame();
												TTTGameInputFrame.dispose();
												tttLoop3=true;
												while(tttLoop3)
												{
													System.out.print("");
													if(TTTGameStartFrame.returnTTTGameStartFrame==true)
													{
														tttLoop3=false;
														Tic_Tac_Toe_Game_Frame TTTGameFrame=new Tic_Tac_Toe_Game_Frame();
														TTTGameStartFrame.dispose();
														tttLoop4=true;
														while(tttLoop4)
														{
															System.out.print("");
															if(TTTGameFrame.returnTTTGameFrame==true)
															{
																tttLoop4=false;
																Tic_Tac_Toe_Game_Final_Frame TTTGameFinalFrame=new Tic_Tac_Toe_Game_Final_Frame();
																tttLoop5=true;
																while(tttLoop5)
																{
																	System.out.print("");
																	if(TTTGameFinalFrame.returnTTTGameFinalFrameRestart==true)
																	{
																		tttLoop5=false;
																		TTTGameFrame.dispose();
																		TTTGameFinalFrame.dispose();
																		gameStateRunningTTT=true;
																	}
																	if(TTTGameFinalFrame.returnTTTGameFinalFrameMainMenu==true)
																	{
																		tttLoop5=false;
																		TTTGameFrame.dispose();
																		TTTGameFinalFrame.dispose();
																		gamesPortalState=true;
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
						if(Games_Portal_Selection_Frame.returnGamesPortalSelectionFrameBS==true)
						{
							portalLoop2=false;
							GamesPortalSelection.dispose();
							Control_System ControlSystem=new Control_System();
							controlSystemState=true;
							while(controlSystemState)
							{
								System.out.print("");
								if(Control_System.returnControlSystemMainMenu==true)
								{
									controlSystemState=false;
									ControlSystem.dispose();
									gamesPortalState=true;
								}
							}
						}
					}
				}
			}
		}
	}
}