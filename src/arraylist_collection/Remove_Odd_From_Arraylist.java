package arraylist_collection;
import java.util.*;
public class Remove_Odd_From_Arraylist 
{
	public static void main(String []aargs)
	{
		ArrayList<Integer> lo=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
		for(int i=0;i<=lo.size()-1;i++)
		{
			if(lo.get(i)%2!=0)
			{
				lo.remove(i);
			}
		}
		System.out.println(lo);
	}
}
