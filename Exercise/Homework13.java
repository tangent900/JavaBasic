package JavaBasic.Exercise;

public class Homework13 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        double r1 = 4;
        double area1 = circle.findarea(r1);
        System.out.println("半径为"+r1+"的圆形的面积为"+area1);

        Circle circle1 = new Circle();
        PassObject passObject = new PassObject();
            passObject.printAreas(circle1,5);

    }
}
class Circle{
    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double findarea(double radius){//定义面积
        return  Math.PI *radius*radius;

    }
    public void setRadius(double radius){
        this.radius = radius;
    }
}

class PassObject{
    //输出1 ~ times 之间所有整数 的半径及其面积
    public void printAreas(Circle c, int times){
        System.out.println("Radius\tArea");//标题
        for(int i = 1 ;i <= times;i++){
            c.setRadius(i);//使i成为c对象的radius
            System.out.println((double)i+"\t"+c.findarea(i));

        }
    }
}