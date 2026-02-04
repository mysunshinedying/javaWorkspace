package ch09.book_interface;
import java.util.ArrayList;

public interface IBookDAO {
    public void insertBook(BookDTO dto);
    public void deleteBook(String bookCode);
    public ArrayList<BookDTO> getAllBooks();
    public BookDTO SearchBook(String bookCode);
    public void updateBook(BookDTO dto);
}
