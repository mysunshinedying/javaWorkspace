package ch09.book_interface;
//제출은 나중에

import java.util.ArrayList;
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
        BookDTO mDTO = null;

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
                    ArrayList<BookDTO> ar = idao.getAllBooks();
                    System.out.println(ar);
                    break;
                case 4:
                    System.out.println("책 정보를 조회합니다.");
                    System.out.print("청구 번호 입력 : ");
                    bookCode = sc.next();
                    mDTO = idao.SearchBook(bookCode);
                    System.out.println(mDTO);
                    break;
                case 5:
                    System.out.println("책 정보를 수정합니다.");
                    System.out.print("수정할 책 청구 번호 입력 : ");
                    bookCode = sc.next();
                    mDTO = idao.SearchBook(bookCode);
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
