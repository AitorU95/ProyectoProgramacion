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
import java.util.ArrayList;
import java.awt.event.ActionEvent;

/**
 * Clase JFrame que nos permite introducir un vehículo en el parking
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
	private JTextField txt_matrícula;
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
		 * JComboBox con el que se introduce si el vehículo es minusválido
		 */
		JComboBox<Object> cmb_minusvalido = new JComboBox<Object>();
		cmb_minusvalido.setModel(new DefaultComboBoxModel<Object>(new String[] {"S\u00CD", "NO"}));
		cmb_minusvalido.setBounds(39, 212, 140, 35);
		contentPane.add(cmb_minusvalido);
		
		/**
		 * JComboBox con el que introduce el tipo de vehículo
		 */
		JComboBox<Object> cmb_tipoVehiculo = new JComboBox<Object>();
		cmb_tipoVehiculo.setModel(new DefaultComboBoxModel<Object>(new String[] {"COCHE", "MOTO"}));
		cmb_tipoVehiculo.setBounds(39, 104, 140, 35);
		contentPane.add(cmb_tipoVehiculo);
		
		JLabel lblMatrcula = new JLabel("Matr\u00EDcula:");
		lblMatrcula.setBounds(353, 74, 100, 19);
		contentPane.add(lblMatrcula);
		
		/**
		 * JTextField con el que introduce la matrícula del vehículo
		 */
		txt_matrícula = new JTextField();
		txt_matrícula.setBounds(353, 104, 139, 35);
		contentPane.add(txt_matrícula);
		txt_matrícula.setColumns(10);
		
		JLabel lblZona = new JLabel("Zona:");
		lblZona.setBounds(353, 177, 100, 24);
		contentPane.add(lblZona);
		
		/**
		 * JTextField con el que introduce la zona del vehículo
		 */
		txt_zona = new JTextField();
		txt_zona.setBounds(353, 212, 139, 35);
		contentPane.add(txt_zona);
		txt_zona.setColumns(10);
		
		JLabel lblPlaza = new JLabel("Plaza:");
		lblPlaza.setBounds(353, 301, 100, 24);
		contentPane.add(lblPlaza);
		
		/**
		 * JTextField con el que se introduce la plaza del vehículo
		 */
		txt_plaza = new JTextField();
		txt_plaza.setBounds(353, 336, 139, 33);
		contentPane.add(txt_plaza);
		txt_plaza.setColumns(10);
		
		JButton btnGuardarVehculo = new JButton("Guardar veh\u00EDculo");
		btnGuardarVehculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clsGestorLN gestor = new clsGestorLN();
				try {
					gestor.AltaVehiculo(txt_matrícula.getText(), (String) cmb_minusvalido.getSelectedItem(), Integer.parseInt(txt_plaza.getText()), txt_zona.getText(), (String) cmb_tipoVehiculo.getSelectedItem());
					JOptionPane.showMessageDialog(null, "Se ha guardado los datos del vehículo, vas a volver al menu");
				
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
				}
				
				volver.setVisible(true);
				dispose();
			}
		});
		btnGuardarVehculo.setBounds(39, 320, 140, 50);
		contentPane.add(btnGuardarVehculo);
		
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
	
	
	public void CrearTabla() {
		
		jtVehiculo = null;
					
		//CargarDatos();

		TablaVehiculoModel tcm = new TablaVehiculoModel(clsVehiculo);
					
					
						jtVehiculo = new JTable(tcm);
						jtVehiculo.setPreferredScrollableViewportSize(new Dimension(500, 70));
						jtVehiculo.setFillsViewportHeight(true);
						jtVehiculo.setEnabled(true);
						jtVehiculo.setRowSelectionAllowed(true);
						tcm.fireTableDataChanged();
						
						jspVehiculo = new JScrollPane(jtVehiculo);
						jspVehiculo.setBounds(10, 236, 457, 164);
					getContentPane().add(jspVehiculo);
					tcm.setData(clsVehiculo);
				}
	
	
	
	class TablaVehiculoModel extends AbstractTableModel
    {
        private String[] columnNames = {"Matricula","Minusvalido","Plaza","Zona", "Tipo de Vehiculo"};
        Object[][] data;
        
        public  TablaVehiculoModel(ArrayList<itfProperty>clsVehiculo)
        {
        	
        	super();
        	
    		int filas = clsVehiculo.size();
    		int cont;
    		data=new Object[filas][];
    		cont=0;
    		
    		
    		//Nos recorremos el map para cargar la variable data[][]
    		for (itfProperty b: clsVehiculo)
    		{
    			Object[]a={b.getProperty("Matricula"),
    					   b.getProperty("Minusvalido"),
    					   b.getProperty("PlazaVehiculo"),
    					   b.getProperty("ZonaVehiculo"),
    					   b.getProperty("TipoVehiculo")};
    			data[cont]=a;
    			cont++;
    		}
    		
        	
        }
        
        public void setData(ArrayList<itfProperty> clsVehiculo) 
        {
        	int filas = clsVehiculo.size();
    		int cont;
    		data=new Object[filas][];
    		cont=0;
    		
    		
    		for (itfProperty b: clsVehiculo)
    		{
    			Object[]a={b.getProperty("Matricula"),
 					   	b.getProperty("Minusvalido"),
 					   b.getProperty("PlazaVehiculo"),
 					   b.getProperty("ZonaVehiculo"),
 					   b.getProperty("TipoVehiculo")};
    			data[cont]=a;
    			cont++;
    		}
        }
        
        
        
        
        
        public int getColumnCount() 
        {
            return columnNames.length;
        }

        public int getRowCount() {
            return data.length;
        }

        public String getColumnName(int col) {
            return columnNames[col];
        }

        public Object getValueAt(int row, int col) {
            return data[row][col];
        }

        /*
         * JTable uses this method to determine the default renderer/
         * editor for each cell.  If we didn't implement this method,
         * then the last column would contain text ("true"/"false"),
         * rather than a check box.
         */
        public Class getColumnClass(int c) {
            return getValueAt(0, c).getClass();
        }

        /*
         * Don't need to implement this method unless your table's
         * editable.
         */
        public boolean isCellEditable(int row, int col) {
           
                return false;
           
        }

        /*
         * Don't need to implement this method unless your table's
         * data can change.
         */
        public void setValueAt(Object value, int row, int col) 
        {
            
            data[row][col] = value;
            fireTableCellUpdated(row, col);

        }

	

}	
}
