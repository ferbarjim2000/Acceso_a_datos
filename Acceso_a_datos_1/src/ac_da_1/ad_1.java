package ac_da_1;

import java.io.File;

public class ad_1 {

	public static void main(String[] args) {
		
		File fch = new File("ejemplos//hola1.txt");
		
		if (fch.exists() && !fch.isDirectory()) {
			InfoFichero(fch);
		}
		
		else {
			System.out.println("El fichero no existe.");
		}

	}

	private static void InfoFichero(File fch) {
		
		String  fchNombre       = fch.getName();
		long    fchBytes        = fch.length();
		boolean fchEsDirectorio = fch.isDirectory();
		boolean fchWrite        = fch.canWrite();
		boolean fchRead         = fch.canRead();
		boolean fchExecute      = fch.canExecute();
		String  fchPadre        = fch.getParent(); 
		String  fchRutaAbsoluta = fch.getAbsolutePath();
		long    fchEspaciolibre = fch.getUsableSpace();
		float Mb = (fchEspaciolibre/1024)/1024;
		float Gb = (Mb / 1024);


		System.out.println("Nombre: " + fchNombre);
		System.out.println("Tamaño: " + fchBytes + " Bytes.");
		System.out.println("Es directorio: " + SiNo(fchEsDirectorio));
		System.out.println("Se puede escribir: " + SiNo(fchWrite));
		System.out.println("Se puede leer: " + SiNo(fchRead));
		System.out.println("Se puede ejecutar: " + SiNo(fchExecute));
		System.out.println("Carpeta padre: " + fchPadre);
		System.out.println("Ruta absoluta: " + fchRutaAbsoluta);
		System.out.println("Espacio libre en Bytes: " + fchEspaciolibre);
		System.out.println("Espacio libre en Megas: " + Mb);
		System.out.println("Espacio libre en Gigas: " + Gb);
	}

	
	private static String SiNo(boolean valorLogico) {
		return valorLogico ? "Sí" : "No";
	}

}