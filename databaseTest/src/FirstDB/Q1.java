package FirstDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Connection conn;
		PreparedStatement pstmt;
		ResultSet rs;
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseprogramming", "test", "1234");
		
		String name,tel,addr;
		
		while(true) {
			System.out.println("\n======================================");
			System.out.println("1.입력 2.검색 3.전체출력 4.삭제 5.종료");
			System.out.print("메뉴를 선택하세요 : ");
			int select = sc.nextInt();
			System.out.println("======================================");
			
			if(select==1) { //입력 
				
				System.out.print("이름 : ");
				name = sc.next();
				System.out.print("연락처 : ");
				tel = sc.next();
				System.out.print("주소 : ");
				addr = sc.next();
				
				pstmt = conn.prepareStatement("insert into telTBL values(?,?,?);");
				pstmt.setString(1, name);
				pstmt.setString(2, tel);
				pstmt.setString(3, addr);
				
				pstmt.executeUpdate();
				System.out.println(" >> 입력이 완료되었습니다.");
				
			}
			else if(select==2){ //검색 
				rs=null;
				
				boolean check=true;
				while(check) {
					System.out.print("검색할 이름을 입력하세요 : ");
					name = sc.next();
				
					pstmt = conn.prepareStatement("select * from telTBL where name=?;");
					pstmt.setString(1, name);
					rs = pstmt.executeQuery();
					
					if(rs.next()) {
						pstmt = conn.prepareStatement("select * from telTBL where name=?;");
						pstmt.setString(1, name);
						rs = pstmt.executeQuery();
						break;
					}
					else {
						System.out.println("일치하는 이름이 없습니다. 다시 입력하세요.");
					}
				}
				
				while(rs.next()) {
					System.out.println("\n >>  검색 결과");
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("tel")+"\t");
					System.out.print(rs.getString("addr")+"\t\n");
				}
				

				
			}
			else if(select==3) { //전체출력
				pstmt=conn.prepareStatement("select * from telTBL;");
				rs=pstmt.executeQuery();
				
				System.out.println("\n >>  검색 결과");
				while(rs.next()) {
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("tel")+"\t");
					System.out.print(rs.getString("addr")+"\t\n");
				}
			}
			else if (select==4) { //삭제
				while(true) {
					System.out.print("삭제할 이름을 입력하세요 : ");
					name = sc.next();
				
					pstmt = conn.prepareStatement("select * from telTBL where name=?;");
					pstmt.setString(1, name);
					rs = pstmt.executeQuery();
					
					if(rs.next()) {
						pstmt = conn.prepareStatement("delete from telTBL where name=?;");
						pstmt.setString(1, name);
						pstmt.executeUpdate();
						System.out.println("\n >> 삭제가 완료되었습니다.");
						break;
					}
					else {
						System.out.println("일치하는 이름이 없습니다. 다시 입력하세요.");
					}
				}
				
				
				
			}
			else if(select ==5 ) { //종료 
				
			}
			else {
				System.out.println("잘못된입력입니다.");
			}
	

		}

	}	
	
}
