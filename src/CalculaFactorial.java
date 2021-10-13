// importar
import java.util.Scanner;


public class CalculaFactorial {

	public static void main(String[] args) {
		// Variables
		int x;
		int result = 1;
		
		
		// comienzo stream
		Scanner userInput = new Scanner(System.in);
		
		// user input
		System.out.println("Escriba número para calcular su factorial ");
		x = userInput.nextInt();
		
		System.out.print( x + "! " + "= ");
		
		for( int i = 1; i <= x ; i++ ) {
			
			if( i!= x ) {
				result *=i;
				System.out.print(i + " * ");
			}
			
		}
		
		result *= x;
		System.out.println( x + " = " + result);
		
		//Final input
		
		userInput.close();
		

	}

}
