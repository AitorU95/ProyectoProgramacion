package LP;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import LN.clsGestorLN;
import LN.clsVehiculo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameMostrar extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	

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
		setBounds(100, 100, 630, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JFrameMenu volver = new JFrameMenu();
		
		JLabel lblAquPuedesVer = new JLabel("Aqu\u00ED puedes ver todos los veh\u00EDculos que hay en el parking");
		lblAquPuedesVer.setBounds(163, 11, 282, 34);
		contentPane.add(lblAquPuedesVer);
		
		JButton btnVolverAtras = new JButton("Volver atras");
		btnVolverAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Vas a volver al menu");
				volver.setVisible(true);
				dispose();
			}
			
		});
		btnVolverAtras.setBounds(456, 395, 135, 49);
		contentPane.add(btnVolverAtras);
		
		clsGestorLN gestor = new clsGestorLN();
		ArrayList<clsVehiculo> listaVehiculos = gestor.mostrarVehiculos();
		String vehiculo = "";
		for (clsVehiculo clsVehiculo : listaVehiculos) {
			vehiculo += "Matrícula: " + clsVehiculo.getMatricula() + "\n" +
					"Tipo de vehículo: " + clsVehiculo.getTipoVehiculo() + "\n" +
					"Plaza: " + clsVehiculo.getPlazaVehiculo() + "\n" + 
					"Zona: " + clsVehiculo.getZonaVehiculo() + "\n" +
					"---------------------\n";
		}
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 56, 594, 328);
		contentPane.add(textArea);
		textArea.setText(vehiculo);

}
}
