package snakeGame;

import javax.swing.*;

public class MainSnakeGame extends JFrame{
	MainSnakeGame(){
		super("Snake Game");
		
		add(new Board());
		pack();
		setSize(300,300);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}
public static void main(String[] arg) {
	new MainSnakeGame();
}
}
