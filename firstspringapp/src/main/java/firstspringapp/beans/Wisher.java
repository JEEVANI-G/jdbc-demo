package firstspringapp.beans;

public  class Wisher 
{
	String message;
 public Wisher() {System.out.println("bean is created");}
 

 public void setMessage(String message)
 {
	 this.message=message;
 }
 public String getMessage()
 {
	 return message;
	
 }
 public void initWisher()
 {
	 System.out.println("bean is initialised");
 }
 public void destWisher()
 {
	 System.out.println("bean is destroyed");
 }
 
}
