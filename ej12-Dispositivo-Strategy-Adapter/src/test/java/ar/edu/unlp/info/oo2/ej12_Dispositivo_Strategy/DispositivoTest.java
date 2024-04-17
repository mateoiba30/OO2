package ar.edu.unlp.info.oo2.ej12_Dispositivo_Strategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispositivoTest {
	private Dispositivo dispositivo;
	private Ringer ringer;
	private Display display;
	private Calculator calcu;
	private Conexion conexion;

	@BeforeEach
	public void setUp() throws Exception {
		this.ringer = new Ringer();
		this.calcu = new CRC16_Calculator();
		this.conexion = new AdapterConexion4G("img 2");
		this.display = new Display();
		this.dispositivo = new Dispositivo(conexion, calcu, ringer, display);
		
	}

	@Test
	public void testSend() {
		assertEquals("4G: Datos 16",this.dispositivo.send("Datos"));
	}
	
	@Test
	public void testConectarCon() {
		assertEquals("Banner: img", this.dispositivo.setConexion(new ConexionWifi("img")));
		assertEquals("Banner: img 2", this.dispositivo.setConexion(new AdapterConexion4G("img 2"))); //puedo recibir por parametro el Conexion4G()
		
	}
	
	@Test
	public void testConfigurarCRC() {
		assertEquals("crc calculator changed",this.dispositivo.setCalculator(new CRC32_Calculator()));
		assertEquals("crc calculator changed",this.dispositivo.setCalculator(new CRC16_Calculator()));
	}

}