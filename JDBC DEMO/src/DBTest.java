import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBTest {
	public static void main(String args[]) throws Exception
	{
	   String url="jdbc:oracle:thin:@localhost:1521:orcl";
		Connection con = null;
		PreparedStatement st= null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection(url,"scott","tiger");
			st=con.prepareCall("call{insertMaster(?,?,?)}");
			st.setInt(1, 102);st.setString(2, "anil");st.setDouble(3, 123.89);
			
	        while(rs.next())
	        	System.out.println(rs.getString(1)+""+rs.getString(2)+""+rs.getString(3));
	        System.out.println();
	        while(rs.previous())

	        	System.out.println(rs.getString(1)+""+rs.getString(2)+""+rs.getString(3));	
			}
		catch (Exception e){
			e.printStackTrace();
			}finally{
				try	{
			
				if(st!=null) st.close();
			   if(con!=null) con.close();
			}catch(Exception e) {
				
			}
		}	
	}
}
