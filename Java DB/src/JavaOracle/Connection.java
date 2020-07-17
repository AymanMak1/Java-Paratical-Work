package JavaOracle;

import java.sql.*;
import java.sql.DriverManager;

public class Connection {

	public static void main(String[] args) throws SQLException {
		String url= "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = (Connection) DriverManager.getConnection(url,"ayman","ayman");
		conn.isValid

	}

}
