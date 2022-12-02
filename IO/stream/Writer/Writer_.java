package JavaBasic.IO.stream.Writer;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;


public class Writer_ {
    public static void main(String[] args) {

    }

    @Test
    public void m(){
        String filePath = "d:\\helloWriter.txt";
        FileWriter fileWriter = null;
        String str = "hello,作者";
        char[] ch = str.toCharArray();
        try {
            fileWriter = new FileWriter(filePath,true);
            fileWriter.write(ch,2,4);
            System.out.println("成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
