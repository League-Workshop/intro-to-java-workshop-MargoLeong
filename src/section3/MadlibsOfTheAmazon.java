package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		String name=JOptionPane.showInputDialog("If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String adjective=JOptionPane.showInputDialog("insert an adjective");
		// Get the user to enter a type of liquid
		String liquid=JOptionPane.showInputDialog(" a type of liquid");
		// Get the user to enter a body part
		String body=JOptionPane.showInputDialog(" insert a body part ");
		// Get the user to enter a verb
		String verb=JOptionPane.showInputDialog("insert a verb");
		// Get the user to enter a place
		String place=JOptionPane.showInputDialog(" insert a place");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		String madlibs=JOptionPane.showInputDialog(null,+name+"");
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

