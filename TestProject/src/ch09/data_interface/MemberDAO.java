package ch09.data_interface;

import java.util.ArrayList;

public class MemberDAO implements IMemberDAO {
    @Override
    public void insertMember(MemberDTO dto) {
        // dto 활용 db에 저장
        //저장했다고 가정
        System.out.println("회원 가입 성공");
        System.out.println(dto.getMemId() + "\t" + dto.getMemPass() + "\t"
        + dto.getMemName() + "\t" + dto.getMemPhone() + "\t" + dto.getMemAddress());
    }

    @Override
    public void deleteMember(String memId) {
        //memId 활용해서 db에서 삭제를 위한 코드
        //삭제 가정

        System.out.println("회원 정보가 영구 삭제되었습니다.");

    }

    @Override
    public ArrayList<MemberDTO> getAllMember() {
        //모든 회원 정보 반환 받아 MemberDTO에 넣고 ArrayList에 포함해서 리턴
        return null;
    }

    @Override
    public MemberDTO SearchMember(String memId) {
        //회원 검색하여 MemberDTO로 구성해서 리턴
        return null;
    }

    @Override
    public void updateMember(MemberDTO dto) {
        //MemberDTO 활용하여 DB에서 수정
        System.out.println("회원 정보 수정이 완료되었습니다.");
    }
}
