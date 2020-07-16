package day20;

public class TestMyArrayList {
	public static void main(String[] args) {
		// 创建容器
		MyArrayList my = new MyArrayList();
		
		// 添加对象
		my.add("张三");
		my.add("李四");
		my.add("王五");
		
		// 查看对象数量
		System.out.println(my.size());
		
		// 遍历元素
		Object[] all = my.getAll();
		for(int i=0;i<all.length;i++) {
			System.out.println(all[i]);
		}
		
		// 获取某个位置的元素
		Object obj = my.get(0);
		System.out.println(obj);
		
		// 查找李四的位置
		int index = my.indexOf("heh");
		System.out.println(index);
	}
}
