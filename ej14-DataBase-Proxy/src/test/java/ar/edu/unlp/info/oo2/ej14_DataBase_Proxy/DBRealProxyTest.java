package ar.edu.unlp.info.oo2.ej14_DataBase_Proxy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DBRealProxyTest {

	private DBReal dbReal;
	private DBRealProxy proxy;
	private String clave;
	
	@BeforeEach
	public void setUp() {
		this.dbReal = new DBReal();
		this.dbReal.insertNewRow(Arrays.asList("Callate", "Infa"));
		this.dbReal.insertNewRow(Arrays.asList("Spiderman", "Marvel"));
		this.dbReal.insertNewRow(Arrays.asList("Hola", "Chau"));
		this.clave = "clave";
		this.proxy = new DBRealProxy(clave, dbReal);
	}
	
	@Test
	public void loginTest() {
		assertTrue(this.proxy.login(this.clave));
		this.proxy.closeSession();
		assertFalse(this.proxy.login(this.clave+this.clave));
	}
	
	@Test
	public void insertNewRowTest() throws Exception {
		Exception exceptionPending = assertThrows(RuntimeException.class, () -> {this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor"));});
		assertEquals("Se debe loguear",exceptionPending.getMessage());
		this.proxy.login(this.clave);
		assertEquals(3, this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
	}
	
	@Test
	public void getSearchResultsTest() throws Exception {
		Exception exceptionPending = assertThrows(RuntimeException.class, () -> {this.proxy.getSearchResults("9");});
		assertEquals("Se debe loguear",exceptionPending.getMessage());
		this.proxy.login(this.clave);
		assertEquals(3, this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.proxy.getSearchResults("select * from comics where id=3"));

	}
}
