package model;

public class Swim
{
	//data members 
	private String stroke;
	private int intensity;
	private int timeMinutes;
	private boolean wasEnjoyable;
	
	//always write data members at the beginning of class
	
	/*
	 * Default constructor for after the fact customization.
	 * AKA I don't know the info yet.
	 * Initializing data members with "bad" values to be changed
	 */
	public Swim()
	{
		
		this.stroke = "sitting on the couch";
		this.intensity = 238;
		this.timeMinutes = 3058;
		this.wasEnjoyable = true;
	}
	
	/*
	 * Better constructor when I know information for the Sport object.
	 * @param user's favorite sport's information.
	 */
	public Swim( String stroke, int intensity, int timeMinutes, boolean wasEnjoyable) 
	{
		
		this.stroke = stroke;
		this.intensity = intensity;
		this.timeMinutes = timeMinutes;
		this.wasEnjoyable = wasEnjoyable;
	}
	
	//getters 
	
	
	public String getStroke()
	{
		return stroke;
	}
	public int getIntensity()
	{
		return intensity;
	}
	public int getTimeMinutes()
	{
		return timeMinutes;
	}
	public boolean getWasEnjoyable()
	{
		return wasEnjoyable;
	}
	
	//setters
	
	public void setStroke(String stroke) 
	{
		this.stroke = stroke;
	}
	public void setIntensity(int intensity)
	{
		this.intensity = intensity;
	}
	public void setTimeMinutes(int timeMinutes)
	{
		this.timeMinutes = timeMinutes;
	}
	public void setWasEnjoyable(boolean wasEnjoyable)
	{
		this.wasEnjoyable = wasEnjoyable;
	}
}
