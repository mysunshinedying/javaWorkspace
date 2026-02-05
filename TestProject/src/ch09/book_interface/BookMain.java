package ch09.book_interface;
//제출은 나중에

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        String bookCode; //책 청구번호
        String bookName; //책 이름
        String bookAuthor; //책 저자
        String bookPublisher; //출판사
        String bookClass; //분류법
        String bookYear; //책 발행년도
        int menuSelected;

        Scanner sc = new Scanner(System.in);

        IBookDAO idao = new BookDAO();
        BookDTO dto = null;
        BookDTO bDTO = null;

        do {
            System.out.println("--------------------------------------------------------------");
            System.out.println("\t메뉴를 선택하세요.");
            System.out.println("\t1.책 등록\t2.책 삭제\t3.책 전체 조회\t4.책 조회\t5.책 정보 수정\t6.종료");
            System.out.println("--------------------------------------------------------------");
            System.out.print("메뉴 선택(번호만) : ");
            menuSelected = sc.nextInt();
            switch (menuSelected) {
                case 1:
                    System.out.println("책 정보를 입력합니다.");
                    System.out.print("청구 번호 입력 : ");
                    bookCode = sc.next();
                    sc.nextLine();
                    System.out.print("책 이름 입력 : ");
                    bookName = sc.nextLine();
                    System.out.print("책 저자 입력 : ");
                    bookAuthor = sc.nextLine();
                    System.out.print("출판사 입력 : ");
                    bookPublisher = sc.nextLine();
                    System.out.print("서가 번호 입력(000~999) : ");
                    bookClass = sc.next();
                    System.out.print("발행년도 입력 : ");
                    bookYear = sc.next();

                    dto = new BookDTO(bookCode, bookName, bookAuthor, bookPublisher, bookClass, bookYear);

                    idao.insertBook(dto);
                    break;
                case 2:
                    System.out.println("책 정보를 삭제합니다.");
                    System.out.print("청구 번호 입력 : ");
                    bookCode = sc.next();
                    idao.deleteBook(bookCode);
                    break;
                case 3:
                    System.out.println("전체 책 정보를 조회합니다.");
                    List<BookDTO> ar = idao.getAllBooks();
                    if(ar.isEmpty()) { //isEmpty 활용하기
                        System.out.println("등록된 책이 없습니다.");
                    } else {
                        for (BookDTO book : ar) {
                            System.out.println("(" + book.getBookClass() + ") 도서명:" + book.getBookName() + ", 저자:" + book.getBookAuthor() + ", 출판사:" + book.getBookPublisher() + ", 발행년도:" + book.getBookYear() + ", 청구번호:" + book.getBookCode());
                        }
                    }
                    break;
                case 4:
                    System.out.println("책 정보를 조회합니다.");
                    System.out.print("찾을 책 제목 : ");
                    bookName = sc.nextLine();
                    bDTO = idao.SearchBook(bookName);
                    if(bDTO == null) {
                        System.out.println("해당 제목의 장서가 조회되지 않습니다.");
                    } else {
                        System.out.println("****" + bookName + " 정보 ****");
                        System.out.println("(" + bDTO.getBookClass() + ") 도서명:" + bDTO.getBookName() + ", 저자:" + bDTO.getBookAuthor() + ", 출판사:" + bDTO.getBookPublisher() + ", 발행년도:" + bDTO.getBookYear() + ", 청구번호:" + bDTO.getBookCode());
                    }
                    break;
                case 5:
                    System.out.println("책 정보를 수정합니다.");
                    System.out.print("수정할 책 청구 번호 입력 : ");
                    bookCode = sc.next();
                    bDTO = idao.SearchBook(bookCode);
                    System.out.println();

                    System.out.print("청구 번호 입력 : ");
                    bookCode = sc.next();
                    sc.nextLine();
                    System.out.print("책 이름 입력 : ");
                    bookName = sc.nextLine();
                    System.out.print("책 저자 입력 : ");
                    bookAuthor = sc.nextLine();
                    System.out.print("출판사 입력 : ");
                    bookPublisher = sc.nextLine();
                    System.out.print("서가 번호 입력(000~999) : ");
                    bookClass = sc.next();
                    System.out.print("발행년도 입력 : ");
                    bookYear = sc.next();

                    dto = new BookDTO(bookCode, bookName, bookAuthor, bookPublisher, bookClass, bookYear);

                    idao.updateBook(dto);
                    break;

                case 6 :
                    System.out.println("종료합니다.");
                    break;
                default:
                    System.out.println("다시 입력해주세요.");

            }
        } while(menuSelected != 6);

        sc.close();


    }
}
