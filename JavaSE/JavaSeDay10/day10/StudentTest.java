package day10;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] stu=new Student[20];
		for(int i=0;i<stu.length;i++) {
			stu[i]=new Student();
			stu[i].number=i;
			stu[i].state=(int)(Math.random()*6+1);//[1,6]
			stu[i].score=(int)(Math.random()*101);
			if(stu[i].state==3) {
				stu[i].showInfo();
			}
			
		}
		
	}

}

class Student{
	int number;
	int state;
	int score;
	
	public void showInfo() {
		System.out.println("学号："+number+",年级:"+state+",成绩"+score);
	}
	
}