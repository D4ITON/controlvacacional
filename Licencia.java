import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{
	// atributos
	private JLabel label1, label2;
	private JCheckBox check1;
	private JButton boton1, boton2;
	private JScrollPane scrollpane1;
	private JTextArea textarea1;

	String nombre = "";

	// constructor
	public Licencia(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Para cerrar ejecucion en segundo plano
		setTitle("Licencia de uso");
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		Bienvenida ventanaBienvenida = new Bienvenida();
		nombre = ventanaBienvenida.texto; // obtengo la variable declarada en la licencia


		label1 = new JLabel("TERMINOS Y CONDICIONES");
		label1.setBounds(200, 5, 200, 30);
		label1.setFont(new Font("Arial", 1, 14));
		label1.setForeground(new Color(0,0,0));
		add(label1);

		textarea1 = new JTextArea();
		textarea1.setEditable(false);
		textarea1.setFont(new Font("Arial", 0, 9));
		textarea1.setText("\n\n          TERMINOS Y CONDICIONES" +
                    "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION DE LA GEEKIPEDIA DE ERNESTO." +
                    "\n            B.  PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISENIO DE LAS INTERFACES GRAFICAS." +
                    "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                    "\n\n          LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACION RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                    "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED" + 
                    "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                    "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
                    "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
                    "\n          http://www.youtube.com/ernestoperezm");
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(10, 40, 565, 200);
		add(scrollpane1);


		// check1 = new JCheckBox("Acepto");
		check1 = new JCheckBox("Yo " + this.nombre + " acepto");
		check1.setBounds(250, 250, 300, 30);
		check1.addChangeListener(this);
		add(check1);

		boton1 = new JButton("Continuar");
		boton1.setBounds(200, 290, 100, 30);
		boton1.addActionListener(this);
		boton1.setEnabled(false);
		add(boton1);

		boton2 = new JButton("No acepto");
		boton2.setBounds(310, 290, 100, 30);
		boton2.addActionListener(this);
		boton2.setEnabled(true);
		add(boton2);
	}

	// metodos
	// ChangeEvent para el checkbox
	public void stateChanged(ChangeEvent e) {
		if(check1.isSelected() == true) {
			boton1.setEnabled(true);
			boton2.setEnabled(false);
		} else {
			boton1.setEnabled(false);
			boton2.setEnabled(true);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton1){
			// copiamos el main de Principal.java
			Principal ventanaPrincipal = new Principal();
			ventanaPrincipal.setBounds(0,0,640,535);
			ventanaPrincipal.setVisible(true);
			ventanaPrincipal.setResizable(false);
			ventanaPrincipal.setLocationRelativeTo(null);
			this.setVisible(false);
		} else if(e.getSource() == boton2) {
			// copiamos el main de Bienvenida.java
			Bienvenida ventanabienvenida = new Bienvenida();
			ventanabienvenida.setBounds(0, 0, 350, 450);
			ventanabienvenida.setVisible(true);
			ventanabienvenida.setResizable(false);
			ventanabienvenida.setLocationRelativeTo(null);
			this.setVisible(false);
		}
	}

	// metodo principal
	public static void main(String args[]){
		Licencia ventanaLicencia = new Licencia();
		ventanaLicencia.setBounds(0, 0,600, 370);
		ventanaLicencia.setVisible(true);
		ventanaLicencia.setResizable(false);
		ventanaLicencia.setLocationRelativeTo(null);
	}

}
