import java.util.*;
public class Main
{

	static boolean ad(StringBuilder sb,String[] s,String test)
	{
		char[] t = test.toCharArray();
		Arrays.sort(t);
		int c = 1;
		boolean noele = true;
		for(int i=0;i<s.length;i++)
		{
			char[] temp = s[i].toCharArray();
			Arrays.sort(temp);
			if(Arrays.equals(t,temp))
			{
				noele = false;
				sb.append("  "+(c++)+") "+s[i]+"\r\n");
			}
		}
		return noele;
	}
	
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
        	int m = sc.nextInt();
        	for(int i=0;i<m;i++)
        	{
        		int n = sc.nextInt();
        		String[] s = new String[n];
        		for(int j=0;j<n;j++)
        			s[j] = sc.next();
        		ArrayList<String> list = new ArrayList();
        		while(true)
        		{
        			String S = sc.next();
        			if(S.equals("END"))
        				break;
        			list.add(S);
        		}
        		StringBuilder sb = new StringBuilder("");
        		for(int j=0;j<list.size();j++)
        		{
        			sb.append("Anagrams for: "+list.get(j)+"\r\n");
        			if(ad(sb,s,list.get(j)))
        				sb.append("No anagrams for: "+list.get(j)+"\r\n");
        		}
        		
        		System.out.print(sb);
        		
        		if(!((m-1)==i))
        			System.out.println();
        	}
        }
    }
};

//== �H�W�����M�d��
/*
//�ϥ�Java���ҥͽЪ`�N�A�̥~�h�����O(class)�ݩR�W�� main �C
//�p�G�J��W�G�Q�������p�A�Ч��sĶ���լݬ�!! �U�sĶ���S�ʤ��P!!
//�w�]����B�H������B�T�w����O�Ψ����U�����Ϊ��C���ɡA�u�ݷt������O�_�q�L!!

//*/
