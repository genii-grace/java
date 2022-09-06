package ch16.sec04_boundedtype.EX03_BoundedTypeOfInputArgument;

class A{}
class B extends A{}
class C extends B{}
class D extends C{}

class Goods<T>{
	private T t;

	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t=t;
	}
}

class Test{
	void method1(Goods<A> g) {}
	void method2(Goods<?> g) {}
	void method3(Goods<? extends B> g) {}
	void method4(Goods<? super B> g) {}
}

public class BoundedTypeOfInputArgument {

	public static void main(String[] args) {

		Test t = new Test();
		
		t.method1(new Goods<A>());
//		t.method1(new Goods<B>()); method1은 Goods <A> 타입이므로 나머지불가 
		
		t.method2(new Goods<A>());
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());
//		method2는 Goods<?> 타입으로 모든클래스타입 가
		
		t.method3(new Goods<B>());
		t.method3(new Goods<C>());
		t.method3(new Goods<D>());
//		method3은 Goods<? extends B> B 이거나 B의 자식클래스 타입 가능
		
		t.method4(new Goods<A>());
		t.method4(new Goods<B>());
//		method4는 Goods<? super B> B이거나 B의 부모 클래스 타입 
	}

}
