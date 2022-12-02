package JavaBasic.IO.file;

import org.junit.jupiter.api.Test;

import java.io.File;

public class FileInformation {
    public static void main(String[] args) {

    }
    @Test
    public void Info(){
        File file = new File("D:\\file01.txt");
        String name = file.getName();
        System.out.println("文件名称"+name);
        System.out.println("文件绝对路径"+file.getAbsolutePath());
        System.out.println("父目录"+file.getParent());
        System.out.println("是否存在"+file.exists());
        System.out.println("是否是正常文件"+file.isFile());
        System.out.println("是否是目录"+file.isDirectory());
        System.out.println("文件大小（byte）"+file.length());



    }
}
