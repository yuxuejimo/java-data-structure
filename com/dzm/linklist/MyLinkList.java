package com.dzm.linklist;

public class MyLinkList {
	public Node head = null;
	public int length = 0;
	
	public void appendNode(Node n){
		if(head==null){
			head = n;
			return;
		}
		Node tmp = head;
		while(tmp.getNext()!=null){
			tmp = tmp.getNext();
		}
		tmp.setNext(n);
	}
	
	public void insertNode(Node per,Node cur){
		
	}
	
	public void deleteNode(){}
	
	public Node getHeadNode(){
		return this.head;
	}
	
	public void getLength(){}
	
	public void clear(){}
	
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		MyLinkList ml = new MyLinkList();
		ml.appendNode(n1);
		ml.appendNode(n2);
		System.out.println(ml.getHeadNode().getData());
	}
	
}
