package patterns.left_triangle;
//k.       *
//		  **
//		 ***
//		****
//	   *****
public class Star {
	public static void main(String[] args) {
		int n=5;
		char space=' ';
		char star='*';
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(space); 
			}
			for(int k=1;k<=i;k++) {
				System.out.print(star);
			}
			System.out.println();
		}
	}

}
