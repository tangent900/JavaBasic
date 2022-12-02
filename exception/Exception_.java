package JavaBasic.exception;

public class Exception_ {
    public static void main(String[] args) {
        int num = 10;
        int num2 = 0;

        try {
            int res = num / num2;
        } catch (Exception e) {
//            e.printStackTrace()
            System.out.println("出现的错误原因为"+e.getMessage());
        }

        //报错之后会引起程序崩溃，不再继续执行  -->解决方法：try-catch
        System.out.println("程序继续执行");
//        int i = 1 ;
//        i = i++;
//        System.out.println(i);

    }
}
