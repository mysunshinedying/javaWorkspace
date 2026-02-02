package ch06.sec07;

public class Final {
    final String nation = "Korea";
    final String ssn; // 생성될 때 부여
    String name;

    public Final(String name, String ssn){
        this.ssn = ssn; //상수 초기화
        this.name = name;

    }
}
