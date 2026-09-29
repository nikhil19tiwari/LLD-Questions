package in.nikhil.project.cache;

class Nodess<K,V>{
	K key;
	V value;
	Nodess<K,V> next;
    final int hashcode;
	Nodess(K key,V value,int hashcode){
		this.key = key;
		this.value = value;
		this.next = null;
		this.hashcode = hashcode;
	}
}
class MyHashMap<K,V>{
	
	static  int default_Initial_Capacity = 1<<4;
	static final double default_load_factor=0.75f;
	static  Integer default_threshhold = 12;
	Nodess<K,V> [] arr = new Nodess[default_Initial_Capacity];
	
	public void put(Object key,Object value) {
		int idx = getHashKeyIndex(key);
		if(idx >= default_threshhold) {
			resize();
		}
		Nodess Nodess = arr[idx];
		if(Nodess == null) {
			arr[idx] = new Nodess(key,value,idx);
			return;
		}
		else {
			Nodess ans = new Nodess(key,value,idx);
			ans.next = Nodess;
			arr[idx] = ans;
			return;
		}
	}
	
	
	public K get(Object key) {
		int idx = getHashKeyIndex(key);
		if(idx >= arr.length) {
			return null;
		}
		Nodess head = arr[idx];
		Nodess temp =head;
		while(temp != null) {
			int hash = temp.hashcode;
			if(hash == idx) {
				return (K)temp.value;
			}
			temp = temp.next;
		}
		return null;
	}
	private int getHashKeyIndex(Object key) {
		int hash = key.hashCode();
		return hash&(default_Initial_Capacity -1);
	}
	
	private void resize() {
		 int newCapacity = default_Initial_Capacity<<1;
		 Nodess<K,V> nums [] = new Nodess[newCapacity];
		 for(int i=0;i<arr.length;i++) {//preserve the data into nums array
			 nums[i]=arr[i];
		 }
		 arr = nums;
		 default_Initial_Capacity = newCapacity;
		 default_threshhold = (int)(newCapacity*default_load_factor);
		 
	}
}

public class CustomHashMap {
	public static void main(String []args) {
		

		MyHashMap<Integer, String> map = new MyHashMap<>();

        map.put(1, "Nikhil");
        map.put(2, "Java");
        map.put(3, "HashMap");

        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
	}
}
