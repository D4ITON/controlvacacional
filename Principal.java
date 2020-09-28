import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {
	// atributos
	private JMenuBar mb;
	private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
	private JMenuItem miCalculo, miDark, miClaro, miElCreador, miSalir, miNuevo;
	private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelAPaterno, labelAMaterno,
		labelDepartamento, labelAntiguedad, labelResultado, labelFooter;

	private JTextField txtNombreTrabajador, txtAPaternoTrabajador, txtAMaternoTrabajador;
	private JComboBox comboDepartamento, comboAntiguedad;
	private JScrollPane scrollpane1;
	private JTextArea textArea1;
	String nombreAdministrador = "";

	// constructor
	public Principal () {
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Para cerrar ejecucion en segundo plano
		setTitle("Pantalla principal");
		getContentPane().setBackground(new Color(85,85,85));
		Bienvenida ventanaBienvenida = new Bienvenida();
		nombreAdministrador = ventanaBienvenida.texto;

		mb = new JMenuBar();
		mb.setBackground(new Color(0, 0, 0));
		setJMenuBar(mb);

		// ------- Menus prinicipales -------
		menuOpciones = new JMenu("Opciones");
		menuOpciones.setBackground(new Color(0, 0, 0));
		menuOpciones.setFont(new Font("Arial", 1 , 14));
		menuOpciones.setForeground(new Color(255, 255, 255));
		mb.add(menuOpciones);

		menuCalcular = new JMenu("Calcular");
		menuCalcular.setBackground(new Color(0, 0, 0));
		menuCalcular.setFont(new Font("Arial", 1, 14));
		menuCalcular.setForeground(new Color(255, 255, 255));
		mb.add(menuCalcular);

		menuAcercaDe = new JMenu("Acerca de");
		menuAcercaDe.setBackground(new Color(255, 0, 0));
		menuAcercaDe.setFont(new Font("Arial", 1, 14));
		menuAcercaDe.setForeground(new Color(255, 255, 255));
		mb.add(menuAcercaDe);

		// ------- Menus secundarios -------
		menuColorFondo = new JMenu("Color de fondo");
		menuColorFondo.setFont(new Font("Arial", 1 ,14));
		menuColorFondo.setForeground(new Color(0, 0, 0));
		menuOpciones.add(menuColorFondo);

		miCalculo = new JMenuItem("Vacaciones");
		miCalculo.setFont(new Font("Arial", 1, 14));
		miCalculo.setForeground(new Color(0, 0, 0));
		menuCalcular.add(miCalculo);
		miCalculo.addActionListener(this);

		miDark = new JMenuItem("Oscuro");
		miDark.setFont(new Font("Arial", 1, 14));
		// miDark.setForeground(new Color(85,85,85));
		menuColorFondo.add(miDark);
		miDark.addActionListener(this);

		miClaro = new JMenuItem("Claro");
		miClaro.setFont(new Font("Arial", 1, 14));
		// miClaro.setForeground(new Color(230,230,230));
		menuColorFondo.add(miClaro);
		miClaro.addActionListener(this);

		miNuevo = new JMenuItem("Limpiar");
		miNuevo.setFont(new Font("Arial", 1, 14));
		miNuevo.setForeground(new Color(0,0,0));
		menuOpciones.add(miNuevo);
		miNuevo.addActionListener(this);

		miElCreador = new JMenuItem("El creador");
		miElCreador.setFont(new Font("Arial", 1, 14));
		miElCreador.setForeground(new Color(0,0,0));
		menuAcercaDe.add(miElCreador);
		miElCreador.addActionListener(this);

		miSalir = new JMenuItem("Salir");
		miSalir.setFont(new Font("Arial", 1, 14));
		miSalir.setForeground(new Color(0,0,0));
		menuOpciones.add(miSalir);
		miSalir.addActionListener(this);

		// ------- Parte superior -------
		ImageIcon imagen = new ImageIcon("images/logo_plano.png");
		labelLogo = new JLabel(imagen);
		labelLogo.setBounds(5,5,250,100);
		add(labelLogo);


		labelBienvenido = new JLabel("Bienvenido " + this.nombreAdministrador);
		labelBienvenido.setBounds(280, 30,300,50);
		labelBienvenido.setFont(new Font("Arial",1,32));
		labelBienvenido.setForeground(new Color(255,255,255));
		add(labelBienvenido);

		labelTitle = new JLabel("Datos del trabajador para calculo de vacaciones");
		labelTitle.setBounds(45,140,900,25);
		labelTitle.setFont(new Font("Arial",0,24));
		labelTitle.setForeground(new Color(255,255,255));
		add(labelTitle);


		// ------- Formulario -------
		labelNombre = new JLabel("Nombre completo");
		labelNombre.setBounds(25,188,180,25);
		labelNombre.setFont(new Font("Arial",1,12));
		labelNombre.setForeground(new Color(255,255,255));
		add(labelNombre);

		txtNombreTrabajador = new JTextField();
		txtNombreTrabajador.setBounds(25,213,150,25);
		txtNombreTrabajador.setBackground(new java.awt.Color(224,224,224));
		txtNombreTrabajador.setFont(new java.awt.Font("Arial",1,14));
		// txtNombreTrabajador.setForeground(new java.awt.Color(255,0,0));
		add(txtNombreTrabajador);

		labelAPaterno = new JLabel("Apellido paterno");
		labelAPaterno.setBounds(25,248,180,25);
		labelAPaterno.setFont(new Font("Arial",1,12));
		labelAPaterno.setForeground(new Color(255,255,255));
		add(labelAPaterno);

		txtAPaternoTrabajador = new JTextField();
		txtAPaternoTrabajador.setBounds(25,273,150,25);
		txtAPaternoTrabajador.setBackground(new java.awt.Color(224,224,224));
		txtAPaternoTrabajador.setFont(new java.awt.Font("Arial",1,14));
		// txtAPaternoTrabajador.setForeground(new java.awt.Color(255,0,0));
		add(txtAPaternoTrabajador);

		labelAMaterno = new JLabel("Apellido materno:");
		labelAMaterno.setBounds(25,308,180,25);
		labelAMaterno.setFont(new Font("Arial",1,12));
		labelAMaterno.setForeground(new Color(255,255,255));
		add(labelAMaterno);

		txtAMaternoTrabajador = new JTextField();
		txtAMaternoTrabajador.setBounds(25,334,150,25);
		txtAMaternoTrabajador.setBackground(new java.awt.Color(224,224,224));
		txtAMaternoTrabajador.setFont(new java.awt.Font("Arial",1,14));
		// txtAMaternoTrabajador.setForeground(new java.awt.Color(255,0,0));
		add(txtAMaternoTrabajador);

		labelDepartamento = new JLabel("Selecciona el departamento");
		labelDepartamento.setBounds(220,188,180,25);
		labelDepartamento.setFont(new Font("Arial",1,12));
		labelDepartamento.setForeground(new Color(255,255,255));
		add(labelDepartamento);


		comboDepartamento = new JComboBox();
		comboDepartamento.setBounds(220,213,220,25);
		comboDepartamento.setBackground(new java.awt.Color(224,224,224));
		comboDepartamento.setFont(new java.awt.Font("Arial", 1,14));
		// comboDepartamento.setForeground(new java.awt.Color(255,255,255));
		add(comboDepartamento);
		comboDepartamento.addItem("");
		comboDepartamento.addItem("Atencion al cliente");
		comboDepartamento.addItem("Departamento de logistica");
		comboDepartamento.addItem("Departamento de gerencia");


		labelAntiguedad = new JLabel("Selecciona la antiguedad");
		labelAntiguedad.setBounds(220,248,180,25);
		labelAntiguedad.setFont(new Font("Arial",1,12));
		labelAntiguedad.setForeground(new Color(255,255,255));
		add(labelAntiguedad);

		comboAntiguedad = new JComboBox();
		comboAntiguedad.setBounds(220,273,220,25);
		comboAntiguedad.setBackground(new java.awt.Color(224,224,224));
		comboAntiguedad.setFont(new java.awt.Font("Arial",1,14));
		// labelAntiguedad.setForeground(new Color(255,255,255));
		add(comboAntiguedad);
		comboAntiguedad.addItem("");
		comboAntiguedad.addItem("1 anio de servicio");
		comboAntiguedad.addItem("2 a 6 anios de servicio");
		comboAntiguedad.addItem("7 anios o mas de servicio");


		labelResultado = new JLabel("Resultado del calculo");
		labelResultado.setBounds(220,307,180,25);
		labelResultado.setFont(new Font("Arial",1,12));
		labelResultado.setForeground(new Color(255,255,255));
		add(labelResultado);

		textArea1 = new JTextArea();
		textArea1.setEditable(false);
		textArea1.setBackground(new Color(224,224,224));
		textArea1.setFont(new Font("Arial",1,11));
		textArea1.setForeground(new Color(0,0,0));
		textArea1.setText("\n   Aqui aparece el caculo de las vacaciones");
		scrollpane1 = new JScrollPane(textArea1);
		scrollpane1.setBounds(220,333,385,90);
		add(scrollpane1);


		labelFooter = new JLabel("2020 Spotify inc. | Todos los derechos reservados");
		labelFooter.setBounds(135,445,500,30);
		labelFooter.setFont(new java.awt.Font("Arial",1,12));
		labelFooter.setForeground(new java.awt.Color(255,255,255));
		add(labelFooter);

	}

	// metodos
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == miCalculo) {
			String nombreTrabajador = this.txtNombreTrabajador.getText();
			String AP = this.txtAPaternoTrabajador.getText();
			String AM = this.txtAMaternoTrabajador.getText();
			String departamento = this.comboDepartamento.getSelectedItem().toString();
			String antiguedad = this.comboAntiguedad.getSelectedItem().toString();


			if(nombreTrabajador.equals("") ||
				AP.equals("") ||
				AM.equals("") ||
				departamento.equals("") ||
				antiguedad.equals("")) {

				JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");
			} else {

				// --- atencion al cliente ----
				if(departamento.equals("Atencion al cliente")){

					// ---- tiempo de vacaciones ----
					if(antiguedad.equals("1 anio de servicio")) {
						this.textArea1.setText(
							"\n  " + nombreTrabajador + " " + AP + " " + AM +
							"quien labora en " + departamento + " con " + antiguedad +
							"recibe 6 dias de vacaciones");
					}
					if(antiguedad.equals("2 a 6 anios de servicio")) {
						this.textArea1.setText(
							"\n  " + nombreTrabajador + " " + AP + " " + AM +
							"quien labora en " + departamento + " con " + antiguedad +
							"recibe 14 dias de vacaciones");
					}
					if(antiguedad.equals("2 a 6 anios de servicio")) {
						this.textArea1.setText(
							"\n  " + nombreTrabajador + " " + AP + " " + AM +
							"quien labora en " + departamento + " con " + antiguedad +
							"recibe 20 dias de vacaciones");
					}
				}

				// --- Departamento de logistica ----
				if(departamento.equals("Departamento de logistica")) {

					// ---- tiempo de vacaciones ----
					if(antiguedad.equals("1 anio de servicio")) {
						this.textArea1.setText(
							"\n  " + nombreTrabajador + " " + AP + " " + AM +
							"quien labora en " + departamento + " con " + antiguedad +
							"recibe 7 dias de vacaciones");
					}
					if(antiguedad.equals("2 a 6 anios de servicio")) {
						this.textArea1.setText(
							"\n  " + nombreTrabajador + " " + AP + " " + AM +
							"quien labora en " + departamento + " con " + antiguedad +
							"recibe 16 dias de vacaciones");
					}
					if(antiguedad.equals("2 a 6 anios de servicio")) {
						this.textArea1.setText(
							"\n  " + nombreTrabajador + " " + AP + " " + AM +
							"quien labora en " + departamento + " con " + antiguedad +
							"recibe 22 dias de vacaciones");
					}
				}


				// --- Departamento de gerencia ----
				if(departamento.equals("Departamento de gerencia")) {

					// ---- tiempo de vacaciones ----
					if(antiguedad.equals("1 anio de servicio")) {
						this.textArea1.setText(
							"\n  " + nombreTrabajador + " " + AP + " " + AM +
							"quien labora en " + departamento + " con " + antiguedad +
							"recibe 10 dias de vacaciones");
					}
					if(antiguedad.equals("2 a 6 anios de servicio")) {
						this.textArea1.setText(
							"\n  " + nombreTrabajador + " " + AP + " " + AM +
							"quien labora en " + departamento + " con " + antiguedad +
							"recibe 20 dias de vacaciones");
					}
					if(antiguedad.equals("2 a 6 anios de servicio")) {
						this.textArea1.setText(
							"\n  " + nombreTrabajador + " " + AP + " " + AM +
							"quien labora en " + departamento + " con " + antiguedad +
							"recibe 30 dias de vacaciones");
					}
				}
			}

		}
		if(e.getSource() == miDark){
			this.getContentPane().setBackground(new Color(85,85,85));
		}
		if(e.getSource() == miClaro){
			this.getContentPane().setBackground(new Color(230,230,230));
		}
		if(e.getSource() == miNuevo){
			this.txtNombreTrabajador.setText("");
			this.txtAPaternoTrabajador.setText("");
			this.txtAMaternoTrabajador.setText("");
			this.comboDepartamento.setSelectedIndex(0);
			this.comboAntiguedad.setSelectedIndex(0);
			this.textArea1.setText("\n   Aqui aparece el caculo de las vacaciones");
		}
		if(e.getSource() == miSalir){
			// copiamos el main de Bienvenida.java
			Bienvenida ventanabienvenida = new Bienvenida();
			ventanabienvenida.setBounds(0, 0, 350, 450);
			ventanabienvenida.setVisible(true);
			ventanabienvenida.setResizable(false);
			ventanabienvenida.setLocationRelativeTo(null);
			this.setVisible(false);
		}
		if(e.getSource() == miElCreador){
			JOptionPane.showMessageDialog(null, "Desarrollado por Daltonmh");
		}
	}

	// metodo principal
	public static void main(String args[]){
		Principal ventanaPrincipal = new Principal();
		ventanaPrincipal.setBounds(0,0,640,535);
		ventanaPrincipal.setVisible(true);
		ventanaPrincipal.setResizable(false);
		ventanaPrincipal.setLocationRelativeTo(null);
	}
}

