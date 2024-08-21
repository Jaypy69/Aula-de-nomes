package LPAlore;

public class ObjetoCOmputador {

	public static void main(String[] args) {
		
    Computador Computador1 = new Computador();
    
    Computador1.setMarca("Samsung");
    Computador1.setLançamento(2009);
    Computador1.setModelo("Galaxy Book3");
    
    System.out.println(Computador1.getMarca());
    System.out.println(Computador1.getLançamento());
	System.out.println(Computador1.getModelo());
	}
}
