package JavaBasic.IO.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    拷贝"d:\\培养.jpg" 到d 盘 培养2.jpg
    思路：1.文件输入流 考到程序中
            2. 文件输出流考到磁盘中
 */
public class FileCopy {
    public static void main(String[] args) {
        String filePath = "d:\\培养.jpg";
        String desfilePath = "d:\\培养2.jpg";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        byte[] buf = new byte[1024];
        int readLine = 0 ;
        try {
            fileInputStream = new FileInputStream(filePath);
            fileOutputStream = new FileOutputStream(desfilePath);
            while(( readLine = fileInputStream.read(buf))!= -1){
                //边读边写,读了多少写多少
                fileOutputStream.write(buf,0,readLine);
            }
            System.out.println("拷贝成功");


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileInputStream != null)
                    fileInputStream.close();
                if(fileOutputStream != null)
                    fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}
