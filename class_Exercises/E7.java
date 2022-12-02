package JavaBasic.class_Exercises;

public class E7 {
    public static void main(String[] args) {
        Images images = new Images();
//        System.out.println("image1");
//        images.i1();
//        System.out.println("image2");
//            images.i2();
//        images.i3();
//        images.i4();
    }
}

class Images {
    public void i1() {
        /*
    输出
    1                   思路：1. 六层 i=  6
    1 2                     2.每层输出数个数为 i
    1 2 3
    1 2 3 4
    1 2 3 4 5
    1 2 3 4 5 6

         */
        for (int i = 1; i <= 6; i++) {//层数
            for (int j = 1; j <= i; j++) {//个数
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
    输出
    1 2 3 4 5 6  思路：1. 6 层 i = 1~6
    1 2 3 4 5         2. 每一行的个数 j = 6 - i + 1
    1 2 3 4
    1 2 3
    1 2
    1
    */
    public void i2() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6 - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();


        }
    }

    /*
              1             思路：   层数   空格数  数字个数   数字
            2 1                      1      10     1       1
          3 2 1                      2      8      2       2  1
        4 3 2 1                      3      6      3    3  2   1
      5 4 3 2 1                      4      4      i    j 倒序列
    6 5 4 3 2 1                      5      2
                                     i  2(6 - i)/(6-i)占位符


     */
    public void i3() {
        for (int i = 1; i <= 6; i++) {
            //先打印空格

            for (int j = 1; j <=6 - i; j++) {
                System.out.printf("%-4s", " ");

            }
            //数字
            for (int j = 1; j <= i; j++) {//个数
                System.out.printf("%-4d", i - j + 1);//数
            }
            System.out.println();

        }


    }
    /*
    1 2 3 4 5 6             层数  空格占位符数 数字个数 数字
      1 2 3 4 5              1        0        6     1~6
        1 2 3 4              2        1        5     1~ 5
          1 2 3              3         2       4     1~4
            1 2              i        i- 1    j=6-i+1  顺序 1~i
              1

     */
    public void i4(){
        for (int i = 1; i <= 6; i++) {
            //空格
            for (int j = 1; j <= i - 1; j++) {
                System.out.printf("%-4s"," ");
            }
            for (int j = 1; j <= 6 -i + 1 ; j++) {
                System.out.printf("%-4d",j);
            }
            System.out.println();
        }
    }



}