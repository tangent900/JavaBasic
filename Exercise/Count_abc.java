package JavaBasic.Exercise;

/**
 * 计算出现几次abc
 */
public class Count_abc {
    public static void main(String[] args) {
        String s1 = "abc ss abc dd abc";
        String s2 ="abc";
        int count = 0;
        int pos = 0;
        while ((pos = s1.indexOf("a",pos)) != -1){
//            pos = s1.indexOf("a",pos);
            count++;
            pos += s2.length();
        }
        System.out.println(count);
    }
}
