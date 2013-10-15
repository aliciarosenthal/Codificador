package ar.edu.unlam.tallerweb.codificador;

public class Removedor extends Codificador {

	public Removedor(Codificable mensaje) {
		super(mensaje);
	}

	@Override
	public String codificar() {
		String mensajecodificado = "";
		for (int i = 0; i <= this.mensaje.codificar().length() - 1; i++) {
			if (this.mensaje.codificar().charAt(i) != ' ') {
				mensajecodificado += mensaje.codificar().charAt(i);
			}
		}

		return mensajecodificado;
	}

}
