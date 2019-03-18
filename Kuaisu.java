package sort;

import java.util.Arrays;

public class Kuaisu {

	public void sort(int [] a)
	{
		System.out.println("≈≈–Ú«∞"+Arrays.toString(a));
		
		 int l=1;
		 int r=a.length-1;
		f(a,l,r);
		
		System.out.println("≈≈–Ú∫Û"+Arrays.toString(a));
	}
	public void f(int [] a,int l,int r)
	{
		
		if(l<r)
		{
		    int i=w(a,l,r);
		    f(a,i+1,r);
		    f(a,l,i-1);
		}
		
	 
	}
	public int  w(int [] a,int l,int r)
	{
		 
		int i=l;
		int j=r;
	    a[0]=a[i];
		while(i<j)
		{
              
			while(i<j&&a[j]>=a[0])
				j--;
			if(i<j)
			{
			   a[i]=a[j];
			   i++;
			}
			
			while(i<j&&a[i]<=a[0])
				i++;
			if(i<j)
			{
				a[j]=a[i];
				j--;
			}
		}
		a[i]=a[0];
		return i;
		
		
		}
}
