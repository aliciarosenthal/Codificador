package ar.edu.unlam.tallerweb.codificador;

public abstract class Codificador extends Codificable {
	protected Codificable mensaje;
	
	public Codificador(Codificable mensaje){
		this.mensaje=mensaje;
	}

}
