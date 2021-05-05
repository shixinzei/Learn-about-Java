package day20;

import org.junit.Test;

public class TestSystem {

    @Test
    public void test2(){
        String[] arr = new String[5];
        arr[0]="hello";
        arr[1]="java";
        arr[2]="world";
        arr[3]="string";
        arr[4]=null;

        // 在arr[1]插入"array"
        int index=1;
        int total=4;
        System.arraycopy(arr,index,arr,index+1,total-index);
        arr[index]="array";
        total++;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    @Test
    public void test(){
        String[] arr = new String[5];
        arr[0]="hello";
        arr[1]="java";
        arr[2]="world";
        arr[3]="string";
        arr[4]="array";

        // 删除arr[1]
        int index=1;
        int total=5;
        System.arraycopy(arr,index+1,arr,index,total-index-1);
        arr[total-1]=null;
        total--;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
