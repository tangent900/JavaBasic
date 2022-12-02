package JavaBasic.Exercise;

public class PrintE13 {
    public static void main(String[] args) {
//        Student_ student1 = new Student_("Tom", '男', 10, "10001");
//        student1.info();
//        System.out.println("=========");
//        Teacher_ teacher = new Teacher_("王飞", '男', 30, 5);
//        teacher.info();

        //可以体现封装的特点
        Teacher_ teacher = new Teacher_("王飞", 30, '男', 5);
        teacher.PrintInfo();
        System.out.println("============");

        Student_ student = new Student_("小明", 15, '男', "00023102");
        student.PrintInfo();

        Person__[] people = new Person__[4];
        people[0] = new Student_("张三", 10, '男', "10086");
        people[1] = new Student_("Lily", 15, '女', "10010");
        people[2] = new Teacher_("Tom", 40, '男', 10);
        people[3] = new Teacher_("Smith", 28, '女', 5);

        System.out.println("排序之前");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
        //按年龄从高到低排序
        Person__ temp;
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - i - 1; j++) {
                if (people[j].getAge() < people[j + 1].getAge()) {
                    temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
        System.out.println("排序之后");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);

        }
        PrintE13 printE13 = new PrintE13();

        for (int i = 0; i < people.length; i++) {
            printE13.useMethod_(people[i]);
        }

    }




    public void useMethod_(Person__ p) {
        if (p instanceof Student_) {
            Student_ ps = (Student_) p;
            System.out.println(ps.study());
        }
        else if (p instanceof Teacher_) {
            Teacher_ pt = (Teacher_) p;
            System.out.println(pt.teach());
        }else{
            System.out.println("do nothing...");
        }

    }

}

class Person__ {
    private String name;
    private int age;
    private char sex;




    public Person__(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person__{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public String info() {
        return "姓名：" + name + "\n年龄：" + age + "\n性别：" + sex;
    }

    public String play() {
        return name + "爱玩";
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student_ extends Person__ {

    private String stu_id;


    @Override
    public String toString() {
        return "Student_{" +
                "stu_id='" + stu_id + '\'' +
                '}' + super.toString();
    }

    public Student_(String name, int age, char sex, String stu_id) {
        super(name, age, sex);
        this.stu_id = stu_id;
    }

    public String info() {
        return super.info() + "\n学号：" + stu_id;


    }

    public String study() {
        return getName()+"承诺，我会好好学习";

    }

    @Override
    public String play() {
        return super.play() + "足球";
    }

    public void PrintInfo() {
        System.out.println("学生的信息");
        System.out.println(info());
        System.out.println(study());
        System.out.println(play());
    }


    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
}

class Teacher_ extends Person__ {
    //封装
    private int work_age;

    public Teacher_(String name, int age, char sex, int work_age) {
        super(name, age, sex);
        this.work_age = work_age;
    }

    @Override
    public String toString() {
        return "Teacher_{" +
                "work_age=" + work_age +
                '}' + super.toString();
    }

    public String info() {
        return super.info() + "\n工龄：" + work_age;
    }

    public String teach() {
        return getName()+"承诺，我会认真教学";
    }

    public String play() {
        return super.play() + "象棋";
    }

    public void PrintInfo() {
        System.out.println("老师的信息");
        System.out.println(info());
        System.out.println(teach());
        System.out.println(play());

    }
}
