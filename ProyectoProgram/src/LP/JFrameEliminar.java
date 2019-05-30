package LP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import LN.clsGestorLN;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

/**
 * Clase JFrame que nos permite eliminar un vehículo de los introducidos en el parking
 * @author Industria 4.0
 *
 */

public class JFrameEliminar extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_eliminar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameEliminar frame = new JFrameEliminar();
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
	public JFrameEliminar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JFrameMenu volver = new JFrameMenu();
		
		JLabel lblEligeElVehculo = new JLabel("Escribe la matr\u00EDcula del veh\u00EDculo que deseas eliminar");
		lblEligeElVehculo.setBounds(217, 11, 254, 39);
		contentPane.add(lblEligeElVehculo);
		
		JButton btnVolverAtras = new JButton("Volver atras");
		btnVolverAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Vas a volver al menu");
				volver.setVisible(true);
				dispose();
			}
		});
		btnVolverAtras.setBounds(499, 371, 124, 50);
		contentPane.add(btnVolverAtras);
		
		JButton btnNewButton = new JButton("Guardar cambios");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clsGestorLN gestor = new clsGestorLN();
				try {
					gestor.eliminarVehiculo2(txt_eliminar.getText());
					JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(499, 304, 124, 50);
		contentPane.add(btnNewButton);
		
		JLabel lblMatrcula = new JLabel("Matr\u00EDcula:");
		lblMatrcula.setBounds(296, 61, 86, 26);
		contentPane.add(lblMatrcula);
		
		txt_eliminar = new JTextField();
		txt_eliminar.setBounds(258, 98, 124, 39);
		contentPane.add(txt_eliminar);
		txt_eliminar.setColumns(10);
	}
}
