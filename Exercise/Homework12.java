package JavaBasic.Exercise;

public class Homework12 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jack", '男', 20, "数分", 20000);
        Employee employee2 = new Employee("Lily", '女', 18);
        Employee employee3 = new Employee("会计", 88888);
        Employee employee = new Employee(null, '男', 0);


    }
}

class Employee {
    //名字，性别，年龄，职位，月薪
    String name;
    char sex;
    int age;
    String job;
    double salary;

    public Employee(String job, double salary) {
        this.job = job;
        this.salary = salary;
        System.out.println("该员工信息如下");
        System.out.println("职位" + job + "月薪" + salary);
    }

    public Employee(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        if (age > 0 && age < 200) {
            this.age = age;
        } else {
            System.out.println("您的年龄输入有误(1-199)");
        }
    }

    public Employee(String name, char sex,
                    int age, String job, double salary) {
        //复用构造器
        this(name,sex,age);

        this.job = job;
        this.salary = salary;
        System.out.println("该员工信息如下");
        System.out.println("名字" + name + "性别" + sex +
                "年龄" + age + "职位" + job + "月薪" + salary);
    }





}
