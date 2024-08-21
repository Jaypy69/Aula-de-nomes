package LPAlore;

public class ObjetosPessoa {

	public static void main(String[] args) {
	 Pessoa pessoa1 = new Pessoa ();
	 Pessoa pessoa2 = new Pessoa ();
	 
	 pessoa1.setNome("João Pedro");
	 pessoa1.setIdade(17);
	 pessoa1.setEndereco("Itapetininga, BRA");
	 pessoa1.setProfissão("Estudante");
	 pessoa1.setCPF("12345678");
	 pessoa1.setRG("1234567");
	 
	 pessoa2.setNome("Messi");
	 pessoa2.setIdade(37);
	 pessoa2.setEndereco("Miami, USA");
	 pessoa2.setProfissão("Jogador de futebol");
	 
	 System.out.println("Objeto");
	 System.out.println(pessoa1.getNome());
	 System.out.println(pessoa1.getIdade());
	 System.out.println(pessoa1.getEndereço());
	 System.out.println(pessoa1.getEndereço());
	 
	 
	 System.out.println("Objeto");
	 System.out.println(pessoa2.getNome());
	 System.out.println(pessoa2.getIdade());
	 System.out.println(pessoa2.getEndereço());
	 System.out.println(pessoa2.getEndereço());
	}

}
