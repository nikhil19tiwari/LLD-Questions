package in.nikhil.project.cache;

import java.util.HashMap;

class Node {

    int data;
    int count;
    int key;

    Node next;
    Node prev;

    public Node(int key, int data) {
        this.key = key;
        this.data = data;
        this.count = 1;
        this.next = null;
        this.prev = null;
    }

    public void incrCount() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class Dll {

    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);

    Dll() {
        head.next = tail;
        tail.prev = head;
    }

    public void insertAtHead(Node node) {

        node.next = head.next;
        head.next.prev = node;

        node.prev = head;
        head.next = node;
    }

    public void removeNode(Node node) {

        node.prev.next = node.next;
        node.next.prev = node.prev;

        node.next = null;
        node.prev = null;
    }

    public Node removeLast() {

        if (head.next == tail) {
            return null;
        }

        Node node = tail.prev;

        removeNode(node);

        return node;
    }

    public boolean isEmpty() {
        return head.next == tail;
    }
}

class LeastFrequentlyUsed {

    HashMap<Integer, Node> map = new HashMap<>();

    HashMap<Integer, Dll> freq = new HashMap<>();

    private int size = 0;

    private static final int capacity = 3;

    public int get(int key) {

        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);

        // old frequency DLL
        Dll oldDll = freq.get(node.count);

        oldDll.removeNode(node);

        // if old DLL becomes empty
        if (oldDll.isEmpty()) {
            freq.remove(node.count);
        }

        // increase frequency
        node.incrCount();

        // get new frequency DLL
        Dll newDll = freq.get(node.count);

        if (newDll == null) {
            newDll = new Dll();
            freq.put(node.count, newDll);
        }

        // put node in new frequency DLL
        newDll.insertAtHead(node);

        return node.data;
    }

    public void put(int key, int value) {

        // If key already exists
        if (map.containsKey(key)) {

            Node node = map.get(key);

            Dll oldDll = freq.get(node.count);

            oldDll.removeNode(node);

            if (oldDll.isEmpty()) {
                freq.remove(node.count);
            }

            node.data = value;

            // increase frequency
            node.incrCount();

            Dll newDll = freq.get(node.count);

            if (newDll == null) {
                newDll = new Dll();
                freq.put(node.count, newDll);
            }

            newDll.insertAtHead(node);

            return;
        }

        // Cache is full
        if (size == capacity) {

            // Find minimum frequency
            int minFreq = Integer.MAX_VALUE;

            for (int frequency : freq.keySet()) {
                minFreq = Math.min(minFreq, frequency);
            }

            // Get DLL of minimum frequency
            Dll dll = freq.get(minFreq);

            // Remove least recently used node
            // from minimum frequency DLL
            Node node = dll.removeLast();

            if (node != null) {
                map.remove(node.key);
                size--;
            }

            // Remove empty DLL
            if (dll.isEmpty()) {
                freq.remove(minFreq);
            }
        }

        // Add new node
        Node node = new Node(key, value);

        map.put(key, node);

        // New node always starts with frequency 1
        Dll dll = freq.get(1);

        if (dll == null) {
            dll = new Dll();
            freq.put(1, dll);
        }

        dll.insertAtHead(node);

        size++;
    }
}

public class Lfu {

    public static void main(String[] args) {

        LeastFrequentlyUsed lfu = new LeastFrequentlyUsed();

        lfu.put(1, 11);
        lfu.put(2, 22);
        lfu.put(3, 33);

        System.out.println(lfu.get(1));
        System.out.println(lfu.get(1));

        System.out.println(lfu.get(2));

        lfu.put(4, 44);

        System.out.println(lfu.get(3));
        System.out.println(lfu.get(4));
    }
}