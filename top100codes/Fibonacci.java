
public class Fibonacci {
		public static void main(String[] args) {
			int f1=0;
			int f2=1;
			int n=5;
			int fr=0;
			System.out.println(f1);
			System.out.println(f2);
			for(int i=0;i<n;i++)
			{
				fr=f1+f2;
				System.out.println(fr);
				f1=f2;
				f2=fr;
			}
		}
}
