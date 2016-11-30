package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Created by 蒋东雨 on 2016/11/18.
 */
public class displayDao {
    Connection dbconn=DruidDB.getConnection();

        public Product diplay(String productid){
            Product product=new Product();
            String sql= null;
            try {
                sql = "select * from products where prod_id=?";
                PreparedStatement pstmt=dbconn.prepareStatement(sql);
                pstmt.setString(1, productid);
                ResultSet rs=pstmt.executeQuery();

                if(rs.next()){

                    product.setProd_id(rs.getString("prod_id"));
                    product.setPname(rs.getString("pname"));
                    product.setPrice(rs.getDouble("price"));
                    product.setStock(rs.getInt("stock"));
                    return product;
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
            return product;
        }
        public ArrayList<Product> displayAll(){
            ArrayList<Product> productList=null;
            productList=new ArrayList<Product>();
            try {
                String sql = "select * from products";
                PreparedStatement pstmt = dbconn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    Product product = new Product();
                    product.setPname(rs.getString("pname"));
                    product.setPrice(rs.getDouble("price"));
                    product.setProd_id(rs.getString("prod_id"));
                    product.setStock(rs.getInt("stock"));
                    productList.add(product);
                }
            }catch (SQLException e) {
                    e.printStackTrace();
                }
            return productList;

        }







}
