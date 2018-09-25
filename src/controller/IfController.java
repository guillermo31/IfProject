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
		askUser();
	}
	
	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;
		
		
		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "you should type a double like 0.52542");
		}
		
		return isValid;
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
		
		for (int loopy = 0; loopy < 30; loopy +=2) 
		{
			JOptionPane.showMessageDialog(null, "the value is: " + loopy);
		}
	}
	
	
	private void askUser() 
	{
		String response = JOptionPane.showInputDialog(null,"What is the distance?");
		
		while (!validDouble(response))
		{
			response = JOptionPane.showInputDialog(null,"no!, type in a valid number for the distance");
		}
	}
	
}
