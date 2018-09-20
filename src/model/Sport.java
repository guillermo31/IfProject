package model;

public class Sport
{
	//data members 
	private String name;
	private String activity;
	private int intensity;
	private int timeMinutes;
	private boolean isEnjoyable;
	
	//always write data members at the beginning of class
	
	public Sport(String name, String activity, int intensity, int timeMinutes, boolean isEnjoyable) 
	{
		this.name = name;
		this.activity = activity;
		this.intensity = intensity;
		this.timeMinutes = timeMinutes;
		this.isEnjoyable = isEnjoyable;
	}
	
	
	
}
