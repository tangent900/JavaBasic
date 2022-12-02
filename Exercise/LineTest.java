package JavaBasic.Exercise;

public class LineTest {
    public static void main(String[] args) {
        Line l = new Line(1, 1, 2, 2);
        System.out.println( l.getLength());


    }
}
class Line{
    Point start,end;//两个实例对象

    //四个参数
    public Line(int x1,int y1,int x2,int y2){
         start = new Point(x1,y1);
         end = new Point(x2,y2);

    }
    public double getLength(){
        return Math.sqrt(Math.pow((start.x - end.x),2)
                +Math.pow((start.y - end.y),2)) ;
    }
    class Point{
        int x,y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }


}
