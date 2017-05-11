package aplicacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField miTexto;
	private JLabel lb_miTexto;
	private JButton btn_enviar;	
	private JButton btn_exportar;

	/**
	 * Create the frame.
	 */
	public VistaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		miTexto = new JTextField();
		contentPane.add(miTexto);
		miTexto.setColumns(10);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		contentPane.add(verticalStrut);
		
		JSeparator separator = new JSeparator();
		contentPane.add(separator);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		contentPane.add(verticalStrut_1);
		
		lb_miTexto = new JLabel("");
		contentPane.add(lb_miTexto);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		contentPane.add(verticalStrut_2);
		
		btn_enviar = new JButton("Enviar");
			
		btn_enviar.setActionCommand("Enviar");
		contentPane.add(btn_enviar);
		
		btn_exportar = new JButton("Exportar");
		btn_exportar.setActionCommand("Exportar");
		contentPane.add(btn_exportar);
	}
	
	public void estableceControlador(Controlador cont){
		this.btn_enviar.addActionListener(cont);
		this.btn_exportar.addActionListener(cont);
	}
	
	public void visualiza(){
		this.setVisible(true);
	}
	
	public void muestraMensaje(){
		String msj = this.miTexto.getText();
		this.lb_miTexto.setText(msj);
	}
	
	public String exportaMensaje(){
		String msj = this.lb_miTexto.getText();
		return msj;
	}

}
