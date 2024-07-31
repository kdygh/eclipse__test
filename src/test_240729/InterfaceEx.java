package test_240729;

/*
 * 인터페이스 내에는 상수 또는 추상 메서드만 가능함
 * 인터페이스를 사용하기 위해서는 일반클래스에서
 * 구현(Implements)력을 가져야 함
 * 일반 클래스에서 implements예약어로 특정 인터페이스를 구현할 것을 명시하는 것임
 */

import java.util.*;

class Record
{
	String name;
	String[] score = new String[3];
	int[] scoreNum = new int[3];
	
	int num, sum;
	float avg;
	
}

class RecordImpl implements IScore
{
	int people;
	Record[] r;
	
	@Override
	public void set() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.printf("인원 수 : ");
			people = sc.nextInt();
		}while(1 > people);
		
		r = new Record[people];
		
		input();
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < r.length; i++)
		{
			r[i] = new Record();
			
			System.out.printf("%d번째 학생 학번 이름 : ", i + 1);
			r[i].num = sc.nextInt();
			r[i].name = sc.next();
			
			System.out.printf("국 영 수 : ");
			r[i].scoreNum[0] = sc.nextInt();
			r[i].scoreNum[1] = sc.nextInt();
			r[i].scoreNum[2] = sc.nextInt();
			
			for(int j = 0; j < r[i].scoreNum.length; j++)
			{
				if(r[i].scoreNum[j] >= 90)
				{
					r[i].score[j] = "A";
				}
				else if(r[i].scoreNum[j] >= 80)
				{
					r[i].score[j] = "B";
				}
				else if(r[i].scoreNum[j] >= 70)
				{
					r[i].score[j] = "C";
				}
				else if(r[i].scoreNum[j] >= 60)
				{
					r[i].score[j] = "D";
				}
				else
				{
					r[i].score[j] = "F";
				}
				
				r[i].sum = r[i].scoreNum[0] + r[i].scoreNum[1] + r[i].scoreNum[2];
				r[i].avg = (float)r[i].sum / 3.f;
			}
		}
		
		print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		for(int i = 0; i < r.length; i++)
		{
			System.out.printf("%5d %7s %3d %3d %3d %5d %5f\n",
					r[i].num, r[i].name, r[i].scoreNum[0], r[i].scoreNum[1], r[i].scoreNum[2],
					r[i].sum, r[i].avg);
		}
	}
}

public class InterfaceEx implements InterEx {

	@Override
	public int getNum() {
		// TODO Auto-generated method stub
		return num;
	}
	
	public static void main(String[] args)
	{
//		InterfaceEx i = new InterfaceEx();
//		
//		System.out.printf("GetNum() : %d", i.getNum());
		
		RecordImpl ri = new RecordImpl();
		
		ri.set();

	}
}
