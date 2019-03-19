package sort;

import java.util.Arrays;

public class Dun {

	public void sort(int []a)
	{
		System.out.println("排序前"+Arrays.toString(a));
		
		/*-
		 * 创建初始堆
		 * */
		int n=a.length-1;
		for(int i=n/2;i>0;i--)
			f(a,i,n);
	 
		for(int i=n;i>1;i--)
		{
			a[0]=a[1];
			a[1]=a[i];
			a[i]=a[0];
			  
			f(a,1,i-1);
		}
		
		
		System.out.println("排序后"+Arrays.toString(a));
	}
	public void f(int [] a,int s,int l)
	{
		int i=s;
	    a[0]=a[s];
		for(int j=2*i;j<=l;j=2*j)
		{
			if(j<l&&a[j]<a[j+1])
	                j=j+1;
			if(a[j]<a[0])
			     break;
			a[i]=a[j];
			i=j;
		}
		
		a[i]=a[0];
	}
}
