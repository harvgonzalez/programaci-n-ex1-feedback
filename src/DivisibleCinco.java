import java.util.Scanner;
public class DivisibleCinco {

	public static void main(String[] args) {		
		int numInicial;
		int numFinal; 
		
		// Comienzo de stream de input usuario
		Scanner inputUsuario = new Scanner(System.in);
		
		// impresion 
		System.out.println("Escriba valor inicial con número entero: ");
		numInicial = inputUsuario.nextInt();
		
		System.out.println("Escriba valor final con número entero: ");
		numFinal = inputUsuario.nextInt();
		
		// Validación
		
		if( numInicial > numFinal  ) {

			System.out.println("El valor inicial no puede ser mayor o igual que el valor final, inténtelo otra vez");
		}	
		// revisar si es divisible
		for(int i = numInicial; i <= numFinal; i++) {
			
			if ( i%5 != 0) {
				
				System.out.println("Número " + i + " no es divisible por cinco");
			}
			else if( i%5 == 0 ) {
				System.out.println("Número " + i + " es divisible por cinco!!");
			}
		}
			
		// final de stream
		inputUsuario.close();
		
	}
}
