package sort;
/*
 * ¼ÆÊýÅÅÐò
 * */

import java.util.Arrays;

public class jishu {

	public void sort(int a [])
	{
		System.out.println(Arrays.toString(a));
		
		int b []= new int[10];
		for(int i=0;i<b.length;i++)
			b[i]=0;
		for(int i=1;i<a.length;i++)
		{
			b[a[i]]=b[a[i]]+1;
		}
		int j=1;
		for(int i=1;i<b.length;i++)
		{
			while(b[i]>0)
				{
				a[j++]=i;
		       	b[i]--;}
		}
		
		System.out.println(Arrays.toString(a));
		
	}
	
}
