package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.DropMode;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

public class Miventana {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
			
				try {
					Miventana window = new Miventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Miventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(224, 224, 224));
		frame.setBounds(100, 100, 454, 324);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DATOS DE DEPARTAMENTOS");
		lblNewLabel.setBounds(0, 11, 438, 14);
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(29, 36, 362, 207);
		panel_1.setBackground(new Color(255, 255, 153));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(195, 54, 53, 20);
		panel_1.add(textField);
		textField.setBackground(new Color(255, 51, 204));
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(195, 84, 136, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(195, 117, 136, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Código Departamento");
		lblNewLabel_1.setBounds(36, 57, 136, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre Departamento");
		lblNewLabel_2.setBounds(36, 87, 130, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Localidad Departamento");
		lblNewLabel_3.setBounds(36, 120, 149, 14);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.add(lblNewLabel_3);
	    
		JButton btnNewButton = new JButton("INSERTAR DATOS");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(57, 254, 139, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnLimpiarDatos = new JButton("LIMPIAR DATOS");
		btnLimpiarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("SE HA PULSADO EL BOTON LIMPIAR");
				textField_1.setText(null);
				textField_2.setText(null);
				textField.setText(null);
			}
		});
		btnLimpiarDatos.setBackground(new Color(255, 255, 255));
		btnLimpiarDatos.setBounds(230, 254, 141, 23);
		frame.getContentPane().add(btnLimpiarDatos);
		btnLimpiarDatos.setVerticalAlignment(SwingConstants.BOTTOM);
		btnLimpiarDatos.setFont(new Font("Tahoma", Font.BOLD, 11));


	}
}
