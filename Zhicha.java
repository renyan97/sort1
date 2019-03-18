package sort;

import java.util.Arrays;

/*
 * 直接插入
 * */
public class Zhicha {

	public void sort(int [] a)
	{
		System.out.println("直接排序前"+Arrays.toString(a));
		int len=a.length;
	    for(int i=2;i<len;i++)
	    {
	    	if(a[i]<a[i-1])
	    	{
	    		a[0]=a[i];
	    		int j=0;
	    		for(j=i-1;a[0]<a[j];j--)
	    		{
	    			a[j+1]=a[j];
	    		}
	    		a[j+1]=a[0];
	    	}
	    	
	    }
	    System.out.println("直接排序后"+Arrays.toString(a));
	}
}
