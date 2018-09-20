package model;

public class Sport
{
	//data members 
	private String name;
	private String sport;
	private int intensity;
	private int timeMinutes;
	private boolean isEnjoyable;
	
	//always write data members at the beginning of class
	
	/*
	 * Default constructor for after the fact customization.
	 * AKA I don't know the info yet.
	 * Initializing data members with "bad" values to be changed
	 */
	public Sport()
	{
		this.name = "aadhkf";
		this.sport = "sitting on the couch";
		this.intensity = 238;
		this.timeMinutes = 3058;
		this.isEnjoyable = true;
	}
	
	/*
	 * Better constructor when I know information for the Sport object.
	 * @param user's favorite sport's information.
	 */
	public Sport(String name, String sport, int intensity, int timeMinutes, boolean isEnjoyable) 
	{
		this.name = name;
		this.sport = sport;
		this.intensity = intensity;
		this.timeMinutes = timeMinutes;
		this.isEnjoyable = isEnjoyable;
	}
	
	//getters 
	
	public String getName()
	{
		return name;
	}
	public String getSport()
	{
		return sport;
	}
	public int getIntensity()
	{
		return intensity;
	}
	public int getTimeMinutes()
	{
		return timeMinutes;
	}
	public boolean getIsEnjoyable()
	{
		return isEnjoyable;
	}
	
	//setters
	public void setName(String name)
	{
		this.name = name;
	}
	public void setSport(String sport) 
	{
		this.sport = sport;
	}
	public void setIntensity(int intensity)
	{
		this.intensity = intensity;
	}
	public void setTimeMinutes(int timeMinutes)
	{
		this.timeMinutes = timeMinutes;
	}
	public void setIsEnjoyable(boolean isEnjoyable)
	{
		this.isEnjoyable = isEnjoyable;
	}
}
