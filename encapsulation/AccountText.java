package JavaBasic.encapsulation;

public class AccountText {
    public static void main(String[] args) {
        Account account = new Account("Jack",60,"000000");
        account.info();
        Account account1 = new Account("Jk",6,"0000");

        account1.info();
    }
}
