package hibfourth;
import java.sql.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App
{
public static void main(String args[])
{
	Configuration cfg= new Configuration();
	cfg.addAnnotatedClass(AadharCard.class);
	cfg.addAnnotatedClass(Person.class);
	cfg.configure();
	SessionFactory factory=cfg.buildSessionFactory();
	Session session = factory.openSession();
	AadharCard ac= new AadharCard(7001,"Govt.Of.India",new Date(2019,10,11));
	Person p1= new Person("ajay",25,"hiTech",ac);
	Transaction trans=session.beginTransaction();
	session.save(ac);
	session.save(p1);
	trans.commit();
	session.close();
	factory.close();
	
}
}
















