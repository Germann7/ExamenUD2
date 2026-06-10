package es.oretania;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerListModel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;

public class FormularioExamenUd2 {

	private JFrame frame;
	private JTextField txtAntonioMolina;
	private JTextField textField;
	/**
	 * @wbp.nonvisual location=51,18
	 */
	private final JLabel lblFormularioDeRegistro = new JLabel("Formulario de Registro");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioExamenUd2 window = new FormularioExamenUd2();
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
	public FormularioExamenUd2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 471, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(88, 25, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtAntonioMolina = new JTextField();
		txtAntonioMolina.setText("Antonio Molina");
		txtAntonioMolina.setBounds(144, 22, 229, 20);
		frame.getContentPane().add(txtAntonioMolina);
		txtAntonioMolina.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Edad:");
		lblNewLabel_1.setBounds(88, 50, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setText("33");
		textField.setBounds(144, 47, 229, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Sexo:");
		lblNewLabel_2.setBounds(88, 75, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(178, 74, 90, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setBounds(275, 74, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Intereses:");
		lblNewLabel_3.setBounds(88, 117, 68, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Deporte");
		chckbxNewCheckBox.setBounds(144, 113, 75, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Música");
		chckbxNewCheckBox_1.setSelected(true);
		chckbxNewCheckBox_1.setBounds(232, 113, 57, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Lectura");
		chckbxNewCheckBox_2.setBounds(314, 113, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel_4 = new JLabel("País:");
		lblNewLabel_4.setBounds(88, 146, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Colombia"}));
		comboBox.setBounds(154, 142, 219, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_5 = new JLabel("Año de nacimiento:");
		lblNewLabel_5.setBounds(88, 181, 103, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerListModel(new String[] {"                                                                                                                 2.002"}));
		spinner.setToolTipText("2.002");
		spinner.setBounds(190, 178, 183, 20);
		frame.getContentPane().add(spinner);
		
		JLabel lblNewLabel_6 = new JLabel("Descripción:");
		lblNewLabel_6.setBounds(88, 223, 68, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JTextArea txtrVehicuoloPropio = new JTextArea();
		txtrVehicuoloPropio.setFont(new Font("Monospaced", Font.PLAIN, 9));
		txtrVehicuoloPropio.setText("Vehiculo propio");
		txtrVehicuoloPropio.setBounds(190, 218, 183, 70);
		frame.getContentPane().add(txtrVehicuoloPropio);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(147, 311, 68, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.setBounds(225, 311, 68, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setBounds(303, 311, 68, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
