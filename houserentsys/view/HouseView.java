package JavaBasic.houserentsys.view;

import JavaBasic.houserentsys.domain.House;
import JavaBasic.houserentsys.service.HouseService;
import JavaBasic.utils.Utility;

/**
 * 主菜单中显示用户进入系统之后看到的界面
 * do-while循环
 * 创建新的变量loop控制循环
 */
public class HouseView {
    private boolean loop = true;
    private char c = ' ';
    //调用HouseService.class
    private HouseService houseService= new HouseService(10);

    public void mainNemu() {
        do {
            System.out.println("===========房屋出租系统菜单==============");
            System.out.println("\t\t\t1 新增房源");
            System.out.println("\t\t\t2 查找房源");
            System.out.println("\t\t\t3 删除房屋信息");
            System.out.println("\t\t\t4 修改房屋信息");
            System.out.println("\t\t\t5 房屋列表");
            System.out.println("\t\t\t6 退   出");
            System.out.print("请输入你的选择(1-6):");
            c = Utility.readChar();
            switch (c) {
                case '1'://新增
                    System.out.println("新增");
                    break;
                case '2'://查找
                    System.out.println("查找");
                    break;
                case '3'://删除
                    System.out.println("删除");
                    break;
                case '4'://修改
                    System.out.println("修改");
                    break;
                case '5'://房屋列表
                    listHouses();
                    break;
                case '6'://退出
                    System.out.println("退出");//退出4
                    loop = false;//退出系统
                    break;
            }

        } while (loop);
        System.out.println("你已退出系统");
    }

    public void listHouses(){
        System.out.println("==============房屋列表==================");
        System.out.println("编号\t\t姓名\t\t号码\t\t地址\t\t月租\t\t状态(已出租/未出租)");
        //调用HouService.class中的House[]
        House[] houses = houseService.list();
        //House.class中以及写出toString方法，so可以直接输出对象即可
        for (int i = 0; i < houses.length; i++) {

            if (houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("==============房屋列表完成==================");

    }


}
