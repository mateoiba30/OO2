package ar.edu.unlp.info.oo2.ej14_DataBase_Proxy;

import java.util.List;
import java.util.logging.*; //para poder enviar logs

public class DBRealProxy implements DBAccess{

	DBReal dbReal;
	String clave;
	boolean logged;
	
	public DBRealProxy(String clave, DBReal dbReal) {
		this.clave = clave;
		this.dbReal = dbReal;
		this.logged = false;
	}
	
//	public boolean logged() throws Exception {
//		
//		if (this.logged)
//			return true;
//		Scanner scanner = new Scanner(System.in);
//		String password= "";
//		System.out.println("Ingrese clave: ");
//		password = scanner.nextLine();
//		if(!login(password))
//			throw new RuntimeException("Clave incorrecta");
//		else
//			return true;
//		
//	}
	
	public boolean login(String clave) {
		if (this.clave == clave)
			this.logged = true;
		return this.logged;
	}
	
	public void closeSession() {
		this.logged = false;
	}
	
	public int insertNewRow(List<String> rowData) throws Exception {
		if (this.logged) {
			Logger.getLogger("bd").log(Level.WARNING, "insert db");//acceso válido para inserción genera warning
			return this.dbReal.insertNewRow(rowData);	
		}
		Logger.getLogger("bd").log(Level.SEVERE, "access denied");//hacer esto para cada excepción
		throw new RuntimeException("Se debe loguear");
	}
	
	public List<String> getSearchResults(String queryString) throws Exception{
		if (this.logged) {
			Logger.getLogger("bd").log(Level.INFO, "search db");//acceso válido para búesqueda genera info
			return this.dbReal.getSearchResults(queryString);
		}

		Logger.getLogger("bd").log(Level.SEVERE, "access denied");//hacer esto para cada excepción
		throw new RuntimeException("Se debe loguear");
	}
}
