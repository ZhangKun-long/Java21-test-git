package com.neuedu.part03;

import java.util.Scanner;

public class TestPart304 {
	public static void main(String[] args) {
		//输入两个数，输出他们最大公约数
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int i = sc1.nextInt();
		int j = sc2.nextInt();
		int m = 0;
		int res = i>j?j:i;
		for(int n = 1;n <= res;n++){
			if(i%n==0&&j%n==0){
				m = n;
			}
		}	
		System.out.println("最小公约数为："+m);
		
		//水仙花数特殊的三位数，各位数字的的立方相加等于他本身
		for (i = 100; i < 1000; i++) { // 循环所有三位数
            int a = i % 10; // 拆分出个位数字
            int b = (i / 10) % 10; // 拆分出十位数字
            int c = i / 100; // 拆分出百位数字
            // 判断立方和是否等于自身
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println(i);
            }
        }
		
		
		//猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个，第二天早上又将剩下的桃子吃掉一半，
		//又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
		int sum = 1;
		for(int a1 = 1;a1<10;a1++){
			 sum =(sum +1) * 2;
			 
		 }
		System.out.println("🐵："+sum);
		
		

		
	}
}
