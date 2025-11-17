package Pekan8_2511532005;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class operatorAritmatikaGUI_2511532005 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtbilangan_2;
	private JTextField txtBilangan_2;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtOperator;
	private JTextField txtHasil;
	
		private void pesanPeringatan(String pesan){
			JOptionPane.showMessageDialog  (this, pesan,"Peringatan", JOptionPane.WARNING_MESSAGE); }
		private void pesanError(String pesan) {
			JOptionPane.showMessageDialog(this, pesan,"Kesalahan", JOptionPane.WARNING_MESSAGE); 
		}
	
	private JTextField txtHasil_1;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					operatorAritmatikaGUI_2511532005 frame = new operatorAritmatikaGUI_2511532005();
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
	public operatorAritmatikaGUI_2511532005() {
		setTitle("OperatorAritmatika");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(254, 255, 255));
		desktopPane.setBounds(6, 6, 438, 260);
		contentPane.add(desktopPane);
		desktopPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setBounds(140, 6, 161, 16);
		desktopPane.add(lblNewLabel);
		
		txtbilangan_2 = new JTextField();
		txtbilangan_2.setText("Bilangan 1");
		txtbilangan_2.setBounds(6, 34, 130, 26);
		desktopPane.add(txtbilangan_2);
		txtbilangan_2.setColumns(10);
		
		txtBilangan_2 = new JTextField();
		txtBilangan_2.setText("Bilangan 2");
		txtBilangan_2.setColumns(10);
		txtBilangan_2.setBounds(6, 72, 130, 26);
		desktopPane.add(txtBilangan_2);
		
		txtBil1 = new JTextField();
		txtBil1.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil1.setBounds(171, 34, 130, 26);
		desktopPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil2.setColumns(10);
		txtBil2.setBounds(171, 72, 130, 26);
		desktopPane.add(txtBil2);
		
		txtOperator = new JTextField();
		txtOperator.setText("Operator");
		txtOperator.setColumns(10);
		txtOperator.setBounds(6, 119, 130, 26);
		desktopPane.add(txtOperator);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "x", "/", "%"}));
		cbOperator.setBounds(181, 120, 52, 27);
		desktopPane.add(cbOperator);
		
		txtHasil = new JTextField();
		txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
		txtHasil.setEditable(false);
		txtHasil.setBounds(171, 170, 130, 26);
		desktopPane.add(txtHasil);
		txtHasil.setColumns(10);
		
		txtHasil_1 = new JTextField();
		txtHasil_1.setText("Hasil");
		txtHasil_1.setColumns(10);
		txtHasil_1.setBounds(6, 170, 130, 26);
		desktopPane.add(txtHasil_1);
		
		btnNewButton = new JButton("Proses");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if (txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan ("Silahkan Isi Bilangan 1");
				} else if(txtBil2.getText().trim().isEmpty()) {
					pesanPeringatan ("Silahkan Isi Bilangan 2");
				} else if (txtBil2.getText().trim().startsWith("0")) {
					pesanPeringatan ("Bilangan 2 tidak boleh angka 0");
				} else {
					try {
			
						int b = Integer.parseInt(txtBil2.getText());
						int a = Integer.parseInt(txtBil1.getText());
						int c = cbOperator.getSelectedIndex();
						if (c==0) {hasil= a+b;}
						if (c==1) {hasil= a-b;}
						if (c==2) {hasil= a*b;}
						if (c==3) {hasil= a/b;}
						if (c==4) {hasil= a&b;}
						
						txtHasil.setText(String.valueOf(hasil));
					} catch (NumberFormatException ex) {
						pesanError ("Bilangan 1 dan bilangan 2 harus Angka");
					}
				}
					int a = Integer.parseInt(txtBil1.getText());
					int b = Integer.parseInt(txtBil2.getText());
					int c = cbOperator.getSelectedIndex();
				
					if(c==1) {
						hasil= a+b;
					}
					if(c==2) {
						hasil= a*b;
					}
					if(c==3) {
						hasil= a/b;
					}
					if(c==4) {
						hasil= a%b;
					}
					
					txtHasil.setText(String.valueOf(hasil));
				
			}
		});
		btnNewButton.setBounds(257, 119, 117, 29);
		desktopPane.add(btnNewButton);
		
		
	}
}
