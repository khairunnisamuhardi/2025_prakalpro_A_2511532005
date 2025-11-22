package Pekan8_2511532005;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class TugasPekan8_2511532005 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;
	private Container desktopPane;
	
	private void pesanPeringatan(String pesan){
		JOptionPane.showMessageDialog  (this, pesan,"Peringatan", JOptionPane.WARNING_MESSAGE); }
	private void pesanError(String pesan) {
		JOptionPane.showMessageDialog(this, pesan,"Kesalahan", JOptionPane.WARNING_MESSAGE); 
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TugasPekan8_2511532005 frame = new TugasPekan8_2511532005();
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
	public TugasPekan8_2511532005() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Operator Assignment");
		lblNewLabel.setBounds(146, 6, 141, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setBounds(41, 45, 93, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Bilangan 2");
		lblNewLabel_2.setBounds(41, 91, 106, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Operator");
		lblNewLabel_3.setBounds(41, 139, 93, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Hasil");
		lblNewLabel_4.setBounds(41, 185, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		txtBil1 = new JTextField();
		txtBil1.setBounds(187, 40, 130, 26);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setBounds(187, 86, 130, 26);
		contentPane.add(txtBil2);
		txtBil2.setColumns(10);
		
		txtHasil = new JTextField();
		txtHasil.setBounds(187, 180, 130, 26);
		contentPane.add(txtHasil);
		txtHasil.setColumns(10);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(197, 135, 52, 27);
		contentPane.add(cbOperator);
		
		JButton btnNewButton_1 = new JButton("Proses");
		btnNewButton_1.addActionListener(new ActionListener() {
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
						
						int A1 = Integer.parseInt(txtBil1.getText());
						int A2 = Integer.parseInt(txtBil2.getText());
						int c = cbOperator.getSelectedIndex();
						if (c==0) {hasil= A1+=A2;}
						if (c==1) {hasil= A1-=A2;}
						if (c==2) {hasil= A1*=A2;}
						if (c==3) {hasil= A1/=A2;}
						if (c==4) {hasil= A1%=A2;}
						
						txtHasil.setText(String.valueOf(A1));
						txtBil1.setText(String.valueOf(A1));
					} catch (NumberFormatException ex) {
						pesanError ("Bilangan 1 dan bilangan 2 harus Angka");
					}
				}
				
				
			}
		});
		
		btnNewButton_1.setBounds(250, 134, 117, 29);
		contentPane.add(btnNewButton_1);
		
		
		
		
	}
}

// Khairunnisa M._2511532005
