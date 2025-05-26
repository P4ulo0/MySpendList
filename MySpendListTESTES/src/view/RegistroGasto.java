package view;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistroGasto extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldValor;
	private JTextField textFieldData;
	private JTextField textFieldCategoria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroGasto dialog = new RegistroGasto();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public RegistroGasto() {
		setBounds(100, 100, 515, 352);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Valor: ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 24, 43, 17);
		getContentPane().add(lblNewLabel);
		
		JLabel lblDataDaCompra = new JLabel("Data da compra (AAAA/MM/DD): ");
		lblDataDaCompra.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDataDaCompra.setBounds(10, 64, 211, 17);
		getContentPane().add(lblDataDaCompra);
		
		JLabel lblCategoria = new JLabel("Categoria: ");
		lblCategoria.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblCategoria.setBounds(10, 107, 69, 17);
		getContentPane().add(lblCategoria);
		
		JLabel lblDescrio = new JLabel("Descrição: ");
		lblDescrio.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDescrio.setBounds(10, 145, 69, 17);
		getContentPane().add(lblDescrio);
		
		textFieldValor = new JTextField();
		textFieldValor.setBounds(60, 23, 104, 20);
		getContentPane().add(textFieldValor);
		textFieldValor.setColumns(10);
		
		textFieldData = new JTextField();
		textFieldData.setBounds(227, 63, 113, 20);
		getContentPane().add(textFieldData);
		textFieldData.setColumns(10);
		
		textFieldCategoria = new JTextField();
		textFieldCategoria.setBounds(88, 106, 178, 20);
		getContentPane().add(textFieldCategoria);
		textFieldCategoria.setColumns(10);
		
		JTextArea textAreaDescricao = new JTextArea();
		textAreaDescricao.setBounds(10, 169, 479, 96);
		getContentPane().add(textAreaDescricao);
		
		JButton botaoSalvar = new JButton("Salvar");
		botaoSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = textFieldValor.getText();
		        String data = textFieldData.getText();
		        String categoria = textFieldCategoria.getText();
		        String descricao = textAreaDescricao.getText();
			}
		});
		botaoSalvar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		botaoSalvar.setBounds(410, 290, 89, 23);
		getContentPane().add(botaoSalvar);

	}
}
