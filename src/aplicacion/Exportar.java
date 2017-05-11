package aplicacion;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Exportar {
	private FileOutputStream fos;
	private ObjectOutputStream oos;

	public Exportar(String texto){
		try{
			//creamos el fichero
			fos = new FileOutputStream("misTextos.dat");
			oos = new ObjectOutputStream(fos);
			
			//guardamos el String recibido en un fichero (podria ser cualquier objeto)
			oos.writeObject(texto);
			
		}catch (Exception e){
			e.printStackTrace();
		} finally {
			try{
				if(fos != null)
					fos.close();
				if(oos != null)
					oos.close();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}
}
