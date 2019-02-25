package SalaryPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;

public class SalaryWindow {

	private JFrame frame;

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

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Заглушка: за реализацию пользовательского интерфейса отвечает Тимур Сафин
		JLabel label = new JLabel("Заглушка: за реализацию пользовательского интерфейса отвечает Тимур Сафин");
		label.setFont(new Font("Dialog", Font.BOLD, 9));
		frame.getContentPane().add(label, BorderLayout.NORTH);
	}

}
