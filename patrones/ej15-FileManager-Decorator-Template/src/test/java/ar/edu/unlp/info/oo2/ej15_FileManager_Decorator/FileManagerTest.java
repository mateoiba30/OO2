package ar.edu.unlp.info.oo2.ej15_FileManager_Decorator;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileManagerTest {
	private FileManager file;
	private FileManager name;
	private FileManager extension;
	private FileManager size;
	private FileManager dateCreated;
	private FileManager dateModified;
	private FileManager permissions;
	
	@BeforeEach
	void setUp() throws Exception {
		this.file = new File ("The Next Best American Record", ".mp3", 10.5, LocalDate.of(2019, 8, 30), LocalDate.of(2019, 8, 30), "rwxr-xr-x");
		
	}

	@Test
	void testPrettyPrintOption1() { 
		//name - extension
		this.name = new NombreDecorator(file);  
		this.extension = new ExtensionDecorator(name);
		
		assertEquals(" The Next Best American Record .mp3",this.extension.prettyPrint());
	}
	
	@Test
	void testPrettyPrintOption2() { 
		//name - extension - date created
		this.name = new NombreDecorator(file);  
		this.extension = new ExtensionDecorator(name);
		this.dateCreated = new InicioDecorator(extension);
		
		assertEquals(" The Next Best American Record .mp3 2019-08-30",this.dateCreated.prettyPrint());
	}
	
	@Test
	void testPrettyPrintOption3() { 
		//permissions - name - extension - size
		this.permissions = new PermisosDecorator(file);  
		this.name = new NombreDecorator (permissions);
		this.extension = new ExtensionDecorator(name);
		this.size = new TamanioDecorator(extension);
		
//		System.out.println(this.size.prettyPrint());
		assertEquals(" rwxr-xr-x The Next Best American Record .mp3 10.5",this.size.prettyPrint());
	}

}