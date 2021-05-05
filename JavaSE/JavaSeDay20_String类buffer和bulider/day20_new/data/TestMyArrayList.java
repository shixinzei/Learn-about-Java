package day20.data;

public class TestMyArrayList {
    public static void main(String[] args) {
        // 创建一个容器
        MyArrayList my = new MyArrayList();

        // 可以装对象
        my.add("张三");
        my.add("李四");
        my.add(null); // null也可以是一个有效元素
        my.add("张六");

        // 查看有几个元素
        System.out.println(my.size());

        // 遍历元素
        Object[] all = my.toArray();
        for(int i=0;i<all.length;i++){
            System.out.println(all[i]);
        }

        // 获取index位置的元素
        Object obj = my.get(0);
        System.out.println(obj);

        // 查找李四的位置
        int index = my.indexOf("李s");
        System.out.println(index);
    }
}
