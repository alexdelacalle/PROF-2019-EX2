package es.upm.grise.profundizacion2025;

public class Main {
	
	public static void main(String[] args) {
		
		ClaseExamen n = new ClaseExamen();
		
        try {
            System.out.println(n.primos(2)); 
        } catch (EntradaInvalida e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
