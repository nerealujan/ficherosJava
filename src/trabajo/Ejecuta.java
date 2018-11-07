package trabajo;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Ejecuta {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String comando = "cmd /c dir";
        
        for(int i=0;i<args.length;i++)
        {
            comando += " " + args[0];
        }
        
        if( comando != "")
            new Ejecuta(comando);
        else
            System.out.println("Introduce argumentos.");
    }
	
	public Ejecuta(String comando) {
		// TODO Auto-generated constructor stub
		 try
         {
             Process p=Runtime.getRuntime().exec(comando);
             p.waitFor();

             InputStream is = p.getInputStream();
             BufferedReader br = new BufferedReader (new InputStreamReader (is));
             String linea = br.readLine();

             while (linea!=null)
             {
                 System.out.println (linea);
                 
                 linea = br.readLine();
             }
         } 
         catch (Exception e)
         {
             
             System.out.println("Error en el comando" + e.getMessage());
         
         }
     }
		
}

