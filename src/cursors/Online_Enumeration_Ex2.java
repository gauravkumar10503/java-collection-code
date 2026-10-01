package cursors;

import java.util.*;
public class Online_Enumeration_Ex2 
{
	public static void main(String []args)
	{
		Bulb single=Bulb.RED;
		
		switch(single)
		{
			case RED :
				System.out.println("Stop");
				break;
				
			case YELLOW :
				System.out.println("Ready");
				break;
				
			case GREEN :
				System.out.println("Go");
				break;
				
			default :
				System.out.println("Please enter a valid light");
		}
	}
}

enum Bulb
{
	RED,YELLOW,GREEN;
}
