package LP;



import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;


import Comun.itfProperty;
import Excepciones.clsMatriculaIncorrecta;
import Excepciones.clsMatriculaVehiculoRepetida;
import Excepciones.clsPlazaOcupada;
import LN.clsGestorLN;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

/**
 * Clase JFrame que nos permite introducir un veh�culo en el parking
 * @author Industria 4.0
 *
 */

public class JFrameIntroducir extends JFrame {

	private ArrayList< itfProperty> clsVehiculo;
	
	JTable 				jtVehiculo;
	JScrollPane 		jspVehiculo;
	JPanel 				jpVehiculo;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_matr�cula;
	private JTextField txt_zona;
	private JTextField txt_plaza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameIntroducir frame = new JFrameIntroducir();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrameIntroducir() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JFrameMenu volver = new JFrameMenu();
		/**
		 * Creaci�n de las etiquetas
		 */
		JLabel lblIntroduceLaInformacin = new JLabel("Introduce la informaci\u00F3n del veh\u00EDculo");
		lblIntroduceLaInformacin.setBounds(221, 11, 271, 58);
		contentPane.add(lblIntroduceLaInformacin);
		
		JLabel lblTipoDeVehculo = new JLabel("Tipo de veh\u00EDculo:");
		lblTipoDeVehculo.setBounds(39, 69, 100, 24);
		contentPane.add(lblTipoDeVehculo);
		
		JLabel lblMinusvlido = new JLabel("Minusv\u00E1lido:");
		lblMinusvlido.setBounds(39, 177, 100, 24);
		contentPane.add(lblMinusvlido);
		
		/**
		 * JComboBox con el que se introduce si el veh�culo es minusv�lido
		 */
		JComboBox<Object> cmb_minusvalido = new JComboBox<Object>();
		cmb_minusvalido.setModel(new DefaultComboBoxModel<Object>(new String[] {"S\u00CD", "NO"}));
		cmb_minusvalido.setBounds(39, 212, 140, 35);
		contentPane.add(cmb_minusvalido);
		
		/**
		 * JComboBox con el que introduce el tipo de veh�culo
		 */
		JComboBox<Object> cmb_tipoVehiculo = new JComboBox<Object>();
		cmb_tipoVehiculo.setModel(new DefaultComboBoxModel<Object>(new String[] {"COCHE", "MOTO"}));
		cmb_tipoVehiculo.setBounds(39, 104, 140, 35);
		contentPane.add(cmb_tipoVehiculo);
		
		JLabel lblMatrcula = new JLabel("Matr\u00EDcula:");
		lblMatrcula.setBounds(353, 74, 100, 19);
		contentPane.add(lblMatrcula);
		
		/**
		 * JTextField con el que introduce la matr�cula del veh�culo
		 */
		txt_matr�cula = new JTextField();
		txt_matr�cula.setBounds(353, 104, 139, 35);
		contentPane.add(txt_matr�cula);
		txt_matr�cula.setColumns(10);
		
		JLabel lblZona = new JLabel("Zona:");
		lblZona.setBounds(353, 177, 100, 24);
		contentPane.add(lblZona);
		
		/**
		 * JTextField con el que introduce la zona del veh�culo
		 */
		txt_zona = new JTextField();
		txt_zona.setBounds(353, 212, 139, 35);
		contentPane.add(txt_zona);
		txt_zona.setColumns(10);
		
		JLabel lblPlaza = new JLabel("Plaza:");
		lblPlaza.setBounds(353, 301, 100, 24);
		contentPane.add(lblPlaza);
		
		/**
		 * JTextField con el que se introduce la plaza del veh�culo
		 */
		txt_plaza = new JTextField();
		txt_plaza.setBounds(353, 336, 139, 33);
		contentPane.add(txt_plaza);
		txt_plaza.setColumns(10);
		
		/**
		 * bot�n que guarda nuestro vehiculo una vez hemos introducido correctamente los datos
		 */
		JButton btnGuardarVehculo = new JButton("Guardar veh\u00EDculo");
		btnGuardarVehculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clsGestorLN gestor = new clsGestorLN();
				try {
					gestor.AltaVehiculo(txt_matr�cula.getText(), (String) cmb_minusvalido.getSelectedItem(), Integer.parseInt(txt_plaza.getText()), txt_zona.getText(), (String) cmb_tipoVehiculo.getSelectedItem());
					JOptionPane.showMessageDialog(null, "Se ha guardado los datos del veh�culo, vas a volver al menu");
				
				} catch (NumberFormatException e) {
					e.printStackTrace();
					
				} catch (clsMatriculaVehiculoRepetida e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
					JOptionPane.showMessageDialog(null, "Vas a volver al menu");
					
				} catch (clsMatriculaIncorrecta e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
					JOptionPane.showMessageDialog(null, "Vas a volver al menu");
				
				} catch (clsPlazaOcupada e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
					JOptionPane.showMessageDialog(null, "Vas a volver al menu");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				volver.setVisible(true);
				dispose();
			}
		});
		btnGuardarVehculo.setBounds(39, 320, 140, 50);
		contentPane.add(btnGuardarVehculo);
		
		/**
		 * bot�n para volver al men� principal
		 */
		JButton btnSalir = new JButton("Volver atras");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Vas a volver al menu");
				volver.setVisible(true);
				dispose();
			}
		});
		btnSalir.setBounds(39, 381, 140, 50);
		contentPane.add(btnSalir);
	}
	

}
