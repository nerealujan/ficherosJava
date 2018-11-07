package trabajo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Aleatorio2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r = Runtime.getRuntime();
		Process p = null;
		
		Scanner sc = new Scanner(System.in);
		String texto = null;
		
		try {
		p = r.exec("java -jar aleatorio.jar");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		PrintStream ps = new PrintStream (p.getOutputStream());
		System.out.println("Escribe letras: ");
		texto = sc.nextLine();
		
		while (!texto.equalsIgnoreCase("fin")){
			ps.println(texto);
			ps.flush();
			try {
				System.out.println(br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			texto = sc.nextLine();
		}

	}

}
