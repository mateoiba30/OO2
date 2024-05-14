package ar.edu.unlp.info.oo2.ej14_DataBase_Proxy;

import java.util.List;

public interface DBAccess {
	
	public int insertNewRow(List<String> rowData) throws Exception;
	
	public List<String> getSearchResults(String queryString) throws Exception;

}
