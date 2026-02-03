package ch08.sec03;

class Super {
    int x;
    int y;

    public Super() {
        x = 50;
        y = 5;
    }

        }

class Sub extends Super {
    int x;
    int y;

    public Sub(){
        x = 10;
        y = 15;
    }
    public void show(){
        System.out.println("x : " + x);
        System.out.println("super x : " + super.x);
        System.out.println("this y : " + this.y);
    }
}

public class SuperEx {
    public static void main(String[] args) {

    }
}
