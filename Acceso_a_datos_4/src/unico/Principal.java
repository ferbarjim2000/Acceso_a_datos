package unico;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		
		final String FILE_NAME_SOURCE = "fotos\\descarga.jpg";
		final String FILE_NAME_TARGET = "fotos\\ciudad.jpg";
		
		copyFileBin(FILE_NAME_SOURCE, FILE_NAME_TARGET);

	}

	private static void copyFileBin(String FILE_NAME_SOURCE, String FILE_NAME_TARGET) {
		
		try {
			FileInputStream fchSource = new FileInputStream(FILE_NAME_SOURCE);
			DataInputStream dataSource = new DataInputStream(fchSource);
			
			FileOutputStream fchTarget = new FileOutputStream(FILE_NAME_TARGET);
			DataOutputStream dataTarget = new DataOutputStream(fchTarget);
			
			int byteRead;
			int iContador=0;
			byteRead = dataSource.read();
			while (byteRead!=-1) {
				dataTarget.write(byteRead);
				byteRead = dataSource.read();
				iContador++;
			}
			
			dataTarget.close();
			fchTarget.close();
			dataSource.close();
			fchSource.close();
			
			System.out.println(iContador);
			
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado.");
		}catch (IOException e) {
			System.err.println("Error accediendo al fichero.");
		}
		
	}

}
