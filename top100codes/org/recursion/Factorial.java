package org.recursion;

public class Factorial {
	
	int fact(int num)
	{
		int f=1;
		if(num==0)
		{
			return 1;
		}
		else if(num<0){
			return -1;
		}
		else {
			f=num*fact(num-1);
			return f;
		}
	}
	
	public static void main(String[] args) {
		Factorial factorial=new Factorial();
		System.out.println(factorial.fact(5));
		
		
	}

}
