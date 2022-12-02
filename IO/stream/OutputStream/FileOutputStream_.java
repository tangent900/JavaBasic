package JavaBasic.IO.stream.OutputStream;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;

public class FileOutputStream_ {
    public static void main(String[] args) {

    }
    //使用FileOutputStream创建新的文件并写入数据
    //如果该path没有该文件，则创建再写入
    @Test
    public void m(){
        String filePath = "d:\\helloOut.txt";
        FileOutputStream fileOutputStream;
        try {
            //可以发现：该方法直接将之前写入的信息覆盖，
            // 若想在后面追加，
            // 将以下fileOutputStream = new FileOutputStream(filePath);改为
            fileOutputStream = new FileOutputStream(filePath,true);
            //append 参数 确定是否继续追加
//            fileOutputStream = new FileOutputStream(filePath);
            //FirstWay:fileOutPutStream.write(byte b)
//            fileOutputStream.write('a');
            //SecondWay:fileOutPutStream.write(byte[] b)
            String str = "hello,world";
            //str.getBytes()  str --> byte[]
//            fileOutputStream.write(str.getBytes());
            //ThirdWay: fileOutPutStream.write(byte[] b,int off,int len)
            //off为偏移量，指从第几个开始
            fileOutputStream.write(str.getBytes(),0,5);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

    }
}
