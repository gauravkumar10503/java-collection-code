package vector_collections;
import java.util.*;
public class Rotation_In_Vector
{
	public static void main(String []args)
	{
		Vector<Integer> rv=new Vector<>(List.of(1,2,3,4,5));
		int k=2;
		for(int i=1;i<=k;i++)
		{
			Integer lastelement=rv.getLast();
			rv.removeLast();
			rv.addFirst(lastelement);
		}
		System.out.println(rv);
	}
}
