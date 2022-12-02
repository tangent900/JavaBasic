package JavaBasic.IO.file;

import org.junit.jupiter.api.Test;

import java.io.File;

public class Directory_ {
    public static void main(String[] args) {

    }
    //判断文件是否存在，若存在删除
    @Test
    public void m1(){
        String filePath = "d:\\file01.txt";
        File file = new File(filePath);
        if(file.exists()){
            if(file.delete()){//file.delete()返回boolean值
                System.out.println(file+"删除成功");
            }else{
                System.out.println("删除失败");
            }
        }else{
            System.out.println("文件不存在");
        }
    }
    //判断目录是否存在，若存在则删除
    //attn:在Java中目录也被当成文件处理
    @Test
    public void m2(){
        String path = "d:\\demo02";
        File file2 = new File(path);
        if(file2.exists()){
            if (file2.delete()){
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
            }
        }else{
            System.out.println("该路径文件不存在");
        }

    }
    //判断d:\\demo\\a\\b\\c 目录是否存在，存在提示，若没有则创建
    @Test
    public void m3(){
        String directoryPath = "d:\\demo\\a\\b\\c";
        File file02 = new File(directoryPath);
        if(file02.exists()){
            System.out.println(directoryPath+"存在");
        }else{
            if(file02.mkdirs()){  //返回boolean值
                // 创建单级目录 mkdir()  只会创建到d:\\demo
                System.out.println("创建成功");
            }else{
                System.out.println("创建失败");

            }
        }

    }

}
