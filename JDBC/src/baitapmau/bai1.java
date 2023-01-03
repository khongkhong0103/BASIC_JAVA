package baitapmau;

import java.sql.*;
import java.util.*;
/*
 * Bài: 1
 * Viết chương trình java kết nối đến cơ cở dữ liệu, truy vấn và hiện thị tên
 * cột của bảng
 */
public class bai1 {
	
	public static void main(String[] args) {
		String hostName = "localhost:3306";
		String dbName = "trongtam"; // database name
		String username = "root"; 
		String password = "";
		String connectionURL = "jdbc:mysql://" + hostName + "/" + dbName;

		try {
			// Nạp drive kết nối đến mysql (sd xampp)
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			
			// kết nối đến CSDL
			Connection con = DriverManager.getConnection(connectionURL,username,password);
			// Tạo đối tượng Statement để gửi các câu lệnh SQL
			Statement sm = con.createStatement();
			//truy vấn thông tin tới bảng 
			ResultSet rs = sm.executeQuery("Select * from sanpham");
			// lấy thông tin từ ResultSet 
			ResultSetMetaData rsm = rs.getMetaData();
			// lấy thông tin số cột của bảng của rsm
			int col_num = rsm.getColumnCount();
			// lấy tên cột của bảng từ đối tượng
			for(int i = 1; i<= col_num;i++) {
				System.out.print(rsm.getColumnLabel(i)+"   ");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
