package usuario;
import usuario.SuperUsuario;

public class ProgramaDoSuperUsuario {
    public static void main(String[] args) {
		final var superUsuario = new SuperUsuario(login: "root", senha: "123456");

        superUsuario.getLogin();

        superUsuario.getSenha();

        String root = superUsuario.nome;
    }
}
