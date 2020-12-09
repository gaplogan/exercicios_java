package Login;

public class CadastroUsuarios {
    private static Usuario[] usuarios = {
        new Usuario("Gabriel", "abc123"),
        new Usuario("Danny", "123abc"),
        new Usuario("Arthur", "abcd")
    };

    private static Usuario _userLogado = null;

    public static Usuario getUsuarioLogado() {
        return _userLogado;
    }

    public static void setUsuarioLogado(Usuario user) {
        _userLogado = user;
    }

    public static boolean Login(String nome, String senha)
    {
        for (Usuario usuario : usuarios) {
            if (usuario.Nome.equals(nome) && usuario.Senha.equals(senha)) {
                setUsuarioLogado(usuario);
                return true;
            }
        }

        return false;
    }
}