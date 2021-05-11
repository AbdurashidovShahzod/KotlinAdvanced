package thread.main3;

public class Main {
    public static void main(String[] args) {
        Circle1 circle = new Circle1(4);
        circle.show();

    }
}
class Circle1 {
    int radius;

    Circle1(int radius) {
        this.radius = radius;
    }

    void show() {
        System.out.println("yuzasi   :" + 3.14*radius*radius);

    }
    void getPeremetr(){
        System.out.println("peremetr  :" + 2*3.14*radius);
    }

}