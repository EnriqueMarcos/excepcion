package practica26;

public class metodosPractica26 {
	
	public static void main(String[] args) throws Exception {
		
		String[] array = split("hola, mundo", ' ');
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	

	public static String[] split(String cadena, char deli) throws Exception{
		
		int contador =0;
		
		for (int i = 0; i < cadena.length(); i++) {
			contador++;
		}
		
		if(contador == 0) {
			throw new EnriqueExceptions ("La cadena esta vacia");
		}
		
		String[] tamaño = new String[contador+1];
		
		for(int i = 0 ; tamaño.length; i++) {
			tamaño[i] = "";
		}
		
		int posicionArray = 0;
					
		boolean delimitador = false;
		
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == deli) {
				delimitador = true;
				posicionArray++;
                break;
            }else {
            	tamaño [posicionArray] = tamaño [posicionArray] + cadena.charAt(i);
            }
		}
		if (!delimitador) {
			throw new EnriqueExceptions ("El delimitador no esta.");	
		}
		
		
		return null;
	}
}
