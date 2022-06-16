package com.cg.enums;

public class ExampleEnum {
public enum Season{
	WINTER,SPRING,SUMMER,AUTMN
}
    public static void main(String[] args) {
    	for(Season s: Season.values()) {
    		System.out.println(s);
    	}
    	System.out.println("The value of autumn is:"  +Season.valueOf("AUTUMN"));
    	System.out.println("The value of winter is:"  +Season.valueOf("WINTER").ordinal());
        System.out.println("The value of autumn is:"  +Season.valueOf("SUMMER").ordinal());
    					
    					
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
