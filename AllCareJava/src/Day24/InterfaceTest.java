package Day24;

interface K{
	void abc();
}

interface X extends K{
	void def();
}

abstract class Y implements X{
	abstract void kor();
	
}

class Z extends Y{
	void kor() {
		
	}
	
	public void abc() { //인터페이스 상속은 public 
		
	}
	
	public void def() {
		
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
