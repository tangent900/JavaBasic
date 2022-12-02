package JavaBasic.SmallChange.OOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
改为OOP模式，所有的功能改为方法

 */
public class SmallChangeSysOOP {
    Scanner scanner = new Scanner(System.in);

    //      part3 收益入账
//        产生的新的变量  收入、余额、时间
    double money = 0;
    double balance = 0;
    Date date = new Date();
    //        形成特定格式  2022-11-02 17：48  使用SimpleDateFormat
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
    //        path2 零钱通明细
    String detial = "---------零钱通明细--------";

    //      path3 消费
//        新的变量 note 消费的理由
    String note;
    //        path4  创建新的变量choice 收用户的选择
//        退出时再询问是否确定退出，回答y/n，只有回答这两个答案是才退出循环
    String choice = "";
    boolean loop = true;

    //显示零钱通菜单
    public void menu() {
        do {//菜单最好用do-while，因为最少显示一次
            System.out.println("\n==========零钱通页面==============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");
            System.out.print("请选择(1-4):");

            System.out.print("请输入你要输入的选项");
            String key = scanner.next();
            switch (key) {
                case "1":
                    this.detial();
                    break;
                case "2":
                    this.makeMoney();
                    break;
                case "3"://消费
                    this.cost();
                    break;
                case "4":
                    //先退出循环
                    this.exit();
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入");
                    break;
            }

        }while(loop);
    }



    //明细
    public void detial() {
        System.out.println(detial);
    }

    public void makeMoney() {
        System.out.print("请输入你的收益入账");
        money = scanner.nextDouble();
        //判断钱数是否合适
        //思路：找出不合适的数字，给出提示 ，打道回府-- 比较简单
        if (money <= 0) {
            System.out.println("你的输入有误，收益需要大于0");
            return;
        }
        balance += money;
        //每进行一次入账才加一次明细
        detial += "\n收益入账\t" + "+" + money + "\t"
                + sdf.format(date) + "\t" + "余额:" + balance;
        return;//无返回值
    }

    //消费
    public void cost() {
        System.out.print("请输入你的消费理由");
        note = scanner.next();
        System.out.print("请输入你的消费金额");
        money = scanner.nextDouble();
        //消费金额不能为负数且消费金额应小于账户中的余额
        if (money < 0 || money > balance) {
            System.out.println("你的消费金额有误，需在0~" + balance + "之间");
            return;
        }
        balance -= money;
//                    拼接
        detial += "\n" + note + "\t\t" + "-" + money + "\t"
                + sdf.format(date) + "\t" + "余额:" + balance;
        return;
    }

    //退出
    public void exit() {
        //先退出循环
        while (true) {
            //询问是否退出
            //放在循环中，每次输入choice之后都会询问
            System.out.print("你确定要退出么y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }

        }
        //再确定退出系统
        //一段代码完成一个小的功能，低耦合，比较好修改
        if ("y".equals(choice)) {
            loop = false;
            System.out.println("您已退出系统");
        }


    }

}
