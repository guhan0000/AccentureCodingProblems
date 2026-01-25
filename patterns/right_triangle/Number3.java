/*  1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1*/  
package patterns.right_triangle;

public class Number3 {
	public static void main(String[] args) {
		int n=5;
		int printVal;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				printVal=0;
			}
			else {
				printVal=1;
			}
			for(int j=1;j<=i;j++) {
				System.out.print(printVal+" ");
				if(printVal==0) {
					printVal=1;
				}
				else {
					printVal=0;
				}
			}
//			printVal=-1;
			System.out.println();
			
		}
	}

}
