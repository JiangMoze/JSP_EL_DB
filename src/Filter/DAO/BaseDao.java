package Filter.DAO;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;

public class BaseDao {
DataSource datasource;
public BaseDao(){
	try {
		Context context=new InitialContext();
		datasource=(DataSource)context.lookup("java:comp/env/jdbc/sampleDB");
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}

	public Connection getConnection() throws Exception{
		return datasource.getConnection();
	}
	
	
}
