package JavaBasic.Wrapper;

public class mixBoxandOpenBox {
    public static void main(String[] args) {
//    装箱和拆箱(其他类型同理)
//     jdk5之前手动装箱  int  -> Integer
        int n1 =100;
        Integer integer1 = new Integer(n1);
        Integer integer2 = Integer.valueOf(50);
        System.out.println(integer1 + " " +integer2);//100  50
//        手动拆箱   Integer -> int
        int n2 = integer2.intValue();
        System.out.println(n2);//50

//        jdk5之后自动装箱和拆箱
//        自动装箱
        int n3 =200;
        Integer integer3 = n3;
        System.out.println(integer3);//200 底层逻辑仍是  integer.valueOf()
//        自动拆箱
        int n4 = integer2;
        System.out.println(n4);//50  底层仍是  integer.intValue()

    }
}
