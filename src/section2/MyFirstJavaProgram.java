package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot foot = new Robot();
		for(int i=0;i<4;i++) {
		foot.setRandomPenColor();
		foot.setPenWidth(20);
		foot.setSpeed(100);
		foot.penDown();
		foot.move(200);
		foot.turn(+90);
		foot.move(200);
		}
	    foot.turn(+90);
	    foot.move(400);
	    
		
		
	}
}
