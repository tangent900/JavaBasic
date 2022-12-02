package JavaBasic.math;
/**
 * 2022/11/8
 */

import java.util.*;

class Student{
    String  sno;
    String  sname;
    int sage;
    public Student(String sno,String sname){
        this.sno=sno;
        this.sname=sname;
    }
    public String toString(){
        return sno+":"+sname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return sno.equals(student.sno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sno);
    }
}
public class W {
    public static void main(String[] args) {
        //输出2~50之间的随机数
        for (int i = 0; i < 20; i++) {
            System.out.println(2 + (int) (50 - 2 + 1) * Math.random());

        }
//        HashSet<JavaBasic.String> set1 = new HashSet<JavaBasic.String>();
//        set1.add( new JavaBasic.String("15001"));
//        set1.add( new JavaBasic.String("15002"));
//        set1.add( new JavaBasic.String("15003"));
//        set1.add( new JavaBasic.String("15001"));
//        for(JavaBasic.String x:set1){
//            System.out.println(x);
//        }
//        System.out.println("======================");
        HashSet<Student> set2 = new HashSet<Student>();//set机制：按地址进行比较，不同则可以放入
        set2.add(new Student("15001", "aaa"));
        set2.add(new Student("15002", "xxx"));
        set2.add(new Student("15003", "bbb"));
        set2.add(new Student("15001", "ccc"));
        for (Student x : set2) {
            System.out.println(x);
        }
        System.out.println("=============");
//        System.out.println("=============");
        Iterator<Student> it1=set2.iterator();
        while(it1.hasNext()) {
            Student s=it1.next();
            System.out.println(s);
        }
        HashMap<String,String> myMap = new HashMap<String,String>();
        myMap.put("ahang","1111");
        myMap.put("zhc","2222");
        myMap.put("zhao","3333");
//        myMap.put("zhao","4444");

    for(String s: myMap.values()){
        System.out.printf("%s \n",s,myMap.get(s));
    }

    }
}

//public class W {
//    public static void main(JavaBasic.String[] args) {
//        ArrayList<JavaBasic.String> myList = new ArrayList<>();
////        add(int index,JavaBasic.String string)  在index位置加入string，index默认末尾
//        myList.add("aaaaaaa");
//        myList.add("xxxxxx");
//        myList.add(1,"yyyyyy");
////        遍历链表
//        //FirstWay  增强型for循环   for(类型 变量：集合)
//        for(JavaBasic.String s:myList){
//            System.out.println(s);
//        }
//        //SecondWay  index
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }
//        //ThirdWay  迭代器
//        Iterator<JavaBasic.String> it=myList.iterator();
//        while(it.hasNext()) {
//            JavaBasic.String s=it.next();
//            System.out.println(s);
//        }
//        HashSet<JavaBasic.String> mySet = new HashSet<>();
//        mySet.add("aaaaa");
//        mySet.add("cc");
//        mySet.add("xxxxx");
//        for(JavaBasic.String x:mySet){
//            System.out.println(x);
//        }
////        for (int i = 0; i < mySet.size(); i++) {
////            System.out.println(mySet.get(i));
////        }
//
//
//
//    }
//}
