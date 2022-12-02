package JavaBasic.String;

/**
 * * 输入用户名、密码、邮箱、如果信息录入正确，则提示注册成功，否则生成异常对象
 * * 要求：1.用户名长度 2/3/4
 * *     2.密码长度为6，并且要求全为数字
 * *     3.邮箱包含@和. @在.的前面
 * <p>
 * 用 过关斩将 + 异常处理机制
 */
public class E2key {
    public static void main(String[] args) {
        String name = "jaac";
        String pwd = "121236";
        String email = "12@das.";

        try {
            Use(name,pwd,email);
            System.out.println("注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    public static void Use(String name, String pwd, String email) {
        //第一关
        int length = name.length();
        if (!(length >= 2 && length <= 4)) {

            throw new RuntimeException("用户名长度 2/3/4");
        }

        //第二关

        if (!(pwd.length() == 6 && isDigital(pwd))) {
            throw new RuntimeException("密码长度为6，并且要求全为数字");
        }
        //第三关
        int i = email.indexOf("@");
        int j = email.indexOf(".");
        if (!(i > 0  && i < j)) {   // 一般@前还有内容
            throw new RuntimeException("邮箱包含@和. @在.的前面");
        }


    }

    //            创建一个方法判断是否均是数字
    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {  //比较unicode 码
                return false;
            }
        }
        return true;
    }


}



