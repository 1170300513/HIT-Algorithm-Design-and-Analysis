package DynamicProgramming;


import java.util.*;


public class Biscuit_allocation 
{
	public static void main(String[] args)
	{
		//�����������֣���Ϊ�������鲢����������
		Scanner sc = new Scanner(System.in);
		System.out.println("Input:");
		String g = sc.nextLine();
		String s = sc.nextLine();
		List<Integer> glist = new ArrayList<>();
		List<Integer> slist = new ArrayList<>();
		int i , j;
		String[] gstrarray = g.split(" ");
		String[] sstrarray = s.split(" ");
		for(i = 0; i < gstrarray.length; i++)
		{
			glist.add(Integer.valueOf(gstrarray[i]));
		}
		for(i = 0; i < sstrarray.length; i++)
		{
			slist.add(Integer.valueOf(sstrarray[i]));
		}
		Collections.sort(glist);
		Collections.sort(slist);
		
		// ̰���㷨
	    // �þ���С�ı������㺢��
		i = 0;
		j = 0;
		while(i < glist.size() && j < slist.size())
		{
			if(glist.get(i) <= slist.get(j))
			{
				i++;
			}
			j++;
		}
		System.out.println("Output:");
		System.out.println(i);
	}
	
}
