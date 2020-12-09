import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Login.*;

public class FormLogin extends JFrame{
    public static boolean Cancelar = false;
	
	Jlabel lblUsuario, lblSenha;
	JTextField txtUsuario, txtSenha;
	JButton btnCancelar, btnSenha;

    public FormLogin() {
		Font letra = new Font("Arial", Font.BOLD, 24);

        lblUsuario = new JLabel("usuario");
		lblUsuario.setBounds(10,10,450,50);
        lblUsuario.setFont(letra);
		add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(10,60,450,50);
        txtUsuario.setFont(letra);
		add(txtUsuario);
		
		lblSenha = new JLabel("senha");
		lblSenha.setBounds(10,110,450,50);
        lblSenha.setFont(letra);
		add(lblSenha);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(10,170,450,50);
        txtSenha.setFont(letra);
		add(txtSenha);
    }

    private void btnSenha_Click() {
        if (CadastroUsuarios.Login(txtUsuario.gettext(), txtSenha.getText())) {
            this.close();
        } else {
            JOptionPane.showMessageDialog(null, "Acesso Negado!");
            txtUsuario.setText = "";
            txtSenha.setText = "";
            txtUsuario.setFocus();
            this.close();
        }
    }

    private void btnCancelar_Click() {
        Cancelar = true;
        exit(0);
    }
}