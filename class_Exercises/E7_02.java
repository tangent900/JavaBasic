package JavaBasic.class_Exercises;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//2. 使用字节流,将文件file.dat复制一份到file2.dat.
public class E7_02 {
    public static void main(String[] args) {
        String recPath = "D:\\file.txt";
        String desPath = "D:\\file02.txt";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        int read = 0;
        byte[] b = new byte[1024];
        try {
             fileInputStream = new FileInputStream(recPath);
             fileOutputStream = new FileOutputStream(desPath);
        while ((read = fileInputStream.read(b)) != -1){
                fileOutputStream.write(b,0,read);
            }
            System.out.println("拷贝成功");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
