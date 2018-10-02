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
		JOptionPane.showMessageDialog(null, userSwim );
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
		boolean isValidInt = false;
		
		
		try
		{
			Integer.parseInt(maybeInt);
			isValidInt = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "you should type an integer like 0348525");
		}
		
		return isValidInt;
	}
	
	public boolean validBoolean(String maybeBool)
	{
		boolean isValidBool = false;
		
		try
		{	
			
			Boolean.parseBoolean(maybeBool);
			isValidBool = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "you should type a boolean like true or false");
		}
		
		return isValidBool;
	}
	
	public Boolean boolYesNo(String yepNope) 
	{
		Boolean yesNo = false;
		
		if(yepNope.equals("yes")) 
		{
			yesNo = true;
		}
		else if(yepNope.equals("no"))
		{
			yesNo = false;
		}
		
		
		return yesNo;
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
		userSwim.setYesNoJoy(userJoy);
//		userSwim.setWasEnjoyable(userJoy);
		
		while(!validInt(userIntensity)) 
		{
			userIntensity = JOptionPane.showInputDialog(null, "Type a valid number for your swim's intensity");
		}
		userSwim.setIntensity(Integer.parseInt(userIntensity));
		
		while(!validInt(userTime)) 
		{
			userTime = JOptionPane.showInputDialog(null, "Type a valid number for the time you swam");
		}
		userSwim.setTimeMinutes(Integer.parseInt(userTime));
		
		userSwim.setWasEnjoyable(boolYesNo(userJoy));
	}
	
}
