import java.util.Arrays;

public class ArrayFrequency {
	
	public static void main(String[] args) {
		int arr[]={2,4,5,2,6,6,3,7};
		int len=arr.length;
		int freq[]=new int[len];
		int visited=-1;
		for(int i=0;i<len;i++)
		{
			int count=1;
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]==arr[j])
				{
					freq[j]=visited;
					count++;
				}
			}
			if(freq[i]!=visited)
			{
				freq[i]=count;
			}
		}
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]!=visited)
			{
				System.out.print("element "+arr[i]+" frequency "+freq[i]+"\n");
			}
		}
				
		
		
	}

}
