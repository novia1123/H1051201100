import java.awt.EventQueue;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	protected static final Integer Interger = null;
	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JButton Button2;
	private JButton Button3;
	private JButton Button4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField1 = new JTextField();
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Jawaban :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		
		JButton Button1 = new JButton("+");
		Button1.addActionListener(new ActionListener() {
			private Integer Interger;

			public void actionPerformed(ActionEvent e) {
				
				try  {
					int num1,num2,ans;
					num1=Integer.parseInt(textField1.getText());
					num2=Integer.parseInt(textField2.getText());
					
					ans=num1+num2;
					textField3.setText(Integer.toString(ans));
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Mansukan angka yang benar");
				}
				
			}
		});
		
		Button2 = new JButton("-");
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try  {
					int num1,num2,ans;
					num1=Integer.parseInt(textField1.getText());
					num2=Integer.parseInt(textField2.getText());
					
					ans=num1-num2;
					textField3.setText(Integer.toString(ans));
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Mansukan angka yang benar");
				}
			}
		});
		
		Button3 = new JButton("*");
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try  {
					int num1,num2,ans;
					num1=Integer.parseInt(textField1.getText());
					num2=Integer.parseInt(textField2.getText());
					
					ans=num1*num2;
					textField3.setText(Integer.toString(ans));
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Mansukan angka yang benar");
				}
			}
		});
		
		Button4 = new JButton("/");
		Button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try  {
					int num1,num2,ans;
					num1=Integer.parseInt(textField1.getText());
					num2=Integer.parseInt(textField2.getText());
					
					ans=num1/num2;
					textField3.setText(Integer.toString(ans));
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Mansukan angka yang benar");
				}
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addGap(18)
									.addComponent(textField3, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
									.addGap(77)
									.addComponent(textField2, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(26, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(Button1, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addGap(33)
							.addComponent(Button2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(Button3, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
							.addComponent(Button4, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addGap(66))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField2, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(Button1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(Button2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(Button4, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(Button3, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textField3, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGap(20))))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
