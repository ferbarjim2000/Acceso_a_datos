import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ad_2 {

	public static void main(String[] args) {
		
		final String FILE_NAME = "ficheros\\ciudades.txt";
		
		//readFileChar(FILE_NAME);
		
		int total = countChar(FILE_NAME, 'A');
		System.out.println(total);

	}

	private static int countChar(String FILE_NAME, char c) {
		int iContador = 0;
		try {
			int caracter;
			FileReader fch = new FileReader(FILE_NAME);
			caracter = fch.read();
			while (caracter !=-1) {
				if ((char) caracter == c) {
					iContador++;
				}
				//System.out.println((char)caracter + "\t" + caracter);
				caracter = fch.read();			
			}
			
			fch.close();
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado.");
		} catch (IOException e) {
			System.err.println("Error de acceso.");
		}
		
		return iContador;
	}
//Con solo esto funciona para mostrar lo que hay dentro del archivo:
	private static void readFileChar(String FILE_NAME) {
		
		try {
			int caracter;
			FileReader fch = new FileReader(FILE_NAME);
			caracter = fch.read();
			while (caracter !=-1) {
				System.out.println((char)caracter + "\t" + caracter);
				caracter = fch.read();			}
			
			fch.close();
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado.");
		} catch (IOException e) {
			System.err.println("Error de acceso.");
		}
		
	}

}
