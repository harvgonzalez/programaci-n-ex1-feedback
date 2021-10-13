
// importar
import java.util.Scanner;

public class MyFirstProgram {
	

	public static void main(String[] args) {
		
		// declara  variables
		double price;
		int quantity;
		
		double totalAbonar; 
		// inicia variable de descuento
		double discount = 0.2;
		 
		
		//Inicia stream de entrada de teclado
		Scanner inputUsuario = new Scanner(System.in);
		
		System.out.print("Inserta precio artículo y presiona enter: ");
		price = inputUsuario.nextInt();
		
		System.out.print("Inserta cantidad y presiona enter: ");
		quantity = inputUsuario.nextInt();
		
		// 
		totalAbonar = ( price - price * discount ) * quantity;
		
		System.out.println( "El total por abonar es: $" + totalAbonar );
		
		
		// Cierra stream de teclado
		inputUsuario.close();

		
	}

}

