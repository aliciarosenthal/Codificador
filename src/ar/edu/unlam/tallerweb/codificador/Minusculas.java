package ar.edu.unlam.tallerweb.codificador;

public class Minusculas extends Codificador{

	public Minusculas(Codificable mensaje) {
		super(mensaje);
	}

	@Override
	public String codificar() {
		return this.mensaje.codificar().toLowerCase();
	}

}
