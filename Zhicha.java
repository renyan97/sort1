package sort;

import java.util.Arrays;

/*
 * ֱ�Ӳ���
 * */
public class Zhicha {

	public void sort(int [] a)
	{
		System.out.println("ֱ������ǰ"+Arrays.toString(a));
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
	    System.out.println("ֱ�������"+Arrays.toString(a));
	}
}
