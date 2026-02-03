package ch08.sec07;

public class DrawingMain {
    public static void main(String[] args) {
        Line line = new Line();
        line.draw();

        Circle circle = new Circle();
        circle.draw();

        Rect rect = new Rect();
        rect.draw();

        Poly poly = new Poly();
        poly.draw();
    }
}
