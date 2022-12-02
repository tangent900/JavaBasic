package JavaBasic.class_Exercises;

import java.io.File;

//1. 显示目录下所有文件的名称及大小。
//思路：显示D:\\下所有文件信息
//        1.到达D盘位置 path = D:\\
//        获得名称和大小file.getName()  file.length()
public class E07_01 {
    public static void main(String[] args) {
        String path = "D:\\java8\\exercise";
//        File file = new File(path);
//        File[] files = file.listFiles();
        File file = new File("D:\\Java8\\exercise");
//        try {
//            for (int i = 0; i < files.length; i++) {
//                if(files[i].isFile()){
//                    System.out.printf("文件名：%s 文件大小：%d%n", files[i].getName(), files[i].length());

//                    System.out.println("文件名称为"+files[i].getName()
//                            +"文件大小为"+files[i].length());
//                }
//                }

//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        }


//        File file = new File("D:\\Java8\\exercise");
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                System.out.printf("文件名：%s 文件大小：%d%n", files[i].getName(), files[i].length());
            }
        }

    }
}
