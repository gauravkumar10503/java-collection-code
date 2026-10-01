//Write a program to check if "Java" exists in an ArrayList of strings.
package arraylist_collection;
import java.util.*;
public class Check_Occurence_In_ArrayList
{
	public static void main(String []args)
	{
		ArrayList<String> lc=new ArrayList<>(List.of("c","java","java","c++","python"));
		boolean found=false;
		for(int i=0;i<=lc.size()-1;i++)
		{
			if(lc.get(i).equals("java"))
			{
				found=true;
			}
		}
		System.out.println(found);
	}
}
