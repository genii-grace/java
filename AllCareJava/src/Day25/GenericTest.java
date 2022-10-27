package Day25;

class Box<T>{
	T vol;
	void setVolume(T v) {
		vol=v;
	}
	T getVolume() {
		return vol;
	}
}

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box<Integer> ibox = new Box<Integer>();
		ibox.setVolume(200);
		
		System.out.println("<Integer> 박스의 부피는 "+ibox.getVolume());
		
		Box<Double> dbox = new Box<Double>();
		dbox.setVolume(123.456);
		
		System.out.println("<Double> 박스의 부피는 "+dbox.getVolume());
		
		
	}

}
