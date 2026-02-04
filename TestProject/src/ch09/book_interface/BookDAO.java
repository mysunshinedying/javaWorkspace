package ch09.book_interface;

import java.util.ArrayList;

public class BookDAO implements IBookDAO {
    private ArrayList<BookDTO> books = new ArrayList<>();

    @Override
    public void insertBook(BookDTO dto) {
        System.out.println("책을 등록했습니다.");
        System.out.println("(" + dto.bookClass + ")\t" + "도서 명 :" + dto.getBookName() + "\n저자 명 : " + dto.getBookAuthor()
                + "\n출판사 : " + dto.getBookPublisher() + "\n발행년도 :" + dto.getBookYear() + "\n청구 번호 : " + dto.getBookCode());
        books.add(dto); //arrayList books에 추가
    }

    @Override
    public void deleteBook(String bookCode) {
        for (BookDTO b : books) { //books를 for문으로 순환
            if (b.getBookCode().equals(bookCode)) { //books 내에 getBookCode를 불러 매개변수 bookCode와 일치하는지 확인
                books.remove(b); //일치할 경우 해당 books 내에서 객체 b(BookDTO)를 삭제.
                break; //만약 찾았다면 for문 순환을 그만 두는 것이 좋음, break 처리
            }
        } //for문 종료
        System.out.println("책 정보가 삭제되었습니다.");
    }

    @Override
    public ArrayList<BookDTO> getAllBooks() {
        return books;
    }

    @Override
    public BookDTO SearchBook(String bookCode) {
        for (BookDTO b : books) { //books를 for문으로 순환
            if (b.getBookCode().equals(bookCode)) { //books 내에 getBookCode를 불러 매개변수 bookCode와 일치하는지 확인
                return b; //일치하는 객체 b를 return한다 → toString을 Override하여 출력
            }
        } //for문 종료
        return null; //일치하지 않을 경우에도 return해야하므로 return null;
    }

    @Override
    public void updateBook(BookDTO dto) {
        System.out.println("책 정보에 대한 수정이 완료되었습니다.");
    }
}
