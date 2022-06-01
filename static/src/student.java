
public class student {
	
     int rollno;
     String name;
     static String college="HKBK";
     student(int r,String n)
     {
    	rollno=r;
    	name=n;
    	
    	 	 
     }
     static void change()
     {
    	 college="orien";
     }
  void display()
    { 
	  System.out.println(rollno+" "+name+" "+college);
	  }
 

	public static void main(String args[]) 
	{
	student s1=new student(111,"molu");
	student s2=new student(112,"aash");
	change();
	s1.display();
	s2.display();
	}
}