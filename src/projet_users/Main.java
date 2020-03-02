package projet_users;

import java.util.*;
import java.sql.Date;
import java.sql.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Date date = new Date(12) ;




		try{  Connection con = User.getConnection();


		System.out.println("connected");
User.addUser("houssam", "tertaki","houssamtertaki",date, "ia_tertaki@", "hello", "+213-055555646", "linkphoto", "Rbouraoui", 0, true);




		}
		catch(SQLException e)
		{
			System.err.println(e);
		}
	}

}
