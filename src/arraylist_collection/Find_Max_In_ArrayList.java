//Given an ArrayList of integers, write a program to find the maximum value.
package arraylist_collection;
import java.util.*;
public class Find_Max_In_ArrayList 
{
	public static void main(String []args)
	{
		ArrayList<Integer> ma=new ArrayList<>(List.of(1,2,5,6,9,4));
		int max=ma.get(0);
		for(int element : ma)
		{
			if(element>max)
			{
				max=element;
			}
		}
		System.out.println(max);
	}
}
