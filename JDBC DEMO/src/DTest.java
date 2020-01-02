import com.del.entity.Employee;
import java.sql.Date;
import com.del.dao.EmployeeDAO;
public class DTest
{
	public static void main(String args[])
	{
		Employee e=new Employee(102,"balu",2000,new Date(1990,10,12));
		EmployeeDAO edao= new EmployeeDAO();
		if(edao.insertEmployee(e))
			System.out.println("Employee Record Inserted");
		else
			System.out.println("insertion failed");
	}

}
