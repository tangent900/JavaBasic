package JavaBasic.EqualExercises;
/*
    题目：
    判断两个Person对象的各个属性是否相同
 */
public class E01 {
    public static void main(String[] args) {
        Person p1 = new Person("Lily", 10, '女');
        Person p2 = new Person("Lily", 10, '女');
        System.out.println(p1.equals(p2));
//        System.out.println("444".equals("45") );




    }
}

class Person{
    private String name;
    private int age;
    private char gender;
    //重写equals()方法
    public boolean equals(Object obj){
        if(this  == obj){//调用哪个对象this指的就是谁
            return true;
        }
        if(obj instanceof Person ){
            //是人 才进行比较
            Person objPerson = (Person)obj;
            /*
            return this.name.equals(objPerson.name) ...
             */
            return objPerson.name.equals(getName())
                    && objPerson.age == getAge()
                    && objPerson.gender == getGender();
        }
        return true;




    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public String info(){
        return "名称为"+getName() +"年龄为"+getAge() +"性别为"+getGender();
    }

}
