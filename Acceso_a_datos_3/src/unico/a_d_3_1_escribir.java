package unico;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class a_d_3_1_escribir {

	public static void main(String[] args) {
		final String FILE_NAME = "ficheros\\ciudades.txt";
		
		List<String> ciudades = new ArrayList<String>();
		ciudades.add("Sevilla");
		ciudades.add("Huelva");
		ciudades.add("Cádiz");
		ciudades.add("Granada");
		
		escribirFichero(FILE_NAME, ciudades);
		

	}

	private static void escribirFichero(String FILE_NAME, List<String> contenido) {
		try {
			//Apertura del fichero y de canal de comunicaciones tipo buffer
			FileWriter fch = new FileWriter(FILE_NAME);
			BufferedWriter escritura = new BufferedWriter(fch);
			
			//Tratamiento de los datos (escritura del parámetro: contenido)
			
			/*for(String cadena : contenido) {
				escritura.write(cadena);
				escritura.newLine();
			}
			*/
			
			for(int i=0; i<contenido.size(); i++) {
				escritura.write(contenido.get(i));
				if(i<contenido.size()-1) {
					escritura.newLine();
				}
			}
			
			//Cierre del fichero y del canal de comunicaciones tipo buffer
			escritura.close();
			fch.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("No se encuentra el fichero "+ FILE_NAME);
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Error accediendo al fichero: "+ FILE_NAME);
		}
		
	}

}
