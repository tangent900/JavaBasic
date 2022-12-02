package JavaBasic.Exercise;

public class PointE9 {
    public static void main(String[] args) {
        new LabeledPoint("Black Thurday",1929,230.07);
    }
}

class Point{//生成一个点
    private double px;//x坐标
    private double py;//y坐标

    public Point(double px, double py) {
        this.px = px;
        this.py = py;
    }
}

class LabeledPoint extends Point{
    private String label;



    public LabeledPoint(String label, double px, double py) {
        super(px, py);
        this.label = label;
        System.out.println("标签为"+label+" x,y坐标"+px+","+py);
    }
}