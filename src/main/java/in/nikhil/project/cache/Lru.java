package in.nikhil.project.cache;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

class Node{
	private volatile int data;
	  Node next;
	  Node prev;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
	public int getData() {return data;}
	public void setData(int data) {this.data = data;}
}
class DLL{
	private  final Node head = new Node(-1);
	private  final Node tail = new Node(-1);
	AtomicInteger size = new AtomicInteger();
	public DLL(int size) {
		head.next = tail;
		tail.prev = head;
		this.size.set(size);
	}
	
	private final HashMap<Integer,Node> map = new HashMap<>();
	public synchronized int get(int key) {
		if(!map.containsKey(key)) {
			return -1;
		}
		Node node = map.get(key);
		deleteNode(node);
		insertAtHead(node);
		return node.getData();
	}
	public synchronized void put(int key,int value) {
//		System.out.println(size.get());
		if(size.get()==0) {
			deleteNode(tail.prev);
			map.remove(key);
			Node node = new Node(value);
			insertAtHead(node);
			map.put(key,node);
		}
		else {
			if(map.containsKey(key)) {
				Node node =map.get(key);
				deleteNode(node);
				node.setData(value);
				map.put(key, node);
				insertAtHead(node);
			}
			else {
				Node node = new Node(value);
				size.decrementAndGet();
				map.put(key, node);
				insertAtHead(node);
     		}
		}
	}
	
	/*
	 * Insert At Head Position
	 */
	private  final void insertAtHead(Node node) {
		node.next = head.next;
		head.next.prev = node;
		head.next = node;
		node.prev = head;
	}
	/*
	 * Delete Node
	 */
	private final void deleteNode(Node node) {
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}
	/*
	 * Print The Doubly Linked list
	 */
	public synchronized final void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.getData()+"->");
			temp = temp.next;
		}
	}
	
}
public class Lru {
	public static void main(String []args) {
		DLL dll = new DLL(5);
		dll.put(1, 10);
		dll.put(2, 20);
		dll.put(3, 30);
		dll.put(4, 40);
		dll.put(5, 50);
		dll.print();
		dll.put(6, 60);
		dll.put(7, 70);
		dll.get(4);
		System.out.println();
		dll.print();
	}
}
