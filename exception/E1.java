package JavaBasic.exception;

import java.util.Scanner;

/**
 * 如果一个用户输入的不是整数，则提醒他反复输入，直到输入一个整数为止
 */
public class E1 {
    public static void main(String[] args) {
        E1 e1 = new E1();
        e1.charge();



    }
    public void charge(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入整数");
        String content = myScanner.next();
        while(true){
            try {
                int num = Integer.parseInt(content);
                System.out.println("你输入的整数为："+num);
                System.out.println("输入正确，退出程序~");
                break;

            } catch (Exception e) {
                System.out.println("请重新输入，需为整数");
                new E1().charge();
            }

        }
    }
}
