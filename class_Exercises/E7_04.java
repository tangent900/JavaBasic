package JavaBasic.class_Exercises;

import java.io.*;

//4. 从文件f1和f2依次读取一行写入文件f3。
// 如果其中一个读取完毕则将另一个文件的剩余部分全部写入f3
public class E7_04 {
    public static void main(String[] args) {
//        String resPath = "D:\\student.txt";
//        String resPath2 = "D:\\student2.txt";
//        String desPath = "D:\\student3.txt";
//        String readLine = null;
//        String readLine2 = null;
//        BufferedReader bufferedReader = null;
//        BufferedReader bufferedReader2 = null;
//        BufferedWriter bufferedWriter = null;
//
//        try {
//            bufferedReader = new BufferedReader(new FileReader(resPath));
//            bufferedReader2 = new BufferedReader(new FileReader(resPath2));
//            bufferedWriter = new BufferedWriter(new FileWriter(desPath));
//            while (((readLine = bufferedReader.readLine()) != null)
//                    || ((readLine2 = bufferedReader2.readLine()) != null)) {
//                //三种情况：f1、f2均没写完，只f1写完，只f2写完
//                if(readLine  != null && readLine2 != null){
//                    bufferedWriter.write("1"+readLine);
//                    bufferedWriter.newLine();
//                    bufferedWriter.write("2"+readLine2);
//                    bufferedWriter.newLine();
//                }
//                if (readLine  != null && readLine2 == null) {
//                    bufferedWriter.write("1"+readLine);
//                    bufferedWriter.newLine();
//                }
//                if (readLine2  != null && readLine == null) {
//                    bufferedWriter.write("2"+readLine2);
//                    bufferedWriter.newLine();
//                }
//            }
//            System.out.println("拷贝成功");
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                bufferedReader.close();
//                bufferedReader2.close();
//                bufferedWriter.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        FileReader in1 = null;
        FileReader in2= null;
        FileWriter out=null;
        BufferedReader bin1=null;
        BufferedReader bin2=null;
        BufferedWriter bout=null;
        try {
            in1= new FileReader("D:\\student.txt");
            in2= new FileReader("D:\\student2.txt");
            out= new FileWriter("D:\\student3.txt");
            bin1= new BufferedReader(in1);
            bin2= new BufferedReader(in2);
            bout= new BufferedWriter(out);
            String s=null;
            int line=0;
            boolean flag1=false,flag2=false;
            while(!flag1&&!flag2) {
                if((s=bin1.readLine())!=null){
                    bout.write("1"+s);
                    bout.newLine();
                }else
                    flag1=true;

                if((s=bin2.readLine())!=null){
                    bout.write("2"+s);
                    bout.newLine();
                }else
                    flag2=true;
            }
            while(!flag1) {
                if((s=bin1.readLine())!=null) {
                    bout.write("1"+s);
                    bout.newLine();//
                }else
                    flag1=true;
            }
            while(!flag2) {
                if((s=bin2.readLine())!=null) {
                    bout.write("2"+s);
                    bout.newLine();
                }else
                    flag2=true;
                System.out.println(line);
            }
            System.out.println("拷贝完毕");
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                bout.flush();
                bout.close();
                in1.close();
                in2.close();
                out.close();
            }catch(IOException e){
                System.out.println(e.getMessage());
            }

        }
    }

    }

