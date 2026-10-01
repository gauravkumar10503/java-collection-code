package arraylist_collection;
import java.util.*;
public class Arraylist_To_Array 
{
	public static void main(String []args)
	{
		//here i'm creating a arraylist
		ArrayList<Integer> aa=new ArrayList<>(List.of(1,2,3,4,5));
		
		//here i'm converting arraylist into array
		Integer []ar=aa.toArray(new Integer[0]);
		
		//now we printing the array's elements
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}
