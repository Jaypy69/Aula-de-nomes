package LPAlore;

public class ObjetoUsuario {

	public static void main(String[] args) {
		Usuario Usuario1 = new Usuario();
		
		Usuario1.setID(696969);
		Usuario1.setNome("Berserk");
        Usuario1.setSenha(666);
        Usuario1.setPermissao("Aceita");
        Usuario1.setUsuario("Guts");
        
        System.out.println(Usuario1.getID());
        System.out.println(Usuario1.getNome());
        System.out.println(Usuario1.getSenha());
        System.out.println(Usuario1.getPermissao());
        System.out.println(Usuario1.getUsuario());
	}
}
