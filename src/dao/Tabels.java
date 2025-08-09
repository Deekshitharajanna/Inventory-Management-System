package dao;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Tabels {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon(); // Assuming this returns a valid connection
            st = con.createStatement();

            // Creating table
            //st.executeUpdate("CREATE TABLE IF NOT EXISTS appuser ("+ "appuser_pk INT AUTO_INCREMENT PRIMARY KEY, "+ "userRole VARCHAR(50), "+ "name VARCHAR(200), "+ "mobileNumber VARCHAR(50), "+ "email VARCHAR(200), "+ "password VARCHAR(50), "+ "address VARCHAR(200), "+ "status VARCHAR(50)"+ ")");
            // Inserting a sample user into the table
            // st.executeUpdate("INSERT INTO appuser(userRole, name, mobileNumber, email, password, address, status) "+ "VALUES('superadmin', 'super admin', '12345', 'superadmin@testemail.com', 'admin', 'india', 'Active')");
            //st.executeUpdate("create table category(category_pk int AUTO_INCREMENT primary key,name varchar(200))");
            //st.executeUpdate("create table product(product_pk int AUTO_INCREMENT primary key,name varchar(200),quantity int,price int,description varchar(500),category_fk int)");
            //st.executeUpdate("create table customer(customer_pk int AUTO_INCREMENT primary key,name varchar(200),mobileNumber varchar(50),email varchar(200))");
            st.executeUpdate("create table orderDetail(order_pk int AUTO_INCREMENT primary key,orderId varchar(200),customer_fk int,orderDate varchar(200),totalPaid int)");
            JOptionPane.showMessageDialog(null, "Table created successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (st != null) {
                    st.close();
                }
            } catch (Exception e) {
                // Ignoring the exception on close as there’s nothing we can do
            }
        }
    }
}
