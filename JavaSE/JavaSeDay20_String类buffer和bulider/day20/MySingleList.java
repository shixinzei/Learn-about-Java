package day20;

public class MySingleList {
	private Node first; 
	private int total;
	
	public void add(Object obj) {
		if(first == null) {
			first = new Node(obj, null);
		}else {
			Node now = first;
			while(now.next!=null) {
				now = now.next;
			}
			now.next = new Node(obj, null);
		}
		total++;
	}
	
	public int size() {
		return total;
	}
	
	public void remove(Object obj) {
		if(obj == null) {
			if(first.data == null) {
				first = first.next;
			}else {
				Node left = first;
				Node now = first.next;
				while(now.data!=null) {
					left = now;
					now = now.next;
				}
				left.next = now.next;
			}
		}else {
			if(obj.equals(first.data)) {
				first = first.next;
			}else {
				Node left = first;
				Node now = first.next;
				while(!obj.equals(now.data)) {
					left = now;
					now = now.next;
				}
				left.next = now.next;
			}
			
		}
		total--;
	}
	
	public Object[] toArray() {
		Object[] all = new Object[total];
		Node node = first;
		for(int i=0;i<all.length;i++) {
			all[i] = node.data;
			node = node.next;
		}
		return all;
	}
	
	
	class Node{
		Object data;
		Node next;
		public Node(Object data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
	}
	
}
