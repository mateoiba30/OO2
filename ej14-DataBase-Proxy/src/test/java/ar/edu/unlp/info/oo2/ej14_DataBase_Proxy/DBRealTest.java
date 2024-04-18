package ar.edu.unlp.info.oo2.ej14_DataBase_Proxy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DBRealTest {

	private DBReal dbReal;
	
	@BeforeEach
	public void setUp() {
		this.dbReal = new DBReal();
		this.dbReal.insertNewRow(Arrays.asList("Callate", "Infa"));
		this.dbReal.insertNewRow(Arrays.asList("Spiderman", "Marvel"));
		this.dbReal.insertNewRow(Arrays.asList("Hola", "Chau"));
	}
	
    @Test
    void testGetSearchResults() {
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.dbReal.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.dbReal.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testInsertNewRow() {
        assertEquals(3, this.dbReal.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.dbReal.getSearchResults("select * from comics where id=3"));
    }
}
