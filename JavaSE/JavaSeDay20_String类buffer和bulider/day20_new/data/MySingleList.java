package day20.data;

public class MySingleList {
    private Node first; // 只记第一个
    private int total; // 结点总数

    // 设计结点类型
    class Node{
        Object data;
        Node next;
        public Node(Object data, Node next){
            super();
            this.data=data;
            this.next=next;
        }
    }

    public void add(Object obj){
        if(first==null){
            first = new Node(obj, null);
        }else{
            // 先找到最后一个，然后把Node放到当前最后一个的next中
            Node now = first;
            while(now.next!=null){
                now=now.next;
            }
            now.next=new Node(obj, null);
        }
        total++;
    }

    public int size(){
        return total;
    }

    public void remove(Object obj){
        if(obj==null){
            if(first.data==null){
                first=first.next;
            }else{
                Node left=first;
                Node now = first.next;
                while (now.data!=null){
                    left=now;
                    now=now.next;
                }
                left.next=now.next;
            }
        }else{
            if(obj.equals(first.data)){
                first=first.next;
            }else{
                Node left=first;
                Node now = first.next;
                while (!obj.equals(now.data)){
                    left=now;
                    now=now.next;
                }
                left.next=now.next;
            }
        }
        total--;
    }

    public Object[] toArray(){
        Object[] all = new Object[total];
        Node node = first;
        for(int i=0;i<total;i++){
            all[i]=node.data;
            node=node.next;
        }
        return all;
    }
}

