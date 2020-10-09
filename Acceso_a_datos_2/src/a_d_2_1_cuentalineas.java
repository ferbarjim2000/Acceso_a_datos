import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class a_d_2_1_cuentalineas {

	public static void main(String[] args) {
		
		final String FILE_NAME = "ficheros\\ciudades.txt";
		
		int lines = countlines(FILE_NAME);
		System.out.println(lines+1);

	}

	private static int countlines(String FILE_NAME) {
		int iContador = 0;
		try {
			int line;
			FileReader fch = new FileReader(FILE_NAME);
			line = fch.read();
			while (line !=-1) {
				//System.out.println((char)caracter + "\t" + caracter);
				line = fch.read();
				if (line==10) {
					iContador++;
				}
			}
		fch.close();	
		} 
		
		catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado.");
		} 
		
		catch (IOException e) {
			System.err.println("Error de acceso.");
		}
		
		return iContador;
	}

}
