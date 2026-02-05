package ch12_collection.data_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberControllerMain {
    public static void main(String[] args) {

        //변수 생성
        String id, pass, name, phone, address;
        Scanner sc = new Scanner(System.in);
        MemberDTO dto = null;
        IMemberDAO idao = null;
        int menuSelected;

        do {
            System.out.println("--------------------------------------------------------------");
            System.out.println("\t메뉴를 선택하세요.");
            System.out.println("\t1.회원가입\t2.회원탈퇴\t3.회원 전체 조회\t4.회원 조회\t5.회원 정보 수정\t6.종료");
            System.out.println("--------------------------------------------------------------");
            System.out.print("메뉴 선택(번호만) : ");

            menuSelected = sc.nextInt();

            switch (menuSelected) {
                case 1:
                    //회원 등록
                    //회원 정보 입력 받기
                    System.out.println("회원 정보를 입력합니다.");
                    System.out.println("id 입력 : ");
                    id = sc.next();
                    System.out.println("Pass 입력 : ");
                    pass = sc.next();
                    System.out.println("이름 입력 : ");
                    name = sc.next();
                    System.out.println("전화번호 입력 : ");
                    phone = sc.next();
                    System.out.println("주소 입력 : ");
                    address = sc.next();

                    //회원 등록 모듈
                    //1. dto 객체 생성
                    dto = new MemberDTO(id, pass, name, phone, address);
                    idao = new MemberDAO();
                    idao.insertMember(dto);
                    break;

                case 2:
                    //회원 탈퇴
                    System.out.println("회원 정보를 삭제합니다.");
                    System.out.println("id 입력 : ");
                    id = sc.next();
                    idao.deleteMember(id);

                    break;

                case 3:
                    //전체 회원 조회
                    System.out.println("전체 회원정보를 조회합니다.");
                    List<MemberDTO> ar = idao.getAllMember();
                    if(ar.isEmpty()) { //isEmpty 활용하기
                        System.out.println("조회할 회원이 없습니다.");
                    } else {
                        for (MemberDTO mem : ar) {
                            System.out.println(mem.getMemId() + "\t" + mem.getMemPass() + "\t"
                                    + mem.getMemName() + "\t" + mem.getMemPhone() + "\t" + mem.getMemAddress());
                        }
                    }
                    break;

                case 4:
                    //한명 회원 조회
                    System.out.println("회원 정보를 조회합니다.");
                    System.out.println("id 입력 : ");
                    id = sc.next();
                    MemberDTO mDTO = idao.SearchMember(id);
                    if (mDTO == null) {
                        System.out.println("해당 ID의 회원이 조회되지 않습니다.");
                    } else {
                        System.out.println("****" + id + "회원 정보 ****");
                        System.out.println(mDTO.getMemId() + "\t" + mDTO.getMemPass() + "\t"
                                + mDTO.getMemName() + "\t" + mDTO.getMemPhone() + "\t" + mDTO.getMemAddress());
                    }

                    break;

                //회원정보 수정
                //수정할 회원 정보 출력

                case 5:
                    System.out.println("회원 정보를 수정합니다.");
                    System.out.println("수정 회원 id 입력 : ");
                    id = sc.next();
                    mDTO = idao.SearchMember(id);
                    if (mDTO == null) {
                        System.out.println("해당 ID의 회원이 조회되지 않습니다.");
                    } else {
                        System.out.println("****" + id + "회원 정보 ****");
                        System.out.println(mDTO.getMemId() + "\t" + mDTO.getMemPass() + "\t"
                                + mDTO.getMemName() + "\t" + mDTO.getMemPhone() + "\t" + mDTO.getMemAddress());

                        //수정 내용을 입력 받기
                        System.out.println("Pass 입력 : ");
                        pass = sc.next();
                        System.out.println("이름 입력 : ");
                        name = sc.next();
                        System.out.println("전화번호 입력 : ");
                        phone = sc.next();
                        System.out.println("주소 입력 : ");
                        address = sc.next();

                        //수정할 내용의 객체
                        dto = new MemberDTO(id, pass, name, phone, address);
                        idao.updateMember(dto);

                    }
                    break;
                case 6 :
                    System.out.println("종료합니다.");
                    break;
                default:
                    System.out.println("다시 입력해주세요.");

            }
        } while(menuSelected != 6);

    }
}
