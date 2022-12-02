package JavaBasic.class_Exercises;

import java.util.Date;

/*
1. 编写程序实现以下逻辑。
① 类Animal具有一个实例方法cry。
② 类Dog继承Animal，并实现cry方法。
③ 类Cat继承Animal并实现cry方法。
编写测试类，分别实现利用上转型实现多态，利用Animal类参数实现多态。

 */
public class E04_01 {
//    public void run(Animal animal){
//        animal.cry();
//    }
    public static void main(String[] args) {
        System.out.println("曾繁宇");
        System.out.println(new Date());
//        E04_01 e04_01 = new E04_01();
//        e04_01.run(new Dog());

        Animal animal = new Animal();
        animal.cry();
        Animal cat = new Cat();//向上转型
        cat.cry();
        Animal dog = new Dog();
        dog.cry();
    }
}

class Cat extends Animal {
    public void cry() {
        System.out.println("Cat Miao~");
    }
}

class Dog extends Animal {
    public void cry() {
        System.out.println("Dog Wang~");
    }
}