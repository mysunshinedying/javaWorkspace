package ch09.book_interface;


import java.util.ArrayList;
import java.util.List;

public class BookDAO implements IBookDAO {
    private List<BookDTO> booksData = new ArrayList<>();

    @Override
    public void insertBook(BookDTO dto) {
        String tmpId = dto.getBookCode();
        BookDTO optDto = booksData.stream().filter(book -> book.getBookCode().equals(tmpId))
                .findFirst().orElse(null);
        if(optDto != null) {
            System.out.println("회원 등록 실패 : 동일 청구번호의 장서가 있습니다.");
        } else {
            booksData.add(dto);
            System.out.println("책을 등록했습니다");
        }
    }

    @Override
    public void deleteBook(String bookCode) {
        BookDTO delDto = booksData.stream().filter(book -> book.getBookCode().equals(bookCode))
                .findFirst().orElse(null);
        if(delDto != null) {
            booksData.remove(delDto);
            System.out.println("책 정보가 삭제되었습니다.");
        } else {
            System.out.println("해당 청구번호의 책이 없습니다.");
        }
    }

    @Override
    public List<BookDTO> getAllBooks() {
        return booksData;
    }

    @Override
    public BookDTO SearchBook(String bookName) {
        BookDTO searchDto = booksData.stream().filter(book -> book.getBookName().equals(bookName))
                .findFirst().orElse(null);

        return searchDto;
    }

    @Override
    public void updateBook(BookDTO dto) {
        System.out.println("책 정보에 대한 수정이 완료되었습니다.");
    }
}
