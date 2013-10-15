package ar.edu.unlam.tallerweb.codificador;

public class Mayusculas extends Codificador {

	public Mayusculas(Codificable mensaje) {
		super(mensaje);
	}

	@Override
	public String codificar() {
		return this.mensaje.codificar().toUpperCase();
	}

}
