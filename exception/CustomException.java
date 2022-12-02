package JavaBasic.exception;

/**
 * 年龄在 18 ~ 120 之外抛异常
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 180;
        if(!(age >= 18 && age <= 120)){
            throw new AgeException("你的年龄范围有误");
        }
        System.out.println("你的年龄范围正确");
    }
}

class AgeException extends RuntimeException{
    public AgeException(String message) {//构造器给提示信息
        super(message);
    }
}
























