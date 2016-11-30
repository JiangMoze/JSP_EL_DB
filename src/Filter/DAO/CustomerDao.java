package Filter.DAO;



import DB.DruidDB;
import Filter.vo.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CustomerDao extends BaseDao{
	public boolean addCustomer(Customer customer){
		String sql="insert into customers"+"(cust_id,cname,email,balance) values (?,?,?,?)";
		try

		{

			Connection conn= DruidDB.getConnection();
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, customer.getCust_id());
			pstmt.setString(2, customer.getCname());
			pstmt.setString(3, customer.getEmail());
			pstmt.setDouble(4, customer.getBalance());
			pstmt.executeUpdate();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;

	}
	public Customer findByName(String cname){
		String sql="select cust_id ,cname,email,balance"+"from customers where cname=?";
		Customer customer =new Customer();
		try {
			Connection conn=datasource.getConnection();
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, cname);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()){
				customer.setCust_id(rs.getString("cust_id"));
				customer.setCname(rs.getString("cname"));
				customer.setEmail(rs.getString("email"));
				customer.setBalance(rs.getDouble("balance"));

			}


		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

		return customer;

	}
public ArrayList<Customer> findAllCustomer(){
	Customer customer=new Customer();
	ArrayList<Customer> custiList=new ArrayList<Customer>();
	String sql="select * from customers";
	try {
		Connection conn=datasource.getConnection();
		PreparedStatement pstmt =conn.prepareStatement(sql);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()){
			
			customer.setCust_id(rs.getString("cust_id"));
			customer.setCname(rs.getString("cname"));
			customer.setEmail(rs.getString("email"));
			customer.setBalance(rs.getDouble("balance"));
			
		}
		return custiList;
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	return null;
	
}


}
