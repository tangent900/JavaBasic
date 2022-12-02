package JavaBasic.String;
/*
输入一个字符串，判断里面有多少大写字母，小写字母，数字
 */
public class E4 {
    public static void main(String[] args) {
        charge("sdkasldadlsavjpe3123321553FGHJKL:LKHVC");
    }
    public static void charge(String str) {
        if(str  == null){
            System.out.println("不能为空");
        }
        char[] ch = str.toCharArray();
        int cB = 0, cS = 0, cD = 0;//cB计大写，cS记小写，cD记数字

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {//若不转换，str。charAt(i)
                cB += 1;
            } else if (ch[i] >= 'a' && ch[i] <= 'z') {
                cS += 1;
            } else if (ch[i] >= '0' && ch[i] <= '9') {
                cD += 1;

            }

        }
        System.out.print(str + "中大写字母，小写字母，数字分别有");
        System.out.printf("%d个,%d个,%d个", cB, cS, cD);
    }
}
