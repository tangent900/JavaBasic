package JavaBasic.encapsulation;

public class Account {



    private String name;
    private double balance;//余额
    private String password;

    public Account() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() == 2 || name.length() == 3 || name.length() == 4) {
            this.name = name;
        } else {
            System.out.println("名字长度必须在2~4之间，给一个默认值他家的猫和狗");
            this.name = "他家的猫和狗";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额需大于20，给一个默认值-1");
            this.balance = -1;
        }
    }

    public String getPassword() {
        return password;
    }

    public Account(String name, double balance, String password) {
        setBalance(balance);
        setName(name);
        setPassword(password);

    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("密码必须为6位，给一个默认值0000");
            this.password = "0000";
        }



    }
    public void info(){

        System.out.println("名字为"+name+"余额为"+balance+"密码为"+password);
    }
}



