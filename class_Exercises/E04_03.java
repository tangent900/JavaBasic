package JavaBasic.class_Exercises;
/*
3. 编写程序实现以下逻辑。
① 接口Animal具有一个抽象方法cry。
② 类Dog实现Animal接口，并实现cry方法。
③ 类Cat实现Animal接口并实现cry方法。
编写测试类，分别实现接口实现多态，利用方法的Animal接口参数实现多态。

 */
public class E04_03 {
    public void run(Animal03 animal03){//与主方法并列的方法
        animal03.cry();
    }
    public static void main(String[] args) {
        E04_03 e04_03 = new E04_03();//创建主类的对象
        e04_03.run(new Cat03());//调用其中的方法
        e04_03.run(new Dog03());
        e04_03.run(new Animal03(){//匿名类
            @Override
            public void cry() {
                System.out.println("匿名类");
                System.out.println("Dog03-2 Wang~");
            }
        });
    }
}
class Dog03 implements Animal03{
    public void cry(){
        System.out.println("Dog03 Wang~");
    }
}
class Cat03 implements Animal03{
    public void  cry(){
        System.out.println("Cat03 Miao~");

    }
}


