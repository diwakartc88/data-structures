package com.example.miscellanious.linkedlist;

public class LinkedListTest {
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList(1);
		
		list.append(2);
		list.append(3);
		list.printList();
		
		//list.removeLast();
		
		//list.printList();
		
		list.prepend(6);
		
		list.printList();
		System.out.println(list.get(4).value);
	}

}
