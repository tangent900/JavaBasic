package JavaBasic.Exercise;

public class DistinguishEquals {
    public static void main(String[] args) {
        System.out.println(5 == 10);
        Object s1 = new Object();
        Object s2 = new Object();
        System.out.println(s1 == s2);//f
        System.out.println(s1.equals(s2));//t ->f  开辟了一块新的地址
        System.out.println("JavaBasic/String".equals("JavaBasic/String"));//t
        System.out.println("JavaBasic/String".equals("ss"));//f
        System.out.println("JavaBasic/String" == "JavaBasic/String");//t
    }
/*
    区别 == 和 equals
    引用类型
    == 是否为同一对象
    equals Object类中判断地址是否相同，其他已自动生成的类中判断值是否相同
    普通类型
    == 判断是否值相同
 */

}

