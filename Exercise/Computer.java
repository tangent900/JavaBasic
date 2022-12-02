package JavaBasic.Exercise;

public class Computer {
    private String CPU;
    private String RAM;//内存
    private String hardDisk;//硬盘

    public Computer(String CPU, String RAM, String hardDisk) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.hardDisk = hardDisk;
    }
    public String getDetials(){
        return "CPU="+CPU+" 内存="+RAM+" 硬盘="+hardDisk;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Computer() {
    }
}
