import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import classes.*;

public class Primos extends JFrame{
	
	private JLabel titulo;
	private JTextArea txtResultado;
	private JScrollPane scroll;
	private JTextField txtNumero;
	private JButton btnVerificar, btnVerificarTodos;
	
	public Primos(){	
		
		NumerosPrimos primo = new NumerosPrimos();
		
		Font letra = new Font("Arial", Font.BOLD, 20);
		
		titulo = new JLabel("Digite um n�mero para Verificar");
		titulo.setBounds(10,10,450,50);
		titulo.setFont(letra);
		add(titulo);
		
		txtResultado = new JTextArea();
		txtResultado.setFont(letra);
		txtResultado.setEditable(false);
		txtResultado.setLineWrap(true);
		
		scroll = new JScrollPane(txtResultado);		
		scroll.setBounds(10,70,300,250);		
		add(scroll);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(320,70,150,50);
		txtNumero.setFont(letra);
		add(txtNumero);
		
		btnVerificar = new JButton("Verificar");
		btnVerificar.setBounds(320,130,150,50);
		btnVerificar.setFont(letra);
		add(btnVerificar);
		btnVerificar.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){					
					int num = Integer.parseInt(txtNumero.getText());
					if(primo.verificarPrimo(num)){
						JOptionPane.showMessageDialog(null, "O n�mero " + num + " � primo");
					}else{
						JOptionPane.showMessageDialog(null, "O n�mero " + num + " n�o � primo");
					}
				}
			}
		);
		
		btnVerificarTodos = new JButton("Ver Todos");
		btnVerificarTodos.setBounds(320,190,150,50);
		btnVerificarTodos.setFont(letra);
		add(btnVerificarTodos);		
		btnVerificarTodos.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					int num = Integer.parseInt(txtNumero.getText());
					txtResultado.setText(primo.verTodos(num));
				}
			}
		);
	}
	
	public static void main(String args[]){
		Primos form = new Primos();
		form.setLayout(null);
		form.setBounds(0,0,500,400);
		form.setLocationRelativeTo(null);
		form.setVisible(true);
		form.setDefaultCloseOperation(EXIT_ON_CLOSE);
		form.setTitle("N�meros Primos");
	}
}
