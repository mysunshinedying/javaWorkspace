package ch12_collection.data_arraylist;

import java.util.ArrayList;
import java.util.List;

public class MemberDAO implements IMemberDAO {
    //db 대신 사용할 저장소 구성 : DB 사용 시에는 회원 정보 집합을 표현할 때 사용
    private List<MemberDTO> listData = new ArrayList<>();

    @Override
    public void insertMember(MemberDTO dto) {
        // dto 활용 db에 저장 대신 ArrayList에 저장
        //id는 중복되면 안 됨 -> 전달된 dto의 memId 값이 이미 저장된 저장된 객체들의 memId와 중복되는 경우 확인
        //List.stream() : 컬렉션에 저장되어 있는 element들을 순회하여 전달된 코드를 처리, stream<T> 객체가 반환
        //Stream.filter() : 반환된 stream 객체에 대한 조건 연산 가능
        //filter(item-> item을 이용한 조건식) ex. filter(member->member.getmemId().equals(dto.getmemId()))
        //findFirst() : filter 조건에 맞는 객체가 찾아지면 객체 반환(Optional 객체로 반환)
        // Optional.orElse(null); //조건에 맞는 객체가 없으면 null 반환

        String tmpId = dto.getMemId();
        MemberDTO optDto = listData.stream().filter(member -> member.getMemId().equals(tmpId))
                .findFirst().orElse(null);
        if(optDto != null) {
            System.out.println("회원 가입 실패 : 동일 ID의 회원이 있습니다.");
        } else {
            listData.add(dto);
            System.out.println("회원 가입 성공");
        }
    }

    @Override
    public void deleteMember(String memId) {
        MemberDTO delDto = listData.stream().filter(member -> member.getMemId().equals(memId))
                .findFirst().orElse(null);

        if(delDto != null){
            listData.remove(delDto);
            System.out.println("회원 정보가 영구 삭제되었습니다.");
        } else {
            System.out.println("해당 id의 회원이 없습니다.");
        }


    }

    @Override
    public List<MemberDTO> getAllMember() {
        //모든 회원 정보 반환 받아 MemberDTO에 넣고 ArrayList에 포함해서 리턴
        return listData;
    }

    @Override
    public MemberDTO SearchMember(String memId) {
        //회원 검색하여 MemberDTO로 구성해서 리턴
        MemberDTO searchDto = listData.stream().filter(member -> member.getMemId().equals(memId))
                .findFirst().orElse(null);
        return searchDto;
    }

    @Override
    public void updateMember(MemberDTO dto) {
        //MemberDTO 활용하여 ArrayList 수정
        // 해당 id의 객체 참조를 추출
        MemberDTO updateDto = listData.stream().filter(member -> member.getMemId().equals(dto.getMemId()))
                .findFirst().orElse(null);

        if(updateDto != null) {
            int idx = listData.indexOf(updateDto); //수정 객체의 idx 반환
            listData.set(idx,dto); //업데이트
            System.out.println("회원 정보 수정이 완료되었습니다.");
        } else {
            System.out.println("회원 정보를 찾을 수 없습니다.");
        }
    }
}
