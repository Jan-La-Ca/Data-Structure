package com.example.demo;

import com.example.demo.LinkedList.LinkList;





public class DemoApplication {

	public static void main(String[] args) {

		// <----------------------------------------------> Linked List <------------------------------------------>
		LinkList<String> ll = new LinkList<String>();

		// <----------------------------------------------> Add first list <------------------------------------------>
        ll.addFirst("Thế giới di động");
		ll.addFirst("Điện máy xanh");
		ll.addFirst("Nhà thuốc Long Châu");
		ll.tranverse();

		System.out.println("<----------------> Add Last List <--------------------->");
		// <----------------------------------------------> Add last list <------------------------------------------>
//		ll.addLast("Thế giới di động");
//		ll.addLast("Điện máy xanh");
//		ll.addLast("Nhà thuốc Long Châu");
//		ll.tranverse();


		System.out.println("<----------------> Add Middle list basing on key <--------------------->");
		ll.insertAfterNode("Nhà thuốc Long Châu","Hoa hồng");
		ll.tranverse();


		System.out.println("<----------------> Remove a Node based on key <--------------------->");
		ll.removeNode("Hoa hồng");
		ll.tranverse();
	}
}


