package patika;
import java.util.Scanner ;
public class Combination {

	public static void main(String[] args) {
		// Combination == C(n,r) = n! / (r! * (n-r)!)
		int n , r ;
		int total1 = 1 ;
		int total2 = 1 ;
		System.out.print("Enter the first number for combination : ");		
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
	   System.out.print("Enter the second number for combination : ");
	
	for ( int i = 1 ; i <= n ; i++ ) { 
		 
		 total1 = total1 * i ; 
	
	}
	 r = input.nextInt();
	 for ( int a = 1 ; a <= r ; a++ ) {
		 total2 = total2 * a ; 
	 }
	   
	 System.out.print(total1 / total2 ) ;
	
	}

}
