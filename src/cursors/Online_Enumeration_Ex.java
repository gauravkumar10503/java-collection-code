package cursors;

import java.util.*;
public class Online_Enumeration_Ex 
{
	public static void main(String []args)
	{
		for(Day day : Day.values())
		{
			if(day.isworkingday())
			{
				System.out.println(day+" is a working day ");
			}
			else
			{
				System.out.println(day+" is not a working day ");
			}
		}
	}
}

enum Day
{
	MONDAY(true),
	TUESDAY(true),
	WEDNESDAY(true),
	THRUSEDAY(true),
	FRIDAY(true),
	SATURDAY(false),
	SUNDAY(false);
	
	private boolean workingday;
	
	Day(boolean workingday)
	{
		this.workingday=workingday;
	}
	public boolean isworkingday()
	{
		return workingday;
	}
}
