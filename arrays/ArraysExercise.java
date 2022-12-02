package JavaBasic.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysExercise {
    public static void main(String[] args) {
//        Book book = new Book();
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("金瓶梅新", 90);
        books[2] = new Book("青年文摘20年", 5);
        books[3] = new Book("Java从入门到放弃", 300);
        //price从大到小
        //冒泡排序
//        Book temp = new Book("",0);
//        for (int i = 0; i < books.length - 1 ; i++) {
//            for (int j = 0; j < books.length - i - 1; j++) {
//                if (books[j].getPrice() < books[j + 1].getPrice()){
//                    temp = books[j];
//                    books[j] = books[j + 1];
//                    books[j + 1] = temp;
//                }
//            }
//        }
        //用定制排序法
        //思路：1.将价格放置于一个数组中  X
        //2.sort 定制排序
//                a.取消范式
//                b.传入的数组中的元素是什么类型，再向下转型
//                c.再利用get()
        //3.依次对应  X
//        Integer[] prices = new Integer[4];
//        for (int i = 0; i < books.length; i++) {
//            prices[i] = books[i].getPrice();
//        }
//        System.out.println(Arrays.toString(prices));
        Arrays.sort(books, new Comparator<Object>() {
            @Override
            //因为进行的是重写，所以需要  确保最后返回值为 int 类型
            //在本题中，因为给的价格全是整数，所以  可以 不再转换
            //如果价格是double类型，则需要进行转换
            public int compare(Object o1, Object o2) {
                Book b1 = (Book)o1;
                Book b2 = (Book)o2;
//                return b2.getPrice() - b1.getPrice(); //<0  降序
//                return b1.getPrice() - b2.getPrice();   //>0 升序
//      进行转换
                double priceDiffence =  b1.getPrice() - b2.getPrice();
                if (priceDiffence > 0) {
                    return 1;

                }else if (priceDiffence <= 0 ) {
                    return -1;
                }else {
                    return 0;
                }
            }
        });
//        System.out.println(Arrays.toString(prices));


//        System.out.println("price从大到小排序后");
        System.out.println("price从小到大排序后");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }

//        按照书名长度排序

        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1 = (Book)o1;
                Book b2 = (Book)o2;
                return b1.getName().length() - b2.getName().length();

            }
        });




    }
}

class Book {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
