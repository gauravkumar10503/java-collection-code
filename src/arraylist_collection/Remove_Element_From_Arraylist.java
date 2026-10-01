//Write a Java program to remove duplicate elements from an ArrayList.
package arraylist_collection;
import java.util.*;
public class Remove_Element_From_Arraylist 
{
	public static void main(String []args)
	{
		ArrayList<Integer> ld=new ArrayList<>(List.of(1,2,3,4,3,2,5,6,7,7));
		ArrayList<Integer> ld2=new ArrayList<>();
		boolean found = false;
		for(int i=0;i<=ld.size()-1;i++)
		{
			if ((ld.get(i) == 1 && found) || (ld.get(i) != 1 && !found))
			{
			    ld2.add(i);
			}
		}
		System.out.println(ld2);
	}
}
