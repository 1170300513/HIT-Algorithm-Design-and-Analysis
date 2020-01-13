package DynamicProgramming;

import java.util.*;

public class Candy 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input:");
		String g = sc.nextLine();
		String[] gstr = g.split("\\[|\\]|,");
		int i , sum = 0;
		List<Integer> A = new ArrayList<>();
		List<Integer> Candy = new ArrayList<>();
		for(i = 1 ; i < gstr.length ; i++)
		{
			A.add(Integer.valueOf(gstr[i]));
		}
		//ÿ�������ȷ���һ���ǹ�
		for(i = 0 ; i < A.size() ; i++)
		{
			Candy.add(1);
		}
		//��ǰ����ɨ�裬��������������С�������Ȩ�ش���ǰ���Ȩ�ص�����������С����ǰ���С�����ǹ����Ļ����ϼ�һ����  O(n)
		for(i = 0 ; i < A.size() ; i++)
		{
			if(i >= 1)
			{
				if(A.get(i) > A.get(i-1)) 
				{
					Candy.set(i, Candy.get(i-1)+1);
				}
			}
				
		} 
		//�Ӻ���ǰɨ�裬��������������С��ǰ���Ȩ�ش���ǰ���Ȩ�ص������  O(n)
		//��������ɨ�������Ϳ��Ա�֤Ȩ�ظߵĺ��ӱ�����Ȩ�ص͵ĺ��ӵ��ǹ��ࡣ
		for(i = A.size() - 1 ; i >= 0  ; i--)
		{
			if(i <= A.size() - 2)
			{
				if(A.get(i) > A.get(i+1)) 
				{
					Candy.set(i, Candy.get(i+1)+1);
				}
			}
				
		}
		//���  O(n)
		for(i = 0 ; i < A.size() ; i++)
		{
			System.out.println(Candy.get(i));
			sum += Candy.get(i);
		}
		System.out.println("Output:");
		System.out.println(sum);
		
	}
}
