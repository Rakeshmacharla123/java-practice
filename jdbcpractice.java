
import java.sql.*;
public Class Jdbc {
public static void main(String[] args) {
	
	String url="jdbc:mysql://localhost:3306/Employee";
	String driver="com.mysql.//localhost:3306/school";
	String username="system";
	String password="pass";
	
	
	
	
	//step1 : register the driver
	Class.forName(driver);
     
	
	//step2:  get the connection
     Connection con=DriverManager.getConnection(url,username,password);

	//step3:  create statement object
    Statement stmt = con.createStatement(); 
    
	//step4:  execute query
    stmt.execute("insert into Employee values(1,'santosh')");
    
	//step5:  close the connection
    con.close();
	
}
}
