package ch08.sec07;

public abstract class DrawingObject {
    public String penColor;

    //draw() 메서드는 반드시 필요하지만 뭘 할지는 못정함
    //추상 메서드로 구성 - 상속받은 클래스가 draw()를 오버라이드하여 정함
    public abstract void draw();

}