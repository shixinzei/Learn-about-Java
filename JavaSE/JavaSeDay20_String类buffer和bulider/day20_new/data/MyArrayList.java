package day20.data;

import java.util.Arrays;

public class MyArrayList {
    private Object[] data;
    private int total;
    public MyArrayList(){
        data = new Object[10]; // 默认初始化大小
    }
    public void add(Object obj){
        if(total>=data.length){
            data = Arrays.copyOf(data, data.length*2);
        }
        data[total++]=obj;
    }

    // 获取有效元素的个数
    public int size(){
        return total;
    }


    // 把数据用数组返回
    public Object[] toArray() {
        return Arrays.copyOf(data,total);
    }

    // 获取index位置的元素
    public Object get(int index){
        if(index<0||index>=total){
            throw new IndexOutOfBoundsException(index + "不合法");
        }
        return data[index];
    }

    public int indexOf(Object obj){
        int index=-1;
        if(obj==null){
            for(int i=0;i<total;i++){
                if(data[i]==obj){
                    return i;
                }
            }
        }else {
            for(int i=0;i<total;i++){
                if(data[i].equals(obj)){
                    return i;
                }
            }
        }
        return index;
    }

    // 删除当前容器中的obj对象
    public void remove(Object obj){
        // 找obj的位置
        int index = indexOf(obj);
        // 删除
        if(index!=-1){
            System.arraycopy(data,index+1,data,index,total-1);
            data[--total]=null;
        }
    }

    // 把当前容器中的old替换为dst
    // 限定只替换第一个找到的
    public void set(Object old, Object dst){
        int index = indexOf(old);
        if(index!=-1){
            data[index]=dst;
        }
    }


}
