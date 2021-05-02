package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ConnectToMySql extends BaseClass {

	private Connection conn = null;
	private Statement stmt = null;
	String DB_PATH ="jdbc:sqlserver://rw-sqlvip-qa-cia.ttgtpmg.net:2202;authenticationScheme=JavaKerberos;integratedSecurity=true;Domain=ttgtpmg.net;databaseName=Codetalkers;SendStringParametersAsUnicode=false;QueryTimeout=60";
	String DB_Username ="svcsql_cia_qa_rw";
	String DB_Password = "Codetalkersqarw01=?!";
	String Query;
	ResultSet res;

	@BeforeTest
	public void DBConnection() throws ClassNotFoundException, SQLException{
		System.out.println(".....Initializing DB......");
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		
		System.out.println("..........DB Initialized.......");
		conn = DriverManager.getConnection(DB_PATH,DB_Username,DB_Password);
		System.out.println("....DB Connected....");
		System.out.println("....creating statement...≥..");
		stmt = conn.createStatement();
		System.out.println("........Statement created........... ");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		Reporter.log("DB Connection Open",true);
	}
	
		@Test
		public void testCase() throws SQLException{
			//Query = "select APPOINTMENT_ID, MRN, CLINIC_CODE, APPT_DATETIME, MESSAGE_DATETIME, EVENT_DATETIME, REMINDER_PREF_CODE, "
			//	+ "PATIENT_SUB_DEPT_CODE from dbo.APPOINTMENT where mrn = '07781928'  order by UPDATE_TIMESTAMP desc";
		//	Query = "";
					
			System.out.println("....Executing Query....");
			res = stmt.executeQuery(Utils.Query);
			//res =stmt.executeQuery(Query);
			System.out.println("...Query Executed...");
//			while(res.next()){
//			System.out.println(res.getString(1) +"  " +res.getString(2) + " "+ res.getString(3));
//			}
			}
		}
		
	
//}
