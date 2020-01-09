package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import web.dao.BookDao;
import web.entity.Book;

@Controller
public class BookController {
	BookDao bdao;

	@Autowired
	BookController(BookDao bdao) {
		this.bdao = bdao;
	}

	@GetMapping("/bookPage")
	public String getEmpPage(Model model) {
		model.addAttribute("bk", new Book(0, "", "", 0.0));
		return "DisplayBook";
	}

	@GetMapping("/bCRUD")
	public String bookCrud(@RequestParam("sub") String sub, @RequestParam("bookid") int bookid,
			@RequestParam("booktitle") String booktitle, @RequestParam("author") String author,
			@RequestParam("price") double price, RedirectAttributes ra) {
		ra.addFlashAttribute("bk", new Book(bookid, booktitle, author, price));
		String val = "";
		if (sub.equals("Add_Book"))
			val = "addBook";
		else if (sub.equals("Delete_Book"))
			val = "deleteBook";
		else if (sub.equals("Modify_Book"))
			val = "updateBook";
		else
			val = "getBook";

		return "redirect:" + val;
	}

	@GetMapping("/addBook")
	public String addBook(@ModelAttribute("bk") Book b) {
		bdao.insertBook(b);
		return "DisplayBook";
	}

	@GetMapping("/updateBook")
	public String updateEmployee(@ModelAttribute("bk") Book b) {
		bdao.updateBook(b);
		return "DisplayBook";
	}

	@GetMapping("/deleteBook")
	public String deleteBook(@ModelAttribute("bk") Book b) {
		bdao.deleteBook(b.getBookid());
		return "DisplayBook";
	}

	@GetMapping("/getBook")
	public String getBook(@ModelAttribute("bk") Book b, Model model) {
		Book b1 = bdao.getBook(b.getBookid());
		model.addAttribute("bk", b1);
		return "DisplayBook";
	}

}
