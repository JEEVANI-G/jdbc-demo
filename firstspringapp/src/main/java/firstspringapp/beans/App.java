package firstspringapp.beans;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
public static void main(String args[])
{
	ClassPathXmlApplicationContext  context= new ClassPathXmlApplicationContext("Beans.xml");
			
	Person p= context.getBean(Person.class,"per1");
	System.out.println(p.getSsn()+""+p.getName());
	System.out.println(p.getAddress().getHno()+""+p.getAddress().getCity());
	System.out.println(p.getAddress().getState());
	context.close();
}
}