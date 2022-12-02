package JavaBasic.IO.stream;

import java.io.*;

public class FileCopyUsingBuff {
    public static void main(String[] args) throws IOException {
        String srcPath = "d:\\ok.txt";
        String desPath ="d:\\ok02.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(srcPath));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(desPath,true));
        String line;
        while ((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}
