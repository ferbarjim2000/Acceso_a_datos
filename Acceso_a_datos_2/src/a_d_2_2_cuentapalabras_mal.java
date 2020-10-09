import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class a_d_2_2_cuentapalabras_mal {

	public static void main(String[] args) {
		
		final String FILE_NAME = "ficheros\\ciudades.txt";
		
		int words = countWords(FILE_NAME);
		System.out.println(words+1);

	}

	private static void readFileChar(String FILE_NAME) {
		
		try {
			int caracter;
			FileReader fch = new FileReader(FILE_NAME);
			caracter = fch.read();
			while (caracter !=-1) {
				//System.out.println((char)caracter + "\t" + caracter);
				caracter = fch.read();			}
			
			fch.close();
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado.");
		} catch (IOException e) {
			System.err.println("Error de acceso.");
		}
		
	}
	
	
	private static int countWords(String FILE_NAME) {
		int iContador = 0;
		try {
			int caracter;
			FileReader fch = new FileReader(FILE_NAME);
			caracter = fch.read();
			while (caracter !=-1) {
				//System.out.println((char)caracter + "\t" + caracter);
				caracter = fch.read();		
				if (caracter==' ') {
					iContador++;
				}
			}
			
			fch.close();
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado.");
		} catch (IOException e) {
			System.err.println("Error de acceso.");
		}
		
		return iContador;
	}

}
