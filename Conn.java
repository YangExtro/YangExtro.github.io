package renshi;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Conn {
	
	 static  Connection conn;

	    public Conn()  {
	        //Properties p = new Properties();
	     
	        //p.load(new InputStream("account.properties"));
	    	try {
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  try {
				Connection con=DriverManager.getConnection("jdbc:odbc:bussiness","","");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	    public static Connection getConn() {
	        if(conn==null) {
	            new Conn();
	        }
	        return conn;

	    }
}
