package ar.edu.unlam.tallerweb.codificador;

import org.junit.Assert;

import org.junit.Test;

public class testCodificador {
	Codificable mensaje1 = new Mensaje("probando mensaje");
	Codificable mensaje2 = new Mayusculas(mensaje1);
	Codificable mensaje3 = new Espejado(mensaje2);
	Codificable mensaje4 = new Removedor(mensaje3);

	@Test
	public void probarRemovedorCodificandoCodificable() {
		Assert.assertEquals("EJASNEMODNABORP", mensaje4.codificar());
	}

	@Test
	public void probarMayusculas() {
		Assert.assertEquals("PROBANDO MENSAJE", mensaje2.codificar());
	}

	@Test
	public void probarMensaje() {
		Assert.assertEquals("probando mensaje", mensaje1.codificar());
	}

}
