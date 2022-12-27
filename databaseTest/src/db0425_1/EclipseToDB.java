package db0425_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class Data{
	
	String a,b,c;
	int d,e,f;
	
	public String getA() {
		return a;
	}
	
	public void setA(String a) {
		this.a=a;
	}
	
	public String getB(){
		return b;
	}
	
	public void setB(String b) {
		this.b=b;
	}
	
	public String getC() {
		return c;
	}
	
	public void setC(String c) {
		this.c=c;
	}
	
	public int getD() {
		return d;
	}
	
	public void setD(int d) {
		this.d=d;
	}
	
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e=e;
	}
	
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f=f;
	}
}

class SQLC{
	private static Connection conn;
	private static PreparedStatement pstmt;
	
	void DataInsert(Data d) {
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseprogramming?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","test","1234");
			pstmt=conn.prepareStatement("insert into 대리점 values(?,?,?,?,?,?)");
			pstmt.setString(1, d.getA());
			pstmt.setString(2, d.getB());
			pstmt.setString(3, d.getC());
			pstmt.setInt(4, d.getD());
			pstmt.setInt(5, d.getE());
			pstmt.setInt(6, d.getF());
			pstmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}

class InputClass{
	Data valueReturn() {
		Data d = new Data();
		
		Scanner scS = new Scanner(System.in);
		Scanner scI = new Scanner(System.in);
		
		System.out.print("지점을 입력하세요 : ");
		d.setA(scS.nextLine());
		
		System.out.print("도시를 입력하세요 : ");
		d.setB(scS.nextLine());
		
		System.out.print("전화번호를 입력하세요 : ");
		d.setC(scS.nextLine());
		
		System.out.print("종업원수를 입력하세요 : ");
		d.setD(scI.nextInt());
		
		System.out.print("자본금을 입력하세요 : ");
		d.setE(scI.nextInt());
		
		System.out.print("지점 개설일을 입력하세요 : ");
		d.setF(scI.nextInt());
		
		scS.close();
		scI.close();
		return d;
	}
}
public class EclipseToDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		SQLC sq = new SQLC();
		InputClass ic = new InputClass();
		
		while(true) {
			System.out.print("1. 입력 / 2. 종료 : ");
			if(sc.nextInt()==1) {
				sq.DataInsert(ic.valueReturn());
			}
			else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}

}
 