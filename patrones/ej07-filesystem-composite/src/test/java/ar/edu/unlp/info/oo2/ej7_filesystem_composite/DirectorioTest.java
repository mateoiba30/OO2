package ar.edu.unlp.info.oo2.ej7_filesystem_composite;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class DirectorioTest {

    private Directorio vacio;
    private Directorio conUnArchivo;
    private Directorio conVariosArchivos;
    private Directorio conSubdirectorios;
    private Archivo grande;
    private Archivo backup2015;

    @BeforeEach
    void setUp() throws Exception {

        LocalDate date = LocalDate.of(2015, 1, 1);
        grande = new Archivo("grande.tmp", LocalDate.of(2016, 4, 2), 2000000);
        backup2015 = new Archivo("2015.zip", LocalDate.of(2016, 4, 6), 240000000);
        Directorio mysql = new Directorio("mysql", date);
        mysql.agregar(new Archivo("mysql01.log", LocalDate.of(2015, 12, 3), 1200000));
        mysql.agregar(new Archivo("mysql02.log", LocalDate.of(2014, 3, 3), 2000000));
        mysql.agregar(new Archivo("mysql03.log", LocalDate.of(2013, 3, 21), 2000000));
        mysql.agregar(new Archivo("mysql04.log", LocalDate.of(2014, 7, 15), 2000000));
        Directorio older = new Directorio("older", date);
        older.agregar(backup2015);
        mysql.agregar(older);
        Directorio postgres = new Directorio("postgres", date);
        postgres.agregar(new Archivo("pg01.log", LocalDate.of(2015, 4, 12), 1400000));
        postgres.agregar(new Archivo("pg02.log", LocalDate.of(2016, 3, 8), 4000000));
        postgres.agregar(new Archivo("pg02.log", LocalDate.of(2016, 2, 13), 4000000));
        // Directorio vacío
        vacio = new Directorio("home", date);
        //"Directorio con un solo archivo"
        conUnArchivo = new Directorio("var", date);
        Archivo config = new Archivo("config.bak", LocalDate.of(2016, 4, 2), 128);
        conUnArchivo.agregar(config);
        // Directorio con varios archivos, pero sin subdirectorios"
        conVariosArchivos = new Directorio("tmp", date);
        conVariosArchivos.agregar(new Archivo("nada.tmp", LocalDate.of(2015, 5, 1), 0));
        conVariosArchivos.agregar(new Archivo("chico.tmp", LocalDate.of(2013, 6, 3), 10));
        conVariosArchivos.agregar(grande);
        conVariosArchivos.agregar(new Archivo("mediano.tmp", LocalDate.of(1995, 11, 23), 10000));
        //Directorio con subdirectorios, archivos, y archivos dentro de los subdirectorios"
        conSubdirectorios = new Directorio("log", date);
        conSubdirectorios.agregar(new Archivo("sys.log", LocalDate.of(2016, 3, 3), 90000));
        conSubdirectorios.agregar(mysql);
        conSubdirectorios.agregar(postgres);
    }

    @Test
    void testArchivoMasGrande() {
        assertEquals(null, vacio.archivoMasGrande());
        assertEquals("config.bak", conUnArchivo.archivoMasGrande().getNombre());
        assertEquals(grande, conVariosArchivos.archivoMasGrande());
        assertEquals(backup2015, conSubdirectorios.archivoMasGrande());
    }

    @Test
    void testArchivoMasNuevo() {
        assertEquals(null, vacio.archivoMasNuevo());
        assertEquals("config.bak", conUnArchivo.archivoMasNuevo().getNombre());
        assertEquals(grande, conVariosArchivos.archivoMasNuevo());
        assertEquals(backup2015, conSubdirectorios.archivoMasNuevo());
    }

    @Test
    void testTamanoTotalOcupado() {
        assertEquals(32, vacio.tamanioTotalOcupado());
        assertEquals(160, conUnArchivo.tamanioTotalOcupado()); //32 del directorio + 128 del archivo
        assertEquals(2010042, conVariosArchivos.tamanioTotalOcupado()); //  2M de grande + 10K + 0 + 10 + 32 directorio
        assertEquals(256690128, conSubdirectorios.tamanioTotalOcupado());
    }

    @Test //-> no me encuentra los datos dentro de otras carpetas
    void testBuscar() {//no recorre los niveles más bajos del árbol
    	String nombreNvl1 = "sys.log";
    	String nombreNvl2 = "mysql";
    	String nombreNvl3 = "pg01.log";
    	assertEquals(nombreNvl1,conSubdirectorios.buscar(nombreNvl1).getNombre());
    	assertEquals(nombreNvl2,conSubdirectorios.buscar(nombreNvl2).getNombre());
    	assertEquals(nombreNvl3,conSubdirectorios.buscar(nombreNvl3).getNombre());
    	assertEquals(null, vacio.buscar(nombreNvl1));
    }
 
    ///NullPointerException -> no me encuentra los datos dentro de otras carpetas
    @Test
    void  testBuscarTodos() {//no recorre los niveles más bajos del árbol
    	String nombreNvl1 = "sys.log";
    	String nombreNvl2 = "mysql";
    	String nombreNvl3 = "pg02.log";
//    	assertTrue(nombreNvl1.equals(conSubdirectorios.buscarTodos(nombreNvl1).get(0).getNombre()));
//    	assertTrue(nombreNvl2.equals(conSubdirectorios.buscarTodos(nombreNvl2).get(0).getNombre()));
//    	assertTrue(nombreNvl3.equals(conSubdirectorios.buscarTodos(nombreNvl3).get(1).getNombre()));
//    	assertEquals(null, vacio.buscar(nombreNvl1));
    	
    	LocalDate date = LocalDate.of(2015, 1, 1);
    	List<FileSystem> lista1 = new ArrayList<>();
    	List<FileSystem> lista2 = new ArrayList<>();
    	List<FileSystem> lista3 = new ArrayList<>();
    	
    	lista1.add(new Archivo(nombreNvl1, date, 5));
    	assertEquals(conSubdirectorios.buscarTodos(nombreNvl1), lista1);
    	
    	lista2.add(new Directorio(nombreNvl2, date));
    	assertEquals(conSubdirectorios.buscarTodos(nombreNvl2), lista2);
    	
    	lista3.add(new Archivo(nombreNvl3, date, 1));
    	lista3.add(new Archivo(nombreNvl3, date, 3));
    	assertEquals(conSubdirectorios.buscarTodos(nombreNvl3), lista3);
    	

    	
    }
    
    @Test
    void testListadoDeContenido() {
    	System.out.println(conSubdirectorios.listadoDeContenido());
    }

}