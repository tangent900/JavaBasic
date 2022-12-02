package JavaBasic.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Arrays_ {
    public static void main(String[] args) {
//        遍历数组
        int[] arr1 = {0, 22, 818, 5, 77, 2};
        //fori循环
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        //Arrays.toString()
        System.out.println(Arrays.toString(arr1));
//    排序
        //冒泡排序
        //普通排序Arrays.sort()
        //attn:数组是引用类型，sort会对其本身产生影响
        Integer[] integer = {10,22,-1,46,1};
        System.out.println("排序前："+Arrays.toString(integer));
        Arrays.sort(integer);//默认升序
        System.out.println("排序后："+Arrays.toString(integer));
//      如何降序 -- 定制排序
        //底层为二叉树查找的原理(数据结构)
        Arrays.sort(integer, new Comparator() { //匿名内部类
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer)o1;
                Integer i2 = (Integer)o2;
                return i1 -i2; //i1 - i2 > 0 升序 i1 - i2 < 0 降序
                //理解：前一个 - 后一个 若 > 0 则交换 ，则最后结果为升序
            }
        });
        System.out.println(Arrays.toString(integer));

//        binaryResearch  二分查找
        //要求：  1.数组需是排列好的
        Integer[] arr = {2,5,9,44,85,95};
        int index = Arrays.binarySearch(arr,2);
        System.out.println("index = "+ index);
        //如果找不到 则 return -(low + 1) low : 如果数组中有该数则返回的值
        //Example: Arrays.binarySearch(arr,45)
        // 若arr中有45 ，则 return 4
        // 所以现在返回 - 5 = -( 4 + 1 )

//        拷贝数组 Array.copyOf()  解读：拷贝arr中arr.length个元素
        Integer[] new_arr1 = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(new_arr1));//[2, 5, 9, 44, 85, 95]
        Integer[] new_arr2 = Arrays.copyOf(arr,arr.length + 1 );
        System.out.println(Arrays.toString(new_arr2));//[2, 5, 9, 44, 85, 95, null]
        //若是int[] 则多的是0 ; Object[] 多 null

//        填充元素
        //解读：将原数组中的所有元素改为指定元素
        Integer[] num = {0,10,88,60,500};
        Arrays.fill(num,99); //直接对原数组进行操作，不会产生新数组
        System.out.println(Arrays.toString(num));//[99, 99, 99, 99, 99]

//        判断每个元素是否相同
        boolean equals = Arrays.equals(new_arr1,new_arr2);
        System.out.println(equals);
//    改成列表集合
        List aslist = Arrays.asList(1,2,3,4,6);
        System.out.println(aslist);

        char x = 'a';
        System.out.println(x + 1);

    }

}
