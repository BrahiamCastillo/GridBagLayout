package one;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
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
	JPanel panel1, panel2, panel3;
	Border titulo, blackline;
	GridBagConstraints constraints;
	JLabel uno, dos, tres, cuatro, foto;
	JTextField campo1, campo2, campo3, campo4;
	JButton boton1, boton2, boton3;
	JComboBox combo;
	
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
		constraints.weighty=1.0;
		panel1.add(campo3,constraints);
		
		cuatro=new JLabel("Celular:");
		constraints.gridx=2;
		constraints.gridy=5;
		constraints.gridwidth=1;
		constraints.gridheight=1;
		constraints.fill=GridBagConstraints.HORIZONTAL;
		constraints.weightx=1.0;
		constraints.weighty=0.0;
		panel1.add(cuatro,constraints);
		
		campo4=new JTextField();
		constraints.gridx=2;
		constraints.gridy=6;
		constraints.gridwidth=1;
		constraints.gridheight=1;
		constraints.anchor=GridBagConstraints.NORTHWEST;
		constraints.fill=GridBagConstraints.HORIZONTAL;
		constraints.weightx=0.0;
		constraints.weighty=0.0;
		panel1.add(campo4,constraints);
		
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
		boton2=new JButton("Probar conexi�n");
		constraints.gridx=0;
		constraints.gridy=1;
		constraints.gridwidth=1;
		constraints.gridheight=2;
		constraints.fill=GridBagConstraints.HORIZONTAL;
		constraints.weightx=1.0;
		panel2.add(boton2,constraints);
		
		boton3=new JButton("Otro bot�n");
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
		columna.addElement("Direcci�n:");
		columna.addElement("Sexo:");
		JTable tabla=new JTable(filatotal,columna);
		JScrollPane jsb=new JScrollPane(tabla);
		panel3.add(jsb,BorderLayout.CENTER);
	}
	
	void Estructura() {
		ventana=new JFrame();
		ventana.setTitle("Formulario de contacto");
		ventana.setSize(400,400);
		ventana.setLayout(new BoxLayout(ventana.getContentPane(),BoxLayout.Y_AXIS));
		Componentes();
		ventana.add(panel1);
		ventana.add(panel2);
		ventana.add(panel3);
		
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
	}
	

}