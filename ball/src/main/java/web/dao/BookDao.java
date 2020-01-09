package web.dao;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import web.entity.Book;

@Repository
public class BookDao 
{

	SessionFactory factory = null;

	@Autowired
	public BookDao(SessionFactory factory) {
		this.factory = factory;
	}

	public boolean insertBook(Book bk) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(bk);
		trans.commit();
		session.close();
		return bk != null;
	}

	public boolean updateBook(Book bk) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.update(bk);
		trans.commit();
		session.close();
		return bk != null;
	}

	public boolean deleteBook(int bookid) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		Book b3 = session.get(Book.class, bookid);
		if (b3 != null) {
			session.delete(b3);
			trans.commit();
		}
		return b3 != null;
	}

	public Book getBook(int bookid) {
		Session session = factory.openSession();
		return session.get(Book.class, bookid);
	}

	@SuppressWarnings("unchecked")
	public List<Book> getBook() {
		Session session = factory.openSession();
		return session.createQuery("from Book").list();
	}
}
