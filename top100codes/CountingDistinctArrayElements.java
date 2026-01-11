
public class CountingDistinctArrayElements {

	public static void main(String[] args) {
			int arr[]= {10,10};
			int len=arr.length;
			int visited=-1;
			int count=0;
			int varr[]=new int[len];
			for(int i=0;i<len;i++)
			{
				for(int j=i+1;j<len;j++)
				{
					if(arr[i]==arr[j])
					{
						varr[i]=visited;
						varr[j]=visited;
					}
				}
			
			}
			for(int i=0;i<len;i++)
			{
				if(varr[i]!=visited) {
					count++;
				}
			}
			System.out.println(count);
	}
}
