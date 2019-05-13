package LP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSplitPane;

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
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblBienvenidAlParking = new JLabel("Bienvenid@ al parking, \u00BFque deseas hacer?");
		contentPane.add(lblBienvenidAlParking, BorderLayout.NORTH);
		
		JButton btnIntroducirVehculo = new JButton("Introducir veh\u00EDculo");
		contentPane.add(btnIntroducirVehculo, BorderLayout.WEST);
		
		JButton btnMostrarListaDe = new JButton("Mostrar lista de veh\u00EDculos");
		contentPane.add(btnMostrarListaDe, BorderLayout.CENTER);
		
		JButton btnEliminarVehculo = new JButton("Eliminar veh\u00EDculo");
		contentPane.add(btnEliminarVehculo, BorderLayout.EAST);
	}

}
