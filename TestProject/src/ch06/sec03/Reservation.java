package ch06.sec03;

public class Reservation {
    String flight, name, departure, arrival, seatNo;
    int price;

    //생성자 함수 오버로딩
    //인스턴스 생성 시 단 한번 호출, 객체구성용도, 개발자 입장에서는 초기화 목적
    //기본 생성자 함수 : 명시적 생성자 함수가 없으면 자동 삽입

    public Reservation() { //빈 객체 생성 용도 = 기본 생성자 함수

    }

    public Reservation(String flight, String name, String departure, String arrival, int price, String seatNo){
        this.flight = flight;
        this.name = name;
        this.departure = departure;
        this.arrival = arrival;
        this.price = price;
        this.seatNo = seatNo;

    }

    public void showRsvInfo(){
        System.out.println("**항공권 예약 정보**");
        System.out.println("항공기 : " + flight);
        System.out.println("예약자 : " + name);
        System.out.println("출발지 : " + departure);
        System.out.println("도착지 : " + arrival);
        System.out.println("금액 : " + price);
        System.out.println("좌석 번호 : " + seatNo);
    }
}
