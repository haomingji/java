package JDBC2_0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;


class JDBC{
	String url = "jdbc:mysql://localhost:3308/ty5";
	String name = "root";
	String pass = "mysql";
	Connection conn ;
	Statement stmt ;//������
	PreparedStatement  pps;// Ԥ���� 
	ResultSet rs  ;
	JDBC(){// ���췽���������ݿ�
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,name,pass);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	void update(String sql,String[] param){
		try {
			pps = conn.prepareStatement(sql);
			for (int i = 0; param!=null && i < param.length; i++) {
				pps.setString(i+1, param[i]);//��ֹ������ָ���쳣
			}
			pps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	void batch( String[] sqls ){//��������stmt��
		
		try {
			stmt = conn.createStatement();
			for (int i = 0; i < sqls.length; i++) {
				stmt.addBatch(sqls[i]);//����������
			}
			stmt.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void executeTranstion( String[] sqls ){
		try{
			stmt = conn.createStatement();
			conn.setAutoCommit(false);//�Զ���׼Ϊ�٣���֤���ȫ��ִ�����ٷ��͵����ݿ�
			for (int i = 0; i < sqls.length; i++) {
				stmt.executeUpdate(sqls[i]);
			}
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();//�ع����ͷ���Դ
				conn.commit();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
	ArrayList<HashMap<String,String>> queryByPage( String sql ,String[] param, int page , int pageSize ){
		
		int start = pageSize*(page-1);
		sql = sql +" limit "+start+","+pageSize+"  ";
		
		return query(sql,param);
		
	}
	
	ArrayList<HashMap<String,String>> query(String sql,String[] param){
		try {
				
			pps = conn.prepareStatement(sql);
			
			for (int i = 0; param!=null && i < param.length; i++) {
				pps.setString(i+1, param[i]);//��ֹ��ָ���쳣
			}
			
			rs = pps.executeQuery();
			
			ResultSetMetaData mt = rs.getMetaData();
			
			int count = mt.getColumnCount();
			
			ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
			while(rs.next()){
				HashMap<String,String> map = new HashMap<String,String>();
				for (int i = 1; i <=count ; i++) {
					String name = mt.getColumnName(i);
					map.put(name, rs.getString(name));
				}
				list.add(map);
			}
			return list ;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	void close(){
		try {
			if(rs!=null){
				rs.close();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			if(stmt!=null){
				stmt.close();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if(pps!=null){
				pps.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}