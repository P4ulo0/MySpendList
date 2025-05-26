package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Font;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setResizable(false);
		setSize(new Dimension(800, 600));
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaPrincipal.class.getResource("/view/imagens/logoMySpendList.png")));
		setTitle("MySpendList");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1180, 759);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botaoAdicionarGasto = new JButton("Adicionar");
		botaoAdicionarGasto.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		botaoAdicionarGasto.setBounds(1018, 643, 89, 23);
		contentPane.add(botaoAdicionarGasto);
	}
}
