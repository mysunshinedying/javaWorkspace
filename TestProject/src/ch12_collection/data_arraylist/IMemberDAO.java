package ch12_collection.data_arraylist;

import java.util.ArrayList;
import java.util.List;

//컨트롤러와 DAO의 중간자 역할을 진행함
public interface IMemberDAO {
    //회원 등록 : 1명의 회원 정보를 받아서 DB에 저장하고 반환값 없음
    public void insertMember(MemberDTO dto);

    //회원 정보 삭제 : 회원의 아이디(memId)를 전달받아서
    //DB에서 해당되는 회원 찾아서 삭제 종료 반환값 없음

    public void deleteMember(String memId);

    //전체 회원 정보 조회
    //DB(회원 테이블)에서 전체 회원 정보를 반환
    //회원 여러명 : MemberDTO 타입의 인스턴스 여러 개 저장 -> ArrayList(배열은 처음부터 크기가 고정되어야하여 부적절함,
    // 가변 배열처럼 사용 가능한 ArrayList 사용)
    public List<MemberDTO> getAllMember();

    //한명의 회원 정보를 조회
    //memId를 전달받아서 db에서 검색 후 회원 한 명의 정보(memberDTO)를 반환하는 메서드
    public MemberDTO SearchMember(String memId);

    //회원 정보 수정
    //memId를 전달받아서 db에서 회원 정보 수정 후 종료 반환값 없음
    public void updateMember(MemberDTO dto);
}
