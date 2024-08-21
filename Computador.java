package LPAlore;

public class Computador {

	String marca;
	int lançamento;
	String modelo;
	
	public String getMarca() {
	return marca;
	}
	public void setMarca(String marca) {
	this.marca = marca;
	}
	public int getLançamento() {
	return lançamento;
	}
	public void setLançamento (int lançamento) {
	this.lançamento = lançamento;
	}
	public String getModelo() {
	return modelo;
	}
	public void setModelo(String modelo) {
	this.modelo = modelo;
	}
    public String reiniciar() {
    return "Reinicia";
    }
    public String iniciar() {
    return "Inicia";
    }
}
