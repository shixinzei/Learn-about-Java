package day21.set;

import org.junit.Test;

import java.util.*;

public class TestSet {
    @SuppressWarnings("all")
    @Test
    public void test7(){
        Set set = new TreeSet();
        set.add(new Student(2,"张三",89));
        set.add(new Student(1,"李四",86));
        set.add(new Student(3,"王五",83));
        set.add(new Student(4,"赵六",92));
        set.add(new Student(4,"赵六",92));

        for(Object o:set){
            System.out.println(o);
        }
    }

    @SuppressWarnings("all")
    @Test
    public void test6(){
        Set set = new HashSet();
        set.add(new Student(2,"张三",89));
        set.add(new Student(1,"李四",86));
        set.add(new Student(3,"王五",83));
        set.add(new Student(4,"赵六",92));

        set.add(new Student(2,"张三",89));
        set.add(new Student(1,"李四",86));
        set.add(new Student(3,"王五",83));
        set.add(new Student(4,"赵六",92));

        for(Object o:set){
            System.out.println(o);
        }
    }

    @SuppressWarnings("all")
    @Test
    public void test5(){
        Set set = new HashSet();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("赵六");
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("赵六");

        for(Object o:set){
            System.out.println(o);
        }
    }

    @SuppressWarnings("all")
    @Test
    public void test4(){
        Set set = new LinkedHashSet();
        set.add(new Student(2,"张三",89));
        set.add(new Student(1,"李四",86));
        set.add(new Student(3,"王五",83));
        set.add(new Student(4,"赵六",92));

        for(Object o:set){
            System.out.println(o);
        }
    }

    @SuppressWarnings("all")
    @Test
    public void test3(){
        Set set = new TreeSet();
        set.add(new Student(2,"张三",89));
        set.add(new Student(1,"李四",86));
        set.add(new Student(3,"王五",83));
        set.add(new Student(4,"赵六",92));

        for(Object o:set){
            System.out.println(o);
        }
    }

    @SuppressWarnings("all")
    @Test
    public void test2(){
        Set set = new TreeSet();
        set.add("zhangsan");
        set.add("lisi");
        set.add("wangwu");
        set.add("zhaoliu");

        for(Object o:set){
            System.out.println(o);
        }
    }

    @SuppressWarnings("all")
    @Test
    public void test(){
        Set set = new HashSet();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("赵六");

        for(Object o:set){
            System.out.println(o);
        }
    }
}

class Student implements Comparable{
    private int id;
    private String name;
    private int score;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && score == student.score && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, score);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

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
    public int compareTo(Object o) {
        Student stu = (Student) o;
        return this.id - stu.getId();
    }
}