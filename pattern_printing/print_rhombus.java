package pattern_printing;
import java.util.Scanner;
public class print_rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		   PRINT
//	     *****
//	    *****
//	   *****
//	  *****
//	 *****

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
				
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}	
			System.out.println();
		}
	}

}
