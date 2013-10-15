package ar.edu.unlam.tallerweb.codificador;

public class Mensaje extends Codificable {
	private String mensaje;

	public Mensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String codificar() {
		return mensaje;
	}

}
