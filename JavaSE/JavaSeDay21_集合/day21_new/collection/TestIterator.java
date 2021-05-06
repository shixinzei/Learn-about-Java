package day21.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
    @SuppressWarnings("all")
    @Test
    public void test1(){
        Collection c = new ArrayList();
        c.add("张三");
        c.add("李四");
        c.add("王五");
        c.add("赵六");
        c.add("钱七");

        // 先通过Collection系列集合，对象拿到迭代器对象
       Iterator iterator = c.iterator();
       while(iterator.hasNext()){
           Object next = iterator.next();
           System.out.println(next);
       }
    }

    @SuppressWarnings("all")
    @Test
    public void test2(){
        Collection c = new ArrayList();
        c.add(new Student(1,"张三",89));
        c.add(new Student(2,"李四",92));
        c.add(new Student(3,"王五",55));
        c.add(new Student(4,"赵六",81));
        c.add(new Student(5,"钱七",99));

        // 先通过Collection系列集合，对象拿到迭代器对象


/*        for(Object obj:c){
            Student stu = (Student) obj;
            if(stu.getScore()<60){
                c.remove(stu);
            }
        }*/

        Iterator iterator = c.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            Student stu = (Student) next;
            if(stu.getScore()<60){
                iterator.remove();
            }
        }

        for(Object obj:c){
            System.out.println(obj.toString());
        }

    }
}

class Student{
    private int id;
    private String name;
    private int score;

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}