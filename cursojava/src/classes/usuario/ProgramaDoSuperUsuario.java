package classes.usuario;
public class ProgramaDoSuperUsuario {
    public static void main(String[] args){
        final var superUsuario = new SuperUsuario(login: "root", senha: "1234"); // login e senha inacessíveis porque estão com modificador private
        superUsuario.getLogin();
        superUsuario.getSenha();
        String root = superUsuario.nome;
    }
}
