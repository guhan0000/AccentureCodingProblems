import java.util.Arrays;

public class LeftRotation {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int len=arr.length;
		int d=2;
		for(int j=0;j<d;j++)
		{	
			int temp=arr[0];
			for(int i=1;i<len;i++)
			{
				arr[i-1]=arr[i];
				
			}
			arr[len-1]=temp;
			
		}
			
	
		System.out.println(Arrays.toString(arr));
		
		
	}
}
