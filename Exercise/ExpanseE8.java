package JavaBasic.Exercise;

public class ExpanseE8 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(0);
        checkingAccount.deposit2(100);//0+100-1
        checkingAccount.withdraw(8);//99-8-1
        System.out.println(checkingAccount.getBalance());


    }
}

class BankAccount{
    private int balance;
    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }
    public void  deposit(double amount){//存入  数量
        balance += amount;
    }
    public void  withdraw(double amount){//取出  数量
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}

//建立新类，每次存入或支出收取一美金手续费
class CheckingAccount extends BankAccount{
    public CheckingAccount(int initialBalance) {
        super(initialBalance);
    }

    public void  deposit2(double amount){//手续费1元
        super.deposit( amount - 1);//每次存款时少1元
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount  + 1);//每次取款时多取1元，但是那1元没有到自己手里
    }
}
/*
扩展新类，有利息产生
 */
class SavingsAccount extends BankAccount{
    /*独有属性
        利率 rate  存款或取款次数 count
     */
    private int count = 3;
    private double rate = 0.01;

    public SavingsAccount(int initialBalance) {
        super(initialBalance);
    }


    public void earnMouthlyInterest(){//利息

    }


}