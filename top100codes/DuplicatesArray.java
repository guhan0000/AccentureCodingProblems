import java.util.*;

public class DuplicatesArray {
	
	public static void main(String[] args) {
		int arr[]= {10,20,30,10};
		Set<Integer>set=new HashSet<>();
		for(int i:arr)
		{
			set.add(i);
		}
		System.out.println(set);
		Object[] array = set.toArray();
		System.out.println(arra);
	}

}
