import java.util.Arrays;

public class RightRotation {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};//50 10 20 30 40
		int len=arr.length;
		int temp=arr[len-1];
		for(int i=len-2;i>=1;i--)
		{
			arr[i-1]=arr[i];
		}
		arr[0]=temp;
		System.out.println(Arrays.toString(arr));
		
	}

}
