package ����;

import java.util.Scanner;

public class TwoArr {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		// ��ά����
		int[][] a=new int[3][5];
		a[0][1]=6;
		int[][] b= {
				{1,2,3,4},
				{1,2,3}
		};
		
		final int SIZE=3;
		int[][] board=new int[SIZE][SIZE];
		boolean gotResult=false;
		int numOfX=0;
		int numOFO=0;
		
		// �������
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				board[i][j]=in.nextInt();
			}
		}
		
		// �������
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
}
