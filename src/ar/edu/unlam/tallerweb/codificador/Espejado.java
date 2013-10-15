package ar.edu.unlam.tallerweb.codificador;

public class Espejado extends Codificador {

	public Espejado(Codificable mensaje) {
		super(mensaje);
	}

	@Override
	public String codificar() {
		String mensajecodificado = "";
		for (int i = this.mensaje.codificar().length() - 1; i >= 0; i--) {
			mensajecodificado += mensaje.codificar().charAt(i);
		}

		return mensajecodificado;
	}

}
