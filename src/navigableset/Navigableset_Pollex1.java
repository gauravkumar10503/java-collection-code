package navigableset;

import java.util.*;
public class Navigableset_Pollex1 
{
	public static void main(String []args)
	{
		NavigableSet<Integer>np=new TreeSet<>(List.of(10,20,30,40,50));
		System.out.println("Original set :- "+np);
		
		Integer first=np.pollFirst();
		System.out.println("PollFirst :- "+first);
		System.out.println("After the pollfirst :- "+np);
		
		Integer last=np.pollLast();
		System.out.println("PollLast :- "+last);
		System.out.println("After the polllast :- "+np);
	}
}
