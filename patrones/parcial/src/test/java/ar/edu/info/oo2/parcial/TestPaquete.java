package ar.edu.info.oo2.parcial;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPaquete {
	private ConSeguro conSeguro;
	private EntregaExpress entregaExpress;
	private Paquete paquete;
	private double valorDeclarado;
	private double costoFinal;

	@BeforeEach
	public void setUp() {
		this.valorDeclarado = 20000;
		this.costoFinal = this.valorDeclarado * ( 0.20 + 0.50 + 0.05);
		this.paquete = new Paquete("Caja de libros", "destinatario", "direccionDestinatario", valorDeclarado);
		this.conSeguro = new ConSeguro(this.paquete);
		this.entregaExpress = new EntregaExpress(this.conSeguro);
	}
	
	@Test
	public void testGetDescripcion() {
		assertEquals(this.entregaExpress.getDescripcion(), "Caja de libros con seguro entrega express");
	}
	
	@Test
	public void testGetCostoEnvio() {
		assertEquals((int)this.entregaExpress.getCostoEnvio(), (int)this.costoFinal);
	}
}
