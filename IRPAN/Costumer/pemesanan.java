
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class pemesanan {
	public static void main (String[] args)	 


	{
		JFrame form = new JFrame();
		form.setTitle("");
		form.setSize(500,700);
		form.setLocationRelativeTo(null);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setResizable(false);
		form.setVisible(true);
		
		form.setLayout(null);
	
		JLabel labell = new JLabel();
		labell.setText ("PEMESANAN");
		labell.setFont(new Font("Tahoma", Font.BOLD, 22));
		labell.setForeground(Color.BLUE);	
		labell.setHorizontalAlignment(JLabel.CENTER);
		labell.setBounds(0, 40, 500, 20);
		form.add(labell);
		
		JLabel label2 = new JLabel ();
		label2.setText("id_Costumer");
		label2.setHorizontalAlignment(JLabel.LEFT);
		label2.setBounds (50, 220, 170, 20);
		form.add(label2);
		
		JLabel label3 = new JLabel ();
		label3.setText("Id_Kendaraan");
		label3.setHorizontalAlignment(JLabel.LEFT);
		label3.setBounds (50, 100, 170, 20);
		form.add(label3);
		
		JLabel label4 = new JLabel ();
		label4.setText("id_Tujuan Penjemputan");
		label4.setHorizontalAlignment(JLabel.LEFT);
		label4.setBounds (50, 160, 170, 20);
		//25 = from left, 70 = from up, 150 = lebar label, 20 = tinggi  
		form.add(label4);
		//didalam tanda kutif boleh menggunakn spasi
		
		JLabel label5 = new JLabel ();
		label5.setText("Jumlah Orang");
		label5.setHorizontalAlignment(JLabel.LEFT);
		label5.setBounds (50, 280, 170, 20);
		form.add(label5);
		
		JLabel label6 = new JLabel ();
		label6.setText("no_hp");
		label6.setHorizontalAlignment(JLabel.LEFT);
		label6.setBounds (50, 340, 170, 20);
		form.add(label6);
		
		form.setLayout(null);
			
		JTextField TextID = new JTextField();
		TextID.setBounds(200, 95, 200, 28);				
		form.add(TextID);
		
		JTextField TextContact = new JTextField();
		TextContact.setBounds(200, 155, 200, 28);
		form.add(TextContact);	
			
		JTextField TextAddress = new JTextField();
		TextAddress.setBounds(200, 215, 200, 28);				
		form.add(TextAddress);
		form.setForeground(Color.red);
		
		JTextField TextName = new JTextField();
		TextName.setBounds(200, 275, 200, 28);
		form.add(TextName);	
			
		JTextField TextPass = new JTextField();
		TextPass.setBounds(200, 335, 200, 28);				
		form.add(TextPass);		
				
	}	
}