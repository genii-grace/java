package ch16.sec02_genericclass.EX02_TwoGenericArguments;

class KeyValue<K, V>{
	private K key;
	private V value;
	
	public K getKey() {
		return key;//키 값 리턴 
	}
	public void setKey(K key) {
		this.key=key; // 키값 받아서 대치 
	}
	
	public V getValue() {
		return value; // 벨류 값 리턴 
	}
	
	public void setValue(V value) {
		this.value=value;// 벨류값 받아서 대치 
	}
}

public class TwoGenericArguments {

	public static void main(String[] args) {
		
		KeyValue<String, Integer> kv1=new KeyValue<>(); //K는 스트링, V는 인트 
		kv1.setKey("사과"); //set에 사과 세팅 
		kv1.setValue(1000); //set에 1000 세
		
		String key1=kv1.getKey(); //key1에 getKey 값 읽기 
		int value1=kv1.getValue();//value1에 getValue 값 읽기 
		System.out.println("key: "+key1+" value: "+value1);

		KeyValue<Integer, String> kv2=new KeyValue<>(); //K는 인트,V는 스트링 
		kv2.setKey(404);
		kv2.setValue("Not Found(요청한 페이지를 찾을 수 없습니다.");
		
		int key2=kv2.getKey();
		String value2=kv2.getValue();
		System.out.println("key: "+key2+" value: "+value2);
		
		KeyValue<String, Void> kv3=new KeyValue<>();
		kv3.setKey("키값만 사용");
		
		String key3=kv3.getKey();
		System.out.println("key: "+key3);

	}

}
