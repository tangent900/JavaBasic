package JavaBasic.Exercise;
/*
    思路：分身份，然后再赋值

 */
public class TeacherE3 {
    public static void main(String[] args) {
//        编译对象 直接为 相应职称就可以
        Teacher teacher1 = new professor("Lily", 30, "教授", 5000);
        System.out.println(teacher1.introduce());
        Teacher teacher2 = new SelfProfessor("Tom", 20, "副教授", 10000);
        System.out.println(teacher2.introduce());

    }
}

class Teacher{
    private String name;
    private int age;
    private  String post;//职称
    private double salary;


    public String introduce(){//基本信息
        return "姓名= "+getName()+"年龄= "+getAge()+"职称= "
                +getPost()+"实际工资= "+getSalary();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }
}

class professor extends Teacher{
    public professor(String name, int age, String post, double salary) {
        super(name, age, post, 1.3*salary);
    }



}

class SelfProfessor extends Teacher{

    public SelfProfessor(String name, int age, String post, double salary) {
        super(name, age, post, 1.2 * salary);

    }
//    public double getSalary() {
//        return super.getSalary();
//    }


    public String introduce(){
        return super.introduce();
    }

}

class Lecturer extends Teacher{
    public Lecturer(String name, int age, String post, double salary) {
        super(name, age, post, 1.1*salary);
    }

    public String introduce(){
        return super.introduce();
    }
}