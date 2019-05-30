package LP;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import LN.clsGestorLN;
import LN.clsVehiculo;

public class JFrameMostrar extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	clsGestorLN gestor = new clsGestorLN();
	

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
	 * Creación de las etiquetas y botones.
	 */
	public JFrameMostrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		final JFrameMenu volver = new JFrameMenu();
		contentPane.setLayout(null);
		
		JLabel lblAquPuedesVer = new JLabel("Aqu\u00ED puedes ver todos los veh\u00EDculos que hay en el parking");
		lblAquPuedesVer.setBounds(163, 11, 282, 34);
		contentPane.add(lblAquPuedesVer);
		
		/**
		 * botón para volver al menu principal.
		 */
		JButton btnVolverAtras = new JButton("Volver atras");
		btnVolverAtras.setBounds(456, 395, 135, 49);
		btnVolverAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Vas a volver al menu");
				volver.setVisible(true);
				dispose();
			}
			
		});
		contentPane.add(btnVolverAtras);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 92, 540, 290);
		contentPane.add(scrollPane);
		
		/**
		 * TextArea que muestra los datos de nuestro arraylist
		 */
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		String texto = "";
		for(clsVehiculo a:clsGestorLN.listaVehiculos) {
			texto +="Matricula: " +  a.getProperty("Matricula") + "\n" +
					   "Minusválido: " + a.getProperty("Minusvalido") + "\n" +
					   "Plaza: " + a.getProperty("PlazaVehiculo") + "\n" +
					   "Zona: " + a.getProperty("ZonaVehiculo")+ "\n" +
					   "Tipo de vehículo: " + a.getProperty("TipoVehiculo")+ "\n" + "------------------ \n";
			
		}
	    textArea.append(texto);
		
	
	}
}
