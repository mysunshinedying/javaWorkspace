package ch08.constructor_ex;

public class PartTime extends Worker {
    private int hours, unitPrice;

    public PartTime(String joominNo, String name, int unitPrice, int hours) {
        super(joominNo, name);
        this.hours = hours;
        this.unitPrice = unitPrice;
    }

    public int calculatePay() {
        return hours * unitPrice;
    }

    @Override
    public String toString(){
        return super.toString() + "시급 : " + unitPrice + " 원\n근무시간 : " + hours + "시간\n총 지불액 : " + calculatePay() + "원";

    }
}
