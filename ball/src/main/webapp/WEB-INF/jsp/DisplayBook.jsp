<%@page
	import="web.entity.Book, web.dao.BookDao"%>
<html>
<%@page isELIgnored = "false" %>
<body>
	<form action="bCRUD">
		<table align=center width=50% bgcolor=green>
			<tr>
				<th>Book ID</th>
				<td><input type=text name=bookid value=${b.bookid } ></td>
			</tr>
			<tr>
				<th>title</th>
				<td><input type=text name=booktitle value=${b.booktitle }></td>
			</tr>
			<tr>
				<th>Author</th>
				<td><input type=text name=author value=${b.author }></td>
			</tr>
			
			<tr>
				<th>Price</th>
				<td><input type=text name=price value=${b.price }></td>
			</tr>
			
			<tr>
				<td><input type=submit value=Add_Book name="sub"></td>
				<td><input type=submit value=Show_Book name="sub"></td>
			</tr>
			<tr>
				<td><input type=submit value=Modify_Book name="sub"></td>
				<td><input type=submit value=Delete_Book name="sub"></td>
			</tr>
		</table>
	</form>
</body>
</html>