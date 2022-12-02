package JavaBasic.exception;

import java.util.Scanner;

/**
 * 如果一个用户输入的不是整数，则提醒他反复输入，直到输入一个整数为止
 */
public class E1plus {
    public static void main(String[] args) {
        while(true) {
            System.out.println("请输入一个整数");
            Scanner scanner = new Scanner(System.in);
            try {
                int num = Integer.parseInt(scanner.next());
                System.out.println("输入正确，您输入的整数为："+num+"\n"
                        +"退出程序");
                break;
            } catch (Exception e) {
                System.out.println("输入有误，请重新输入");
            }
        }


    }
}
