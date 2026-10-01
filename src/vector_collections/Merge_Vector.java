package vector_collections;
import java.util.*;
public class Merge_Vector 
{
	public static void main(String []args)
	{
		Vector<Integer> vl=new Vector<>(List.of(1,5,6,3,6));
		Vector<Integer> vl2=new Vector<>(List.of(2,3,7,9));
		vl.addAll(vl2);
		Collections.sort(vl);
		System.out.println(vl);
	}
}
