package LP;

import java.awt.EventQueue;


/**
 * Clase JFrame que nos muestra todos los vehículos que tenemos en el parking
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import LN.clsGestorLN;
import LN.clsVehiculo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JFrameMostrar extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameMostrar frame = new JFrameMostrar();
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
	public JFrameMostrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JFrameMenu volver = new JFrameMenu();
		
		JLabel lblEstaEsLa = new JLabel("Esta es la lista de los veh\u00EDculos que hay en el parking");
		lblEstaEsLa.setBounds(166, 11, 336, 32);
		contentPane.add(lblEstaEsLa);
		
		JButton btnNewButton_1 = new JButton("Volver atras");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Vas a volver al menu");
				volver.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(471, 390, 127, 56);
		contentPane.add(btnNewButton_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 54, 585, 325);
		contentPane.add(textArea_1);
		
		clsGestorLN gestor = new clsGestorLN();
		ArrayList<clsVehiculo> listaVehiculos = gestor.mostrarVehiculos();
		String vehiculo = "";
		for (clsVehiculo clsVehiculo : listaVehiculos) {
			vehiculo += "Matrícula: " + clsVehiculo.getMatricula() + "\n" +
					"Tipo de vehículo: " + clsVehiculo.getTipoVehiculo() + "\n" +
					"Plaza: " + clsVehiculo.getPlazaVehiculo() + "\n" + 
					"Zona: " + clsVehiculo.getZonaVehiculo() + "\n" +
					"---------------------\n";
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 49, 610, 304);
		contentPane.add(scrollPane);
		
		textArea = new JTextField();
		scrollPane.setViewportView(textArea);
		textArea.setColumns(10);
	}
}
}
