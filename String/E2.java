package JavaBasic.String;

/**
 * 输入用户名、密码、邮箱、如果信息录入正确，则提示注册成功，否则生成异常对象
 * 要求：1.用户名长度 2/3/4
 *     2.密码长度为6，并且要求全为数字
 *     3.邮箱包含@和. @在.的前面
 */
public class E2 {
    public static void main(String[] args) {
        Uses u1 = new Uses("Tom", "666666", "1966@pp.com");
        System.out.println(u1);
        Uses u2 = new Uses("Jack", "848751", "15.@");
        System.out.println(u2);

    }
}


class Uses{
    private String name;
    private String password;
    private String email;

    public Uses(String name, String password, String email) {
        if(name.length() == 2 ||name.length() == 3 || name.length() == 4) {
            this.name = name;
        }else{
            System.out.println("你的姓名格式输入有误，给一个默认姓名A");
            this.name = "A";
        }


        if(password.length() == 6 ){
            char[] ch = password.toCharArray();
            for (int i = 0; i < ch.length; i++) {
//                全是数字
                if(ch[i] >= '0' && ch[i] <= '9'){
                    this.password = password;
                }
            }

        }else{
            System.out.println("你的密码格式输入有误，给一个默认密码0000");
            this.password = "0000";
        }



        if (email.indexOf("@") != -1 &&
                email.indexOf(".") != -1 &&
                email.indexOf("@") < email.indexOf(".")) {
            this.email = email;
        }else{
            System.out.println("你的邮箱格式输入有误，给一个默认邮箱196.@");
            this.email = "196.@";
        }

    }

    public String getName() {
        return name;
    }

    //约束name    1.用户名长度 2/3/4
    public void setName(String name) {
        if(name.length() == 2 ||name.length() == 3 || name.length() == 4){
            this.name = name;
        }else{
            System.out.println("给一个默认姓名A");
            this.name = "A";
        }
    }

    public String getPassword() {
        return password;
    }
    //2.密码长度为6，并且要求全为数字
    public void setPassword(String password) {
        if(password.length() == 6 ){
            char[] ch = password.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                //全是数字
//                if(int(char[i]) == 0){
//                    this.password = password;
//                }
            }

        }else{
            System.out.println("你的密码格式输入有误，给一个默认密码0000");
            this.password = "0000";
        }
    }

    public String getEmail() {
        return email;
    }
//3.邮箱包含@和. @在.的前面
    public void setEmail(String email) {
        if (email.indexOf("@") != -1 &&
                email.indexOf(".") != -1 &&
                email.indexOf("@") < email.indexOf(".")) {
            this.email = email;
        }else{
            System.out.println("给一个默认邮箱196.@");
            this.email = "196.@";
        }


    }

    @Override
    public String toString() {
        return "Uses{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}