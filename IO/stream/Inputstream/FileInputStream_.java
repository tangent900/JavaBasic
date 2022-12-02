package JavaBasic.IO.stream.Inputstream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_ {
    public static void main(String[] args) {

    }
    //用FileInputStream.read()读取二进制文件
    //read()每次读取一个字节，返回(int) 1 ,效率低
    @Test
    public void m1(){
        String filePath = "d:\\hello.txt";
        FileInputStream fileInputStream = null;
        int readData = 0;
        try {//可能filePath所表示的路径下文件不存在
            fileInputStream = new FileInputStream(filePath);
            while((readData = fileInputStream.read()) != -1 ){ //可能该文件中没有内容
                //fileInputStream.read()每次读取一个字节的内容，若返回-1则到了末尾
                System.out.print((char)readData);//int -- > char
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //完成读取之后要关闭文件释放资源
                fileInputStream.close(); //可能关闭未成功
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //read(byte[] b)每次读一个数组长度的数据，返回值为实际读取数据的字节长度
    @Test
    public void m2(){
        String filePath = "d:\\hello.txt";
        FileInputStream fileInputStream = null;
        byte[] b = new byte[8]; //每次最多一次读取8byte长度数据
        int readLine = 0;
        try {//可能filePath所表示的路径下文件不存在
            fileInputStream = new FileInputStream(filePath);
            while((readLine = fileInputStream.read(b)) != -1 ){ //可能该文件中没有内容

                System.out.print(new String(b,0,readLine));
                //解释：1.读8个，再读三个，第一次读取的后面5个并不会被舍弃，所以只转换第二次读取长度的数据
                //将读取到的byte[]形式  -->String  从0 到readLine
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //完成读取之后要关闭文件释放资源
                fileInputStream.close(); //可能关闭未成功
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
