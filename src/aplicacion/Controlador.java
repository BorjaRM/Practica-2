package aplicacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
	VistaPrincipal vp;
	
	public Controlador(VistaPrincipal vista){
		vp=vista;
	}
	
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()){
			case "Enviar": vp.muestraMensaje(); break;
			case "Exportar": 
				String msj = vp.exportaMensaje(); 
				if(msj != null){
					Exportar ex = new Exportar(msj);
				}
				break;
		}
	}
	
	

}
