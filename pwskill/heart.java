package pwskill;

public class heart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		        int n = 7;  // Adjust this value to change the size of the heart
		        System.out.println();
		        
		        // Upper part of the heart
		        for (int i = n / 2; i <= n; i += 2) {
		            for (int j = 1; j < n - i; j += 2) {
		                System.out.print("  ");
		            }
		            for (int j = 1; j <= i; j++) {
		                System.out.print(" *");
		            }
		            for (int j = 1; j <= n - i; j++) {
		                System.out.print("  ");
		            }
		            for (int j = 1; j <= i; j++) {
		                System.out.print(" *");
		            }
		            System.out.println();
		        }
		        
		        // Lower part of the heart
		        for (int i = n; i >= 1; i--) {
		            for (int j = i; j < n; j++) {
		                System.out.print("  ");
		            }
		            for (int j = 1; j <= (i * 2) - 1; j++) {
		                System.out.print(" *");
		            }
		            System.out.println();
		        }
		    System.out.println("          DEVENDRA");

		
		
		
	}

}
