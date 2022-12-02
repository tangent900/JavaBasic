package JavaBasic.Exercise;

public class StaffE {
    public static void main(String[] args) {

        Staff s1 = new master("Tom", 1000, 10);
        System.out.println(s1.allSalary());

    }
}

class Staff{
    private String name;
    private double dailySalary;//每天工资
    private int doDay;//工作天数  workdays
//分析出还有一个等级属性
    private double grade;

    public Staff() {
    }
    public Staff(String name, double dailySalary, int doDay) {
        this.name = name;
        this.dailySalary = dailySalary;
        this.doDay = doDay;

    }
    //打印员工工资  void
    public double allSalary(){
        return getDailySalary()*getDoDay();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }

    public int getDoDay() {
        return doDay;
    }

    public void setDoDay(int doDay) {
        this.doDay = doDay;
    }


}

class master extends Staff{//Manager
//    有自己独有的属性奖金，但是在生活中奖金并不是固定的，所以构造器中不写，用setter
    public master(String name, double dailySalary, int doDay) {
        super(name, dailySalary, doDay);
    }

    public double allSalary(){
        return super.allSalary()*1.2;

    }
}

class Employee_ extends Staff{
    public Employee_(String name, double dailySalary, int doDay) {
        super(name, dailySalary, doDay);
    }

    public double allSalary(){
        return super.allSalary();
    }
}