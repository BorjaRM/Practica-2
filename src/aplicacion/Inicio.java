package aplicacion;

import java.awt.EventQueue;

public class Inicio {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Creamos vista principal
					VistaPrincipal vp = new VistaPrincipal();
					//Creamos modelo (no hay)
					//Creamos controlador
					Controlador c = new Controlador(vp);
					//Asociamos el controlador con la vista
					vp.estableceControlador(c);
					//Hacemos visible la ventana
					vp.visualiza();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
