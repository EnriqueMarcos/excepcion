import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class pruebaException {

	public static void main(String[] args) throws Exception {
		int numero = cadenaEntero();
		System.out.println(numero+1);
	}
	
	public static double division() throws Exception {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dime el primer numero ");
		int num1 = sc.nextInt();
		
		System.out.println("Dime el segundo numero");
		int num2 = sc.nextInt();
		
	
		if (num2 == 0){
			throw new EnriqueExceptions("No esta permitido dividir entre 0");
		}else {
			int res = num1 / num2;
			return res;
		}
		
	}
	
	public static int indiceOutOfBounce() throws EnriqueExceptions {
		
		Scanner sc = new Scanner (System.in);
		int[] array = {1,2,3,4,5};
		System.out.println("Dime la posicion del rango al que quieres acceder");
		int posicion = sc.nextInt();
		
		if (posicion > 5){
			throw new EnriqueExceptions("No hay mas de 5 posiciones");
		}else {
			return posicion;
		}
	}
	
	public static void cadenaEntero() throws EnriqueExceptions {
		Scanner sc = new Scanner (System.in);
		String cadena = sc.nextLine();
		
		for (int i = 0; i < cadena.length(); i++) {
			char actual = cadena.charAt(i);
			
			switch (actual) {
			case '0','1','2','3','4','5','6','7','8','9':
				break;
			default:
				throw new EnriqueExceptions(actual+ "no es un número");
			}
		}
	}
	
	
	
}
