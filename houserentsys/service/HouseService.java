package JavaBasic.houserentsys.service;

import JavaBasic.houserentsys.domain.House;

/**
 * 创建House[] 存放house信息
 *
 */
public class HouseService {
   private House[] houses;//基于House.class
    //因为不知道有多少房子，所以利用构造器，在使用该方法时传入参数
    public HouseService(int size){
        houses = new House[size];
//一个house代表一个房屋，包括房屋的各个信息
//  样式： 2     none    116     昌平区     5000    已出租2
        houses[0] = new House(1 ,"Jack","183","北京",3000,"未出租");

    }
    //显示数组的信息
    // 因为在house.class中已经有toString方法，所以直接输出对象即可
    public House[] list(){
           return houses;

    }
}
