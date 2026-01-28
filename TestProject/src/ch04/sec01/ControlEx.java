package ch04.sec01;
import java.util.Scanner;

public class ControlEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int productNum, sellCount, price, discount;
        String productName;

        System.out.println("******* 상품 정보 *******");
        System.out.println("1 노트북 : 1,200,000 원");
        System.out.println("2 디지털카메라 : 400,000 원");
        System.out.println("*************************");
        System.out.print("상품 번호 입력 : ");
        productNum = sc.nextInt();

        if(!(productNum == 1 || productNum == 2)){
            System.out.println("잘못 입력하였습니다. 종료합니다.");
        } else {
            System.out.print("주문 수량 입력 : ");
            sellCount = sc.nextInt();

            switch (productNum) {
                case 1:
                    price = 1_200_000;
                    productName = "노트북";
                    break;
                case 2:
                    price = 400_000;
                    productName = "디지털카메라";
                    break;
                default:
                    price = 0;
                    productName = "";
            }

            int totalSell = price * sellCount;

            if(totalSell >= 1000000) {
                discount = (int)(totalSell * 0.1);
            } else if(totalSell >= 500000) {
                discount = (int)(totalSell * 0.05);
            } else {
                discount = 0;
            }

            final int totalBill = totalSell - discount;

            System.out.println("******* 주문 내용 *******");
            System.out.println("상품명 : " + productName);
            System.out.println("가격 : " + price + "원");
            System.out.println("주문 수량 : " + sellCount + "개");
            System.out.println("주문액 : " + totalSell + "원");
            System.out.println("할인액 : " + (int)discount + "원");
            System.out.println("총 지불액 : " + totalBill + "원");

        }

        sc.close();
    }
}
