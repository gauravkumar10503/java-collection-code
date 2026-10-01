//Sum all the numbers in an ArrayList of integers.
package arraylist_collection;
import java.util.*;
public class Sum_Of_ArrayList 
{
	public static void main(String []args)
	{
		ArrayList<Integer> ls=new ArrayList<>(List.of(1,2,3,4,5));
		int sum=0;
		for(int i=0;i<=ls.size()-1;i++)
		{
			sum=sum+ls.get(i);
		}
		System.out.println("Sum of given arraylist is :- "+sum);
	}
}
