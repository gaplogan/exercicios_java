import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Login.*;

public class FormMain extends JFrame{
    private JLabel titulo;

    public FormMain(){        
        Font letra = new Font("Arial", Font.BOLD, 36);

        titulo = new JLabel("Bem vindo!");
		titulo.setBounds(10,10,450,50);
        titulo.setFont(letra);
		add(titulo);
    }

    public static void main(String[] args) {
        FormMain form = new FormMain();
		form.setLayout(null);
		form.setBounds(0,0,600,400);
		form.setLocationRelativeTo(null);
		form.setVisible(true);
		form.setDefaultCloseOperation(EXIT_ON_CLOSE);
		form.setTitle("Números Primos");        
    }
}