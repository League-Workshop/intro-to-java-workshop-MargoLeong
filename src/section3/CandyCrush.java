package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
String name=JOptionPane.showInputDialog("Who Do You Dislike");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on "+name);
		// 3. Ask the user for the name of their best friend
		String Friend =JOptionPane.showInputDialog("What is your best friend's name?");
		// 4. Tell them their best friend is as sweet as candy
JOptionPane.showMessageDialog(null,Friend + " is As Sweet As Candy!");
	} 
}



