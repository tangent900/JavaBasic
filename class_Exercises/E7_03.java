package JavaBasic.class_Exercises;

import java.io.*;

//3. 将文件student.txt读出，写入文件student.bak文件中，并加上四位行号,形如0001。
//思路：1.使用字符流，BufferedReader  and BufferedWriter 按行读取，读取的每一行为行号
//         2.行号类型 int -->String 前面补零
public class E7_03 {
    public static void main(String[] args) {
        String resPath = "D:\\student.txt";
        String desPath = "D:\\student02.txt";
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        String readline = "";

        try {
            bufferedReader = new BufferedReader(new FileReader(resPath));
            bufferedWriter = new BufferedWriter(new FileWriter(desPath));
            int count = 1;
            while ((readline = bufferedReader.readLine()) != null) {
                String s = String.valueOf(count);
                if (s.length() == 1) {
                    bufferedWriter.write("000" + s + "\t" + readline);//行号+内容
//                     bufferedWriter.write(readline);
                    bufferedWriter.newLine();
                } else if (s.length() == 2) {
                    bufferedWriter.write("00" + s + "\t" + readline);
//                     bufferedWriter.write(readline);
                    bufferedWriter.newLine();
                } else if (s.length() == 3) {
                    bufferedWriter.write("0" + s + "\t" + readline);
//                     bufferedWriter.write(readline);
                    bufferedWriter.newLine();
                } else {
                    bufferedWriter.write(s + "\t" + readline);
//                     bufferedWriter.write(readline);
                    bufferedWriter.newLine();
                }
                count++;

            }
            System.out.println("拷贝完成");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
