package ch10.sec03_methodoverriding.EX04_MethodOverriding_4;

class A{
	protected void abc() {}
}

class B1 extends A{
	public void abc() {}
}

class B2 extends A{
	protected void abc() {}
}

class B3 extends A{
//	default void abc() {} // class A 가 protected 이므로 그 미만은 불
}

class B4 extends A{
//	private void abc() {}
}

public class MethodOverriding_4 {

	public static void main(String[] args) {


	}

}
