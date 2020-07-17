import java.awt.*;
import java.sql.*;
public class Display extends Frame {
	public Display() {
		super("Display data awt");
		setLayout(new BorderLayout());
		setSize(300,300);
		Panel pcenter = new Panel();
		Connection conn = DbConn.ConnectionDb();
		String fetchAll = "select count(*) from javaetudiant";
		PreparedStatement prepareFetch;
		try {
			prepareFetch = conn.prepareStatement(fetchAll);
			ResultSet rs = prepareFetch.executeQuery();
			Label l;
			while(rs.next()) {
				l= new Label();
				pcenter.add(l);
			}
			this.add(pcenter, BorderLayout.NORTH);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public static void main(String [] args) {
		Display d= new Display();
		d.show();
	}
}
