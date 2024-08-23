package ch13.sec04.exam01;

public class Container<K, V> {
	
	private K key;
	private V value;
	
	
	public K getKey() {
		return this.key;
	}
		
	public V getValue() {
		return this.value;
	}
	

	public void set(K key, V value) {
		this.key = key;
		this.value = value;
		
	}
	
	
	

	

}
