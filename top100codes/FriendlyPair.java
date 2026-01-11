

public class FriendlyPair {
    public static void main(String args[])
    {
        int num1=30;
        int num2=140;
        if((computeDivisor(num1)/num1==1) && (computeDivisor(num2)/num2==1))
        {
        	System.out.println("friendly pair");
        }
        else
        {
        	System.out.println("not a friendly pair");
        }
      //System.out.println(computeDivisor(num1));
        
    }
    public static int computeDivisor(int num)
    {
    	int sum=0;
    	for(int i=1;i<num;i++)
    	{
    		if(num%i==0)
    		sum+=i;
    	}
    	return sum;
    }
    
}
