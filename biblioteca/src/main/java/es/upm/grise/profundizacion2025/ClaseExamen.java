package es.upm.grise.profundizacion2025;

import java.util.ArrayList;
import java.util.List;

public class ClaseExamen {

	public static List<Integer> primos (int n) throws EntradaInvalida{
		if (n>1) {
			List<Integer> nPrimos = new ArrayList<>();
			for(int i=2;i<=n;) {
				if (n%i==0) {
					nPrimos.add(i);
					n/=i;
				}else {
					i++;
				}
			}
			return nPrimos;
		}else {
			throw new EntradaInvalida("N debe ser mayor que 1");
		}
	}


}
