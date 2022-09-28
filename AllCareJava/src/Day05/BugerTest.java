package Day05;

import java.util.Scanner;

public class BugerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 메인메뉴 선택(숫자)
		 * 		1. 갈릭버거, 2. 페페로니, 3. 페포로니 치킨, 4. 뭔치킨 5. 종료 
		 * 
		 *  사이드메뉴 선택(숫자)
		 *  	감튀, 콜라, 사이다
		 *  
		 *  결제 입력(문자열)
		 *  	카드, 상품권, 현금
		 *  
		 *  이 외 선택하면 잘못된선택입니다. 메인으로 돌아가기
		 *  모두 선택 완료 한 후 선택한 메뉴 모두 출력 
		 *  
		 */
		
		Scanner sc = new Scanner(System.in);
		String menu;
		String pay;
		String sideMenu;
		int num;
		boolean check =true;
		
		while(check) {
			System.out.print("메뉴를 입력하세요 : ");
			num = sc.nextInt();
			switch(num) {
			case 1:
				menu="갈릭버거";
				System.out.print("사이드 메뉴를 입력하세요 : ");
				num=sc.nextInt();
				switch(num) {
				case 1:
					sideMenu="감튀";
					pay="";
					while(!(pay.equals("카드")||pay.equals("현금")||pay.equals("상품권"))) {
					System.out.println("카드, 현금, 상품권 중 입력하세요.");
					System.out.print("결제방법을 입력하세요 : ");
					pay=sc.next();
					}	System.out.println("주문하신 메뉴는 "+menu+","+sideMenu+" 결제수단은 "+pay+"입니다.");
						System.out.println();
					
					break;
				case 2:
					sideMenu="콜라";
					break;
				case 3:
					sideMenu="사이다";
					break;
				default:
					System.out.println("잘못된 선택입니다.");
					break;
				}
				break;
			case 2:
				menu="페퍼로니";
				break;
			case 3:
				menu="페포로니 치킨";
				break;
			case 4:
				menu="뭔치킨";
				break;
			case 5:
				check=false;
				System.out.println(" 프로그램이 종료됩니다. ");
				break;
			default :
				System.out.println(" 잘못된 입력입니다. ");
				break;
					
			}
		}

	}

}
