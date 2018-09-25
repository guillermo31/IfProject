package controller;

//imports
import javax.swing.JOptionPane;
import model.Swim;

public class IfController
{	
	
	private Swim userSwim;
	
	public IfController() 
	{
		userSwim = new Swim();
	}
	
	
	public void start()
	{
		//loop();
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
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "you should type an integer like 0348525");
		}
		
		return isValid;
	}
	
	public boolean validBoolean(String maybeBool)
	{
		boolean isValid = false;
		
		
		try
		{
			Boolean.parseBoolean(maybeBool);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "you should type a boolean like true or false");
		}
		
		return isValid;
	}
	
	
	
	private void askUser() 
	{
		String userStroke = JOptionPane.showInputDialog(null, "what stroke did you do?");
		userSwim.setStroke(userStroke);
		
		String userIntensity = JOptionPane.showInputDialog(null, "how intense did you swim?");
		//userSwim.setIntensity(userIntensity);
		
		String userTime = JOptionPane.showInputDialog(null, "how long did you swim for?");
		//userSwim.setTimeMinutes(userTime);
		
		String userJoy = JOptionPane.showInputDialog(null, "did you enjoy your swim?");
		//userSwim.setWasEnjoyable(userJoy);
		
		while(!validInt(userIntensity)) 
		{
			userIntensity = JOptionPane.showInputDialog(null, "Type a valid number");
			if(validInt(userIntensity)) 
			{
				userSwim.setIntensity(Integer.parseInt(userIntensity));
			}
		}
		
		while(!validInt(userTime)) 
		{
			userTime = JOptionPane.showInputDialog(null, "Type a valid number");
			if(validInt(userTime)) 
			{
				userSwim.setIntensity(Integer.parseInt(userTime));
			}
		}
		
		while(!validBoolean(userJoy)) 
		{
			userTime = JOptionPane.showInputDialog(null, "Type true or false");
			if(validBoolean(userJoy)) 
			{
				userSwim.setIntensity(Integer.parseInt(userTime));
			}
		}
		
	}
	
}
