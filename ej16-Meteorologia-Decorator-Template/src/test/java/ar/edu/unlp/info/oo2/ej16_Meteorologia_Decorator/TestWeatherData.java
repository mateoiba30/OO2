package ar.edu.unlp.info.oo2.ej16_Meteorologia_Decorator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestWeatherData {
	
	private WeatherDataInterface displayerF;
	private WeatherDataInterface displayerC;
	private WeatherDataInterface promedio;
	private WeatherDataInterface minMax;
	
	@BeforeEach
	public void setUp() {
		this.displayerF = new HomeWeatherStation();
		this.displayerC = new HomeWeatherStationCelcius();
	}
	
	@Test
	public void testDisplayData1() {
		//System.out.println(this.displayerF.displayData());
		assertEquals("Temperatura F: 86.0 Presion atmosf: 1008.0 Radiacion solar: 200.0",this.displayerF.displayData());
	}
	
	@Test
	public void testDisplayData2() {
		//System.out.println(this.displayerC.displayData());
		assertEquals("Temperatura C: 30.0 Presion atmosf: 1008.0 Radiacion solar: 200.0",this.displayerC.displayData());
	}
	
	@Test
	public void testDisplayData3() {
		this.promedio = new PromedioDatos(this.displayerC);
		//System.out.println(this.promedio.displayData());
		assertEquals("Temperatura C: 30.0 Presion atmosf: 1008.0 Radiacion solar: 200.0 Promedio: 30.0",this.promedio.displayData());
	}
	
	@Test
	public void testDisplayData4() {
		this.promedio = new PromedioDatos(this.displayerF);
		//System.out.println(this.promedio.displayData());
		assertEquals("Temperatura F: 86.0 Presion atmosf: 1008.0 Radiacion solar: 200.0 Promedio: 86.0",this.promedio.displayData());
	}
	
	@Test
	public void testDisplayData5() {
		this.promedio = new PromedioDatos(this.displayerC);
		this.minMax = new MinimoMaximo(promedio);
		//System.out.println(this.minMax.displayData());
		assertEquals("Temperatura C: 30.0 Presion atmosf: 1008.0 Radiacion solar: 200.0 Promedio: 30.0 Minimo 27.0 Maximo 33.0",this.minMax.displayData());
	}
	
	@Test
	public void testDisplayData6() {
		this.minMax = new MinimoMaximo(this.displayerC);
		//System.out.println(this.minMax.displayData());
		assertEquals("Temperatura C: 30.0 Presion atmosf: 1008.0 Radiacion solar: 200.0 Minimo 27.0 Maximo 33.0",this.minMax.displayData());
	}
	
	@Test
	public void testDisplayData7() {
		this.minMax = new MinimoMaximo(this.displayerC);
		this.promedio = new PromedioDatos(this.minMax);
		//System.out.println(this.promedio.displayData());
		assertEquals("Temperatura C: 30.0 Presion atmosf: 1008.0 Radiacion solar: 200.0 Minimo 27.0 Maximo 33.0 Promedio: 30.0",this.promedio.displayData());
	}
}
