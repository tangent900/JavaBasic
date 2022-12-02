package JavaBasic.houserentsys.view;

/*
在此调用HouseView对象，并调用整体功能
 */
public class HouseRentSysApp {
    public static void main(String[] args) {
        new HouseView().mainNemu();
    }
}


//        测试utils包中Utility类，因为其中方法为静态方法，
//        所以可以直接调用  --classname.methodname
//        char c = Utility.readChar('s');
//        System.out.println("c="+c);
