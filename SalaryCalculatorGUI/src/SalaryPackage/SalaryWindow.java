package SalaryPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SalaryWindow {

	private JFrame frame;
	private JTextField textFieldInput;
	private JTextField textFieldSalary;
	private JTextField textFieldPIT;
	private JTextField textFieldIPT;
	private JButton buttonCalculate;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalaryWindow window = new SalaryWindow();
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
	public SalaryWindow() {
		initialize();
		//Заглушка: за создание связи с классом отвечает Роман Гатин				
	}
	
	private void changedEvent(DocumentEvent de) {
		if (this.textFieldInput.getText().length() > 0)
		{
			this.buttonCalculate.setEnabled(true);
		}
		else
		{
			this.buttonCalculate.setEnabled(false);
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Зарплатный калькулятор");
		frame.setBounds(100, 100, 450, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Размер зарплаты до вычета налогов");
		lblNewLabel.setBounds(12, 12, 342, 15);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Размер зарплаты после вычета налогов");
		lblNewLabel_1.setBounds(12, 78, 342, 15);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("НДФЛ 13%, уплаченный работником");
		lblNewLabel_2.setBounds(12, 105, 342, 15);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Взносы в фонды, уплаченные работодателем");
		lblNewLabel_3.setBounds(12, 132, 342, 15);
		panel.add(lblNewLabel_3);
		
		textFieldInput = new JTextField();
		textFieldInput.setBounds(372, 10, 58, 19);
		panel.add(textFieldInput);
		textFieldInput.setColumns(10);
		textFieldInput.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				changedEvent(e);
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				changedEvent(e);
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				changedEvent(e);
			}				
		});
		
		textFieldSalary = new JTextField();
		textFieldSalary.setEditable(false);
		textFieldSalary.setBounds(372, 76, 58, 19);
		panel.add(textFieldSalary);
		textFieldSalary.setColumns(10);
		
		textFieldPIT = new JTextField();
		textFieldPIT.setEditable(false);
		textFieldPIT.setBounds(372, 103, 58, 19);
		panel.add(textFieldPIT);
		textFieldPIT.setColumns(10);
		
		textFieldIPT = new JTextField();
		textFieldIPT.setEditable(false);
		textFieldIPT.setBounds(372, 130, 58, 19);
		panel.add(textFieldIPT);
		textFieldIPT.setColumns(10);
		
		buttonCalculate = new JButton("Рассчитать");
		buttonCalculate.setBounds(12, 39, 418, 25);
		panel.add(buttonCalculate);
	}
}


