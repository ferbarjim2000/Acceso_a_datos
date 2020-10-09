import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class a_d_2_3_copy_paste {

	public static void main(String[] args) {
		
		final String FILE_NAME= "ficheros\\ciudades.txt";
		
		final String FILE_NAME_SOURCE = "ficheros\\ciudades.txt";
		final String FILE_NAME_TARGET = "ficheros\\localidad.txt";
		
		copyFileChar(FILE_NAME_SOURCE, FILE_NAME_TARGET);
		
	}
	
	private static void copyFileChar(String FILE_NAME_SOURCE, String FILE_NAME_TARGET) {
		try {
			int caracter;
			FileReader fchSource = new FileReader(FILE_NAME_SOURCE);
			FileWriter fchTarget = new FileWriter(FILE_NAME_TARGET);
			caracter = fchSource.read();
			while (caracter !=-1) {
				fchTarget.write(caracter);
				caracter = fchSource.read();
			}
			fchSource.close();
			fchTarget.close();
		
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado.");
		} catch (IOException e) {
			System.err.println("Error de acceso.");
		}
	}

}
