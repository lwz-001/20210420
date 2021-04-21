package edu.xcdq;

public class Main {

    public static void main(String[] args) {
	    Phone xiaomi11 = new Phone() ;
	    xiaomi11.weight = 255;
	    xiaomi11.height = 135 ;
	    xiaomi11.width = 55 ;
	    xiaomi11.color = "color" ;
	     Phone iphone = new Phone(56,136,256,"土豪金");
		System.out.println(iphone);
    }
}
