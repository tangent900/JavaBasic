package JavaBasic.Exercise;

public class StaffE5 {
    public static void main(String[] args) {
        Employees waiters = new Waiters(1800);//向上转型
        System.out.println(waiters.info());
//Workers、Farmers、Waiters 同理
//Scientists、Teachers同理
        //这到底是Scientists or Employees ？
        Scientists scientists = new Scientists(8000);
        scientists.setEndYearBonus(100000)  ;
        //如何调用Scientist中info
//        System.out.println(Scientists.info());

    }
}

class Employees{
    //有姓名，有带薪月份，默认12，再用setter
    private double salary;

    public Employees(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String info(){
        return "年工资= "+getSalary() *12;
    }
}

//工人、农民、服务生只有基本工资
class Workers extends Employees{
    public Workers(double salary) {
        super(salary);
    }
}

class Farmers extends Employees {//Persant
    public Farmers(double salary) {
        super(salary);
    }
    public String info(){
        return super.info() ;
    }
}

class Waiters extends Employees{
    public Waiters(double salary) {
        super(salary);
    }
    public String info(){
        return super.info() ;
    }
}

//教师还有课酬(元/天)
class Terchers extends Employees{
    private double classSalary;//课酬
    public double getClassSalary() {
        return classSalary;
    }
    public void setClassSalary(double classSalary) {
        this.classSalary = classSalary;
    }

    public Terchers(double salary) {
        super(salary);

    }
    public String info(){
        return super.info() + "全年课酬="+getClassSalary()*365;
    }
}

//科学家还有年终奖
class Scientists extends Employees{
    private double endYearBonus;//年终奖
    public Scientists(double salary) {
        super(salary);
    }
    public double getEndYearBonus() {
        return endYearBonus;
    }
    public void setEndYearBonus(double endYearBonus) {
        this.endYearBonus = endYearBonus;
    }
    public String info(){
        return super.info() + "年终奖="+getEndYearBonus();
    }
}

