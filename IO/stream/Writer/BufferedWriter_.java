package JavaBasic.IO.stream.Writer;

import java.io.*;

public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        //attn:要在源文件内容下追加，改动new FileWriter(filePath,true)
        String filePath = "d:\\ok.txt";
        BufferedWriter bW = new BufferedWriter(new FileWriter(filePath));
        bW.write("Will you like them,");
        bW.newLine();//插入一个和系统相关的换行符
        bW.write("abandon me.");
        bW.newLine();
        bW.write("will you?");
        bW.close();
    }
}
