package LP;

import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Clase JFrame que nos muestra un menu con el cual vamos a poder inetractuar con todas las posibilidades del parking
 * @author Industria 4.0
 *
 */

public class JFrameMenu extends javax.swing.JFrame {

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
					JFrameMenu frame = new JFrameMenu();
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
	public JFrameMenu() {
		setDefaultCloseOperation(JFrameMenu.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenidAlParking = new JLabel("Bienvenid@ al parking, \u00BFqu\u00E9 deseas hacer?");
		lblBienvenidAlParking.setBounds(210, 29, 238, 32);
		contentPane.add(lblBienvenidAlParking);
		
		JButton btnIntroducirUnVehculo = new JButton("Introducir un veh\u00EDculo");
		btnIntroducirUnVehculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has seleccionado: Introducir un vehÝculo");
				JFrameIntroducir introducir = null;
				try {
					introducir = new JFrameIntroducir();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				introducir.setVisible(true);
				dispose();
			}
		});
		btnIntroducirUnVehculo.setBounds(20, 95, 180, 220);
		contentPane.add(btnIntroducirUnVehculo);
		
		JButton btnMostrarLaLista = new JButton("Mostrar la lista de veh\u00EDculos");
		btnMostrarLaLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has seleccionado: Mostrar la lista de vehÝculos");
				JFrameMostrar mostrar = null;
				try {
					mostrar = new JFrameMostrar();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				mostrar.setVisible(true);
				dispose();
			}
		});
		btnMostrarLaLista.setBounds(226, 95, 180, 220);
		contentPane.add(btnMostrarLaLista);
		
		JButton btnEliminarUnVehculo = new JButton("Eliminar un veh\u00EDculo");
		btnEliminarUnVehculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has seleccionado: Eliminar un vehÝculo");
				JFrameEliminar eliminar = null;
				try {
					eliminar = new JFrameEliminar();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				eliminar.setVisible(true);
				dispose();
			}
		});
		btnEliminarUnVehculo.setBounds(440, 95, 180, 220);
		contentPane.add(btnEliminarUnVehculo);
		
		JButton btnSalirDelParking = new JButton("Salir del parking");
		btnSalirDelParking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalirDelParking.setBounds(226, 326, 180, 90);
		contentPane.add(btnSalirDelParking);
	}

}
