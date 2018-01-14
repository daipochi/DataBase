package database;

import java.sql.ResultSet;
import java.sql.SQLException;

import database.MySQL;

public class DataBase_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBase_view graph = new DataBase_view();
		graph.setBounds(5,5,655,455);
		graph.setVisible(true);

		int id, year,ton;
		String name;
		ResultSet rs;
		MySQL mysql = new MySQL();
		rs = mysql.selectAll();


			try {
				while(rs.next()){
				    id = rs.getInt("id");
				    name = rs.getString("name");
				    year = rs.getInt("year");
				    ton = rs.getInt("ton");
				    System.out.println("ID：" + id);
				    System.out.println("name：" + name);
				    System.out.println("year：" + year);
				    System.out.println("ton：" + ton);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}


}
