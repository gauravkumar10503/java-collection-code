package arraylist_collection;
import java.util.*;
public class Find_Min_In_Arraylist 
{
	public static void main(String []args)
	{
		ArrayList<Integer> lm=new ArrayList<>(List.of(1,55,4,3,6,8));
		int min=lm.get(0);
		
		for(int elem : lm)
		{
			if(elem<min)
			{
				min=elem;
			}
		}
		System.out.println(min);
	}
}
