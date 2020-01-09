package web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Book {
	@Id
	@Column(columnDefinition = "number(3)", name = "bookid")
	int bookid;
	
	@Column(columnDefinition = "varchar2(20)", name = "name")
	String booktitle;
	
	@Column(columnDefinition = "varchar2(20)", name = "author")
	String author;
	
	@Column(columnDefinition = "number(8,2)",name = "price")
	double price;

	public Book() {

	}

	public Book(int bookid, String booktitle, String author, double price) {

		this.bookid = bookid;
		this.booktitle = booktitle;
		this.author = author;
		this.price = price;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBooktitle() {
		return booktitle;
	}

	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
