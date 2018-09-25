package controller;

//imports
import javax.swing.JOptionPane;
import model.Sport;

public class IfController
{	
	/**
	 * builds the instance of the controller 
	 */
	public IfController() 
	{
		
	}
	
	/**
	 * where methods are called 
	 */
	public void start()
	{
		loop();
	}
	
	
	private void loop()
	{
		boolean isDone = false;
		int count = 0;
		
		while(!isDone)
		{
			JOptionPane.showMessageDialog(null, "hey i am looping");
			
			count++;
			if (count >= 10)
			{
				isDone = true;
			}
		}
	}
	
}
