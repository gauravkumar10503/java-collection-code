package vector_collections;
import java.util.*;
public class Reverse_Vector 
{
	public static void main(String []args)
	{
		Vector<Integer> vr=new Vector<>(List.of(1,2,3,4,5));
		System.out.println("Original vector :- "+vr);
		
		Collections.reverse(vr);
		System.out.println("Reverse vector :- "+vr);
	}
}
