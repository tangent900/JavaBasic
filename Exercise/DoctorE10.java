package JavaBasic.Exercise;

public class DoctorE10 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Lily", 10, "医生", '男', 20000);
        Doctor doctor2 = new Doctor("Lily", 10, "医生", '男', 20000);
        System.out.println(doctor1.equals(doctor2));

    }
}

class Doctor{
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    //重写equals方法
    public boolean equals(Object obj){
        if (this == obj ){
            return true;
        }
        if(obj instanceof Doctor){
            //可以先向下转型
            Doctor doctor = (Doctor)obj;
            //下面 (Doctor)obj 改为 doctor
            return this.name.equals(((Doctor) obj).name)
                    && this.age ==((Doctor) obj).age
                    && this.gender == ((Doctor) obj).gender
                    && this.job.equals(((Doctor) obj).job)
                    && this.sal == ((Doctor) obj).sal;
        }
        return false;
    }

    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
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
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public double getSal() {
        return sal;
    }
    public void setSal(double sal) {
        this.sal = sal;
    }
}