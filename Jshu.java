package sort;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * »ùÊýÅÅÐò
 * */
public class Jshu {

	public void sort(int [] a)
	{
		 System.out.println(Arrays.toString(a));
		int max=a[1];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		int num=0;
		while(max>0)
			{
			max=max/10;
		    num++;
		    }
		ArrayList<ArrayList<Integer>>  l=new ArrayList();
		
		for(int i=0;i<10;i++)
			l.add(new ArrayList<Integer>());
		int k=1;
		int n=a.length;
		while(num>0)
		{
		 
			for(int i=1;i<n;i++)
			{
				int s=(a[i]/k)%10;
				l.get(s).add(a[i]);
			}
			int  z=1;
			 
			for(int i=0;i<10;i++)
			{
				for(Integer p:l.get(i))
				{
				     if(z>=n)
				    	 break;
				      a[z++]=p;
			    }
				}
			
			 System.out.println(Arrays.toString(a));
			k=k*10;
			num--;
		}
 		
		 System.out.println(Arrays.toString(a));
	}
}  
