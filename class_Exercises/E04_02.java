package JavaBasic.class_Exercises;

/*
2. 编写程序实现以下逻辑。
① 抽象类Animal具有一个抽象方法cry。
② 类Dog继承Animal，并实现cry方法。
③ 类Cat继承Animal并实现cry方法。
编写测试类，分别实现抽象类实现多态，利用方法的Animal参数实现多态。

 */
public class E04_02 {
    public void run(Animal02 animal02){
        animal02.cry();
    }

    public static void main(String[] args) {
        E04_02 e04_02 = new E04_02();
        e04_02.run(new Dog02());
        e04_02.run(new Cat02());
        e04_02.run(new Animal02() {//匿名类
            public void cry(){
                System.out.println("Dog02-2 Wang~");
            }
        });

//        Animal02 dog02 = new Dog02();//向上继承
//        dog02.cry();
//        Animal02 cat02 = new Cat02();
//        cat02.cry();

    }
}

class Cat02 extends Animal02 {
    public void cry() {
        super.cry();
        System.out.println("Cat02 Miao~");
    }
}

class Dog02 extends Animal02 {
    public void cry() {
        super.cry();
        System.out.println("Dog02 Wang~");
    }
}