package JavaBasic.IO.stream.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_ {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Java8\\class_exexcise\\E6.java";
        BufferedReader bR = new BufferedReader(new FileReader(path));
        String line;
        //br.readLine()是按照每行依次读取，输出的是该行内容
        //当return null时，读到了末尾
        while((line = bR.readLine() )!=null){
            System.out.println(line);
        }
        //关闭时仅需关闭外层流
        bR.close();


    }
}
