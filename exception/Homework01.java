package JavaBasic.exception;

public class Homework01 {
    public static void main(String[] args) {
        try {
            //缺少命令行参数
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            double res = cal(i, j);
            System.out.println("结果为：" + res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("除数不应为0");
        } catch (NumberFormatException e) {
            System.out.println("参数格式错误，需输入整数");
        }
    }
    public static double cal(int i, int j) {
        return i / j;
    }
}