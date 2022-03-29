package Chap16.Ex04;


//제너릭 클래스 : 매개변수(Argument) 가 2 개
class KeyValue<K, V>{
	private K key;
	private V value;
	
	//getter, setter
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	
}

public class TwoGenericArgument {

	public static void main(String[] args) {

//		KeyValue<String, Integer> kv1 = new KeyValue();	뒷 부분인 생성자에서는 생략 가능합니다~^^
		KeyValue<String, Integer> kv1 = new KeyValue<String, Integer>();
		
		kv1.setKey("사과");
		kv1.setValue(1000);
		System.out.println(kv1.getKey());
		System.out.println(kv1.getValue());
		
		KeyValue<Integer, String> kv2 = new KeyValue();
		kv2.setKey(404);
		kv2.setValue("NOT Found (요청한 페이지를 찾을 수 없습니다.)");
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());
		
		KeyValue<String, Double> kv3 = new KeyValue();
		kv3.setKey("평균값");
		kv3.setValue(12.34);
		System.out.println(kv3.getKey());
		System.out.println(kv3.getValue());
		
		//특정 타입을 사용하지 않을 경우 Void 키를 사용합니다. : 대문자임!
		// void 부분은 사용하지 않겠다.
		KeyValue<String, Void> kv4 = new KeyValue();
		kv4.setKey("키 값만 사용");
//		kv4.setValue(11111); 	//Void 한 것은 사용 불가
		System.out.println(kv4.getKey());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
