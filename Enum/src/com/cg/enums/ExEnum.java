package com.cg.enums;

public class ExEnum {
     enum Day{
    	 Sunday,Monday,Tuesday,wednesday, Thursady,Friday,Saturday
    	 
    	 
     }
     public static void main(String[] args) {
    	 Day day=Day.Sunday;
    	 switch(day) {
    	 case Sunday:
    		 System.out.println("moving towards Monday");
    	 case Friday:
    		 System.out.println("Hurrah!! weekend");
    	default:
    		System.out.println("other day");
    		
    	 }
     }
}
