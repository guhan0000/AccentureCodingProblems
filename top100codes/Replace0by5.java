import java.util.*;
public class Replace0by5 {
public static void main(String[] args) {
	
	int num=101;
	String number=String.valueOf(num);
	char ca[]=number.toCharArray();
	for(int i=0;i<ca.length;i++)
	{
		if(ca[i]=='0')
		{
			ca[i]='5';
		}
	}
	String reString=new String(ca);
	int res=Integer.parseInt(reString);
	
	
	System.out.println(res+9);
}
}
