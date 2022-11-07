package items;

import database.Connect;
import database.DBPrinter;


public class itemDAO {
	
	public static void printDB() {
		Connect con = new Connect();
		DBPrinter printDB = new DBPrinter();
		String query = "SELECT * FROM items";
		
		printDB.printResultSet(con.executeQuery(query));
	}
	
}
