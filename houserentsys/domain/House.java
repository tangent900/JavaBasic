package JavaBasic.houserentsys.domain;
/**
 *一个house代表一个房屋，包括房屋的各个信息
 * 样式： 2     none    116     昌平区     5000    已出租2
 */
public class House {
    private int number;//编号
    private String name;
    private String phone;
    private String address;
    private double rent;//月租
    private String mode;//状态（未出租/已出租）

    public House(int number, String name, String phone, String address, double rent, String mode) {
        this.number = number;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.rent = rent;
        this.mode = mode;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    //输出格式化
//         编号   姓名     号码     地址       月租      状态(已出租/未出租)
//    样式： 2     none    116     昌平区     5000    已出租
    public String toString() {
        return number +
                "\t\t" + name +
                "\t" + phone +
                "\t\t" + address +
                "\t\t" + rent +
                "\t\t" + mode;
    }
}
