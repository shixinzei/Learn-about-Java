package day20.data;

public class TestMySingleList {
    public static void main(String[] args) {
        // 创建容器
        MyArrayList my = new MyArrayList();

        // 添加元素
        my.add("张三");
        my.add("李四");
        my.add("王五");
        my.add("赵六");

        // 获取元素的个数
        System.out.println(my.size());

        // 遍历
        Object[] array = my.toArray();
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println();

        // 删除
        my.remove("张三");
        array = my.toArray();
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println();

        my.remove("王五");
        array = my.toArray();
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println();
    }
}
