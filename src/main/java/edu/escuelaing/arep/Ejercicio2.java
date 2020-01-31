package edu.escuelaing.arep;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Ejercicio2 {
	
	public static void main(String[] args) throws IOException {
		
		URL n = new URL("https://www.google.com/");
		String pagina =" ";
		
		FileOutputStream fos = new FileOutputStream("programa.html");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		try (BufferedReader reader= new BufferedReader(new InputStreamReader(n.openStream())))
		{
			String inputLine = null;
			while ((inputLine = reader.readLine()) != null) 
			{
			
			pagina=pagina+inputLine;
			}
			 
		}catch (IOException x) {
			System.err.println(x);
		}
		
		oos.writeUTF(pagina);


        oos.close();
        fos.close();
        
        
		
	
		}

}
