package JavaBasic.String;

/**
 * 1.将字符串指定部分进行反转  abcdef  --> aedcbf
 * 2.编写方法 public static void reverse(String str ,int start,int end)
 *
 *
 * 思路：1.裁剪 从 start 到 end 的 字符串
 *      2.调用StringBuffer，将中间的内容旋转
 */
public class E1 {

    public static void main(String[] args) {
        String str = "abcdef";
//        System.out.println(E1.reverse(str,1,5));
//        System.out.println("交换前"+str);

//        char[]
        System.out.println("交换前"+str);
        try {
             str = reverse02(str, 9, 5);//发现有错
        } catch (Exception e) {//到了catch，输出了错误信息，就return不再继续向下
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("交换后"+str);

    }
    //FirstWay
    public static String reverse(String str,int start,int end){
        //截取对应位置的String
        String strTemp = str.substring(start,end);
        StringBuffer sb = new StringBuffer(strTemp);
        sb.reverse();
        String s = sb.toString();
        return str.substring(0,start) + s + str.substring(end);


    }
    //SencondWay
    public static String reverse02(String str , int start, int end){
        /**
         * 转为字符数组，+双指针,两者一直交换直至i>=j
         *防止报错：先写正确的，再取反
         **/
        char[] chars = str.toCharArray();
        if(!(str != null && start >= 0 && start < end && end<chars.length)){
            throw new RuntimeException("参数不正确");
        }
        char temp =' ';
        for (int i = start,j = end; i < j; i++,j--) {

            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        return new String(chars);

    }

}
