package JavaBasic.IO.stream;

import java.io.*;

public class BufferCopyOthers {
    public static void main(String[] args) throws IOException {
        String photopath = "d:\\白底.jpg";
        String desphotopath = "d:\\白底02.jpg";
        byte[] b =new byte[1024];
        BufferedInputStream buffin = new BufferedInputStream(new FileInputStream(photopath));
        BufferedOutputStream bufout = new BufferedOutputStream(new FileOutputStream(desphotopath));
        int read = 0;
        while((read = buffin.read(b)) != -1){
            bufout.write(b,0,read);
        }
        System.out.println("拷贝完成");
        bufout.close();
        buffin.close();



    }
}
