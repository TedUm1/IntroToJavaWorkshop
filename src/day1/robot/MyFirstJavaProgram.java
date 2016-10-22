package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args)
	{
		
		// START HERE
		Robot dave = new Robot();
		dave.penDown();
		dave.setSpeed(90);
		for (int i = 0; i < 4; i++) {
			dave.move(200);
			dave.turn(90);	
		}
		for (int i = 0; i < 4; i++) {
			
		}
		dave.setPenColor(255, 90, 90);;
		dave.penDown();
		dave.turn(-90);
		dave.move(250);
		dave.turn(-90);
		dave.move(250);
		dave.turn(-90);
		dave.move(250);
		dave.turn(-90);
		dave.move(250);
		dave.penUp();
		dave.setPenColor(20,10,199);
		dave.move(200);
		dave.turn(45);
		dave.move(200);
		dave.penDown();
		
	}
}