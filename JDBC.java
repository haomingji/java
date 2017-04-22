package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.sql.ResultSetMetaData;

public class homework24_1 {
	public static void main(String[] args) {
		jdbc j=new jdbc();
		
		j.close();
		
		
	}

}
class jdbc{
	String url="jdbc:mysql://localhost:3308/ty5";
String name="root";
String pass="mysql";
Connection con;
Statement stmt;
ResultSet rs;
	jdbc(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con=(Connection) DriverManager.getConnection(url, name, pass);
			 stmt =con.createStatement();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	void update(String sql){
		
		try {
			 stmt.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
}
	 
	 void batch(String[]  sqls){
		 
			try {
				for (int i = 0; i < sqls.length; i++) {
				stmt.addBatch(sqls[i]);
			}
			stmt.executeBatch();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	 }
	 void executeTranstion(String [] sqls){
		 
			try {
				con.setAutoCommit(false);
				for (int j = 0; j < sqls.length; j++) {
				stmt.executeUpdate(sqls[j]);
				}
				con.commit();
			} catch (SQLException e) {
				try {
					con.rollback();
					con.commit();
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				
				e.printStackTrace();
			}
		}
		 
		ArrayList<HashMap<String, String>> querybypage(String sql,int page,int pagesize){
			
			int start=pagesize*(page-1);
			sql=sql+"limit "+start+","+pagesize+" ";
			return query(sql);
		}
	ArrayList<HashMap<String, String>> query(String sql){
	try {
		rs=stmt.executeQuery(sql);
		ResultSetMetaData mt = rs.getMetaData();
		int count =mt.getColumnCount();
		
		ArrayList<HashMap<String, String>> list=new ArrayList<HashMap<String,String>>();
		while(rs.next()){
			HashMap<String, String> map =new HashMap<String, String>();
			for (int i = 1; i <= count; i++) {
			String name =mt.getCatalogName(i);
			map.put(name, rs.getString(name));
			
		}
			list.add(map);
		}
		return list;
	}catch(SQLException e){
		e.printStackTrace();
		return null;
	}
}
	void close(){
		try {
			if(rs!=null){
			rs.close();
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
