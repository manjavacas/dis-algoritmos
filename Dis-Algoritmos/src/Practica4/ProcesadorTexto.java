package Practica4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProcesadorTexto {

	private File f;
	private int porcentaje;
	private BufferedReader br;

	public ProcesadorTexto(File f, int porcentaje) {
		this.f = f;
		this.porcentaje = porcentaje;
	}

	// Extrae un porcentaje de lineas de un fichero y las devuelve en una cadena
	public String procesar() {
		try {
			String texto = "";
			FileReader fr = new FileReader(f);
			br = new BufferedReader(fr);
			int lineas = (int) (1 / ((double) porcentaje / 100));
			int cont = 0;

			String linea;
			while ((linea = br.readLine()) != null) {
				if((cont % lineas) == 0)
					texto += linea;
				cont++;
			}

			return texto;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
