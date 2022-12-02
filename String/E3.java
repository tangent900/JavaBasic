package JavaBasic.String;

/**
 * 题目：输入 Han shun Ping的人名，以Ping,Han.S的形式打印出来
 *      .S是中间单词的首字母
 * 思路：Scanner输入人名，按空格分开，再分别截取
 */
public class E3 {
    public static void main(String[] args) {
//        Rename rename = new Rename();
        reName("Zeng fan Yv");


    }

    public static void reName(String name){
        if(name == null){
            System.out.println("名字不能为空");
            return;
        }
        String[] s = name.split(" ");
        if(s.length != 3){
            System.out.println("名字格式不对");
            return;
        }
//        Ping,Han.S
        String format = name.format("%s,%s.%c", s[2], s[0], s[1].toUpperCase().charAt(0));
        System.out.println(format);

//        return s[1] + "," + s[0] + "." + s[2].substring(0,1).toUpperCase();
    }
}

