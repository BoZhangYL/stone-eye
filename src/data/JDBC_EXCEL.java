package data;

import java.io.*;

import java.sql.*;

public class JDBC_EXCEL {
	public static void main(String[] args) throws SQLException {

		Connection con = null;

		try {

			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

			con = DriverManager.getConnection("jdbc:odbc:ExcelJDBC");

			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery("Select * from[Sheet1$]");

			ResultSetMetaData rsmd = rs.getMetaData();

			int numberOfColumns = rsmd.getColumnCount();

			System.out.println("表格列数" + numberOfColumns);

			System.out.println(rsmd.getColumnName(1) + "," + rsmd.getColumnName(2) + "," + rsmd.getColumnName(3));

			while (rs.next()) {

				for (int i = 1; i <= numberOfColumns; i++) {

					if (i > 1)
						System.out.print(", ");

					String columnValue = rs.getString(i);

					System.out.print(columnValue);

				}

				System.out.println("");

			}

			rs.close();

			st.close();

		}

		catch (Exception ex) {

			System.err.print("Exception: ");

			System.err.println(ex.getMessage());

		}

		finally {

			con.close();

		}

	}
}
