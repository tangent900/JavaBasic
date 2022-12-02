package JavaBasic.system;

import java.util.Arrays;

public class System_ {
    public static void main(String[] args) {
//        1.exit()
        System.out.println("ok1~");
//        System.exit(0);  //执行到这程序退出，下面不再执行
        System.out.println("ok2~");
//        2.Array.copyOf()底层是System.arraycopy()
//        attn:一般直接使用Array.copyOf() , 不使用System.arraycopy()
        //五个参数
        // 1.src 拷贝的原 arr
        // 2.srcPos 从哪开始拷贝
        // 3.dest 拷贝到哪
        // 4.destPos 拷贝开始的下标
        // 5.length 拷贝原数组的长度
        int[] arr = {1,2,3};
        int[] dest = new int[3];
        //一般形式
        System.arraycopy(arr,0,dest,0,arr.length);
        System.out.println("dest="+ Arrays.toString(dest));
//        3.currentTimeMillis() 返回从现在到1970-1-1午夜的毫秒数
        System.out.println(System.currentTimeMillis());


    }
}
