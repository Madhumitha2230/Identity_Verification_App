package com.madhu;
public class MenuTest {
	public static void main(String[] args) {
		//creating object to canteen
		Menu menu1=new Menu("idly",10);
		System.out.println(menu1);
		System.out.println("ItemName: "+menu1.name + "Price: "+menu1.price);
		
		//creating another object to canteen
		Menu menu2=new Menu("dosai",20);
		System.out.println("Itemname: "+menu2.name + "price: "+ menu2.price);
	}

}
