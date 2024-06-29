package com.example.demo;

import com.example.demo.LinkedList.LinkList;
import com.example.demo.LinkedList.Node;
import com.example.demo.LinkedList.Person;
import org.springframework.boot.autoconfigure.SpringBootApplication;




public class DemoApplication {

	public static void main(String[] args) {

		// <----------------------------------------------> Linked List <------------------------------------------>
		LinkList<String> ll = new LinkList<String>();


        ll.addLast("Thế giới di động");
		ll.addLast("Điện máy xanh");
		ll.addLast("Nhà thuốc Long Châu");

		ll.tranverse();
	}
}


