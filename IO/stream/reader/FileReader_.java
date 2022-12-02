package JavaBasic.IO.stream.reader;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReader_ {
    public static void main(String[] args) {

    }
    @Test
    public void m(){
        //读入文件
        String filePath = "d:\\hello.txt";
        int read = 0;

        FileReader fileReader= null;
        try {
            fileReader = new FileReader(filePath);
            while((read = fileReader.read())!= -1){
                System.out.print((char)read); // int -> char
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void m2(){
        //读入文件  read(char[])
        String filePath = "d:\\hello.txt";
        char[] ch = new char[5];
        int read = 0;
        FileReader fileReader= null;
        try {
            fileReader = new FileReader(filePath);
            while((read = fileReader.read(ch))!= -1){
                System.out.print(new String(ch,0,read)); // char[] -> String
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
