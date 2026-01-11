import java.util.*;

import com.sun.org.apache.bcel.internal.Const;
public class WaterJug {
	public static void main(String[] args) {
		int cont8[]= {1,1,1,1,1,1,1,1};
		int cont5[]= new int[5];
		int cont3[]= new int[3];
//		System.out.println(Arrays.toString(cont5));
//		Moving from cont8 to cont5		
		for(int i=0;i<5;i++)
		{
			cont5[i]=1;
			cont8[i]=0;
		}
		System.out.println("container8 "+Arrays.toString(cont8));
		System.out.println("container5 "+Arrays.toString(cont5));
		System.out.println("container3 "+Arrays.toString(cont3));
		System.out.println();
		for(int i=0;i<3;i++)
		{
			cont3[i]=1;
			cont5[i]=0;
			
		}
		System.out.println("container8 "+Arrays.toString(cont8));
		System.out.println("container5 "+Arrays.toString(cont5));
		System.out.println("container3 "+Arrays.toString(cont3));
		System.out.println();
		for(int i=0;i<3;i++)
		{
			cont8[i]=1;
			cont3[i]=0;
		}
		System.out.println("container8 "+Arrays.toString(cont8));
		System.out.println("container5 "+Arrays.toString(cont5));
		System.out.println("container3 "+Arrays.toString(cont3));
		System.out.println();
		for(int i=0;i<2;i++)
		{
			cont5[i]=1;
			cont8[i]=0;
		}
		System.out.println("container8 "+Arrays.toString(cont8));
		System.out.println("container5 "+Arrays.toString(cont5));
		System.out.println("container3 "+Arrays.toString(cont3));
		System.out.println();
	}

}
