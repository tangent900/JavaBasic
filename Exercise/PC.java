package JavaBasic.Exercise;

public class PC extends Computer {
    public static void main(String[] args) {

    }
    private String brand;//品牌

    public PC(String CPU, String RAM, String hardDisk, String brand) {
        super(CPU, RAM, hardDisk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printInfo(){
        System.out.println("PC信息如下：");
        System.out.println(getDetials() +  " brand= " +brand);
    }
}
