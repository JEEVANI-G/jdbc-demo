package firstspringapp.beans;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import firstspringapp.beans.*;
public class App 
{
public static void main(String args[])
{
	ApplicationContext  context= new ClassPathXmlApplicationContext("Beans.xml");
			Wisher w1= (Wisher)context.getBean("wish1");
	System.out.println(w1.getMessage());
}
}
