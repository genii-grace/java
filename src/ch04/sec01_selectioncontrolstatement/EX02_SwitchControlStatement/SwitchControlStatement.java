package ch04.sec01_selectioncontrolstatement.EX02_SwitchControlStatement;

public class SwitchControlStatement {
	
	public static void main(String[] args) {
		
		int value1 = 2;
		switch(value1) {
		case 1:
			System.out.println("A");
			
		case 2:
			System.out.println("B"); //break이 없으므로 switch로 점프하여 case2부터 출력
		
		case 3:
			System.out.println("C");
			
		default:
			System.out.println("D");
			
			System.out.println();
		}
		
		int value2 = 2;
		switch(value2) {
		case 1:
			System.out.println("A");
			break;
			
		case 2:
			System.out.println("B");
			break; // switch 로 점프 후  break 으로 탈출하여 b만 출력 
		
		case 3:
			System.out.println("C");
			break;
			
		default:
			System.out.println("D");
			break;
		}
		
			System.out.println();
		
			
		if(value1 ==1) {
			System.out.println("A");
		}
		else if (value1==2) {
			System.out.println("B"); //if-else 문은 switch-break과 유사하게 구현된
			}
		else if (value1==3) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
		
		
	}

}
