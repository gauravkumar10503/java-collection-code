package vector_collections;
import java.util.*;
public class Duplicate_Vector
{
	public static void main(String []args)
	{
		Vector<Integer> vi=new Vector<>(List.of(1,2,3,4,5));
		Vector<Integer> vi2=new Vector<>();
		vi2.addAll(vi);
		System.out.println(vi2);
	}
}
