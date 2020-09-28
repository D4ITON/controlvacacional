import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener {

	// metodos
	private JTextField textfield1;
	private JLabel label1, label2, label3, label4;
	private JButton boton1;
	public static String texto = ""; // variable compartida

	// constructor
	public Bienvenida(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Para cerrar ejecucion en segundo plano
		setTitle("Bienvenido");
		getContentPane().setBackground(new Color(85,85,85)); // new Color(85,85,85)
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

		// imagen de logo
		ImageIcon imagen = new ImageIcon("images/logo_plano.png");
		label1 = new JLabel(imagen);
		label1.setBounds(25, 15, 300, 150); // 25px derecha 15px abajo, 300px ancho, 150px alto
		add(label1);

		label2 = new JLabel("Sistema de Control Vacacional");
		label2.setBounds(35, 135, 300, 30);
		label2.setFont(new Font("Arial", 3, 18)); // 1= negrita, 2=cursiva, 3=ambos
		label2.setForeground(new Color(255, 255, 255));
		add(label2);


		label3 = new JLabel("Ingrese su nombre");
		label3.setBounds(45, 212, 200, 30);
		label3.setFont(new Font("Arial", 1, 12)); // 1= negrita, 2=cursiva, 3=ambos / tamaño fuente
		label3.setForeground(new Color(255, 255, 255));
		add(label3);

		label4 = new JLabel("2020 The Spotify Inc.");
		label4.setBounds(105, 375, 300, 30);
		label4.setFont(new Font("Arial", 1, 12)); // 0 = default, 1= negrita, 2=cursiva, 3=ambos / tamaño fuente
		label4.setForeground(new Color(255, 255, 255));
		add(label4);

		// cuadro de texto
		textfield1 = new JTextField();
		textfield1.setBounds(45, 240, 255, 25);
		textfield1.setBackground(new Color(224, 224, 224));
		textfield1.setFont(new Font("Arial", 1, 14)); // 1= negrita, 2=cursiva, 3=ambos / tamaño fuente
		textfield1.setForeground(new Color(0, 0, 0)); // color del texto
		add(textfield1);

		// estilos del boton
		boton1 = new JButton("Ingresar");
		boton1.setBounds(125, 280, 100, 30);
		boton1.setBackground(new Color(255, 255, 255));
		boton1.setFont(new Font("Arial", 1, 14)); // 1= negrita, 2=cursiva, 3=ambos / tamaño fuente
		boton1.setForeground(new Color(0,0,0));
		boton1.addActionListener(this);
		add(boton1);
	}

	public void actionPerformed(ActionEvent e) {
		// e.getResource obtiene el evento que usuario dispara si es el boton 1
		if(e.getSource() == boton1) {
			texto = textfield1.getText().trim(); // con get text obtiene todo el texto
			if(texto.length() < 1) {
				JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
			} else {
				Licencia ventanaLicencia = new Licencia();
				ventanaLicencia.setBounds(0, 0,600, 370);
				ventanaLicencia.setVisible(true);
				ventanaLicencia.setResizable(false);
				ventanaLicencia.setLocationRelativeTo(null);
				// oculto la interfaz de bienvenida
				this.setVisible(false);
			}
		}
	}

	// interfaz
	public static void main(String args[]) {
		Bienvenida ventanabienvenida = new Bienvenida();
		ventanabienvenida.setBounds(0, 0, 350, 450);
		ventanabienvenida.setVisible(true);
		ventanabienvenida.setResizable(false);
		ventanabienvenida.setLocationRelativeTo(null);
	}
}