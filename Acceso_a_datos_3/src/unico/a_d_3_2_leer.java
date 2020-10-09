package unico;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class a_d_3_2_leer {

	public static void main(String[] args) {
		
		final String FILE_NAME = "ficheros\\ciudades.txt";
		
		mostrarContenidoFichero(FILE_NAME);

	}

	private static void mostrarContenidoFichero(String FILE_NAME) {
		try {
			// Apertura del fichero y del canal de comunicaciones de lectura
			FileReader fch = new FileReader(FILE_NAME);
			BufferedReader lectura = new BufferedReader(fch);
			
			//Tratamiento del contenido del fichero
			String linealeida;
			
			linealeida= lectura.readLine();
			while (linealeida != null) {
				System.out.println(linealeida);
				linealeida= lectura.readLine();
			}
			
			//Cierre del fichero y del canal de comunicaciones de lectura
			lectura.close();
			fch.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("No se encuentra el fichero "+ FILE_NAME);
		} catch (IOException e) {
			System.err.println("Error accediendo al fichero.");
		}
	}
}