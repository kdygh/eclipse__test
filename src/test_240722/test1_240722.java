package test_240722;

import java.util.*;
import java.io.*;

public class test1_240722 {

	public class Sub
	{
		int kor;
		int eng;
		int math;
		
		int total;
		float avg;
		
		public Sub() {}
		
		public int getKor() {
			return kor;
		}
		public void setKor(int kor) {
			this.kor = kor;
		}
		public int getEng() {
			return eng;
		}
		public void setEng(int eng) {
			this.eng = eng;
		}
		public int getMath() {
			return math;
		}
		public void setMath(int math) {
			this.math = math;
		}
		public int getTotal() {
			return total;
		}
		public void setTotal() {
			this.total = kor + eng + math;
		}
		public float getAvg() {
			return avg;
		}
		public void setAvg() {
			this.avg = (float) total / 3;
		}
		
		public void displayRes()
		{
			System.out.println("============");
			System.out.printf("국어 : %d\n", kor);
			System.out.printf("영어 : %d\n", eng);
			System.out.printf("수학 : %d\n", math);
			System.out.println();
			System.out.printf("총점 : %d\n", total);
			System.out.printf("평균 : %f\n", avg);
			System.out.println("============");
			System.out.println();
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("인원 수 : ");
		int num = Integer.parseInt(br.readLine());
		
		Sub[] arr = new Sub[num];
		
		for(int i = 0; i < num; i++)
		{
			

			System.out.printf("%d번째 인원 국어 : ", i + 1);
			arr[i].setKor(Integer.parseInt(br.readLine()));
			
			System.out.printf("%d번째 인원 영어 : ", i + 1);
			arr[i].setEng(Integer.parseInt(br.readLine()));
			
			System.out.printf("%d번째 인원 수학 : ", i + 1);
			arr[i].setMath(Integer.parseInt(br.readLine()));
			
			arr[i].setTotal();
			
			arr[i].setAvg();
		}
		
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i].displayRes();
		}
	}

}
