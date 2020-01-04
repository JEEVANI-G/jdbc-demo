package third;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.del.entity.Student;

public class StudentDAO {
	public boolean insertEmployee(Student s) {
		int count=0;
		Connection con = null;
		PreparedStatement pst = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");
			pst = con.prepareStatement("insert into Student values(?,?,?,?)");

			pst.setInt(1, s.getRno());
			pst.setString(2, s.getName());
			pst.setDouble(3, s.getAge());
			pst.setDate(4, s.getDob());
			count = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pst != null)
					pst.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return count == 1;
	}

	public boolean updateEmployee(Student s) {
		int count = 0;
		Connection con = null;
		PreparedStatement pst = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");
			pst = con.prepareStatement("update employee setename = ?, salary = ?, where empid = ?");
			pst.setInt(1, s.getRno());
			pst.setString(2, s.getName());
			pst.setDouble(3, s.getAge());
			count = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pst != null)
					pst.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return count == 1;
	}

	public boolean removeEmployee(int i) {
		int count = 0;
		Connection con = null;
		PreparedStatement pst = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");
			pst = con.prepareStatement("delete from student where rno = ?");
			pst.setInt(1, i);
			count = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pst != null)
					pst.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return count == 1;
	}

	public Student getStudent(int rno) {
		Student s = null;
		int count = 0;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");
			pst = con.prepareStatement("select * from student where rno = ?");
			pst.setInt(1, rno);
			rs = pst.executeQuery();
			if (rs.next()) {
				s = new Student(rs.getRno(1), rs.getAge(2), rs.getName(3), rs.getDob(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pst != null)
					pst.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return s;
	}
	public ArrayList<Student> getStudent() {
		Student s = null;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		ArrayList<Student> empList = new ArrayList<>();
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");
			pst = con.prepareStatement("select * from student");
			rs = pst.executeQuery();
			while (rs.next()) {
				s = new Student(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDate(4));
				ArrayList<third.Student> sList;
				sList.add(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pst != null)
					pst.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return empList;
	}

	public boolean modifyStudent(Student s) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeStudent(int i) {
		// TODO Auto-generated method stub
		return false;
	}
}


