package one;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Ventana {
	JFrame ventana;
	JPanel panel1, panel2, panel3, panel4;
	Border titulo, blackline;
	GridBagConstraints constraints;
	JLabel uno, dos, tres, cuatro, cinco, foto;
	JTextField campo1, campo2, campo3, campo4, campo5;
	JButton boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9;
	JComboBox combo;
	ImageIcon imagen;
	Icon icono;
	
	Ventana() {
		Estructura();
	}
	
	void Componentes() {
		panel1=new JPanel();
		panel1.setLayout(new GridBagLayout());
		titulo=BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.black),"Datos personales");
		panel1.setBorder(titulo);
		constraints=new GridBagConstraints();
		
		uno=new JLabel("Nombres del contacto:");
		constraints.gridx=0;
		constraints.gridy=1;
		constraints.gridwidth=1;
		constraints.gridheight=1;
		constraints.anchor=GridBagConstraints.NORTHWEST;
		constraints.weightx=1.0;
		constraints.weighty=0.0;
		panel1.add(uno,constraints);
		
		campo1=new JTextField();
		constraints.gridx=0;
		constraints.gridy=2;
		constraints.gridwidth=1;
		constraints.gridheight=1;
		constraints.anchor=GridBagConstraints.WEST;
		constraints.fill=GridBagConstraints.HORIZONTAL;
		constraints.weightx=0.0;
		constraints.weighty=0.0;
		panel1.add(campo1,constraints);
		
		dos=new JLabel("Apellidos del contacto:");
		constraints.gridx=0;
		constraints.gridy=3;
		constraints.gridwidth=1;
		constraints.gridheight=1;
		constraints.fill=GridBagConstraints.NONE;
		constraints.weightx=0.0;
		constraints.weighty=0.0;
		panel1.add(dos,constraints);
		
		campo2=new JTextField();
		constraints.gridx=0;
		constraints.gridy=4;
		constraints.gridwidth=1;
		constraints.gridheight=1;
		constraints.fill=GridBagConstraints.HORIZONTAL;
		constraints.weightx=0.0;
		constraints.weighty=0.0;
		panel1.add(campo2,constraints);
		
		tres=new JLabel("Email:");
		constraints.gridx=0;
		constraints.gridy=5;
		constraints.gridwidth=1;
		constraints.gridheight=1;
		constraints.anchor=GridBagConstraints.NORTHWEST;
		constraints.fill=GridBagConstraints.NONE;
		constraints.weightx=0.0;
		constraints.weighty=0.0;
		panel1.add(tres,constraints);
		
		campo3=new JTextField();
		constraints.gridx=0;
		constraints.gridy=6;
		constraints.gridwidth=1;
		constraints.gridheight=1;
		constraints.anchor=GridBagConstraints.NORTHWEST;
		constraints.fill=GridBagConstraints.HORIZONTAL;
		constraints.weightx=0.0;
		constraints.weighty=0.0;
		panel1.add(campo3,constraints);
		
		cuatro=new JLabel("Celular:");
		constraints.gridx=2;
		constraints.gridy=5;
		constraints.gridwidth=1;
		constraints.gridheight=1;
		constraints.anchor=GridBagConstraints.NORTHWEST;
		constraints.fill=GridBagConstraints.NONE;
		constraints.weightx=1.0;
		constraints.weighty=0.0;
		panel1.add(cuatro,constraints);
		
		campo4=new JTextField();
		constraints.gridx=2;
		constraints.gridy=6;
		constraints.gridwidth=1;
		constraints.gridheight=1;
		constraints.fill=GridBagConstraints.HORIZONTAL;
		constraints.weightx=0.0;
		constraints.weighty=0.0;
		panel1.add(campo4,constraints);
		
		cinco=new JLabel("Dirección:");
		constraints.gridx=0;
		constraints.gridy=7;
		constraints.gridwidth=1;
		constraints.gridheight=1;
		constraints.anchor=GridBagConstraints.NORTHWEST;
		constraints.fill=GridBagConstraints.NONE;
		constraints.weightx=0.0;
		constraints.weighty=1.0;
		panel1.add(cinco,constraints);
		
		campo5=new JTextField();
		constraints.gridx=0;
		constraints.gridy=8;
		constraints.gridwidth=1;
		constraints.gridheight=1;
		constraints.anchor=GridBagConstraints.NORTHWEST;
		constraints.fill=GridBagConstraints.HORIZONTAL;
		constraints.weightx=0.0;
		constraints.weighty=1.0;
		panel1.add(campo5,constraints);
	
		foto=new JLabel(" ");
		foto.setFont(new Font("ARIAL",Font.CENTER_BASELINE,15));
		blackline=BorderFactory.createLineBorder(Color.black);
		foto.setBorder(blackline);
		constraints.gridx=3;
		constraints.gridy=1;
		constraints.gridwidth=1;
		constraints.gridheight=5;
		constraints.anchor=GridBagConstraints.EAST;
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weightx=0.0;
		constraints.weighty=0.0;
		panel1.add(foto,constraints);
		
		boton1=new JButton("Cargar foto");
		boton1.setFont(new Font("ARIAL",Font.BOLD,15));
		constraints.gridx=3;
		constraints.gridy=6;
		constraints.gridwidth=1;
		constraints.gridheight=1;
		constraints.anchor=GridBagConstraints.NORTH;
		constraints.fill=GridBagConstraints.NONE;
		constraints.weightx=0.0;
		constraints.weighty=0.0;
		panel1.add(boton1,constraints);
		
		combo=new JComboBox();
		combo.addItem("Seleccione");
		combo.addItem("Femenino");
		combo.addItem("Masculino");
		constraints.gridx=3;
		constraints.gridy=7;
		constraints.gridwidth=1;
		constraints.gridheight=1;
		constraints.anchor=GridBagConstraints.NORTH;
		constraints.weightx=0.0;
		constraints.weighty=0.0;
		panel1.add(combo,constraints);
		
		panel2=new JPanel();
		panel2.setLayout(new GridBagLayout());
		boton2=new JButton("Probar conexión");
		constraints.gridx=0;
		constraints.gridy=1;
		constraints.gridwidth=1;
		constraints.gridheight=2;
		constraints.fill=GridBagConstraints.HORIZONTAL;
		constraints.weightx=1.0;
		panel2.add(boton2,constraints);
		
		boton3=new JButton("Otro botón");
		constraints.gridx=3;
		constraints.gridy=1;
		constraints.gridwidth=1;
		constraints.gridheight=2;
		panel2.add(boton3,constraints);
		
		panel3=new JPanel();
		panel3.setLayout(new BorderLayout());
		Vector<String> fila= new Vector<String>();
		Vector<Vector> filatotal= new Vector<Vector>();
		filatotal.addElement(fila);
		Vector<String> columna= new Vector<String>();
		columna.addElement("Nombres:");
		columna.addElement("Apellidos:");
		columna.addElement("Email:");
		columna.addElement("Telefono:");
		columna.addElement("Dirección:");
		columna.addElement("Sexo:");
		JTable tabla=new JTable(filatotal,columna);
		JScrollPane jsb=new JScrollPane(tabla);
		panel3.add(jsb,BorderLayout.CENTER);
		
		panel4=new JPanel();
		panel4.setLayout(new GridBagLayout());
		boton4=new JButton("Ir");
		constraints.gridx=0;
		constraints.gridy=1;
		constraints.gridwidth=1;
		constraints.gridheight=1;
		constraints.fill=GridBagConstraints.VERTICAL;
		constraints.weightx=1.0;
		constraints.weighty=1.0;
		panel4.add(boton4,constraints);
		
		boton5=new JButton("Guardar");
		imagen=new ImageIcon("src/imagenes/guardar.jpg");
		icono=new ImageIcon(imagen.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		boton5.setIcon(icono);
		boton5.setIconTextGap(1);
		boton5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		boton5.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
		boton5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
		boton5.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
		constraints.gridx=1;
		constraints.gridy=1;
		constraints.gridwidth=1;
		constraints.gridheight=1;
		panel4.add(boton5,constraints);
		
		boton6=new JButton("Eliminar");
		constraints.gridx=2;
		constraints.gridy=1;
		constraints.gridwidth=1;
		constraints.gridheight=1;
		panel4.add(boton6,constraints);
		
		boton7=new JButton("Modificar");
		constraints.gridx=3;
		constraints.gridy=1;
		constraints.gridwidth=1;
		constraints.gridheight=1;
		panel4.add(boton7,constraints);
		
		boton8=new JButton("Limpiar");
		constraints.gridx=4;
		constraints.gridy=1;
		constraints.gridwidth=1;
		constraints.gridheight=1;
		panel4.add(boton8,constraints);
		
		boton9=new JButton("Salir");
		constraints.gridx=5;
		constraints.gridy=1;
		constraints.gridwidth=1;
		constraints.gridheight=1;
		panel4.add(boton9,constraints);
	}
	
	void Estructura() {
		ventana=new JFrame();
		ventana.setTitle("Formulario de contacto");
		ventana.setSize(640,460);
		ventana.setLayout(new BoxLayout(ventana.getContentPane(),BoxLayout.Y_AXIS));
		Componentes();
		ventana.add(panel1);
		ventana.add(panel2);
		ventana.add(panel3);
		ventana.add(panel4);
		
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
	}
	

}
