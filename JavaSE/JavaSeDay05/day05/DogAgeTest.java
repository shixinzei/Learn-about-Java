package day05;

import java.util.Scanner;

public class DogAgeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Please input dogAge:");
		double dogAge=in.nextDouble();
		if(dogAge>=0.0&&dogAge<=2.0) {
			System.out.println(dogAge*10.5);
		}else if(dogAge>2) {
			System.out.println((dogAge-2)*4+10.5*2);
		}else if(dogAge<0){
			System.out.println("error");
		}
		
	}

}
