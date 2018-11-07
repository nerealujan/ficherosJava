package trabajo;

import java.util.ArrayList;
import java.util.Scanner;

public class aleatorio {

		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			String texto = null;
			texto = sc.nextLine();
			
			int numero;
			
			while (texto !=null) {
				numero = (int) (Math.random() * 10 + 1);
				
					System.out.println(numero);
					texto = sc.nextLine();
					
				
			}
				
			}

	}

