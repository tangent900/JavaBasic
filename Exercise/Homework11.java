package JavaBasic.Exercise;

public class Homework11 {
    public static void main(String[] args) {
        Text text = new Text();
        System.out.println(text.Method(text.Method(10,20),100));

    }
}

class  Text{
    public double Method(double a,double b){
        return a+b;

    }

}