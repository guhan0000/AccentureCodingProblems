import java.util.*;
public class FrequencyOfCharacters {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.next();
		str=str.toLowerCase();
		char sa[]=str.toCharArray();
		int count[]=new int[26];
		for(char ch:sa)
		{
			count[ch-'a']++;
		}
		for(int i=0;i<26;i++)
		{
			if(count[i]!=0)
			{
				System.out.println((char)(i+'a')+" "+count[i]);
			}
		}
		
		
	}

}
