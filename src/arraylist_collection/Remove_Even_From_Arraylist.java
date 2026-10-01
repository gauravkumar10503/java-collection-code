//Given an ArrayList of integers, remove all even numbers.
package arraylist_collection;
import java.util.*;
public class Remove_Even_From_Arraylist 
{
	public static void main(String []args)
	{
		ArrayList<Integer> lr=new ArrayList<>(List.of(1,2,3,4,5,6,7));
		
		for(int i=0;i<=lr.size()-1;i++)
		{
			if(lr.get(i)%2==0)
			{
				lr.remove(i);
			}
		}
		System.out.println(lr);
	}
}
