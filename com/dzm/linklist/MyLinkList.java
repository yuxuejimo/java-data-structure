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
		if(head==null){
			head.setNext(next);
		}
	}
	
	public void deleteNode(){}
	
	public void getNode(){}
	
	public void getLength(){}
	
	public void clear(){}
	
}
