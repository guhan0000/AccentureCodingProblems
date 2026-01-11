import java.util.Arrays;

public class SecondSmallest {
	public static void main(String[] args) {
		int arr[]= {50,51,1,0,99};
		Arrays.sort(arr);
//		System.out.println(arr[arr.length-2]);
		int max=arr[arr.length-1];
		int sec_max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=max && arr[i]>sec_max)
			{
				sec_max=arr[i];
			}
		}
		System.out.println(sec_max);
		
		
	}
}
