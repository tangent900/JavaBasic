package JavaBasic.String;

public class Methods {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 ="world";
        String s3 = s1.concat(s2);
        System.out.println("s3="+s3);//s3=helloworld

//        JavaBasic.String s1 = "hello";
        char[] ch = s1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]+" ");
        }//h e l l o
        System.out.println();

        System.out.println(s1.compareTo(s2));

        String s ="java,and,hello,java  ";
//        JavaBasic.String sReplace = s.replace("java","python");
//        System.out.println(sReplace);//python and hello python
        String[] sArr = s.split(",");
        for (int i = 0; i < sArr.length; i++) {
            System.out.print(sArr[i]+" ");
        }//java and hello java

    }
}
