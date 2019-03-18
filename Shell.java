package sort;

import java.util.Arrays;

public class Shell {
	public int b[]={5,3,1}; 
	public void sort(int [] a)
	{
		System.out.println("≈≈–Ú«∞"+Arrays.toString(a));
		for(int p=0;p<b.length;p++)
		{ 
			int d=b[p];
			int len=a.length;
			for(int i=d+1;i<len;i++)
			{
			 
				a[0]=a[i];
				if( a[0]<a[i-d])
				{
					int j=0;
					for( j=i-d;j>0&&a[0]<a[j];j=j-d)
						a[j+d]=a[j];
					a[j+d]=a[0];
				}			
			}
			 
		}
		
		
		
		System.out.println("≈≈–Ú∫Û"+Arrays.toString(a));
	}
	
	
	
	
}
