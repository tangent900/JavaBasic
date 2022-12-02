package JavaBasic.IO.file;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;

/**
 * 创建新的文件
 */
public class File_ {
    public static void main(String[] args) {



    }
    //FirstWay -- new File(String pathname)
    @Test
    public void CreateFile01(){
        String filePath = "D:\\file01.txt";
        File file = new File(filePath);

        //此处产生异常，抛出/catch
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //SecondWay new File(File Parent,String child) 根据父目录 + 子路径
    @Test
    public void createFile02(){
        File parentFile = new File("D:\\");
        String childName = "file02.txt";
        File file = new File(parentFile, childName);

        try {
            file.createNewFile();
            System.out.println("file02创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //ThirdWay new File(String parentPath,String filename)
    @Test
    public void createFile03(){
        String parentPath = "D:\\";
        String filename = "file03.txt";
        File file = new File(parentPath, filename);
        try {
            file.createNewFile();
            System.out.println("file03创建完成");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
