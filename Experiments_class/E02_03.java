package JavaBasic.Experiments_class;

import java.util.Date;

public class E02_03 {
    public static void main(String[] args) {
        System.out.println("曾繁宇");
        System.out.println(new Date());

        A a = new A();
        a.setB(100);//【代码5】      // 通过类名操作类变量b，并赋值100
        a.inputB();//【代码6】      // 通过类名调用方法inputB( )
        A cat=new A( );
        A dog=new A( );
       cat.setA(200);//【代码7】     // cat调用方法setA(int a)将cat的成员a的值设置为200
       cat.setB(400);//【代码8】     // cat调用方法setB(int b)将cat的成员b的值设置为400
       dog.setA(200);//【代码9】     // dog调用方法setA(int a)将dog的成员a的值设置为200
       dog.setB(900);//【代码10】    // dog调用方法setB(int b)将dog的成员b的值设置为900
	   cat.inputA();//【代码11】    // cat调用inputA( )
       cat.inputB();//【代码12】    // cat调用inputB( )
       dog.inputA();//【代码13】    // dog调用inputA( )
       dog.inputB();//【代码14】    // dog调用inputB( )

    }
}
class A {
    private float a;//【代码1】         //声明一个实例float变量a
    private static float b;//    【代码2】   //声明一个static的float变量b
    void setA(float a) {
      this.a =a;//【代码3】      // 将参数a的值赋值给成员变量a
    }
    void setB(float b){
     this.b = b;// 【代码4】      // 将参数b的值赋值给成员变量b
    }
    float getA( ) {
        return a;
    }
    float getB( ) {
        return b;
    }
    void inputA( ) {
        System.out.println(a);
    }
    static void inputB( ){
        System.out.println(b);
    }
}

