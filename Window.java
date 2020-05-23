//These are imports, they are classes from within java that we access later in the program
import java.awt.Dimension;
import javax.swing.JFrame;
//public means accessible to other classes
//A class is like a container for code
//We're calling it Game
public class Game {
	//static variables are shared between every instance of a class
	//JFrame is the window that the program is rendered inside of
	//frame is just the name we're assigning the JFrame
	public static JFrame frame;
	//final means it cant be changed once the program starts
	//int is a variable type, storing whole numbers.
	public static final int WIDTH = 1280, HEIGHT = WIDTH/16*9;
	
	//void means it doesn't give any data back when called
	//This is a method, it is required by every java program to have a 'main' method
	//Inside the brackets is a String array (represented by the []), A String being text and
	//an array being a data structure storing several elements, in this case String's (text)
	public static void main(String args[]) {
		
		//We need to initialize the JFrame using its constructor method, we'll touch more on this in the next video
		frame = new JFrame();
		
		//Use methods from the JFrame class to set how we want our window
		frame.setTitle("Window!");
		
		//Create an instance of the dimension class called size
		Dimension size = new Dimension(WIDTH, HEIGHT);
		
		//Below we access method's from the JFrame class, using our instance of JFrame called frame
		
		//These methods takes in a dimension, so we can use our size dimension
		frame.setSize(size);
		frame.setPreferredSize(size);
		
		//Disable resizing on the window. This can cause issues in more complex programs so I tend to leave it this way
		frame.setResizable(false);
		
		//Cause the exit button to fully close the program, other wise, it may just hide it
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Sets the location of the window to the center of the screen
		frame.setLocationRelativeTo(null);
		
		//fits the window to the specified preferred size and if a minimum or maximum size is specified,
		//It prevents the window from going beyond those constraints
		frame.pack();
		//Makes the frame visible when set to true
		frame.setVisible(true);
		
		//Prints a line out to the console, in this case telling us the size of the window
		System.out.println("Window of size: " + WIDTH + "x" + HEIGHT + " was created.");
	}
}
