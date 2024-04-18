package ar.edu.unlp.info.oo2.ej14_DataBase_Proxy;

import java.util.List;
import java.util.ArrayList;

public class DBReal {

	private int insercionID;
	
	private List<List<String>> DB;
	
	public DBReal() {
		this.insercionID = 0;
		this.DB = new ArrayList<>();
	}
	
	public int insertNewRow(List<String> rowData) {
		this.DB.add(rowData);
		return insercionID++;//lo devuelvo y luego lo incremento
	}
	
	public List<String> getSearchResults(String queryString){
		String str = queryString.substring(queryString.indexOf("=") + 1);
		int ID = Integer.valueOf(str);
		if (ID <= insercionID)
			return DB.get(ID);
		else
			return new ArrayList<String>();
	}
}
